package com.github.scottnj.hellojitpack

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloTest {

    @Test
    fun test_Hello() {
        assertEquals("Joe", Hello("Joe").name)
    }
}