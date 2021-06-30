package anonymous
//具名函数的引用
fun main() {
    show("牙膏",::getDis)
}

private fun getDis(goods:String,hour:Int):String{
    val cur = 2077
    return "${cur}年，双十一${goods}:$hour 小时"
}

fun show(goods:String,getDis:(String,Int)->String) {
    val hour = (1..24).shuffled().last()
    println(getDis(goods,hour))
}