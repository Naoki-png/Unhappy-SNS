package com.example.pien.data.model

import android.os.Parcelable
import com.google.firebase.firestore.ServerTimestamp
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Post(
    val userId: String? = null,
    val userName: String? = null,
    val userImage: String? = null,
    val postImage: String? = null,
    val productName: String? = null,
    val brandName: String? = null,
    val productPrice: String? = null,
    val productType: String? = null,
    val postMessage: String? = null,
    @ServerTimestamp
    val timeStamp: Date? = null
): Parcelable