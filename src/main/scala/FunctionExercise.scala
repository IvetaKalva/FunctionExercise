import scala.io.StdIn.readLine
object FunctionExercise extends App {
  def isPalindrome(text:String): Boolean = {
    if(text.toLowerCase == text.toLowerCase.reverse) return true
    else return false
  }
    //TODO actually check if the text reads the same from both ways
    //"alus arī ir sula" that's a palindrome
    //text.reverse should work :)

    if (isPalindrome(readLine("Input Your word: "))) println("That's a palindrome")
    else println("That's NOT a palindrome")
}