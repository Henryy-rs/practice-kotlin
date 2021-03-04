
import kotlinx.*
import java.util.*


//비동기처리 코루틴
//global scope, CoroutineScope: Dispatcher사용
fun main() {

    var x = 10
    var y = 20
    println(Arrays.toString(swap(x, y)));


}

fun swap(a : Int, b: Int): Array<Int>{

    var temp_a: Int = a
    var temp_b: Int = b

    var result = arrayOf(temp_b, temp_a)

    return result
}