package com.will;

import com.will.pojo.One;
import com.will.pojo.Three;
import com.will.pojo.Two;

public class Builder {

    public Product oneProduct(Double basePrice){
        return new NoodlesStore("骨汤面",basePrice).addOne(new One())
                .addTwo(new Two()).addThree(new Three());
    }
}
