fun main() {
    var list = mutableListOf(100, 89, 90, 95, 105, 2, 20, 60)

    var currentMinimum: Int
    var currentItem: Int

    for (element in 0 until (list.size)) {
        currentMinimum = list[element]
        currentItem = element

        for (item in element + 1 until (list.size)) {
            if (currentMinimum > list[item]) {
                currentMinimum = list[item]
                currentItem = item
            }
        }

        list[currentItem] = list[element]
        list[element] = currentMinimum

    }

    println(list)
}