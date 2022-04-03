fun main(args: Array<String>) {
    val t = Integer.parseInt(readLine())
    repeat(t) { index ->
        val list = readLine()!!.split(" ").map(String::toInt)
        val R = list[0]
        val C = list[1]
        var result:String = ""
        var firstLine = "..+"
        var secondLine = "..|"
        var bodyLine = ""
        repeat(C-1) {
            firstLine = firstLine + "-+"
            secondLine = secondLine + ".|"
        }
        firstLine = firstLine + "\n"
        secondLine = secondLine + "\n"

        repeat((R-1)*2) { index ->
            if(index % 2 == 0){
                bodyLine = bodyLine + "+" + "-+".repeat(C) + "\n"
            } else {
                bodyLine = bodyLine + "|" + ".|".repeat(C) + "\n"
            }
        }
        var endLine = "+" + "-+".repeat(C)

        if(index+1 != t) {
            println("Case #${index+1}:")
            println("${firstLine}${secondLine}${bodyLine}${endLine}")
        }else{
            println("Case #${index+1}:")
            print("${firstLine}${secondLine}${bodyLine}${endLine}")
        }

    }
}
