fun main(args: Array<String>) {
    val t = Integer.parseInt(readLine())
    repeat(t) { index ->
        val N = Integer.parseInt(readLine())
        val si = readLine()!!.split(" ").map(String::toInt)
        var result:String = ""
        var sortedSi = quicksort(si)
        var checkCompleted = false
        if(N == 1){
            if(index+1 != t) {
                println("Case #${index+1}: 1")
            }else{
                print("Case #${index+1}: 1")
            }
        } else {
            var tempindex = 0
            var tempelem = 0
            for ((index, elem) in sortedSi.withIndex()) {
                if(elem < index+1){
                    tempindex = index+1
                    tempelem = elem
                }
            }
            if(index+1 != t) {
                println("Case #${index+1}: ${sortedSi.size - (tempindex-tempelem)} ")
            }else{
                println("Case #${index+1}: ${sortedSi.size - (tempindex-tempelem)} ")
            }
        }
    }
}

fun quicksort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]

    val equal = items.filter { it == pivot }
//    println("pivot value is : "+equal)

    val less = items.filter { it < pivot }
//    println("Lesser values than pivot : "+less)

    val greater = items.filter { it > pivot }
//    println("Greater values than pivot : "+greater)

    return quicksort(less) + equal + quicksort(greater)
}
