fun main() {
    var company: String = "Hello World"
    val name = "Gara"

    // var = bisa diubah nilai dalam company ataupun string
    // val = tidak bisa diubah dalam company ataupun string nya

    company = "Hello"

    println(company)
    println(name)
    println(company + " " + name)

    var numbers = 50.22
    var boolean = true

    println(numbers)
    println(boolean)

    var array = arrayOf(1,2,3,4)

    println(array[2])

    var GRADE = 'Z'
    var grade = 'a'

    println(grade++)
    println(grade++)
    println(grade++)
    println(grade--)
    println(grade--)
    println(grade--)

    println(grade)

    print(++GRADE)
    print(++GRADE)
    print(++GRADE)
    print(++GRADE)
    print(++GRADE)
    print(++GRADE)
    print(++GRADE)

    println()
    println()

    val stringText = "Kotlin Language"
    val firstChar = stringText[0]

    println(firstChar)

    println(" Gara 'G' ")
    println(" Gara \"Keren\" ")
    println(" Gara \\Gara ")

    println()
    println("""
        Tegar "Gara" Wibisana
    """.trimIndent())
    //  """""" Agar bisa menulis tanpa menggunakan \t \n \" dan lain lain

    println()
    println()

    val mallOpen = 9
    val mallClosed = 21
    val now = 23

    val isOpen = if ( now >= mallOpen && now <= mallClosed ){
        true
    }else{
        false
    }

    println(isOpen)

    val isClose = now < mallOpen || now > mallClosed
    print("Office is close : $isClose ")

    println()
    println(!isOpen)

    val A: Int = 10
    val B: Double = 2.0
    val C: Float = 3.0F
    val D: Long = 100000L
    val E: Byte = Byte.MAX_VALUE
    val F: Short = Short.MAX_VALUE

    println(Byte)
    println(Short)

    val groups = arrayOf<String>("Group 1", "Group 2", "Group 5", "Group 4", "Group 5" )

    println(groups[1])
    println(groups.get(0))
    println( groups.get(3) )
    groups.set(0, "Group 0")
    println(groups.get(0))

    val group = arrayOf("Group 1", 2, "Group 5", "Group 4", "Group 5" )

    println(group.get(1))
    println(group.asList())

    val a = intArrayOf()
    val b = booleanArrayOf()
//    val c = intArrayOf()
//    val d = intArrayOf()
//    val e = intArrayOf()
//    val f = intArrayOf()

}
