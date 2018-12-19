package domain.university

import scala.collection.mutable.ListBuffer

class University(val name: String) {
  var faculties = new ListBuffer[Faculty]

  def add(faculty: Faculty): Unit = faculties += faculty

  def remove(faculty: Faculty): Unit = faculties -= faculty
}
