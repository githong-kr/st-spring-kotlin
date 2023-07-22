package com.bale.stspringkotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Test {
    @Test
    fun `왜 안 되냐`() {
        println("아오!!!!!!!!!")
    }
}
