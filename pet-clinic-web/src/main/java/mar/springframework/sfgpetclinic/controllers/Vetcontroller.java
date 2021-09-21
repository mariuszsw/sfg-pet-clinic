package mar.springframework.sfgpetclinic.controllers;

import mar.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Vetcontroller {

    private final VetService vetService;

    public Vetcontroller(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","vets/index", "vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
