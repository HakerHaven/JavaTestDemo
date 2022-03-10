package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:31
 * @Description:
 * @Version 1.0
 */
public class PayDemo {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("1", 5000));
        bill.addItem(new Item("2", 15000));
        bill.pay(PaymentMethodFactory.getPaymentMethod("debit"));
    }
}
