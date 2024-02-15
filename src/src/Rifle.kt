class Rifle (
    municion: Int,
    tipoMunicion: String,
    danio: Int,
    radio: TipoRadio
): ArmaDeFuego("Rifle", municion, 2, tipoMunicion) {

    override var danio: Int = danio
        set(value) {
            require(value in 5..10)
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            field in TipoRadio.entries.toTypedArray()
            field = value
        }
}