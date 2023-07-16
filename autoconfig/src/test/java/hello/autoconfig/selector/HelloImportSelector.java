package hello.autoconfig.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

// 설정 정보를 동적으로 선택할 수 있도록 함
public class HelloImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"hello.autoconfig.selector.HelloConfig", "hello.autoconfig.selector.HelloConfig2"};
    }
}
