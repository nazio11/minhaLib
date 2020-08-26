package com.bulb.support.beacon.task;


import com.bulb.support.beacon.callback.BulbOrderTaskCallback;
import com.bulb.support.beacon.entity.OrderType;

/**
 * @Date 2017/12/14 0014
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.task.IBeaconDateTask
 */
public class IBeaconDateTask extends OrderTask {

    public byte[] data;

    public IBeaconDateTask(BulbOrderTaskCallback callback, int sendDataType) {
        super(OrderType.iBeaconDate, callback, sendDataType);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
