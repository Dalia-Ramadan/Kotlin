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

    //prefix
    var b = 4
    var res1 = ++b
    println(res1)

    /////////////////////////////////////

    //postfix
    var c = 6
    var res2 = c--
    println(res2)

}
