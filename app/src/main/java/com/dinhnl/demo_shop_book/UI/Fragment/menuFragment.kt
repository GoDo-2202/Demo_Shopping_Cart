package com.dinhnl.demo_shop_book.UI.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dinhnl.demo_shop_book.databinding.FragmentMenuFragmentBinding

class menuFragment : Fragment() {

    private var _binding: FragmentMenuFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    //to avoid memory leaks
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}