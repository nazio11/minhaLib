package com.bulbx.support.beaconx.task;

import com.bulbx.support.beaconx.callback.BulbOrderTaskCallback;
import com.bulbx.support.beaconx.entity.OrderType;

/**
 * @Date 2018/1/20
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.task.HardwareVersionTask
 */
public class HardwareVersionTask extends OrderTask {

    public byte[] data;

    public HardwareVersionTask(BulbOrderTaskCallback callback, int responseType) {
        super(OrderType.hardwareVersion, callback, responseType);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
