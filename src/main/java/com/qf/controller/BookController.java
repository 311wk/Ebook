package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Administrator 2019/7/19 0019 22:22
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("list")
    public String list(){

        return "book_list";
    }

}
