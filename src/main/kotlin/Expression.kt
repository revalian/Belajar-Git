fun main() {
    val NilaiDiatasKkm = 80
    val NilaiDibawahKkm = 60
    val nilai: String
    nilai = if (NilaiDibawahKkm > 60) {
        "Selamat ya!"
    } else if (NilaiDibawahKkm > NilaiDiatasKkm){
        "Nilai kamu 80, Selamat ya!"
    } else {
        "Nilai kamu 68, silakan ikuti remidial."

    }
    print(nilai)
}