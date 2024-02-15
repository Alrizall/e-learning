package com.example.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.login.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FragmentLogin : Fragment() {
    private lateinit var intentLauncher: ActivityResultLauncher<Intent>
    private val viewModel: LoginViewModel by viewModels()
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

        intentLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {

        }
        binding.loginGoogle.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                    val intent = viewModel.initSignIn()
                    intentLauncher.launch(intent)
                }
            }
        }

        //TODO source ini di gunakan di profil (untuk nama user) dan home (pengecekan) onviewcreate / iniview
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.userDataState.onEach {
                    when {
                        it.errorMessage.isNotEmpty() -> {
                            Log.e("TAG", "onViewCreated: ${it.errorMessage} ")
                        }

                        it.user != null -> {
                            val request = NavDeepLinkRequest.Builder
                                .fromUri("android-app://example.google.app/home".toUri())
                                .build()
                            findNavController().navigate(request)
                        }
                    }
                }.launchIn(this)
            }
        }
    }


    private fun initView() {
        binding.btnLogin.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            when {
                username.isEmpty() -> {
                    Toast.makeText(it.context, "masukan username", Toast.LENGTH_SHORT).show()
                }

                password.isEmpty() -> {
                    Toast.makeText(it.context, "masukan password", Toast.LENGTH_SHORT).show()
                }

                else -> {
                    if (username == "admin") {
                        viewModel.saveAdmin()
                    }
                    viewModel.saveUserName(username)
                    val request = NavDeepLinkRequest.Builder
                        .fromUri("android-app://example.google.app/home".toUri())
                        .build()
                    findNavController().navigate(request)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}