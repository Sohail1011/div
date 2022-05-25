class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String
) : BaseCoffeeMachine(price, color) {
    override val brand: String
        get() = "Oster"

    override fun makeCoffee(type: String): String {
        return "Your $type is Ready"
    }

    override fun machineInfo(): String {
        return super.machineInfo()
    }

}