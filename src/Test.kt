import java.lang.Math.PI
import java.lang.Math.sqrt
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.pow

fun main(){
    println(
        "insert 1 - 1 задание \n" +
                "insert 2 - 2 задание \n" +
                "insert 3 - 3 задание и так далее всего их 9 \n"
    )
    loop@ while(true) {
        val read = Scanner(System.`in`)
        val input = read.nextInt();
        when (input) {
            1 -> rndm()
            2 -> seconds()
            3 -> segment()
            4 -> radians()
            5 -> thirdDigit()
            6 -> trackLength()
            7 -> train()
            8 -> bank()
            9 -> reverseNumber();
            else -> {
                print("no exercise")
            }
        }
    }
}
fun rndm(){
    val rnds = (32..122).random()
    println(rnds)
    println(rnds.toChar())
    println("is digit "+rnds.toChar().isDigit())
    println("is letter "+rnds.toChar().isLetter())
    println("letter or digit "+rnds.toChar().isLetterOrDigit())
}
fun seconds() {
        val read = Scanner(System.`in`)
        println("insert hours ")
        val hours= read.nextInt();
        println("insert minutes ")
        val minutes= read.nextInt();
         println("insert seconds ")
        val seconds = read.nextInt();
        println("input = $hours : $minutes : $seconds")
        val a = hours * 3600
        val b = minutes * 60
        val sum = a + b + seconds
        println(sum)
}
fun segment(){
    val reader = Scanner(System.`in`)
    println("Enter fathoms:")
    val fat:Int = reader.nextInt()

    println("Enter arshins:")
    val arsh:Int = reader.nextInt()

    println("Enter vershoks:")
    val ver:Int = reader.nextInt()

    val result = ((ver*4.445) + (arsh*71.12) + (213.36*fat))/100.0
    println("in meters: $result")
}
fun radians(){
    val read = Scanner(System.`in`)
    println("insert degrees ")
    val degrees= read.nextInt();
    println("insert minutes ")
    val minutes= read.nextInt();
    println("insert seconds ")
    val seconds = read.nextInt();

    val angel = degrees + minutes/60.0 + seconds/3600.0

    val rads = (angel* PI)/180

    println(rads)
}
fun thirdDigit(){
    val read = Scanner(System.`in`)
    println("insert number ")
    val number= read.nextInt();
    val a = number % 1000
    val third = a / 100
    println(third)
}

fun trackLength() {
    val read = Scanner(System.`in`)
    println("insert x1 ")
    val x1 = read.nextDouble();
    println("insert y1 ")
    val y1 = read.nextDouble();
    println("insert x2 ")
    val x2 = read.nextDouble();
    println("insert y2 ")
    val y2 = read.nextDouble();
    val length = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    println(length)
}
fun train(){
    val read = Scanner(System.`in`)

    println("insert hours ")
    val hours= read.nextInt();
    println("insert minutes ")
    val minutes= read.nextInt();
    println("train left at $hours:$minutes")


    println("insert hours ")
    val hours1= read.nextInt();
    println("insert minutes ")
    val minutes1= read.nextInt();
    println("train arrived at $hours1:$minutes1")

    val time1 = hours* 3600000 + minutes*60000
    val time2 = hours1* 3600000 + minutes1*60000
    val time3 = time2-time1

    val hms = String.format(
        "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(time3.toLong()),
        TimeUnit.MILLISECONDS.toMinutes(time3.toLong()) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time3.toLong())),
        TimeUnit.MILLISECONDS.toSeconds(time3.toLong()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time3.toLong()))
    )
    println("Travel time: $hms")

}

fun bank(){
    val read = Scanner(System.`in`)
    println("insert money ")
    var num = read.nextInt()

    var i = 0
    while(i<3){
        num += num / 10
        i++
    }
    println(num)

}

fun reverseNumber(){

    val read = Scanner(System.`in`)
    println("insert number ")
    var num = read.nextInt()
    var num2 = 0

    while (num != 0) {
        val digit = num % 10
        num2 = num2 * 10 + digit
        num /= 10
    }

    println("Reversed Number: $num2")

}