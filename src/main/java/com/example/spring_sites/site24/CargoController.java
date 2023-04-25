package com.example.spring_sites.site24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/site24")
public class CargoController {

    @Autowired
    private CargoService service;

    @GetMapping()
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Cargo> listCargo = service.listAll(keyword);
        model.addAttribute("listCargo", listCargo);
        model.addAttribute("keyword", keyword);
        return "site24_index";
    }

    @GetMapping("/new")
    public String showNewSessionForm(Model model){
        Cargo cargo = new Cargo();
        model.addAttribute("Cargo", cargo);
        return "new_cargo";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSession(@ModelAttribute("Session") Cargo cargo){
        service.save(cargo);
        return "redirect:/site24";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditSessionFrom(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_cargo");
        Cargo cargo = service.get(id);
        mav.addObject("Cargo", cargo);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteSession(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/site24";

    }


}