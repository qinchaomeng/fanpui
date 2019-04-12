package com.example.workwork.contract;

/**
 * Time:2019/4/12
 * Author:秦超蒙
 * Description:
 */
public interface Contract {
    //view层
    public interface ViewInteface{
        public void ShowDisplay(String str);
    }

    //P层
    public interface PresenterInteface{
        public void toToast();
    }
}
