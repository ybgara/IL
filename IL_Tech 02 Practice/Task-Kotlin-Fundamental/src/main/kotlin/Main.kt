fun main() {
    /*
    TODO 1
        Buatlah variable dengan ketentuan berikut :
        - Variable dapat diubah sewaktu-waktu
        - Variable memiliki Identifier berupa myName
        - Variable memiliki tipe data berupa String
        - Variable memiliki Initialization berupa nama panggilan kamu
    */
    // Tulis Code dibawah ini

    // MEMBUAT VARIABLE myName DENGAN INPUTAN "Gara"
    var myName: String = "Gara"

    // MENAMPILKAN myName "Gara"
    println("Nama Panggilan : $myName " )

    /*
    TODO 2
        Ubah Initialization pada varible myName diatas menjadi Nama Lengkap kamu
     */
    // Tulis Code dibawah ini

    // MENGUBAH ISI DATA MENJADI NAMA LENGKAP
    myName = "Tegar Wibisana"

    // MENAMPILKAN myName NAMA LENGKAP
    println("Nama Lengkap : $myName ")

    /*
    TODO 4
        Buatlah Array dengan ketentuan berikut :
        - variabel Array bernama mobileMentors
        - Array berisi tipe data String
        - Index pada Array berisi ["Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan"]
        - Ubah index yang berisi "Raihan Zhaky" pada Array menjadi "Raihan Zhaky Al-Hafizh"
        - Tampilkan index yang berisi "Raihan Zhaky Al-Hafizh"
    */
    // Tulis Code dibawah ini

    // MEMBUAT ARRAYS DENGAN INPUTAN STATIC
    val mobileMentors = arrayOf("Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan")

    // MENGUBAH ARRAY PADA INDEX 0
    mobileMentors[1] = "Raihan Zhaky Al-Hafizh"

    // MENAMPILKAN ARRAY PADA DATA Raihan Zhaky Al-Hafizh
    println("Index Berisi Nama : ${mobileMentors[1]} ")

    // MEMANGGIL FUNGSI KALKULATOR
    println("Hasil Perkalian = " + calculator(200, 150))

    // MEMANGGIL FUNGSI EKSPEDISI
    expedition(20)
}