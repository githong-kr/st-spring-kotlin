package com.bale.stspringkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

<<<<<<<< HEAD:src/test/kotlin/com/bale/stspringkotlin/BaseTest.kt
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BaseTest() {
========
class IntegrateTests:BaseTests() {
>>>>>>>> c0de13667d4e953a0142a963f07830e8d71978fc:src/test/kotlin/com/bale/stspringkotlin/IntegrateTests.kt

    @Autowired
    lateinit var restTemplate:TestRestTemplate

    @Test
    fun `Assert article page title, content and status code`() {
        println(">> TODO")
    }

}
