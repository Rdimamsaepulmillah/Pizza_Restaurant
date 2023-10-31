package lat.pam.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Tampilan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan2)

        val nama = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        val userIdTextView = findViewById<TextView>(R.id.pengguna)
        val storeLocationTextView = findViewById<TextView>(R.id.lokasi)

        userIdTextView.text = "Hello,  $nama"
        storeLocationTextView.text = storeLocation

        val seeMenu = findViewById<Button>(R.id.seemenus)
        seeMenu?.setOnClickListener {

            val intent = Intent(this, tampilan3::class.java)
            intent.putExtra("NAMA", nama)
            intent.putExtra("LOCATION", storeLocation)
            startActivity(intent)
        }



    }
}