package com.netweb.netwebbharat

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.view.WindowManager
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

open class BaseFragment : Fragment() {
    private val pleaseWaitDialog: Dialog by lazy { Dialog(requireContext()) }
    private val loadingDialog: Dialog by lazy { Dialog(requireContext()) }
    lateinit var loadingMsg: TextView

    lateinit var sourceStation: TextView
    lateinit var endDestination: TextView
    private val paymentProcessingDialog: Dialog by lazy { Dialog(requireContext()) }

//    fun showPleaseWaitDialog(startStation: String, destinationStation: String) {
//
//        pleaseWaitDialog.setContentView(R.layout.dialog_fetching_best_fares)
//        pleaseWaitDialog.apply {
//            window?.setBackgroundDrawableResource(R.color.transparent)
//            window?.setLayout(
//                WindowManager.LayoutParams.MATCH_PARENT,
//                WindowManager.LayoutParams.MATCH_PARENT
//            )
//            setCancelable(false)
//            show()
//        }
//        sourceStation = pleaseWaitDialog.findViewById(R.id.txt_source_destination_dialog)
//        endDestination = pleaseWaitDialog.findViewById(R.id.txt_end_station_dialog)
//        sourceStation.text = startStation
//        endDestination.text = destinationStation
//
//    }
//
//    fun hidePleaseWaitDialog() {
//        pleaseWaitDialog.dismiss()
//    }
//
//
//    fun showLoadingDialog(msg: String? = null) {
//
//        loadingDialog.setContentView(R.layout.dialog_loading)
//
//        loadingDialog.apply {
//            window?.setBackgroundDrawableResource(R.color.transparent)
//            window?.setLayout(
//                WindowManager.LayoutParams.MATCH_PARENT,
//                WindowManager.LayoutParams.MATCH_PARENT
//            )
//            setCancelable(false)
//            show()
//        }
//
//        loadingMsg = loadingDialog.findViewById(R.id.txt_loading)
//        if (msg != null) loadingMsg.text = msg
//
//
//    }
//
//    fun hideLoadingDialog() {
//        loadingDialog.dismiss()
//    }
//
//    fun showAlertDialog(activity: Activity) {
//        val builder = AlertDialog.Builder(requireActivity())
//        builder.setTitle("Alert")
//        builder.setMessage("Something Went Wrong, Try Again")
//        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
//            findNavController().popBackStack()
//        }
//        builder.setCancelable(false)
//        builder.show()
//    }
//
//
//    fun showPaymentProcessingDialog() {
//        paymentProcessingDialog.setContentView(R.layout.dialog_payment_processing)
//        paymentProcessingDialog.apply {
//            window?.setBackgroundDrawableResource(R.color.transparent)
//            window?.setLayout(
//                WindowManager.LayoutParams.MATCH_PARENT,
//                WindowManager.LayoutParams.MATCH_PARENT
//            )
//            setCancelable(false)
//            show()
//        }
//    }
//
//    fun hidePaymentProcessingDialog() {
//        paymentProcessingDialog.dismiss()
//    }

}