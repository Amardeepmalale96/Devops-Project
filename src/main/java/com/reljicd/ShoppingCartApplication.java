package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankingController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the Banking Domain Web Application");
        return "index";
    }

    @GetMapping("/banking_fundamentals")
    public String bankingFundamentals(Model model) {
        model.addAttribute("fundamentals", getBankingFundamentals());
        return "banking_fundamentals";
    }

    // Example method to get banking fundamentals
    private String getBankingFundamentals() {
        return "A bank is a financial institution...";
    }
}
