fun main() {
    var list = mutableListOf(100, 89, 90, 95, 105, 2, 20, 60)

    for (pass in 0 until (list.size - 1)) {
        for (position in 0 until (list.size - 1)) {
            var tmp: Int
            if (list[position] > list[position + 1]) {
                tmp = list[position]
                list[position] = list[position + 1]
                list[position + 1] = tmp
            }
        }
    }

    println(list.size)
    println(list.lastIndex)
    println(list.lastIndexOf(105))
    print(list)
}