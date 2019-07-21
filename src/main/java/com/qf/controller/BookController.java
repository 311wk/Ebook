package com.qf.controller;

import com.qf.pojo.EbookEntry;
import com.qf.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Administrator 2019/7/19 0019 22:22
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public String list(Model model){

        List<EbookEntry> list = ebookService.findAll();
        model.addAttribute("ebook", list);

        return "book_list";
    }

}
