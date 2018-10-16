package com.taotao.web.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author myd
 */
public abstract class BaseController {

    /**
     * 日志操作对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
