package com.myproject.houseworksolution.utils.ext

import android.annotation.SuppressLint
import android.location.Location
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.myproject.houseworksolution.data.models.responseModel.Resource
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import org.json.JSONArray

/**Convert simple object to String with Gson*/
inline fun <reified T : Any> T.toSimpleJson() : String =  Gson().toJson(this, T::class.java)

/**Convert String Json to Object*/
inline fun <reified T : Any> String.fromJsonToObject() : T =  Gson().fromJson(this ,  T::class.java)

/**Convert String List Json to Object*/
inline fun <reified T : Any> String.fromJsonToObjectList() : MutableList <T> =  when( this.isNotEmpty()){
    true -> Gson().fromJson(this, object : TypeToken<MutableList<T>>() {}.type)
    false -> mutableListOf()
}

fun JSONArray.toMutableList(): MutableList<Any> = MutableList(length(), this::get)

inline fun <T> safeCall(action: () -> Resource<T>): Resource<T> {
    return try {
        action()
    } catch (e: Exception) {
        Resource.Error(message = e.message ?: "An unknown Error Occurred")
    }
}
