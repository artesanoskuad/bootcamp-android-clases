package com.artesanoskuad.sharedpreferencesejercicio

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artesanoskuad.sharedpreferencesejercicio.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    companion object{
        private const val SHARED_PREF_NAME = "settings"
        private const val NUMERO_ENTERO_KEY = "numero-entero"
        private const val NUMERO_DECIMAL_KEY = "numero-decimal"
        private const val TEXTO_KEY = "texto"
        private const val SWITCH_KEY = "switch"
    }

    private lateinit var binding: FragmentFirstBinding
    private lateinit var sharedPreferences : SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListener()
        initSharedPrefences()
        loadDefaultValues()
    }

    private fun initSharedPrefences() {
        activity?.let { safeActivity ->
            sharedPreferences = safeActivity.getSharedPreferences(
                SHARED_PREF_NAME,
                Context.MODE_PRIVATE
            )
        }
    }

    private fun setupClickListener() {
        binding.run {
            btnGuardar.setOnClickListener {
                saveValues()
            }
            btnBorrar.setOnClickListener {
                deleteValues()
            }
        }
    }

    private fun loadDefaultValues() {
        val numeroEntero = sharedPreferences.getInt(NUMERO_ENTERO_KEY, 0)
        val numeroDecimal = sharedPreferences.getFloat(NUMERO_DECIMAL_KEY, 0.0f)
        val texto = sharedPreferences.getString(TEXTO_KEY, "")
        val switchValue = sharedPreferences.getBoolean(SWITCH_KEY, false)

        binding.etTexto.setText(texto)
        binding.etNumeroEntero.setText(numeroEntero.toString())
        binding.etNumeroDecimal.setText(numeroDecimal.toString())
        binding.swSaludo.isChecked = switchValue
    }

    private fun saveValues() {
        sharedPreferences.edit()
            .putString(TEXTO_KEY, binding.etTexto.text.toString())
            .putInt(NUMERO_ENTERO_KEY, binding.etNumeroEntero.text.toString().toInt())
            .putFloat(NUMERO_DECIMAL_KEY, binding.etNumeroDecimal.text.toString().toFloat())
            .putBoolean(SWITCH_KEY, binding.swSaludo.isChecked)
            .apply()
    }

    private fun deleteValues() {
        sharedPreferences.edit()
            .putString(TEXTO_KEY, "")
            .putInt(NUMERO_ENTERO_KEY, 0)
            .putFloat(NUMERO_DECIMAL_KEY, 0.0f)
            .putBoolean(SWITCH_KEY, false)
            .apply()

        loadDefaultValues()
    }
}