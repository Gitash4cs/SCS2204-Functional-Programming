object Q1 extends App{
  //create objects
  var p1 = new Point(2,3)
  var p2 = new Point(1,5)

  //display created objects
  println(p1)
  println(p2)

  //display addition of two points
  println("Add p1 and p2 points : " + (p1 + p2))

  //move point
  var p3 = p1.move(5,3)
  println("Move p1 by given distance 5 and 3 : " + p3)

  println("Distance between p1 and p2 : " + p1.distance(p2))

  println("Invert of p1 : " + p1.invert())

}


case class Point(a:Int, b:Int){
  var x:Int = a
  var y:Int = b

  //function for add two given points
  def +(p:Point): Point = Point(this.x + p.x, this.y + p.y)

  // function for Move point by distance dx and dy
  def move(dx: Int, dy: Int): Point = Point(this.x + dx, this.y + dy)

  // function for Get the distance between two points
  def distance(pt:Point) : Double = {
    var xD:Int = this.x - pt.x
    var yD:Int = this.y - pt.y
    var dist: Int = xD*xD + yD*yD
    scala.math.sqrt(dist)
  }

  //function for switch the x and y coordinates.
  def invert(): Point = Point(this.y, this.x)
}