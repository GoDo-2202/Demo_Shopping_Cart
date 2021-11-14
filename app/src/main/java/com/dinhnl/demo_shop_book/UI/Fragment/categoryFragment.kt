package com.dinhnl.demo_shop_book.UI.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dinhnl.demo_shop_book.databinding.FragmentCategoryFragmentBinding

class categoryFragment : Fragment() {

    private var _binding: FragmentCategoryFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCategoryFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    //to avoid memory leaks
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}