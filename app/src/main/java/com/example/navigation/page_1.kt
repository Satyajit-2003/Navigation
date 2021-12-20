package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentHomeBinding
import com.example.navigation.databinding.FragmentPage1Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [page_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class page_1 : Fragment() {

    lateinit var bindHome: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =  FragmentPage1Binding.inflate(inflater, container, false)
        binding.Back.setOnClickListener{ Navigation.findNavController(binding.root).navigate(R.id.page1_to_home) }
        return binding.root
    }


}