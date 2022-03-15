package nm
//匿名函数
fun main() {
    val len = "cao".count()
    println(len)

    val len1 = "cao".count() {
        it == 'c'
    }
    println(len1)
}