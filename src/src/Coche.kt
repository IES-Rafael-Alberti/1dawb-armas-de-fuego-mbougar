class Coche(
    municion: Int,
    tipoMunicion: String,
    danio: Int,
    radio: TipoRadio
): ArmaDeFuego("Coche", municion, 1, tipoMunicion) {

    override var danio: Int = danio
        set(value) {
            require(value in 1..2)
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            field in TipoRadio.entries.toTypedArray()
            field = value
        }

}