package domain.university

import scala.collection.mutable.ListBuffer

class Group(val name: String) {
  var students = new ListBuffer[Student]

  def add(student: Student): Unit = students += student

  def remove(student: Student): Unit = students -= student
}
