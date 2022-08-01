object Q1 extends App{

  //function for calculate interest amount for the deposit amount
  def interestRate(deposit:Double):Double = deposit match{
    case deposit if (deposit < 0) => 0
    case deposit if (deposit <= 20000) => deposit * 0.2
    case deposit if (deposit <= 200000) => deposit * 0.4
    case deposit if (deposit <= 2000000) => deposit * 0.35
    case deposit if (deposit > 2000000) => deposit * 0.65
  }

  //get user input of deposit amount
  println("Enter the deposit amount : ")
  var amount:Double = scala.io.StdIn.readDouble()

  printf("Total interest for the deposited money earns in a year : Rs. %.2f" , interestRate(amount))

}
