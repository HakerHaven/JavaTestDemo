package cn.lisang.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lisang
 * @Date 2020/12/14 12:25
 * @Description:
 * @Version 1.0
 */
public class Bill {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public int getSumCents() {
        return items.stream().mapToInt(item -> item.getCents()).sum();
    }

    public void pay(PaymentMethod paymentMethod) {
        paymentMethod.pay(getSumCents());
    }

}
