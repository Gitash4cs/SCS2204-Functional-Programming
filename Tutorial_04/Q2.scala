
object Q2{

  //function for find number is even or odd
  def IsEven(num:Int): Unit = num match{
    case num if num<1 => println("Negative/Zero");
    case num if num%2==0 => println("Even number");
    case _ => println("Odd number");
  }

  def main(arg:Array[String]): Unit = {
    var input:Int = 0;
    //check is there any character got as input when this compile
    if(arg.length > 0){
      //convert a stated character into an integer
      input = arg(0).toInt;
    }
    //call isEven function
    IsEven(input);
  }
}
