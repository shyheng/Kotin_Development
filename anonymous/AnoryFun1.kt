package anonymous

fun main() {
    showOnBoard1("艹"){goods:String,hour:Int->
        val curr = 2077
        "${curr}年，双十一${goods}:$hour 小时"
    }

}

fun showOnBoard1(goods:String,getDis:(String,Int)->String) {
    val hour = (1..24).shuffled().last()
    println(getDis(goods,hour))
}