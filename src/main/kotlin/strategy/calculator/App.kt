/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package strategy.calculator

class App {
    val greeting: String
        get() = "Hello world."

        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                println(App().greeting)
            }
        }
    }
