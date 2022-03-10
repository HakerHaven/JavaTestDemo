package cn.lisang.chapter1;

/**
 * @Author lisang
 * @Date 2020/12/14 12:04
 * @Description:
 * @Version 1.0
 */
public class CloudService {
    private CloudSDK cloudSDK;

    public CloudService(String cloudStategy) {
        this.cloudSDK = CloudFactory.create(cloudStategy);
    }

    public void uploadFile(String fileName) {
        cloudSDK.putObject(fileName);
    }
}
