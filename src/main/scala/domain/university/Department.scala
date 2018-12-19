package domain.university

import scala.collection.mutable.ListBuffer

class Department(val name: String) {
  var teachers = new ListBuffer[Teacher]
  var groups = new ListBuffer[Group]
  var subjects = new ListBuffer[Subject]

  def add(teacher: Teacher): Unit = teachers += teacher

  def remove(teacher: Teacher): Unit = teachers -= teacher

  def add(group: Group): Unit = groups += group

  def remove(group: Group): Unit = groups -= group

  def add(subject: Subject): Unit = subjects += subject

  def remove(subject: Subject): Unit = subjects -= subject
}