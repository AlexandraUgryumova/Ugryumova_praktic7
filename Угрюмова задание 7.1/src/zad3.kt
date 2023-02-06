//7(2)
fun main(){
    println("x: ")
    val x: Double = readLine()!!.toDouble()
    println("y: ")
    val y: Double = readLine()!!.toDouble()
    println("z: ")
    val z: Double = readLine()!!.toDouble()
    val a: Double = (3+ Math.pow(Math.E, y-1))/(1+Math.pow(x, 2.0)*Math.abs(y - Math.tan(z)))
    println(a)
}