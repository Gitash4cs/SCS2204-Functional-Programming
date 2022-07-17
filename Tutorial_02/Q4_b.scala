object Q4_b extends App{
  //Function for Calculate the number of attendees
  def attendees(price:Int):Int= {
    return 120 + ((15 - price) / 5 )* 20    //15 price for 120 attendees
  }

  //Function for Calculate the income
  def income(price:Int):Int ={
    return attendees(price) * price
  }

  //Function for Calculate the cost by giving the ticket price
  def cost(price:Int):Int={
    return 500 + attendees(price) * 3   //attendee costs -> 3 Rupees
  }

  //Function for Calculate the profit
  def profit(price:Int):Int = {
    return income(price)- cost(price)
  }

  println(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35),profit(40))
  //answer -> (-180,480,940,1200,1260,1120,780,240)
}
