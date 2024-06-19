package com.dicoding.destinatik.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicoding.destinatik.R
import com.dicoding.destinatik.databinding.ActivityLoginBinding
import com.dicoding.destinatik.databinding.FragmentHomeBinding
import com.dicoding.destinatik.databinding.FragmentRatingBinding


class RatingFragment : Fragment() {
    private var _binding: FragmentRatingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRatingBinding.inflate(inflater, container, false)
        return binding.root
    }
}