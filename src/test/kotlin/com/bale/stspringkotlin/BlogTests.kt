package com.bale.stspringkotlin

import org.assertj.core.api.AssertionsForInterfaceTypes
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

class BlogTests:BaseTest() {

    @Autowired
    lateinit var restTemplate:TestRestTemplate
    @Test
    fun `Assert blog page title, content and status code`() {
        println(">> Assert blog page title, content and status code")
        val entity = restTemplate.getForEntity<String>("/")
        AssertionsForInterfaceTypes.assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        AssertionsForInterfaceTypes.assertThat(entity.body).contains("<h1>Blog</h1>")
    }
}
