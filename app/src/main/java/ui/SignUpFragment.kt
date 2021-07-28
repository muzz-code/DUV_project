package ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ebookfrenzy.duvproject.R
import com.ebookfrenzy.duvproject.databinding.SignUpFragmentBinding

class SignUpFragment : Fragment() {

    private var _binding: SignUpFragmentBinding? = null
    val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SignUpFragmentBinding.inflate(inflater, container, false)
        return binding?.root

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sign_up_fragment, container, false)
    }
}
