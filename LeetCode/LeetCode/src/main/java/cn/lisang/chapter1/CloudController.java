package cn.lisang.chapter1;

/**
 * @Author lisang
 * @Date 2020/12/14 12:04
 * @Description:
 * @Version 1.0
 */
public class CloudController {
    CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void storeFileToCloud() {
        cloudService.uploadFile("1.zip");
    }

    public static void main(String[] args) {
        CloudController cloudController = new CloudController(new CloudService("AWSSDK"));
        cloudController.storeFileToCloud();
    }
}
