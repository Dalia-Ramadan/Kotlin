fun main(){
    var Name = "Dalia Ramadan"

    println(Name)

    /////////////////////////////////////////

    var Age = 19

    println(Age)

    ////////////////////////////////////////

    println("My name is $Name , My age = $Age ")

    ////////////////////////////////////////

    Name = "Mohamed"
    Age = 16

    println("My name is $Name , My age = $Age ")

    ////////////////////////////////////////

    Name = ""

    println(Name.isEmpty())

    ////////////////////////////////////////

    Name = "M"

    println(Name.isEmpty())

    println("////////////////////////////////////////")

    //read-only local variables
    // Use val for a variable whose value never changes.
    val x = 5

    println(x)

    val y:String = "Dalia"

    println(y)

    println("////////////////////////////////////////")

    //provide a type on kotlin variables
    var A:Int = 5

    println(A)

    var X:String = "d"

    println(X::class)
    println(A::class)

    println("////////////////////////////////////////")

    /*Data type:"numbers"
    Byte 8bit
    Short 16bit
    Int 32bit
    Long 64bit
    Float 32bit
    Double 64bit
     */
    val B:Byte = 8
    val S:Short = 16
    val I:Int = 32
    val L:Long = 64
    val F:Float = 32.00F
    val D:Double = 64.00

    println("$B  \n $S \n  $I  \n    $F  \n  $L  \n  $D")
    println(B::class)
    println(B.toDouble())
    println(B.toDouble()::class)

    val NI = I.plus(58)

    println("NI = $NI")

    println("////////////////////////////////////////")

    //Data type : String && Char
    val str:String = "Dalia"
    println(str)
    println(str.uppercase())
    println(str.lowercase())
    val ch:Char = 'A'

    println(ch)
    println(ch.lowercase())

    val Ch:Char = '#'

    println(Ch)
    println('\uFF00')

    println("////////////////////////////////////////")

    //String data type
    val message:String = """
        dvgfdgfryghgf
        shgthref
        trhmjnfer
        drmttlkrg
    """.trimIndent()

    println(message)

    println("////////////////////////////////////////")

    val message2:String = """
        dvgfdgfryghgf
        shgthref
        trhmjnfer
        drmttlkrg
    """.replaceIndent("**")

    println(message2)

    println("////////////////////////////////////////")

    val message3:String = """
        *dvgfdgfryghgf
        *shgthref
        *trhmjnfer
        *drmttlkrg
    """.trimMargin("*")

    println(message3)

    val name0 = "Dalia"
    println(name0.length)

    println("length of name0 = ${name0.length}")

    println("////////////////////////////////////////")

    //Boolean Data type
    var isBlank:Boolean = false

    println(isBlank)
    println(isBlank.not())

    //isBlank() == isEmpty()
    isBlank = "Dalia" .isBlank()

    println(isBlank)

    isBlank = "" .isBlank()

    println(isBlank)
}