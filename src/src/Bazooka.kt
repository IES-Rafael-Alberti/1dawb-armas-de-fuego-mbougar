class Bazooka (
    municion: Int,
    tipoMunicion: String,
    danio: Int,
    radio: TipoRadio
): ArmaDeFuego("Bazooka", municion, 3, tipoMunicion) {

    override var danio: Int = danio
        set(value) {
            require(value in 10..30)
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            field in TipoRadio.entries.toTypedArray()
            field = value
        }

}