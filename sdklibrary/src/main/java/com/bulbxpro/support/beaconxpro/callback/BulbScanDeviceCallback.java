package com.bulbxpro.support.beaconxpro.callback;

import com.bulbxpro.support.beaconxpro.entity.DeviceInfo;

/**
 * @Date 2017/12/8 0008
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.callback.BulbScanDeviceCallback
 */
public interface BulbScanDeviceCallback {
    void onStartScan();

    void onScanDevice(DeviceInfo device);

    void onStopScan();
}
