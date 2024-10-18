package com.bale.stspringkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

class IntegrateTests:BaseTests() {

    @Autowired
    lateinit var restTemplate:TestRestTemplate

    @Test
    fun `Assert article page title, content and status code`() {
        println(">> TODO")
    }

}
