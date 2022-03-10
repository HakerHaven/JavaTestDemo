package cn.lisang.chapter1;

/**
 * @Author lisang
 * @Date 2020/12/14 12:03
 * @Description:
 * @Version 1.0
 */
public class ALIAdapter implements CloudSDK{
    private ALISDK alisdk;

    public ALIAdapter(ALISDK alisdk) {
        this.alisdk = alisdk;
    }

    @Override
    public void putObject(String fileName) {
        alisdk.setBackets();
        alisdk.upload(fileName);
    }
}
