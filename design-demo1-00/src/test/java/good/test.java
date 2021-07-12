package good;

import com.willz.good.GiftFactory;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        GiftFactory instance = GiftFactory.getInstance();

        instance.getService(1).sendGift("B","B2",new HashMap<>(1));
        System.out.println();
        instance.getService(2).sendGift("A","A1",new HashMap<>(1));
        System.out.println();
        instance.getService(3).sendGift("C","C3",new HashMap<>(1));
    }
}
