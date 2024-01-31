import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_e_learning.databinding.FragmentHomeBinding
import com.example.my_e_learning.databinding.FragmentNilaiBinding

private var _binding: FragmentNilaiBinding? = null
private val binding get() = _binding!!


override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    _binding = FragmentNilaiBinding.inflate(inflater, container, false)
    return binding.root
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initView ()
}
private fun initView (){
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}