package com.github.thenicholaschen.savemoneylahexpensetracker


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.github.thenicholaschen.savemoneylahexpensetracker.databinding.FragmentMainMenuBinding
import kotlinx.android.synthetic.main.fragment_main_menu.*

/**
 * A simple [Fragment] subclass.
 */
class MainMenu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMainMenuBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_menu, container, false)

        binding.btnAddExpense.setOnClickListener {
//            this.findNavController().navigate()
        }

        return binding.root
    }


}
