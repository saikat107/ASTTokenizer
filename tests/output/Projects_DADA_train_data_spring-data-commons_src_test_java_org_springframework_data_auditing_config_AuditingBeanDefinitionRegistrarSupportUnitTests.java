<METHOD_START> @ Test public void void ( ) { AuditingBeanDefinitionRegistrarSupport org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupport = new org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupportUnitTests.DummyAuditingBeanDefinitionRegistrarSupport ( ) ; AnnotationMetadata org.springframework.data.auditing.config.AnnotationMetadata = new StandardAnnotationMetadata ( org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupportUnitTests.SampleConfig .class ) ; org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupport . registerBeanDefinitions ( org.springframework.data.auditing.config.AnnotationMetadata , org.springframework.data.auditing.config.BeanDefinitionRegistry ) ; verify ( org.springframework.data.auditing.config.BeanDefinitionRegistry , times ( NUMBER ) ) . registerBeanDefinition ( anyString ( ) , any ( BeanDefinition .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( BeanDefinition org.springframework.data.auditing.config.BeanDefinition , BeanDefinitionRegistry org.springframework.data.auditing.config.BeanDefinitionRegistry ) {}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ( ) { return EnableAuditing .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.auditing.config.AuditingConfiguration org.springframework.data.auditing.config.AuditingConfiguration ( AnnotationMetadata org.springframework.data.auditing.config.AnnotationMetadata ) { return new AuditingConfiguration ( ) { public java.lang.String java.lang.String ( ) { return STRING ; } public boolean boolean ( ) { return true ; } public java.lang.String java.lang.String ( ) { return STRING ; } public boolean boolean ( ) { return true ; } } ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>