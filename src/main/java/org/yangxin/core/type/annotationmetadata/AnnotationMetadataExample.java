package org.yangxin.core.type.annotationmetadata;

import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author yangxin
 * 2024/3/3 22:57
 */
@MyAnnotation(value = "example", description = "This is an example annotation")
public class AnnotationMetadataExample {

    public static void main(String[] args) {
        // 创建一个 StandardAnnotationMetadata 实例，传入一个类的全限定名
        AnnotationMetadata metadata = AnnotationMetadata.introspect(AnnotationMetadataExample.class);

        // 获取 MyAnnotation 注解的属性值
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(
                "org.yangxin.core.type.annotationmetadata.MyAnnotation"
        );
        if (annotationAttributes != null) {
            // 输出注解属性值
            System.out.println("Value: " + annotationAttributes.get("value"));
            System.out.println("Description: " + annotationAttributes.get("description"));
        } else {
            System.out.println("Annotation not found.");
        }
    }
}
