package hr.iskugor.database

import hr.iskugor.core.IDatabase
import android.util.Log

class Database: IDatabase {
    override fun getAccessId(): String? {
        return "access_id"
    }

    override fun storeSomething() {
        Log.i("Database", "Storing something")
    }
}