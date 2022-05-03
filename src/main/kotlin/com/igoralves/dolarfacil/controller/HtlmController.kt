package com.igoralves.dolarfacil.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtlmController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Dólar Facil"
        return "index"
    }
}