package com.example.newdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class Control {
    @GetMapping("404")
    public ModelAndView error() {
        return new ModelAndView("404");
    }

    @GetMapping("about")
    public ModelAndView about() {
        return new ModelAndView("about");
    }

    @GetMapping("booking")
    public ModelAndView booking() {
        return new ModelAndView("booking");
    }

    @GetMapping("contact")
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }

    @GetMapping("index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("service")
    public ModelAndView service() {
        return new ModelAndView("service");

    }

    @GetMapping("team")
    public ModelAndView team() {
        return new ModelAndView("team");
    }

    @GetMapping("testimonial")
    public ModelAndView testimonial() {
        return new ModelAndView("testimonial");
    }
}