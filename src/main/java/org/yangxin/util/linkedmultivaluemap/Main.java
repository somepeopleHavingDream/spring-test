package org.yangxin.util.linkedmultivaluemap;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author yangxin
 * 2024/3/24 15:04
 */
public class Main {

    public static void main(String[] args) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        // 添加键值对
        map.add("key", "value1");
        map.add("key", "value2");
        map.add("anotherKey", "anotherValue");

        // 获取值
        System.out.println("Values for 'key': " + map.get("key")); // 输出: [value1, value2]
        System.out.println("Values for 'anotherKey': " + map.get("anotherKey")); // 输出: [anotherValue]
    }
}
