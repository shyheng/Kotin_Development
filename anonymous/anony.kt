package anonymous

fun main() {
    val total = "mismsmmsjskdflpwejrop".count()

    val totals = "mismsmmsjskdflpwejrop".count({
        letter -> letter == 's'
    })

    println(total)
    println(totals)

//    变量类型是一个匿名函数
//    val bls:()->String = {
//        val hol = "new"
//        "shy $hol"
//    }


//    val bls:(String)->String = {name->
//        val hol = "new"
//        "$name shy $hol"
//    }

//    val bls:(String)->String = {
//        val hol = "new"
//        "$it shy $hol"
//    }

//    val bls = {
//        val hol = "new"
//        " shy $hol"
//    }

    val bls = {name:String,year:Int->
        val hol = "new"
        "$name shy $hol $year"
    }
    println(bls("jk",5000))
}