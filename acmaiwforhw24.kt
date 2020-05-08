/*****************************************************************************************
* Lviv'2020 // ACM // Kotlin functional programming(by quicksort implementation example) *
*    file: acmiwforhw24.kt                                                               *
******************************************************************************************/
val INPUT_DATA = intArrayOf( 5, 7, 3, 4, 1, 9, 2, 8, 10, 6 )

fun <T : Comparable<T>> List<T>.quickSort(): List<T> = 
    if(size < 2) this
    else {
        val pivot = first()
        val (lesserPart, greaterPart) = drop(1).partition { it <= pivot}
        lesserPart.quickSort() + pivot + greaterPart.quickSort()
    }
    
fun <T : Comparable<T>> List<T>.print(): List<T> = 
    if(size == 0) {
	    this
	}
    else {
        val others = drop(1)
        print(first().toString() + " ")
        others.print()
    }    

fun main(args: Array<String>) {
    //println(INPUT_DATA.toList().quickSort())
    val input = INPUT_DATA.toList()
    val output = input.quickSort()
    println("input:")
    input.print()
    println()
    println("output:")
    output.print()
    println()    
}