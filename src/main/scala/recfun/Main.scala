package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int ={
    if (c == 0 && r == 0)
      return 1
    if (c < 0 || c > r)
      return 0
    pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
    
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var count = 0
    def innerBalance(chars: List[Char], count: Int): Boolean = {
      if (chars.isEmpty){
    	  return count == 0
      }
      if (count < 0)
        return false
      return false
    }
    return innerBalance(chars, count)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
