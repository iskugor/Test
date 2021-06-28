package hr.iskugor.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.iskugor.backend.Backend
import hr.iskugor.core.Doer
import hr.iskugor.database.Database

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doer = Doer(Backend(), Database())
        doer.doSomething()
    }
}