object Q01 extends App{

  //function for calculate Area of a disk
  def AreaOfDisk(radius:Int): Double ={
    return math.Pi * radius * radius;   //pi contains in package object of scala math
  }

  val radius:Int = 5;
  printf("Area of a disk = %f",AreaOfDisk(radius)) //answer :- 78.539816

}
