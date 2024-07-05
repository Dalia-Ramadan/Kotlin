package operators
/*
unary plus --> (+a)
unary minus --> (-a)
not --> (!a)
increment --> (++a)
decrement --> (--a)
 */
fun main(){
    val a = 5
    var b = 4
    var c = 6

    var res = +a
    println(res)

    ////////////////////////////////////

    res = -a  //res = !a
    println(res)

    ///////////////////////////////////

    var res1 = ++b
    println(res1)

    /////////////////////////////////////

    var res2 = --c
    println(res2)
}
