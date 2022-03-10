package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:17
 * @Description:
 * @Version 1.0
 */
public abstract class Card implements PaymentMethod {

    @Override
    public void pay(int cents) {
        System.out.println("use " + getType() + " --> payed " + cents + " cents");
        //具体执行支付操作
        executeTransaction(cents);
    }

    protected abstract String getType();

    protected abstract void executeTransaction(int cents);
}
