package domain.university

class Student(override val firstName: String, override val patronym: String, override val lastName: String,
              val numberOfMarkBook: String) extends Person {
}
