package org.yangxin.core.type.annotationmetadata;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Map;
import java.util.Set;

/**
 * @author yangxin
 * 2024/3/3 22:57
 */
@SuppressWarnings("unused")
@MyAnnotation(value = "example", description = "This is an example annotation")
public class AnnotationMetadataExample {

    public static void main(String[] args) {
//        getAnnotationAttributes();
        getAnnotationMethods();
    }

    private static void getAnnotationMethods() {
        // 创建 AnnotationMetadata 对象
        AnnotationMetadata metadata = AnnotationMetadata.introspect(AnnotationMetadataExample.class);

        // 获取被 @MyAnnotation 注解标注的方法信息
        Set<MethodMetadata> annotatedMethods = metadata.getAnnotatedMethods(MyAnnotation.class.getName());

        // 遍历输出被标注方法的信息
        for (MethodMetadata methodMetadata : annotatedMethods) {
            System.out.println("Annotated method name: " + methodMetadata.getMethodName());
        }
    }

    private static void getAnnotationAttributes() {
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

    @MyAnnotation(value = "annotatedMethod1", description = "annotatedMethod1")
    public void annotatedMethod1() {
        System.out.println("Annotated method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }
}
