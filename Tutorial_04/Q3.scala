object Q3 extends App{

  //function for convert a string to upper case
  def ToUpper(text:String): String ={
    val len:Int = text.length
    val n:Int = 0
    var result = ""
    var outString = ""

    //do loop for entire given string
    for(n <- 0 until len){
      //if the character is lowers case covert to upper case
      // a = 97 && z = 122
      if(text(n).toInt >= 97 && text(n).toInt <= 122){
        //char output take as a string input to results
        result = s"${(text(n).toInt - 32).toChar}"
      }
      else{
        result = s"${text(n)}"
      }
      //concat() method provides to concatenate outString and result string
      outString = outString.concat(result)
    }

    return outString    //return a string
  }

  //function for convert a string to upper case
  def ToLower(text:String): String ={
    val len = text.length
    val n:Int=0
    var result = ""
    var outString = ""

    //do loop for entire given string
    for(n <- 0 until len){
      //if the character is upper case covert to lower case
      // A = 65 && Z =9 0
      if(text(n).toInt >= 65 && text(n).toInt <= 90){
        //char output take as a string input to results
        result = s"${(text(n).toInt + 32).toChar}"
      }
      else{
        result = s"${text(n)}"
      }
      //concat() method provides to concatenate outString and result string
      outString = outString.concat(result)
    }

    return outString    //return a string
  }

  //function with an input of type String and also outputs a String
  //this function provide call different function with different parameter
  def formatNames(fun:(String) => String , input: String): String = fun(input)


  //assign values to text array
  val text = Array("Benny","Niroshan","Saman","Kumara")


  //call formatName function for get given outputs
  println( formatNames(ToUpper, text(0)) )      // Benny  ->  BENNY
  //substring() method is utilized to find the sub-string from the stated String
  println( formatNames(ToUpper, text(1).substring(0,2)) + text(1).substring(2) )  //Niroshan  ->  NIroshan
  println( formatNames(ToLower, text(2)) )      // Saman  ->  saman
  println( text(3).substring(0,5) + formatNames(ToUpper, text(3).substring(5)) ) //Kumara  ->  KumarA

}
