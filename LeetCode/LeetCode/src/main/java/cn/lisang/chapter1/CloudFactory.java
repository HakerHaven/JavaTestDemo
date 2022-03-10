package cn.lisang.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lisang
 * @Date 2020/12/14 12:09
 * @Description:
 * @Version 1.0
 */
public class CloudFactory {
    static Map<String, CloudSDK> cloudSDKMap = new HashMap<>();

    static {
        cloudSDKMap.put("ALISDK", new ALIAdapter(new ALISDK()));
        cloudSDKMap.put("AWSSDK", new AWSAdpater(new AWSSDK()));
    }

    public static CloudSDK create(String cloudStategy) {
        return cloudSDKMap.get(cloudStategy);
    }
}
