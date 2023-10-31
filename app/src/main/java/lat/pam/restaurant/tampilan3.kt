package lat.pam.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class tampilan3 : AppCompatActivity() {
    private var selectedMenuName: String = "" // Default value
    private var selectedMenuDescription: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan3)

        val nama = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        val userIdTextView = findViewById<TextView>(R.id.pengguna)
        userIdTextView.text = "Hello,  $nama"

        val pizzaTextView = findViewById<ImageView>(R.id.menupizza)
        val spaghettiTextView = findViewById<ImageView>(R.id.menuspaghetti)
        val burgerTextView = findViewById<ImageView>(R.id.menuburger)
        val steakTextView = findViewById<ImageView>(R.id.menusteak)

        pizzaTextView.setOnClickListener {
            selectedMenuName = "Pepperoni Pizza"
            selectedMenuDescription =
                "Pepperoni Pizza, cocok bagi anda yang ingin merasakan pizza original dengan taburan keju dan daging asap yang lezat"
            showToast("Anda memesan: $selectedMenuName")
        }

        spaghettiTextView.setOnClickListener {
            selectedMenuName = "Spaghetti"
            selectedMenuDescription =
                "Cocok bagi anda yang ingin merasakan spaghetti original dengan bumbu yang oriental"
            showToast("Anda memesan: $selectedMenuName")
        }

        burgerTextView.setOnClickListener {
            selectedMenuName = "Burger"
            selectedMenuDescription =
                "Burger Cocok bagi anda yang ingin merasakan kelembutan burger berlapiskan keju, sayuran dan daging yang tebal"
            showToast("Anda memesan: $selectedMenuName")
        }

        steakTextView.setOnClickListener {
            selectedMenuName = "Steak"
            selectedMenuDescription =
                "Steak Cocok bagi anda yang ingin merasakan lezatnya daging steak dipadukan dengan kentang yang lezat"
            showToast("Anda memesan: $selectedMenuName")
        }

        val orderImageView = findViewById<ImageView>(R.id.order)
        orderImageView.setOnClickListener {
            if (selectedMenuName.isNotEmpty() && selectedMenuDescription.isNotEmpty()) {
                val intent = Intent(this, tampilan4::class.java)
                intent.putExtra("MENU_NAME", selectedMenuName)
                intent.putExtra("MENU_DESCRIPTION", selectedMenuDescription)
                intent.putExtra("NAMA", nama)
                intent.putExtra("LOCATION", storeLocation)
                startActivity(intent)
            } else {
                showToast("Pilih menu terlebih dahulu")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
