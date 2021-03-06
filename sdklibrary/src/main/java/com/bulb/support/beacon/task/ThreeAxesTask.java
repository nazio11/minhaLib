package com.bulb.support.beacon.task;


import com.bulb.support.beacon.callback.BulbOrderTaskCallback;
import com.bulb.support.beacon.entity.OrderType;

/**
 * @Date 2017/12/14 0014
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.bulb.support.task.ThreeAxesTask
 */
public class ThreeAxesTask extends OrderTask {

    public byte[] data;

    public ThreeAxesTask(BulbOrderTaskCallback callback, int sendDataType) {
        super(OrderType.writeAndNotify, callback, sendDataType);
    }

    public void setData(boolean isOpen) {
        data = new byte[5];
        data[0] = Integer.valueOf(Integer.toHexString(234), 16).byteValue();
        data[1] = (byte) 108;
        data[2] = 0;
        data[3] = 1;
        data[4] = (byte) (isOpen ? 0 : 1);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
