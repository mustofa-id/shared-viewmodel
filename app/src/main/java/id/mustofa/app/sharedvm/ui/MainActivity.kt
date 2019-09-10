package id.mustofa.app.sharedvm.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import id.mustofa.app.sharedvm.R
import id.mustofa.app.sharedvm.util.clearViewModel
import id.mustofa.app.sharedvm.util.obtainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = obtainViewModel(SharedViewModel::class)

        editText.doOnTextChanged { text, _, _, _ ->
            viewModel.setUser(text.toString())
        }

        button.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        // manually clear store
        clearViewModel()
    }
}