<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String )			throws org.springframework.boot.autoconfigure.jdbc.BeansException { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String )			throws org.springframework.boot.autoconfigure.jdbc.BeansException { if ( java.lang.Object instanceof javax.sql.DataSource ) { this . org.springframework.boot.autoconfigure.jdbc.BeanFactory . getBean ( DataSourceInitializer .class ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.boot.autoconfigure.jdbc.AnnotationMetadata , BeanDefinitionRegistry org.springframework.boot.autoconfigure.jdbc.BeanDefinitionRegistry ) { if ( ! org.springframework.boot.autoconfigure.jdbc.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { GenericBeanDefinition org.springframework.boot.autoconfigure.jdbc.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.boot.autoconfigure.jdbc.GenericBeanDefinition . setBeanClass ( org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerPostProcessor .class ) ; org.springframework.boot.autoconfigure.jdbc.GenericBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.boot.autoconfigure.jdbc.GenericBeanDefinition . setSynthetic ( true ) ; org.springframework.boot.autoconfigure.jdbc.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.boot.autoconfigure.jdbc.GenericBeanDefinition ) ; } }  <METHOD_END>