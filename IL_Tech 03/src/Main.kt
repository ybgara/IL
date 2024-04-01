fun main() {
    println("Control Flow")

    println()
    // EXPRESSION & STATEMNT
    var now: Int = 9
    var openOffice: Int = 10

    val office = if (now > openOffice) "Office Already Open" else "Office Close"
    println(office)

    if (now > openOffice){
        println("Office Already Open")
    }else{
        println("Office Close")
    }

    println()
    // WHEN EXPRESSION
    val finalExam = 'D'
    when(finalExam){
        'A' -> println("Very Good")
        'B' -> println("Good")
        'C' -> println("Bad")
        'D' -> {
            println("Halo Halo Halo ")
            println("Halo Halo Halo ")
        }
    }



    val name = "Gara"
    when(name){
        is String -> println("Ini String")
        !is String -> println("Bukan String")
    }

    val examValue = 90
    when{
        examValue > 60 -> println("Not Bad")
        examValue > 80 -> println("Go Job")
        else -> println("Try Again")
    }

    println()
    // WHILE & DO WHILE

    // WHILE
    var i = 0 ;
    while(i == 5){
        println("Infinite Learning")

        i++
    }

    // FOR
    val nilai =  arrayOf("A", "B", "C", "D")
    for(x in nilai){
        print(x + " ")
    }
    println("\n")

    // DO WHILE
    var counter = 1
    do {
        println("Ini iterasi Ke-$counter")
        counter++
    }while (counter < 5)


    println()
    // RANGE
    val rangeInt = 1..10

    println(rangeInt.step)

    rangeInt.forEach{
        print("$it" + " ")
    }

    println()
    println(rangeInt.step)

    val rangeChar = 'A'.rangeTo('Z')
    rangeChar.forEach{
        print("$it" + " ")
    }
    println()

    val range = 1.rangeTo(10)
    val ranges = 1..5
    for(i in range){
        println("value is $i !")
    }


    println()
    val angkaMundur = 10 downTo 1
    for ( i in angkaMundur ){
        println(i)
    }

    println()
    // FOR EACH
    angkaMundur.forEach{
        println("Number = $it")
    }

    // BREAK & CONTINUE

    println()
    // CONTINUE
    val listofInt = listOf(1,2,3, null, 5, null, 7)
    for ( i in listofInt){
        if ( i == null)
            continue

        println("Number $i")
    }

    println()
    // BREAK
    for ( i in listofInt){
        if ( i == null)
            break

        println("Number $i")
    }
}


























