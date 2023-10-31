package lat.pam.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tampilan4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan4)

        val nama = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        val pesanan = intent.getStringExtra("MENU_NAME")


        val submitButton = findViewById<Button>(R.id.orderNow)

        submitButton.setOnClickListener {
            val intent = Intent(this, tampilan5::class.java)
            intent.putExtra("NAMA", nama)
            intent.putExtra("LOCATION", storeLocation)
            intent.putExtra("MENU_NAME", pesanan)
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.Back)
        backButton.setOnClickListener {
            val intent = Intent(this, tampilan3::class.java)
            intent.putExtra("NAMA", nama)
            intent.putExtra("LOCATION", storeLocation)
            startActivity(intent)
        }
    }
}
