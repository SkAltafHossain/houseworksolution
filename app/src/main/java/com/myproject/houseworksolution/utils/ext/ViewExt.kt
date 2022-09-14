package com.myproject.houseworksolution.utils.ext

import android.content.Context
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.myproject.houseworksolution.R

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.toast(message: String, gravity: Int) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
    toast.setGravity(gravity, 0, 0)
    toast.show()
}

fun Fragment.toast(msg: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this.requireContext(), msg, duration).show()
}

fun ProgressBar.show() {
    visibility = View.VISIBLE
}

fun ProgressBar.hide() {
    visibility = View.GONE
}

fun View.snackbar(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setAction("Ok") {
            snackbar.dismiss()
        }
    }.show()
}

/**View Visibility Ext*/
fun View.gone() {
    if (visibility != View.GONE) visibility = View.GONE
}

fun View.visible() {
    if (visibility != View.VISIBLE) visibility = View.VISIBLE
}

fun View.invisible() {
    if (visibility != View.INVISIBLE) visibility = View.INVISIBLE
}

/**View Get Value Ext*/
val Button.value
    get() = text?.toString() ?: ""

val EditText.value
    get() = text?.toString() ?: ""

val TextView.value
    get() = text?.toString() ?: ""

/**View Empty validation Ext*/
fun EditText.isEmpty() = value.isEmpty()

fun TextView.isEmpty() = value.isEmpty()

/**Image SetUp Using Glide*/
fun ImageView.loadImage(imageId: Int) {
    Glide.with(this)
        .asBitmap()
        .load(imageId)
        .placeholder(R.color.colorPrimaryDark)
        .into(this)
}

/**View Enable/Disable Ext*/
fun View.enable() {
    isEnabled = true
    alpha = 1f
}

fun View.disable() {
    isEnabled = false
    alpha = 0.5f
}

/**Extension method for Material Alert Dialog Using Higher order function.*/
inline fun Context.showAlertFunction(title: String, message: String, positiveBtnTxt: String = "Yes", negativeBtnTxt: String = "No", crossinline positiveBtnClick: () -> Unit) {
    MaterialAlertDialogBuilder(this, R.style.AlertDialogTheme)
        .setCancelable(false)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveBtnTxt) { _, _ ->
            positiveBtnClick()
        }
        .setNegativeButton(negativeBtnTxt, null)
        .show()
}

/**Extension method for Material Alert Dialog Using Higher order function.*/
inline fun Context.showOkayAlertFunction(title: String, message: String, positiveBtnTxt: String = "Okay", crossinline positiveBtnClick: () -> Unit) {
    MaterialAlertDialogBuilder(this, R.style.AlertDialogTheme)
        .setCancelable(false)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveBtnTxt) { _, _ ->
            positiveBtnClick()
        }
        .show()
}