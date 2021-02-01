package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ：fzj
 * @date ：2021/1/20
 */
@Controller
public class EncodingController {


    @GetMapping("/encoding/t0")
    public String encoding0(){
        return "form";
    }
    @PostMapping("/encoding/t1")
    public String encoding(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "encodingTest";
    }

}
