package id.ac.unhas.infocovid19.ui.harian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.unhas.infocovid19.R
import id.ac.unhas.infocovid19.model.Harian
import kotlinx.android.synthetic.main.recyclerview_item_harian.view.*

class HarianAdapter {private val daftarHarian: ArrayList<Harian>) :
    RecyclerView.Adapter<HarianAdapter.HarianHolder>() {
        class HarianHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
            fun bind(itemHarian: Harian){
                with(itemView){
                    hari_ke.text = itemHarian.harike
                    data_harian.text = "tanggal: ${itemHarian.tanggal}, " +
                            "jumlah kasus baru per hari: ${itemHarian.jumlahKasusBaruperHari}, " +
                            "jumlah kasus kumulatif: ${itemHarian.jumlahKasusKumulatif}, " +
                            "jumlah pasien dalam perawatan: ${itemHarian.jumlahpasiendalamperawatan}, " +
                            "persentase pasien dalam perawatan: ${itemHarian.persentasePasiendalamPerawatan}, " +
                            "jumlah pasien sembuh: ${itemHarian.jumlahPasienSembuh}, " +
                            "persentase pasien sembuh: ${itemHarian.persentasePasienSembuh}, " +
                            "jumlah pasien meninggal: ${itemHarian.jumlahPasienMeninggal}, " +
                            "persentase pasien meninggal: ${itemHarian.persentasePasienMeninggal}, " +
                            "jumlah kasus meninggal per hari: ${itemHarian.jumlahKasusMeninggalperHari}, " +
                            "jumlah kasus dirawat per hari: ${itemHarian.jumlahKasusDirawatperHari}]"
                }
            }
        }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewtype: Int
        ): HarianAdapter.HarianHolder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.recyclerview_item_harian,parent, false)
            return HarianHolder(view)
        }

        override fun getItemCount() = daftarHarian.size

        override fun onBindViewHolder(holder: HarianAdapter.HarianHolder, position: Int) {
            holder.bind(daftarHarian[position])
        }
    }
