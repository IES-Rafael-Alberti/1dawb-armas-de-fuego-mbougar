import kotlin.random.Random

abstract class ArmaDeFuego(
    private val nombre: String,
    private var municion: Int,
    private val municionARestar: Int,
    private val tipoDeMunicion: String) {

    abstract val danio: Int
    abstract val radio: TipoRadio

    fun dispara(): String {

        if (municion < municionARestar) {
          return recarga()
        } else {
            municion -= municionARestar
            return "$nombre dispara. Munición restante: $municion."
        }
    }

    fun recarga(): String {

        when {
            cantidadMunicionExtra >= (municionARestar * 2 - municion) -> {
                municion += (municionARestar * 2 - municion)
                return "$nombre ha recargado ${municionARestar * 2} disparos. Munición: $municion"
            }
            cantidadMunicionExtra >= (municionARestar - municion) -> {
                municion += (municionARestar - municion)
                return "Recarga parcial"
            }
            else -> {
                return "No hay suficiente munición extra para recargar."
            }
        }
    }

    fun mostrarInfo(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: ${radio.desc}"
    }

    companion object {
        var cantidadMunicionExtra = Random.nextInt(5,16)
    }

}