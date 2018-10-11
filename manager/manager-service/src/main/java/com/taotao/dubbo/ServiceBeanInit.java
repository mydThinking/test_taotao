package com.taotao.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * provider服务bean创建
 *
 * @author myd
 */
public class ServiceBeanInit {


    private static ApplicationContext ctx_provider = null;

    public final static String ApplicationContextRoot = "";
    public final static String ApplicationContextPath = ApplicationContextRoot + "spring-provider.xml";

    /**
     * 初始化
     */
    public static void inti() {
        if (ctx_provider == null) {
            synchronized (ServiceBeanInit.class) {
                if (ctx_provider == null) {
                    String[] configLocations = new String[]{ApplicationContextPath};
                    ctx_provider = new ClassPathXmlApplicationContext(configLocations);
                }
            }
        }
    }

    /**
     * 获取服务暴露ip
     */
    private static void getServiceIp(){
        try {
            System.out.println("服务暴露ip:"+InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static ApplicationContext getContext() {
        inti();
        return ctx_provider;
    }

    /**
     * 开始加载服务
     */
    public static void main(String args[]){
        ServiceBeanInit.inti();
    }
}
























