package org.example.googlemapsapi;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPage {
    @GetMapping("/")
    public String mainPage() {
        return "homePage";
    }
    @PostMapping("/submit")
    public String submitPage(@RequestParam("zip") String zipcode, Model model) {
//        System.out.println(zipcode);

        return "resultsPage";

    }
}
