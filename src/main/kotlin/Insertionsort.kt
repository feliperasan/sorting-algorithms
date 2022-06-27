fun main() {
    var list = mutableListOf(100, 89, 90, 95, 105, 2, 20, 60)

    var lastSortedIndex: Int
    var extracted: Int

    for (i in 0 until list.size) {
        extracted = list[i]
        lastSortedIndex = i

        for (j in lastSortedIndex downTo 0 step 1) {
            if (list[j] > extracted) {
                list[j + 1] = list[j]
                list[j] = extracted
                print(list)
            }
        }
    }
}