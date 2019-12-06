package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company: 十亿网络科技
 * Author: dengy
 * Email: 3291134235@qq.com
 * CreateTime: 2019年12月03日 17时06分
 * Description: <p></p>
 */
@RestController
public class indexController {
    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
