package basicsyntax

import org.junit.Test
import kotlin.test.assertEquals

class StringTemplates {

    fun exampleStringTemplate(input: String): String {
        return "this is a tutorial on $input"
    }

    fun exampleStringTemplate2(input: String) {
        return
    }

    @Test
    fun stringTemplates() {
        assertEquals("this is a tutorial on Kotlin", exampleStringTemplate("Kotlin"))
    }

}