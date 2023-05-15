fun main() {
    val likes = 61
    val likesLastDigit = likes%10
    val variantEnding = if (likesLastDigit == 1) " человеку" else " людям"
    println("Понравилось " + likes + variantEnding )
}