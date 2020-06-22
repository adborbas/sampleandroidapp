package com.adborbas.sample

import org.junit.Test

import org.junit.Assert.*

class GreeterUnitTest {
    @Test
    fun greeting_isCorrect() {
        var greeter = Greeter()
        var expectedGreet = "Hello World!"
        var actualGreet = greeter.greet("World!")

        assertEquals(expectedGreet, actualGreet)
    }
}