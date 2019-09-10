package id.mustofa.app.sharedvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import id.mustofa.app.sharedvm.R
import id.mustofa.app.sharedvm.util.obtainViewModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        obtainViewModel(SharedViewModel::class).apply {
            user.observe(this@DetailActivity, Observer { textView.text = it })
        }
    }
}
