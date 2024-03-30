/*
    TODO 5
        Buatlah pengecekan menggunakan IF dengan ketentuan berikut :
        - Apabila berat kurang dari atau sama dengan 1 kg, tampilkan Output berupa "biaya pengiriman adalah Rp 15.000"
        - Apabila berat kurang dari atau sama dengan 5 kg, tampilkan Output berupa "biaya pengiriman adalah Rp 30.000"
        - Apabila berat kurang dari atau sama dengan 10 kg, tampilkan Output berupa "biaya pengiriman adalah Rp 50.000"
*/
// Buat Pengecekan di function ini
fun expedition(berat: Int) {

    // KONDISI PERTAMA
    if (berat <= 1){
        println("biaya pengiriman adalah Rp 15.000")

    // KONDISI KEDUA
    }else if (berat <= 5){
        println("biaya pengiriman adalah Rp 30.000")

    // KONDISI KETIGA
    }else if (berat <= 10){
        println("biaya pengiriman adalah Rp 50.000")

    // KONDISI DILUAR KETIGA KONDISI
    }else{
        println("berat yang diinputkan adalah $berat, biaya belum diketahui ")
    }
}