fun main() {
    println("Hello World!")
    println(calculateSum(20,40))
   checkVowels("A")
//    countEvenNumbers(arrayOf(23,2,34,6,78,6,7))

    val manager = InventoryManager()


    manager.addProduct(Product(1, "Laptop", 999.99, 10))

    manager.updateProduct(1, "Laptop Pro", 1299.99, 5)


    manager.removeProduct(1)
}
//7. Write a Kotlin program to calculate the sum of all numbers between two given numbers.
fun calculateSum(number1:Int,number2:Int):Int{
    var count = 0
    for(i in number1..number2) {
        count +=i
    }
    return count
}
//3. Write a Kotlin program to check if a given character is a vowel or a consonant.

fun checkVowels(letter:String){
   val name = letter.lowercase()
    val vowels = "aeiou"
    if(name in vowels){
        println("$letter in a vowel")

    }

}

//9. Write a Kotlin program to count the number of even and odd elements in an array.
//fun countEvenNumbers(numbers:Array<Int>):Int{

data class Product(
    val id: Int,
    var name: String,
    var price: Double,
    var quantity: Int
)


class InventoryManager {
    val inventory = mutableListOf()

    // Add
    fun addProduct(product: Product) {
        inventory.add(product)
    }

    // Update
    fun updateProduct(productId: Int, newName: String, newPrice: Double, newQuantity: Int) {
        val product = inventory.find { it.id == productId }
        product?.apply {
            var name = newName
            var price = newPrice
            var quantity = newQuantity
        }
    }

    // Remove
    fun removeProduct(productId: Int) {
        val product = inventory.find { it.id == productId }
        product?.let { inventory.remove(it) }
    }
}

