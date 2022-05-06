package com.zaurtegulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee employee) {

        String name = employee.getName();
        employee.setName("Mr " + name);
        String surname = employee.getSurname();
        employee.setSurname(surname + "!");
        int salary = employee.getSalary();
        employee.setSalary(salary * 10);
        return "show-emp-details-view";
    }
















}
