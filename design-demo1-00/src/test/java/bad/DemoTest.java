package bad;

import com.willz.bad.AwardReq;
import com.willz.bad.PrizeController;

public class DemoTest {
    public static void main(String[] args) {
        PrizeController controller = new PrizeController();
        int type = 0;
        controller.running(new AwardReq(type));
        controller.running(new AwardReq(type+1));
        controller.running(new AwardReq(type+2));
    }
}
