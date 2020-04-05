package com.developer.SpringMYSQL.controllers;


import com.developer.SpringMYSQL.Models.AppUsers;
import com.developer.SpringMYSQL.Models.AppUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    AppUsersRepo appRepo;


    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("list", appRepo.findAll());
        return mv;
    }

 /*   @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("symptoms") String symptoms, @RequestParam("duration") String duration, @RequestParam("mortalityrate") String mortalityrate, @RequestParam("imageaddress") String imageaddress)
    {
        ModelAndView mv = new ModelAndView("redirect:/");
        AppUsers virusToSave ;
        if(!id.isEmpty())
        {
            Optional<AppUsers> virus = appRepo.findById(Integer.parseInt(id));
            virusToSave = virus.get();
        }
        else
        {
            virusToSave = new AppUsers();
        }
        virusToSave.setname(name);
        virusToSave.setdescription(description);
        virusToSave.setsymptoms(symptoms);
        virusToSave.setduration(duration);
        virusToSave.setmortalityrate(mortalityrate);
        virusToSave.setimageaddress(imageaddress);
        appRepo.save(virusToSave);
        mv.addObject("list", appRepo.findAll());
        return mv;
    }*/
}
