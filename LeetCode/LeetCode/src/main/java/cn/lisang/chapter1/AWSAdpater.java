package cn.lisang.chapter1;

/**
 * @Author lisang
 * @Date 2020/12/14 12:07
 * @Description:
 * @Version 1.0
 */
public class AWSAdpater implements CloudSDK{
    private AWSSDK awssdk;

    public AWSAdpater(AWSSDK awssdk) {
        this.awssdk = awssdk;
    }

    @Override
    public void putObject(String fileName) {
        awssdk.putObject(fileName);
    }
}
