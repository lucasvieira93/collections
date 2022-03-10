package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    val salariosFilter = salarios.filter { it > 2500 }
    println("")
    salariosFilter.forEach{println(it)}

}