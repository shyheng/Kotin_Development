fun main(){
    var age = 3
//    a..b range表达式
    if (age in 0..3){
        println("婴儿")
    }else if (age in 3..12){
        println("青少年");
    }else{
        println("不知道");
    }


    if (age !in 1..3){

    }

    var shchool = "小学"
    var len = when(shchool){
        "学前班"->"幼儿"
        "小学"->"青少年"
        else -> {
            println("未知")
        }
    }

    println(len)
}
