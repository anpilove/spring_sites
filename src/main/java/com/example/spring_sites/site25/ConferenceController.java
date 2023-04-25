package com.example.spring_sites.site25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/site25")
public class ConferenceController {

    @Autowired
    private ConferenceService service;

    @GetMapping()
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Conference> listConference = service.listAll(keyword);
        model.addAttribute("listConference", listConference);
        model.addAttribute("keyword", keyword);
        return "site25_index";
    }

    @RequestMapping("/new")
    public String showNewSessionForm(Model model){
        Conference conference = new Conference();
        model.addAttribute("Conference", conference);
        return "new_conference";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSession(@ModelAttribute("Session") Conference conference){
        service.save(conference);
        return "redirect:/site25";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditSessionFrom(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_conference");
        Conference conference = service.get(id);
        mav.addObject("Conference", conference );
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteSession(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/site25";

    }


}
