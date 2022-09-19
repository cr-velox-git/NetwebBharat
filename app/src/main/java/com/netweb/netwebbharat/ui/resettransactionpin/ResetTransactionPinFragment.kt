package com.netweb.netwebbharat.ui.resettransactionpin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.netweb.netwebbharat.R

class ResetTransactionPinFragment : Fragment() {

    companion object {
        fun newInstance() = ResetTransactionPinFragment()
    }

    private lateinit var viewModel: ResetTransactionPinViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reset_transaction_pin, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[ResetTransactionPinViewModel::class.java]
        // TODO: Use the ViewModel
    }

}