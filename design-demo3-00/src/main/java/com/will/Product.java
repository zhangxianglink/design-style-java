package com.will;

import com.will.pojo.Noodles;

public interface Product {

    Product addOne(Noodles noodles);
    Product addTwo(Noodles noodles);
    Product addThree(Noodles noodles);

    String getDetail();
}
