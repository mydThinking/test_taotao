package com.taotao.web.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通用页面跳转
 *
 * @author myd
 */
@Controller
@RequestMapping(value = "page")
public class PageController {

    @RequestMapping(value = "{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
