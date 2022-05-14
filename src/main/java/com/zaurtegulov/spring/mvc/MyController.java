package com.zaurtegulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee,
                              BindingResult bindingResult) {

        //System.out.println("surname length = " + employee.getSurname().length());
        if (bindingResult.hasErrors()) {// BindingResult проверка BindingResult
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }


    }


}

