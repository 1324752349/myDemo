package com.mafengwo.demo.importsel;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author chenminrui
 * @date 2020-05-12 3:17 下午
 */
public class importselector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
            Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(UserScan.class.getName());
            if(CollectionUtils.isEmpty(annotationAttributes))return new String[0];
            String[] basePackages = (String[]) annotationAttributes.get("basePackages");//拿到扫描包下的所有有bsePackages的类
            ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
            scanner.addIncludeFilter(new AssignableTypeFilter(Object.class));//这里实现包含,相当@ComponentScan  includeFilters
            //scanner.addExcludeFilter(new AssignableTypeFilter(Object.class));//这里可以实现排除，相当@ComponentScan  excludeFilters
            Set<String> classes = new HashSet<>();
            for (String basePackage : basePackages) {
                Set<BeanDefinition> candidateComponents = scanner.findCandidateComponents(basePackage);
                candidateComponents.forEach(e-> {
                    classes.add(e.getBeanClassName());
                });
            }
            return classes.toArray(new String[classes.size()]);
            //return new String[]{UserA.class.getName()};

    }
}
