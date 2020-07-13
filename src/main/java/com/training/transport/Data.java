package com.training.transport;

import java.io.Serializable;

public class Data implements Serializable {

    public static final long serialUUID = 132515132;

    int a;
    int b;


    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Data{" + "a=" + a +
                ", b=" + b +
                '}';
    }
}
