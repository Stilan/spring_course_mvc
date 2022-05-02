package com.zaurtegulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-emp-details-view";
    }
//    @RequestMapping("showDetails")
//    public String showDetails() {
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "- udemy instructor");
        return "show-emp-details-view";
    }

















}
