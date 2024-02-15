import kotlin.random.Random

fun main() {

    var armas = listOf(
        Pistola(Random.nextInt(5, 10),"9mm", Random.nextInt(1, 6), TipoRadio.values()[Random.nextInt(0, 2)]),
        Rifle(Random.nextInt(5, 10),"7.62x51mm", Random.nextInt(5, 11), TipoRadio.values()[Random.nextInt(1, 3)]),
        Rifle(Random.nextInt(5, 10),"5.56x45mm", Random.nextInt(5, 11), TipoRadio.values()[Random.nextInt(1, 3)]),
        Bazooka(Random.nextInt(5, 10),"60mm", Random.nextInt(10, 31), TipoRadio.values()[Random.nextInt(3, 5)]),
        Bazooka(Random.nextInt(5, 10),"RPG", Random.nextInt(10, 31), TipoRadio.values()[Random.nextInt(3, 5)])
    )

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")

    var disparos = (1..12).map { armas.random() to (1..3).random() }

    disparos.forEach { (first, second) -> repeat(second) { println(first.dispara()); println(first.mostrarInfo())} }

    println("\nAhora añadimos Casa, Coche y Bocadillo\n")

    armas = listOf(
        Pistola(Random.nextInt(5, 10),"9mm", Random.nextInt(1, 6), TipoRadio.values()[Random.nextInt(0, 2)]),
        Rifle(Random.nextInt(5, 10),"7.62x51mm", Random.nextInt(5, 11), TipoRadio.values()[Random.nextInt(1, 3)]),
        Rifle(Random.nextInt(5, 10),"5.56x45mm", Random.nextInt(5, 11), TipoRadio.values()[Random.nextInt(1, 3)]),
        Bazooka(Random.nextInt(5, 10),"60mm", Random.nextInt(10, 31), TipoRadio.values()[Random.nextInt(3, 5)]),
        Bazooka(Random.nextInt(5, 10),"RPG", Random.nextInt(10, 31), TipoRadio.values()[Random.nextInt(3, 5)]),
        Casa(Random.nextInt(5, 10),"confetti", Random.nextInt(1, 3), TipoRadio.values()[Random.nextInt(0, 2)]),
        Coche(Random.nextInt(5, 10),"ráfagas de luz larga", Random.nextInt(1, 3), TipoRadio.values()[Random.nextInt(0, 2)]),
        Bocadillo(Random.nextInt(5, 10),"olor a jamón", Random.nextInt(1, 3), TipoRadio.values()[Random.nextInt(0, 2)])

    )

    disparos = (1..9).map { armas.random() to (1..3).random() }

    disparos.forEach { (first, second) -> repeat(second) { println(first.dispara()); println(first.mostrarInfo())} }
}