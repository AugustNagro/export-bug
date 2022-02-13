package com.example.b

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.*

object C:

  def retry(i: Int)(fn: => Unit): Unit =
    for i <- 0 until i do fn

object B:
  export C.*

@main def test(): Unit =
  import B.*
  retry(2)(println("abcd"))