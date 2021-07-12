package com.willz.bad;

import java.util.logging.Logger;

public class PrizeController {

    private Logger logger = Logger.getLogger("PrizeController.class");

    public AwardRes running(AwardReq awardReq) {
        logger.info("-------- 一把嗦，以下代码1000+ -------");
        if (awardReq.getType() == 0){
            logger.info("--------发优惠券服务");
        }else if (awardReq.getType() == 1){
            logger.info("--------第三方会员卡服务");
        }else if (awardReq.getType() == 2){
            logger.info("--------快递礼品发送服务");
        }
        logger.info("");
        return new AwardRes();
    }
}
