fun main() {

    val mutable = mutableListOf<String>()
    for (i in 1..5000000) {
        mutable.add(i.toString())
    }

    // forEach
    val start = System.currentTimeMillis()

    val forEachProcess = mutable.forEach{
        println(it)
    }

    val end = System.currentTimeMillis()
    val forEachReturnType = forEachProcess::class.simpleName

    // onEach
    val secondStart = System.currentTimeMillis()

    val onEachProcess = mutable.onEach{

        println(it)
    }

    val secondEnd = System.currentTimeMillis()
    val onEachReturnType = onEachProcess::class.simpleName

    // Results
    println("forEach: ${end - start} ms Return Type: $forEachReturnType")
    println("onEach: ${secondEnd - secondStart} ms Return Type: $onEachReturnType")

}