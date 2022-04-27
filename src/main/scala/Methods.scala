object Methods extends App {

  val input1 = 1
  val input2 = 2

  def getBigVal(input1: Int, input2: Int): String = {
  if (input1 > input2) {
     "first"
  } else if (input1 < input2){
    "second"
  } else if (input1 == input2){
    "same"
  } else {
    "what"
  }

  }

  val firstName = "sarina"
  val surname = "salamon"
  def nameLength (firstName: String, surname: String): Int = {
    if(firstName.length> surname.length){
      firstName.length
    } else if (firstName.length < surname.length) {
      surname.length
    } else {
      0
    }
  }

  println(nameLength(firstName, surname))

}
