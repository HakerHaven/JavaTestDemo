package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:22
 * @Description:
 * @Version 1.0
 */
public class CreditCard extends Card {

    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void executeTransaction(int cents) {
        System.out.println("doTran " + cents);
    }
}
