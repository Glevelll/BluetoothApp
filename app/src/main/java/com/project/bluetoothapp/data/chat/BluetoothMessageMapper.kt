package com.project.bluetoothapp.data.chat

import com.project.bluetoothapp.domain.chat.BluetoothMessage

fun String.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return BluetoothMessage(
        message = message,
        senderName = name,
        isFromLocalUser = isFromLocalUser
    )
}

fun BluetoothMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}