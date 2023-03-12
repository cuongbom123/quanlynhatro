package cuongncph28957.poly.viewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import cuongncph28957.poly.viewbindingdemo.databinding.ActivityMain2Binding
import cuongncph28957.poly.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2.setOnClickListener {
            Snackbar.make(it,"Hello",Snackbar.LENGTH_SHORT).setAction("Hủy"){
                Toast.makeText(this@MainActivity2,"Đã hủy",Toast.LENGTH_SHORT).show()
            }.show()
        }
    }
}