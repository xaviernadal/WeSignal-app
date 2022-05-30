package xaviernadalreales.com.wesignal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xaviernadalreales.com.wesignal.databinding.UploadVideoLayoutBinding

class UploadVideo : AppCompatActivity() {
    private lateinit var viewBinding: UploadVideoLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = UploadVideoLayoutBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}