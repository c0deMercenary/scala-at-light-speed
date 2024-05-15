package com.rockthejvm

object ObjectOrientation extends App{
  class Person {
    val age: Int = 0
    val country: String = "Nigeria"

    def travel(from: String, to: String): Unit = println(s"Traveling from $from to $to")
  }

  class Student(val name: String) extends Person {

  }

  //polymorphism
  val aNewStudent: Person = new Student("Henry")

  //abstract
  abstract class WalkingPerson {
    val hasLegs = true
    def walk(): Unit
  }

  //interface
  trait Creative {
    def create(): Unit
  }

}
