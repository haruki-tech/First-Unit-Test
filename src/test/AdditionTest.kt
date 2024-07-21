class AdditionTest {
    @Test
    fun `add two numbers`() {
        expectThat(5+6).isEqualTo(11)
        expectThat(7+42).isEqualTo(49)
        expectThat(9999+1).isEqualTo(10000)
    }

}

annotation class Test
