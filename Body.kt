public class Body {

    fun main(array: StringArray) {
        var value = sum(1, 2, 3, 4, 5, 6)
        println(value)
    } 

    fun sum(vararg args: Int): Int{
        var sum
        args.foreach {
            sum += it
        }
        return sum
    }

}