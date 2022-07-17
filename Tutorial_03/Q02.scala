object Q02 extends App{
  //function for convert celsius temperature into Fahrenheit
  def celsiusToFahrenheit(C:Double):Double ={
    var F:Double = 0;
    F = C * 1.80 + 32.00   //equation for converting to Fahrenheit
    return F;
  }
  //print output
  println(celsiusToFahrenheit(35));

}
