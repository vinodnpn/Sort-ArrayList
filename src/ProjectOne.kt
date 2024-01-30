class ProjectOne {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            inputNumber()
        }
    }
}

fun inputNumber() {
    val numbers: ArrayList<Int> = ArrayList() //gharko ma ta vaxa
    var option = ""
    do {
        println("How many numbers do you want to entry?")
        val limit = readLine()?.toIntOrNull() ?: 0

        for (i in 1..limit) {
            println("Enter a number")
            val number = readLine()?.toIntOrNull() ?: 0
            numbers.add(number)
        }
        println("Do you want to enter more? Y/N")
        option = readLine() ?: ""
    } while (option.toUpperCase() != "N")


    val sortedNumbers = sortNumbers(numbers)
    println("Your Number list in ascending order : $sortedNumbers")
}


fun sortNumbers(numList: ArrayList<Int>): ArrayList<Int> {
    val lengthOfList = numList.size - 1

    for (i in 0..lengthOfList) {
        for (j in i..lengthOfList) {
            if (numList[i] > numList[j]) {
                val temp = numList[j]
                numList[j] = numList[i]
                numList[i] = temp
            }
        }
    }
    return numList
}


