package com.codethink.bts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by _think on 2016/4/6.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
