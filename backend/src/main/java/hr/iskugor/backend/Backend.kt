package hr.iskugor.backend

import android.util.Log
import hr.iskugor.core.IBackend

class Backend: IBackend {

    private var accessId: String? = null

    override fun setAccessId(accessId: String?) {
        this.accessId = accessId
    }

    override fun fetchSomething() {
        Log.i("Backend", "Fetching something")
    }
}