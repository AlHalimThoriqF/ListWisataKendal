package com.alhalimthoriqfebrian.listwisatakendal.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alhalimthoriqfebrian.listwisatakendal.R
import com.alhalimthoriqfebrian.listwisatakendal.adapter.TouristAttractionAdapter
import com.alhalimthoriqfebrian.listwisatakendal.databinding.ActivityMainBinding
import com.alhalimthoriqfebrian.listwisatakendal.model.TouristAttraction

// Kelas MainActivity merupakan kelas utama yang mengatur tampilan halaman utama aplikasi.
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Metode onCreate dipanggil ketika aktivitas dibuat.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Mengikat layout activity_main.xml menggunakan ViewBinding.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Data pariwisata yang akan ditampilkan dalam RecyclerView.
        val touristAttraction = arrayOf(
            TouristAttraction(
                R.drawable.pantaicahaya,
                "Pantai Cahaya",
                "Di Pantai Cahaya ini anda bisa menemukan begitu banyak bangku-bangku duduk lengkap dengan payung raksasa warna-warni di atasnya. Seperti yang bisa ditebak, bangku itu digunakan untuk tempat berkumpul baik untuk keluarga atau bersama dengan teman.\n" +
                        "\n" +
                        "Terletak di Klampok, Sendang Sikucing, Kec. Rowosari, Kabupaten Kendal, Jawa Tengah. Pantai cahaya menjadi salah satu destinasi favorit warga sekitar untuk menghabiskan waktu dengan melihat matahari terbenam.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 20.000,-",
            ),
            TouristAttraction(
                R.drawable.agrowisatapatean,
                "Agro Wisata Patean",
                "Agrowisata Ngebruk Patean merupakan tempat yang bagus untuk menanam sayuran dan buah-buahan. Di sini anda juga dapat melakukan berbagai macam aktivitas berkebun seperti memanen hasil panen.\n" +
                        "\n" +
                        "Terletak di Kalidukuh, RT.026 RW.9, Manggung, Sidodadi, Kecamatan Patean, Kabupaten Kendal, Provinsi Jawa Tengah. Dengan fasilitasnya yang lengkap, anda bisa menikmati waktu bersama keluarga di sini sambil menikmati makanan yang dibuat dari hasil panen yang masih segar\n" +
                        "\n" +
                        "Tiket Masuk: Rp 10.000,-",
            ),
            TouristAttraction(
                R.drawable.pantaingebum,
                "Pantai Ngebum",
                "Pantai Ngebum menjadi wisata Kendal berikutnya yang wajib dikunjungi, di sini pengunjung dapat merasakan pesona alam yang indah. Masih jarang diketahui banyak orang, pantai Ngebum cocok untuk anda yang ingin liburan di pantai yang masih jarang dijamah pengunjung.\n" +
                        "\n" +
                        "Terletak di Merbuh, Mororejo, Kec. Kaliwungu, Kabupaten Kendal, Jawa Tengah. Di sini terdapat juga beberapa penyewaan ban dan pelampung untuk anda yang ingin mengapung di laut, atau anda dapat membawa sendiri perlengkapan berenang.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 3.000,-",
            ),
            TouristAttraction(
                R.drawable.pemandianairpanas,
                "Pemandian Air Panas Citra Asri Gonoharjo",
                "Pemandian Air Panas Citra Asri Gonoharjo yang terletak di Desa Gonoharjo, berada di atas perbukitan, pemandian ini juga bisa menjadi tempat terbaik untuk bersantai di hari yang melelahkan dengan berendam di pemandian air panas dengan pemandangan alam yang masih asri.\n" +
                        "\n" +
                        "Hanya ada satu kolam di sini, cukup besar untuk sekitar 30 orang. Di area tersebut, anda dapat melihat pemandangan gunung yang indah di sekitar anda. Karena letaknya yang berada di dataran tinggi, Aada bisa melihat pemandangan Kendal dengan jelas dari pemandian air panas Citra Asri Gonoharjo.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 15.000,-",
            ),
            TouristAttraction(
                R.drawable.kebuntehmedini,
                "Kebun Teh Medini",
                "Kebun Teh Medini  memiliki pesona alamnya yang indah, kebun teh medini juga menyuguhkan spot foto yang menarik, wahan dan fasilitas umum yang lumayan lengkap.\n" +
                        "\n" +
                        "Terletak di Jatirejo, Ngampel, Ngesrep Balong, Limbangan, Kabupaten Kendal, Jawa Tengah. Disini terdapat camping ground untuk pengunjung yang ingin kemah di area perkebunan teh dan wahana permainan untuk pengunjung anak-anak.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 3.000,-",
            ),
            TouristAttraction(
                R.drawable.curugsemawur,
                "Air Terjun Curug Semawur",
                "Pemandangan di sekitar air terjun adalah hal terbaik yang dapat ditemukan di sini. Vegetasi hijau akan membuat air terjun terlihat begitu segar dan memukau.\n" +
                        "\n" +
                        "Terletak di Desa Blumah, Kecamatan Plantungan, Kabupaten Kendal, Provinsi Jawa Tengah. Selama berjalan kaki menuju letak air terjun semawur anda akan disuguhi panorama indah alam yang hijau dan asri.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 5.000,-",
            ),
            TouristAttraction(
                R.drawable.pengleburgongso,
                "Air Terjun Penglebur Gongso",
                "Air Terjun Panglebur Gongso di Desa Gondang. Ini mungkin air terjun terpendek dari semua air terjun di Kendal. Dengan ketinggiannya yang hanya mencapai sekitar 2 hingga 3 meter namun memiliki keindahan yang tidak kalah dari air terjun lainnya.\n" +
                        "\n" +
                        "Masih jarang diketahui oleh banyak orang, membuat anda bisa menikmati air terjun yang bebas dari aktivitas banyak orang. Anda juga dapat melakukan apapun yang anda inginkan di sini seperti mandi atau hanya berenang di sekitar air terjun.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 5.000,-",
            ),
            TouristAttraction(
                R.drawable.curugsewu,
                "Air Terjun Curug Sewu",
                "Air terjun Curug sewu. Air terjun ini memiliki 5 aliran yang berasal dari satu sungai. Banyaknya aliran sungai menjadi alasan mengapa air terjun ini dinamakan Air Terjun Sewu, karena jumlahnya yang sangat banyak seperti ada ribuan.\n" +
                        "\n" +
                        "Terletak di Desa Wisata Curugsewu, Kecamatan Patean, Kabupaten Kendal, Jawa Tengah. Selain menikmati keindahan air terjun, pengunjung juga dapat menikmati berbagai macam fasilitas seperti taman bermain anak dan spot foto yang instagramable.\n" +
                        "\n" +
                        "Tiket Masuk: Rp 15.000,-",
            ),
            TouristAttraction(
                R.drawable.sekatul,
                "Kampung Jawa Sekatul",
                "Kampung Jawa Sekatul, atau sebagian orang menyebutnya sebagai Kampung Jowo. Seperti namanya, tempat ini memiliki begitu banyak budaya Jawa untuk anda pelajari dan temukan.\n" +
                        "\n" +
                        "Semua hal di kampung jawa dibuat begitu alami. Bahkan jalan di sana masih menggunakan desain berbatu, bukan aspal. Selain itu, bangunan di sana juga menyerupai arsitektur Jawa, seperti yang bisa anda temukan di Keraton Jogja. Namun demikian, tempat ini paling baik untuk dikunjungi bersama keluarga, terutama jika anda memiliki anak.\n" +
                        "\n" +
                        "Tiket Masuk : Hanya tiket parkir",
            ),

        )

        // Mengatur layout manager dan adapter untuk RecyclerView.
        binding.rvTouristAttraction.layoutManager = LinearLayoutManager(this)
        binding.rvTouristAttraction.adapter = TouristAttractionAdapter(touristAttraction) { item ->
            // Mengarahkan pengguna ke DetailActivity saat item RecyclerView diklik.
            val touristAttractionIntent = Intent(this, DetailActivity::class.java).apply {
                putExtra(DetailActivity.KEY_TITLE, item.title)
                putExtra(DetailActivity.KEY_DESCRIPTION, item.description)
                putExtra(DetailActivity.KEY_IMAGE, item.image)
            }
            startActivity(touristAttractionIntent)
        }
    }
}