package app.notificationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    lateinit var btnSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btn_send_notification)
        btnSend.setOnClickListener {
            this.showNotification("1234","bootcamp","kotlin")
        }
        Log.i("**newToken", FirebaseMessaging.getInstance().token.toString())
    }
}