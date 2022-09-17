package com.netweb.netwebbharat.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.netweb.netwebbharat.application.AppController
import com.netweb.netwebbharat.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!
    lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val ticketBookingRepository =
            (requireActivity().application as AppController).repository
        dashboardViewModel = ViewModelProvider(
            requireActivity(),
            DashboardViewModelFactory(ticketBookingRepository)
        )[DashboardViewModel::class.java]


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}