package basicsyntax

import org.junit.Test
import kotlin.test.assertEquals

class DefiningVariables {

    /*
           Assign-once (read-only) local variable:
     */

    fun defineVal() {
        val a: Int = 1
        val b = 1   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 1       // definite assignment

        assertEquals(1, a)
        assertEquals(1, b)
        assertEquals(1, c)
    }

    /*
        Mutable variable:
     */

    @Test
    fun defineVar() {
        var x = 5
        x += 1

        assertEquals(6, x)
    }
}

