package com.bulbxpro.support.beaconxpro.task;

import com.bulbxpro.support.beaconxpro.callback.BulbOrderTaskCallback;
import com.bulbxpro.support.beaconxpro.entity.OrderEnum;
import com.bulbxpro.support.beaconxpro.entity.OrderType;

/**
 * @Date 2018/1/20
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.task.DeviceModelTask
 */
public class DeviceModelTask extends OrderTask {

    public byte[] data;

    public DeviceModelTask(BulbOrderTaskCallback callback) {
        super(OrderType.deviceModel, OrderEnum.DEVICE_MODE, callback, OrderTask.RESPONSE_TYPE_READ);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
