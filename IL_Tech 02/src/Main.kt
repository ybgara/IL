fun main() {
    println("==============")
    println("Fundamental 02")
    println("==============")


    // String Template
    val company = "Infinte Learning"
    println("We are Study $company")
    println("We are Study" + company)

    // $ = Print Format

    val score = 80
    println("Result ${ if (score >= 80) "You Win !" else "Please try Again !" }")

    // Pertanyaan
    // Apakah ini sama dengan print format dalam java ?

    // Nullable Types
    // Null Pointer Exception ( NPE )
    val text: String? = null
    println(text)
    // Agar bisa running menggunakan Tanda Tanya (?) dalam null
    // Pada dasarnya (?) cuma buat penanda aja

    // println(text.length)
    // Error karena null

    if ( text != null ){
        println(text.length)
    }

    var obj: Any = "Ini String"
    if(obj is String){
        println(obj)
    }

    // Safe Calls and Elvis Operator
    val safeText: String? = null

    // Kapan di pake Safe Calls ?
    // untuk menghindari error tentu saja

    val safeTextLength = safeText?.length ?: 0
    println(safeTextLength)

    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if ( status.equals("Checkout")){
        dateOut = "18/03/2024 13:30:00"
    }

    println(dateOut)

    var tinggi = 2.88
    println( String.format("%.1f", tinggi))

    // IF EXPRESSIONS
    val examScore = 90

    if (examScore  == 100){
        println("A")
    }else if(examScore >= 80){
        println("B")
    }else{
        println("C")
    }

    // FUNCTION
    // MEMANGGIL FUNCTION GARA
    gara()

    // MEMANGGIL FUNCTION DENGAN PARAMETER
    sayHello("Hi", "Gara")

    // MEMANGGIL FUNCTION DENGAN NAMED ARGUMENT
    fullName(
        satu = "Tegar",
        tiga = "Wibisana",
        dua = "\"Gara\""
    )

}

// FUNCTION GARA
fun gara(){
    println("Hi Gara")
}

// FUNCTION DENGAN PARAMETER
fun sayHello(ucapan: String, nama: String){
    println("$ucapan $nama")
}

// FUNCTION NAMER ARGUMENT
fun fullName(satu: String,
             dua: String,
             tiga: String){
    println("$satu, $dua, $tiga")
}