package com.example.demo.controller;

import com.example.demo.dto.phongBan.PhongBanRequest;
import com.example.demo.entity.PhongBan;
import com.example.demo.service.PhongBanServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PhongBanController {
    protected final PhongBanServiceImpl phongBanService;

    public PhongBanController(PhongBanServiceImpl phongBanService) {
        this.phongBanService = phongBanService;
    }
    @GetMapping("/hien-thi")
    public String getAll(Model model){
        model.addAttribute("list",phongBanService.getAll());
        return "hien-thi";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute("phongBan") PhongBanRequest phongBan){
        phongBanService.create(phongBan);
        return "redirect:/hien-thi";
    }
    @GetMapping("/add")
    public String getViewAdd(Model model){
        model.addAttribute("phongBan",new PhongBanRequest());
        return "add";
    }
}
