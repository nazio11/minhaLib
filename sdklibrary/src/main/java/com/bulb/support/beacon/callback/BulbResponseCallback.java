package com.bulb.support.beacon.callback;

import android.bluetooth.BluetoothGattCharacteristic;

/**
 * @Date 2017/12/12 0012
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.callback.BulbResponseCallback
 */
public interface BulbResponseCallback {

    void onCharacteristicChanged(BluetoothGattCharacteristic characteristic, byte[] value);

    void onCharacteristicWrite(byte[] value);

    void onCharacteristicRead(byte[] value);

    void onDescriptorWrite();
}
