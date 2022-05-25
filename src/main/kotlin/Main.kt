fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo();
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)
    val simpleCoffeeMachine = CoffeeMachine(2000.0, "Black")
    val coffe2 = simpleCoffeeMachine.makeCoffee("Espresso")
    print(coffe2)
}