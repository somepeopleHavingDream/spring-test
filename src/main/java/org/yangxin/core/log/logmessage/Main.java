package org.yangxin.core.log.logmessage;

import org.springframework.core.log.LogMessage;

/**
 * @author yangxin
 * 2024/3/25 22:33
 */
public class Main {

    public static void main(String[] args) {
        String messageTemplate = "Hello, %s!";
        String name = "World";

        // 调用 LogMessage.format 方法格式化日志消息
        LogMessage format = LogMessage.format(messageTemplate, name);
        // 输出格式化后的日志消息
        System.out.println(format);
    }
}
