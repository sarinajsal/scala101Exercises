object Conditionals2 extends App{

  val age = 13
                                  //18  15   12    pg8   u4
  val ratings: List[String] = List("U","PG","12A","15","18")
  val ratingsNum: List[Int] = List(4, 8, 12, 15, 18)
  if (age >= 4 && age < 8) {
    println(ratings.head)

  }else if (age >=8 && age< 12){
    println(ratings.reverse.takeRight(4))
  }else if (age >= 12 && age<15) {
    println(ratings.reverse.takeRight(3))
  }else if (age>= 15 && age< 18){
    println(ratings.reverse.takeRight(2))
  }else if (age >= 18){
    println(ratings)
  }
}
