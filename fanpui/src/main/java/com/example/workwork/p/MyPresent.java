package com.example.workwork.p;

import com.example.workwork.contract.Contract;
import com.example.workwork.m.MyModel;

/**
 * Time:2019/4/12
 * Author:秦超蒙
 * Description:
 */
public class MyPresent implements Contract.PresenterInteface {
    MyModel myModel;
    Contract.ViewInteface viewInteface;

    public MyPresent( Contract.ViewInteface viewInteface) {
        myModel=new MyModel();
        this.viewInteface = viewInteface;
    }

    public MyModel getMyModel() {
        return myModel;
    }

    @Override
    public void toToast() {

        myModel.getData(new MyModel.MyCallBack() {
            @Override
            public void success(String str) {
                viewInteface.ShowDisplay(str);
            }
        });
    }
}
