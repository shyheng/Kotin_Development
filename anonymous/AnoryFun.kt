package anonymous

fun main() {
    val getDis = {goods:String,hour:Int->
        val curr = 2077
        "${curr}年，双十一${goods}:$hour 小时"
    }
    showOnBoard("艹",getDis)
}

fun showOnBoard(goods:String,getDis:(String,Int)->String) {
    val hour = (1..24).shuffled().last()
    println(getDis(goods,hour))
}