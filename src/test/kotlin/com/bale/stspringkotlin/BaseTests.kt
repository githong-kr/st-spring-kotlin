package com.bale.stspringkotlin

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.springframework.boot.test.context.SpringBootTest

// Region Comments
// * TestRestTemplate 를 사용하기 위해서는 포트를 명시해주어야 함.
// * 이를 위해 SpringBootTest 어노테이션에 RANDOM_PORT 옵션을 사용할 수 있음.
// ! 대신 RANDOM_PORT 옵션은 전체 테스트 클래스 중 SpringBootTest 는 하나만 사용되어야 함
// * 최상위로 한 클래스를 두고 상속해서 사용해야할 듯

// * 테스트를 실행하면 아래 오류 메세지가 찍히곤 한다.
// * settings 에서 async 검색 후 instrumenting agent 항목을 uncheck 하면 된다지만.. 난 안 되네..
// End Region
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// ! class 이름이 Application 이 되면 RANDOM_PORT 옵션을 사용하지 못하는 것으로 보임.
class BaseTests(/*@Autowired val restTemplate: TestRestTemplate*/) {

    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

   @AfterAll
    fun teardown() {
        println(">> Tear down")
    }

}
