package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:23
 * @Description:
 * @Version 1.0
 */
public class DebitCard extends Card {

    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void executeTransaction(int cents) {
        System.out.println("doTran " + cents);
    }
}
