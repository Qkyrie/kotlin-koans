package basicsyntax

class DefiningFunctions {

    //Defining Functions

    /*
        Defining functions
        Function having two Int parameters with Int return type:
    */
    fun sumWithReturn(a: Int, b: Int): Int {
        return a + b
    }

    /*
        Function with an expression body and inferred return type:
    */
    fun expressionBody(a: Int, b: Int) = a + b

    /*
        Function returning no meaningful value:
     */

    fun returningVoid(a: Int, b: Int): Unit {
        print(a + b)
    }

    /*
        Unit return type can be omitted:
    */
    fun omittedUnit(a: Int, b: Int) {
        print(a + b)
    }




}