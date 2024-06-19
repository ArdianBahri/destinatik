package com.dicoding.destinatik.ui

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.dicoding.destinatik.R
import com.dicoding.destinatik.databinding.FragmentDetailsBinding
import com.dicoding.destinatik.utils.BlurUtils

class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        setupBlurView()
        return binding.root
    }

    private fun setupBlurView() {
        val radius = 20f

        val backgroundBitmap = BitmapFactory.decodeResource(resources, R.drawable.blur)
        val blurredBitmap = BlurUtils.blur(requireContext(), backgroundBitmap, radius)
        val blurredDrawable: Drawable = BitmapDrawable(resources, blurredBitmap)

        binding.blurView.setImageDrawable(blurredDrawable)

        binding.apply {
            placeRatingContainer.setOnClickListener {
                navigateToRating()
            }
            ivRating1.setOnClickListener {
                navigateToRating()
            }
            ivRating2.setOnClickListener {
                navigateToRating()
            }
            ivRating3.setOnClickListener {
                navigateToRating()
            }
            ivRating4.setOnClickListener {
                navigateToRating()
            }
            ivRating5.setOnClickListener {
                navigateToRating()
            }
            placeRating.setOnClickListener {
                navigateToRating()
            }
        }
    }

    private fun navigateToRating(){
        val action = DetailsFragmentDirections.actionDetailsFragmentToRatingFragment()
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
