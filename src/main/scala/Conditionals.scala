object Conditionals extends  App{

  val grade = 76
  val gradeIs = "the grade is"

  if (grade>= 90){
    println(gradeIs + " A")
  } else if (grade>= 80){
    println(gradeIs + " B")
  } else if (grade>= 70){
    println(gradeIs + " C")
  }else if (grade>= 60){
    println(gradeIs + " D")
  }else if (grade>= 50){
    println(gradeIs + " E")
  }else{
    println(gradeIs + " F")
  }
}
