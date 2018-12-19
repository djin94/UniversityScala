package domain.university

import scala.collection.mutable.ListBuffer

class Faculty(val name: String) {
  var departments = new ListBuffer[Department]
  var audiences = new ListBuffer[Audience]

  def add(department: Department): Unit = departments += department

  def remove(department: Department): Unit = departments -= department

  def add(audience: Audience): Unit = audiences += audience

  def remove(audience: Audience): Unit = audiences -= audience
}
