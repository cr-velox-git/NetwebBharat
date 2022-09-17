package com.netweb.netwebbharat.utils.custom_dialog

import android.app.Dialog
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.netweb.netwebbharat.R

class LoadingDialogImp : Fragment(), ILoadingDialog {
    private val pleaseWaitDialog: Dialog by lazy {Dialog(requireContext())}
    override fun showPleaseWaitDialog() {
        pleaseWaitDialog.setContentView(R.layout.dialog_loading)
        pleaseWaitDialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        pleaseWaitDialog.apply {
            window?.setBackgroundDrawableResource(R.color.transparent)
            window?.addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)
            setCancelable(false)
            show()
        }

    }

    override fun hidePleaseWaitDialog() {
        pleaseWaitDialog.dismiss()
    }

}