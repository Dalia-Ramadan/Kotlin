package operators
/*
unary plus --> (+a)
unary minus --> (-a)
not --> (!a)
increment --> prefix (++a)  || postfix (a++)
decrement --> prefix (--a)  || postfix (a--)
 */
fun main(){
    val a = 5

    var res = +a
    println(res)

    ////////////////////////////////////

    res = -a  //res = !a
    println(res)

    ///////////////////////////////////

    var b = 4
    //prefix
    var res1 = ++b
    println(res1)

    /////////////////////////////////////

    var c = 6
    //postfix
    var res2 = c--
    println(res2)

}
