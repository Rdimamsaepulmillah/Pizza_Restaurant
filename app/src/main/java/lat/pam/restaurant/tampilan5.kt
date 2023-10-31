package lat.pam.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class tampilan5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan5)

        val nama = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        val pesan = intent.getStringExtra("MENU_NAME")

        val userIdTextView = findViewById<TextView>(R.id.user)
        val storeLocationTextView = findViewById<TextView>(R.id.store)
        val pesananTextView = findViewById<TextView>(R.id.pesanan)

        userIdTextView.text = "$nama"
        storeLocationTextView.text = "Store : $storeLocation"
        pesananTextView.text = "$pesan sudah dipesan"

        val ambilSendiriCheckBox = findViewById<CheckBox>(R.id.sendiri)
        val deliveryCheckBox = findViewById<CheckBox>(R.id.delivery)
        val doneButton = findViewById<Button>(R.id.done)

        doneButton.setOnClickListener {
            val selectedOption = when {
                ambilSendiriCheckBox.isChecked -> "Ambil Sendiri"
                deliveryCheckBox.isChecked -> "Delivery"
                else -> "Pilih opsi terlebih dahulu"
            }

            Toast.makeText(this, "Terima kasih sudah memesan \n" + "ditoko kami, pesanan Pepperoni Pizza \n" + "anda dikirim menggunakan Fast Delivery : $selectedOption", Toast.LENGTH_SHORT).show()
        }

    }
}