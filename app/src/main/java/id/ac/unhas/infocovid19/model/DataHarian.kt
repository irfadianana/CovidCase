package id.ac.unhas.infocovid19.model

data class DataHarian(
    val data: List<Harian?>?
){
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach{
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class Harian(
    val harike: Int?,
    val tanggal: String?,
    val jumlahKasusBaruperHari: Int?,
    val jumlahKasusKumulatif: Int?,
    val jumlahpasiendalamperawatan: Int?,
    val persentasePasiendalamPerawatan: Double?,
    val jumlahPasienSembuh: Int?,
    val persentasePasienSembuh: Double?,
    val jumlahPasienMeninggal: Int?,
    val persentasePasienMeninggal: Double?,
    val jumlahKasusSembuhperHari: Int?,
    val jumlahKasusMeninggalperHari: Int?,
    val jumlahKasusDirawatperHari: Int?,
    val fid: Int?
){
    override fun toString(): String {
        return "Hari ke ${this.harike}[#tanggal: ${this.tanggal}, " +
                "#jumlah kasus baru per hari: ${this.jumlahKasusBaruperHari}, " +
                "#jumlah kasus kumulatif: ${this.jumlahKasusKumulatif}, " +
                "#jumlah pasien dalam perawatan: ${this.jumlahpasiendalamperawatan}, " +
                "#persentase pasien dalam perawatan: ${this.persentasePasiendalamPerawatan}, " +
                "#jumlah pasien sembuh: ${this.jumlahPasienSembuh}, " +
                "#persentase pasien sembuh: ${this.persentasePasienSembuh}, " +
                "#jumlah pasien meninggal: ${this.jumlahPasienMeninggal}, " +
                "#persentase pasien meninggal: ${this.persentasePasienMeninggal}, " +
                "#jumlah kasus meninggal per hari: ${this.jumlahKasusMeninggalperHari}, " +
                "#jumlah kasus dirawat per hari: ${this.jumlahKasusDirawatperHari}]"
    }
}