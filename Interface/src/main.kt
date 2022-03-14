interface Test {
    fun iss() : String
}

class TestImp : Test{
    override fun iss(): String {
        return "shy"
    }

}

fun main() {
    val shy = TL("你爹",20)
    KtT(shy).show()
}