package ui.client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ebookfrenzy.duvproject.databinding.OnBoardingActivityBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: OnBoardingActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnBoardingActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
