<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.data.gemfire.config.annotation.AnnotationMetadata , BeanDefinitionRegistry org.springframework.data.gemfire.config.annotation.BeanDefinitionRegistry ) { if ( org.springframework.data.gemfire.config.annotation.AnnotationMetadata . hasAnnotation ( EnablePools .class . java.lang.String ( ) ) ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.data.gemfire.config.annotation.AnnotationMetadata . getAnnotationAttributes ( EnablePools .class . java.lang.String ( ) ) ; AnnotationAttributes [] org.springframework.data.gemfire.config.annotation.AnnotationAttributes[] = ( AnnotationAttributes [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; for ( AnnotationAttributes org.springframework.data.gemfire.config.annotation.AnnotationAttributes : org.springframework.data.gemfire.config.annotation.AnnotationAttributes[] ) { registerPoolFactoryBeanDefinition ( org.springframework.data.gemfire.config.annotation.AnnotationAttributes , org.springframework.data.gemfire.config.annotation.BeanDefinitionRegistry ) ; } } }  <METHOD_END>