package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:32
 * @Description:
 * @Version 1.0
 */
public class PaymentMethodFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        switch (type) {
            case "credit":
                return new CreditCard();
            case "debit":
                return new DebitCard();
            default:
                throw new RuntimeException("can't found type");
        }
    }
}
