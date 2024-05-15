package com.rockthejvm

object Basics extends App {
  val meaningOfLife: Int = 10

  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val interpolatedString = s"The meaning of life is $meaningOfLife"

  val ifExpression = if (meaningOfLife > 40) 75 else 10
  val randomUser: String = "Rejoice"

  val userName = {
    val name: String =
      if (randomUser == "Joy") "Found"
      else "Not Found"

    name + ' ' + "loves coding with Scala!."
  }

  println(userName)
}
