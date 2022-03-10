package cn.lisang.chapter2;

/**
 * @Author lisang
 * @Date 2020/12/14 12:24
 * @Description:
 * @Version 1.0
 */
public class Item {
    private String desc;
    private int cents;

    public Item(String desc, int cents) {
        this.desc = desc;
        this.cents = cents;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}
