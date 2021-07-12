package com.will;

import com.will.factory.ClusterFactory;

public class main {
    public static void main(String[] args) {
        ClusterFactory.getService(1).show();

        ClusterFactory.getService(0).show();
    }
}
