package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jian on 17/8/2.
 */
@Controller
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "panel-tabs.html")
    public String tab() {
        return "panel-tabs";
    }
}
