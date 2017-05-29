package me.harshithgoka.chatsocks

import android.app.Service
import android.content.Intent
import android.os.IBinder

class NetworkService : Service() {

    var receiverRunning: Boolean = false;

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        return super.onStartCommand(intent, flags, startId)
        var action: Int? = intent?.getIntExtra(Constants.ACTION, -1);
        if (action == Constants.LOGIN) {
            TODO()
            spawnSendDataThread("")
            if (receiverRunning) {
                spawnReceiverThread()
                receiverRunning = true
            }
        }
        else if (action == Constants.REGISTER) {
            TODO()
        }
        
        return START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        // TODO: Return the communication channel to the service.
        throw UnsupportedOperationException("Not yet implemented")
    }

    fun spawnSendDataThread(data: String) {
        var thread: SendThread = SendThread(data)
        thread.start()
    }

    fun spawnReceiverThread() {
        var thread: ReceiveThread = ReceiveThread("192.168.1.1", 9399)
        thread.start()
    }
}
