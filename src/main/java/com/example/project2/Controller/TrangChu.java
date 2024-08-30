package com.example.project2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class TrangChu {
    @GetMapping("/index")
    public String home(Model model) {
        return "TrangChu/index";
    }


}

