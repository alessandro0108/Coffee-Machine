package machine

var water = 400
var milk = 540
var coffeeBeans = 120
var cups = 9
var money = 550

fun main() {
    do {
        println()
        println(CoffeeMachine.currentState.prompt)
        val input: String = readLine()!!

        CoffeeMachine.processInput(input)

    } while (CoffeeMachine.currentState != CoffeeMachine.Exiting)
}

enum class CoffeeMachine(val prompt: String) {
    ChoosingAction("Write action (buy, fill, take, remaining, exit): "),
    ChoosingCoffeeType("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: "),
    AddingWater("Write how many ml of water do you want to add: "),
    AddingMilk("Write how many ml of milk do you want to add: "),
    AddingCoffeeBeans("Write how many grams of coffee beans do you want to add: "),
    AddingDisposableCups("Write how many disposable cups of coffee do you want to add: "),
    Exiting("");

    companion object {
        var currentState: CoffeeMachine = ChoosingAction
        fun processInput(input: String) {
            when(currentState) {
                ChoosingAction -> {
                    processAction(input)
                }
                ChoosingCoffeeType -> {
                    processCoffeeType(input)
                }
                AddingWater -> {
                    addWater(input.toInt())
                    currentState = AddingMilk
                }
                AddingMilk -> {
                    addMilk(input.toInt())
                    currentState = AddingCoffeeBeans
                }
                AddingCoffeeBeans -> {
                    addCoffeeBeans(input.toInt())
                    currentState = AddingDisposableCups
                }
                AddingDisposableCups -> {
                    addCups(input.toInt())
                    currentState = ChoosingAction
                }
            }
        }

        private fun processAction(input: String) {
            when (input) {
                "buy" -> {
                    currentState = ChoosingCoffeeType
                }
                "fill" -> {
                    currentState = AddingWater
                }
                "take" -> {
                    takeAction()
                    currentState = ChoosingAction
                }
                "remaining" -> {
                    showMachineContent()
                    currentState = ChoosingAction
                }
                "exit" -> {
                    currentState = Exiting
                }
            }
        }

        private fun processCoffeeType(input: String) {
            when (input) {
                "1" -> buyEspresso()
                "2" -> buyLatte()
                "3" -> buyCappuccino()
                "back" -> print("")
                else -> println("unavailable")
            }
            currentState = ChoosingAction
        }

        private fun showMachineContent() {
            println()
            println("The coffee machine has:")
            println("$water of water")
            println("$milk of milk")
            println("$coffeeBeans of coffee beans")
            println("$cups of disposable cups")
            println("$money of money")
            println()
        }

        private fun buyEspresso() {
            //For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
            if (areThereEnoughResources(250,0,16) ) {
                water -= 250
                coffeeBeans -= 16
                money += 4
                cups--
            }
        }

        private fun buyLatte() {
            //For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
            if (areThereEnoughResources(350,75,20)) {
                water -= 350
                milk -= 75
                coffeeBeans -= 20
                money += 7
                cups--
            }
        }

        private fun buyCappuccino() {
            //for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
            if (areThereEnoughResources(200,100,12)) {
                water -= 200
                milk -= 100
                coffeeBeans -= 12
                money += 6
                cups--
            }
        }

        private fun addWater(quantity: Int) {
            water += quantity
        }

        private fun addMilk(quantity: Int) {
            milk += quantity
        }

        private fun addCoffeeBeans(quantity: Int) {
            coffeeBeans += quantity
        }

        private fun addCups(quantity: Int) {
            cups += quantity
        }

        private fun takeAction() {
            println("I gave you $$money")
            money = 0
        }

        private fun areThereEnoughResources(neededWater: Int, neededMilk: Int, neededCoffeeBeans: Int): Boolean {
            val waterCups = if (neededWater > 0) { water / neededWater } else { 1 }
            if (waterCups == 0) println("Sorry, not enough water!")

            val milkCups = if (neededMilk > 0) milk / neededMilk else 1
            if (milkCups == 0) println("Sorry, not enough milk cups!")

            val coffeeCups = if (neededCoffeeBeans > 0) coffeeBeans / neededCoffeeBeans else 1
            if (coffeeCups == 0) println("Sorry, not enough coffee beans!")

            if (cups == 0) println("Sorry, not enough disposable cups!")

            val result = cups >= 1 && waterCups >= 1 && milkCups >= 1 && coffeeCups >= 1
            if (result) println("I have enough resources, making you a coffee!")

            println()

            return result
        }

    }
}

