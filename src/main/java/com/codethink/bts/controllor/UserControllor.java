package com.codethink.bts.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by _think on 2016/4/6.
 */
@Controller
@RequestMapping
public class UserControllor {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
