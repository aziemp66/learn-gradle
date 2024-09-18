package org.example

import StringUtil
import com.google.gson.Gson
import com.example.Product

class App {
  val greeting : String
    get() = "Hello From Azie!"
}

fun main() {
  println("Hello World!")
  val app = App()
  println(app.greeting)

  val parser = Gson()

  val product = Product("12","sabun")

  println(StringUtil.toUpper(product.name))
}