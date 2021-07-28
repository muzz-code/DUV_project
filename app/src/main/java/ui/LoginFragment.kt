package ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ebookfrenzy.duvproject.R
import com.ebookfrenzy.duvproject.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {
    private lateinit var forgotPasswordTextKey: TextView

    private var _binding: LoginFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = LoginFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        forgotPasswordTextKey = binding.loginFragmentForgotPasswordTextView
        forgotPasswordTextKey.setOnClickListener {
            findNavController().navigate(R.id.forgotPasswordFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
