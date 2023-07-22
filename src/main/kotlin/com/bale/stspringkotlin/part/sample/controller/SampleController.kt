package com.bale.stspringkotlin.part.sample.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController {
    @GetMapping("/")
    fun sample1(model:Model):String {
        model["title"] = "Blog"

        return "blog"
    }
}
