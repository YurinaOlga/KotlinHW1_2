fun main() {
    val likes = 1111
    val likesLastDigit = likes%10
    val likesSecondOrderDigit =  (likes/10)%10
    val variantEnding = if (likesLastDigit == 1 && likesSecondOrderDigit !=1) " человеку" else " людям"
    println("Понравилось " + likes + variantEnding )
  }
