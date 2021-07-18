package app.notificationapplication


import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService() : FirebaseMessagingService() {

    private val tag = "MessagingServ"

    override fun onNewToken(s: String) {
        super.onNewToken(s)
        Log.i("**newTokenService", FirebaseMessaging.getInstance().token.toString())
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag, remoteMessage.from.toString())

        if(remoteMessage.notification != null){
            this.showNotification("1234",
            remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString())
        }
    }

}