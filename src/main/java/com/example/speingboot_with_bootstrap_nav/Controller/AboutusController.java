package com.example.speingboot_with_bootstrap_nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/aboutUs")
public class AboutusController {


        @GetMapping
        public String aboutUs() {
            return "aboutUs";
        }

    }


