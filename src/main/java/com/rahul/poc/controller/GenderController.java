package com.rahul.poc.controller;

import com.rahul.poc.domain.Gender;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/genders")
@Controller
@RooWebScaffold(path = "genders", formBackingObject = Gender.class)
public class GenderController {
}
