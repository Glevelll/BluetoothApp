package com.project.bluetoothapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.project.bluetoothapp.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}