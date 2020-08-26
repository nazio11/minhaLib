package com.bulbxpro.support.beaconxpro.task;

import com.bulbxpro.support.beaconxpro.callback.BulbOrderTaskCallback;
import com.bulbxpro.support.beaconxpro.entity.OrderEnum;
import com.bulbxpro.support.beaconxpro.entity.OrderType;

/**
 * @Date 2018/1/20
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.task.BatteryTask
 */
public class DeviceTypeTask extends OrderTask {

    public byte[] data;

    public DeviceTypeTask(BulbOrderTaskCallback callback) {
        super(OrderType.deviceType, OrderEnum.DEVICE_TYPE, callback, OrderTask.RESPONSE_TYPE_READ);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
