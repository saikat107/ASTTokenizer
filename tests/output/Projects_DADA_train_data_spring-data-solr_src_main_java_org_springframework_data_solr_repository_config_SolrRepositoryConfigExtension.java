<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return SolrRepositoryFactoryBean .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionBuilder org.springframework.data.solr.repository.config.BeanDefinitionBuilder , AnnotationRepositoryConfigurationSource org.springframework.data.solr.repository.config.AnnotationRepositoryConfigurationSource ) { AnnotationAttributes org.springframework.data.solr.repository.config.AnnotationAttributes = org.springframework.data.solr.repository.config.AnnotationRepositoryConfigurationSource . getAttributes ( ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , org.springframework.data.solr.repository.config.AnnotationAttributes . getString ( STRING ) ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.solr.repository.config.AnnotationAttributes . getBoolean ( STRING ) ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , STRING ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionRegistry org.springframework.data.solr.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) { super. registerBeansForRoot ( org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; void ( org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; void ( org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; void ( org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; void ( org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; registerIfNotAlreadyRegistered ( BeanDefinitionBuilder . genericBeanDefinition ( SolrExceptionTranslator .class ) . getBeanDefinition ( ) , org.springframework.data.solr.repository.config.BeanDefinitionRegistry , STRING , org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionBuilder org.springframework.data.solr.repository.config.BeanDefinitionBuilder , XmlRepositoryConfigurationSource org.springframework.data.solr.repository.config.XmlRepositoryConfigurationSource ) { org.w3c.dom.Element org.w3c.dom.Element = org.springframework.data.solr.repository.config.XmlRepositoryConfigurationSource . getElement ( ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , STRING ) ; org.springframework.data.solr.repository.config.BeanDefinitionBuilder . addPropertyReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> ( ) { return java.util.Collections . java.util.Set<java.lang.Class<org.springframework.data.solr.repository.config.SolrDocument>> ( SolrDocument .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Collection<java.lang.Class<?>> ( ) { return java.util.Arrays . java.util.List<java.lang.Class<?>> ( SolrRepository .class , SolrCrudRepository .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.data.solr.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) { RootBeanDefinition org.springframework.data.solr.repository.config.RootBeanDefinition = new RootBeanDefinition ( CustomConversions .class ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setRole ( AbstractBeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setSource ( org.springframework.data.solr.repository.config.RepositoryConfigurationSource . getSource ( ) ) ; registerIfNotAlreadyRegistered ( org.springframework.data.solr.repository.config.RootBeanDefinition , org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , org.springframework.data.solr.repository.config.RootBeanDefinition ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.data.solr.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) { RootBeanDefinition org.springframework.data.solr.repository.config.RootBeanDefinition = new RootBeanDefinition ( SimpleSolrMappingContext .class ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setRole ( AbstractBeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setSource ( org.springframework.data.solr.repository.config.RepositoryConfigurationSource . getSource ( ) ) ; registerIfNotAlreadyRegistered ( org.springframework.data.solr.repository.config.RootBeanDefinition , org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , org.springframework.data.solr.repository.config.RootBeanDefinition ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.data.solr.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) { RootBeanDefinition org.springframework.data.solr.repository.config.RootBeanDefinition = new RootBeanDefinition ( MappingSolrConverter .class ) ; ConstructorArgumentValues org.springframework.data.solr.repository.config.ConstructorArgumentValues = new ConstructorArgumentValues ( ) ; org.springframework.data.solr.repository.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , new RuntimeBeanReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) ) ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setConstructorArgumentValues ( org.springframework.data.solr.repository.config.ConstructorArgumentValues ) ; MutablePropertyValues org.springframework.data.solr.repository.config.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.data.solr.repository.config.MutablePropertyValues . add ( STRING , new RuntimeBeanReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) ) ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setPropertyValues ( org.springframework.data.solr.repository.config.MutablePropertyValues ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setRole ( AbstractBeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setSource ( org.springframework.data.solr.repository.config.RepositoryConfigurationSource . getSource ( ) ) ; registerIfNotAlreadyRegistered ( org.springframework.data.solr.repository.config.RootBeanDefinition , org.springframework.data.solr.repository.config.BeanDefinitionRegistry , org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) , org.springframework.data.solr.repository.config.RootBeanDefinition ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.data.solr.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.solr.repository.config.RepositoryConfigurationSource ) { RootBeanDefinition org.springframework.data.solr.repository.config.RootBeanDefinition = new RootBeanDefinition ( SolrTemplate .class ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setTargetType ( SolrOperations .class ) ; ConstructorArgumentValues org.springframework.data.solr.repository.config.ConstructorArgumentValues = new ConstructorArgumentValues ( ) ; org.springframework.data.solr.repository.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , org.springframework.data.solr.repository.config.BeanDefinition ( ) ) ; org.springframework.data.solr.repository.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , new RuntimeBeanReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) ) ) ; org.springframework.data.solr.repository.config.RootBeanDefinition . setConstructorArgumentValues ( org.springframework.data.solr.repository.config.ConstructorArgumentValues ) ; registerIfNotAlreadyRegistered ( org.springframework.data.solr.repository.config.RootBeanDefinition , org.springframework.data.solr.repository.config.BeanDefinitionRegistry , STRING , org.springframework.data.solr.repository.config.RootBeanDefinition ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.config.BeanDefinition org.springframework.data.solr.repository.config.BeanDefinition ( ) { GenericBeanDefinition org.springframework.data.solr.repository.config.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.data.solr.repository.config.GenericBeanDefinition . setBeanClass ( HttpSolrClientFactory .class ) ; ConstructorArgumentValues org.springframework.data.solr.repository.config.ConstructorArgumentValues = new ConstructorArgumentValues ( ) ; org.springframework.data.solr.repository.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , new RuntimeBeanReference ( org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . org.springframework.data.solr.repository.config.SolrRepositoryConfigExtension.BeanDefinitionName . java.lang.String ( ) ) ) ; org.springframework.data.solr.repository.config.GenericBeanDefinition . setConstructorArgumentValues ( org.springframework.data.solr.repository.config.ConstructorArgumentValues ) ; return org.springframework.data.solr.repository.config.GenericBeanDefinition ; }  <METHOD_END>