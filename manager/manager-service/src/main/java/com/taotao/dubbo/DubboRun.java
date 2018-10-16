package com.taotao.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

/**
 * dubbo的思想就是服务化,所以会有多个服务(提供者)
 * dubbo服务启动类
 *
 * @author myd
 */
public class DubboRun {

    private static Logger logger = LoggerFactory.getLogger(DubboRun.class);
    private static boolean running = true;

    /**
     * 启动dubbo服务
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-provider.xml");
        //优雅关机
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                context.stop();
                logger.info("dubbo service has down");
                synchronized (Main.class) {
                    running = false;
                    Main.class.notify();
                }
            }
        });
        context.start();
        logger.info("dubbo service has started");
        synchronized (Main.class) {
            while (running) {
                Main.class.wait();
            }
        }
    }
}
























