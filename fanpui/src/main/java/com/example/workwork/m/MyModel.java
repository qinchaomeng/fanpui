package com.example.workwork.m;

/**
 * Time:2019/4/12
 * Author:秦超蒙
 * Description:
 */
public class MyModel {
    MyCallBack myCallBack;

    public void getData(MyCallBack callBack){
        String name="这里是1611B";
        callBack.success(name);
    }

    public void setMyCallBack(MyCallBack myCallBack) {
        this.myCallBack = myCallBack;
    }

    public interface MyCallBack{
        public void success(String str);
    }
}
