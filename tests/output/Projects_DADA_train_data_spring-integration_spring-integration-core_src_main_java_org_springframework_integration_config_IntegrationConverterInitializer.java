<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.integration.config.ConfigurableListableBeanFactory ) throws org.springframework.integration.config.BeansException { BeanDefinitionRegistry org.springframework.integration.config.BeanDefinitionRegistry = ( BeanDefinitionRegistry ) org.springframework.integration.config.ConfigurableListableBeanFactory ; for ( java.lang.String java.lang.String : org.springframework.integration.config.BeanDefinitionRegistry . getBeanDefinitionNames ( ) ) { BeanDefinition org.springframework.integration.config.BeanDefinition = org.springframework.integration.config.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; if ( org.springframework.integration.config.BeanDefinition instanceof AnnotatedBeanDefinition ) { AnnotationMetadata org.springframework.integration.config.AnnotationMetadata = ( ( AnnotatedBeanDefinition ) org.springframework.integration.config.BeanDefinition ) . getMetadata ( ) ; boolean boolean = org.springframework.integration.config.AnnotationMetadata . hasAnnotation ( IntegrationConverter .class . java.lang.String ( ) ) ; if ( ! boolean && org.springframework.integration.config.BeanDefinition . getSource ( ) instanceof MethodMetadata ) { MethodMetadata org.springframework.integration.config.MethodMetadata = ( MethodMetadata ) org.springframework.integration.config.BeanDefinition . getSource ( ) ; boolean = org.springframework.integration.config.MethodMetadata . isAnnotated ( IntegrationConverter .class . java.lang.String ( ) ) ; } if ( boolean ) { this . void ( org.springframework.integration.config.BeanDefinitionRegistry , new RuntimeBeanReference ( java.lang.String ) ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( BeanDefinitionRegistry org.springframework.integration.config.BeanDefinitionRegistry , BeanMetadataElement org.springframework.integration.config.BeanMetadataElement ) { java.util.Set<org.springframework.integration.config.BeanMetadataElement> < BeanMetadataElement > java.util.Set<org.springframework.integration.config.BeanMetadataElement> = new ManagedSet < BeanMetadataElement > ( ) ; if ( ! org.springframework.integration.config.BeanDefinitionRegistry . containsBeanDefinition ( IntegrationContextUtils . CONVERTER_REGISTRAR_BEAN_NAME ) ) { BeanDefinitionBuilder org.springframework.integration.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( java.lang.String + STRING ) . addConstructorArgValue ( java.util.Set<org.springframework.integration.config.BeanMetadataElement> ) ; org.springframework.integration.config.BeanDefinitionRegistry . registerBeanDefinition ( IntegrationContextUtils . CONVERTER_REGISTRAR_BEAN_NAME , org.springframework.integration.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; if ( ! org.springframework.integration.config.BeanDefinitionRegistry . containsBeanDefinition ( IntegrationUtils . INTEGRATION_CONVERSION_SERVICE_BEAN_NAME ) ) { org.springframework.integration.config.BeanDefinitionRegistry . registerBeanDefinition ( IntegrationUtils . INTEGRATION_CONVERSION_SERVICE_BEAN_NAME , new RootBeanDefinition ( java.lang.String + STRING ) ) ; } } else { BeanDefinition org.springframework.integration.config.BeanDefinition = org.springframework.integration.config.BeanDefinitionRegistry . getBeanDefinition ( IntegrationContextUtils . CONVERTER_REGISTRAR_BEAN_NAME ) ; java.util.Set<org.springframework.integration.config.BeanMetadataElement> = ( java.util.Set<org.springframework.integration.config.BeanMetadataElement> < BeanMetadataElement > ) org.springframework.integration.config.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValues ( ) . values ( ) . iterator ( ) . next ( ) . getValue ( ) ; } java.util.Set<org.springframework.integration.config.BeanMetadataElement> . add ( org.springframework.integration.config.BeanMetadataElement ) ; }  <METHOD_END>