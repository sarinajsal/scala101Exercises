object Boats extends App {

  class Boat {
    var length: Int = 0
    var width: Int = 0
    var speed: Int = 0

//     def isFasterThan(anotherBoat: Boat): Boolean {
//      if(anotherBoat.speed > boat.speed){
//     false
//     }
//    }
  }

  trait hasArtillery {
    val hasArtillary: Boolean
  }

  trait hasDesigner {
    val hasDesigner: Boolean
  }

 class Sailboat (val numSails: Int, val hasOars: Boolean, val canTrack: Boolean ) extends Boat {

 }


  class LuxurySailBoat (val hasJacuzzi: Boolean, val hasBooze: Boolean) extends Sailboat(2,false, false) {

  }

  class PirateShip (val numGangPlanks: Int) extends Sailboat(3,true,true){

  }



 val luxurySailboatMako = new LuxurySailBoat(true, true) with hasDesigner{
   override val hasDesigner: Boolean = true
   speed = 2
 }

  val pirateShipRolo = new PirateShip(4) with hasArtillery{
    override val hasArtillary: Boolean = true
    speed = 1
  }

  println(luxurySailboatMako.hasJacuzzi.toString)
  println(pirateShipRolo.numGangPlanks.toString)

}
