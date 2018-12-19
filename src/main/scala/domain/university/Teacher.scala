package domain.university

import scala.collection.mutable.ListBuffer

class Teacher(override val firstName: String, override val patronym: String, override val lastName: String,
              val employeeId: Int) extends Person {
  val subjects = new ListBuffer[Subject]

  def add(subject: Subject): Unit = subjects += subject

  def remove(subject: Subject): Unit = subjects -= subject
}
