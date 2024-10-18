package com.bale.stspringkotlin

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BaseTest() {

    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

    @Test
    fun `Assert article page title, content and status code`() {
        println(">> TODO")
    }

    @AfterAll
    fun teardown() {
        println(">> Tear down")
    }

}
