<METHOD_START> static void void ( ParserContext org.springframework.data.gemfire.config.xml.ParserContext ) { if ( java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition = BeanDefinitionBuilder . rootBeanDefinition ( ClientRegionPoolBeanFactoryPostProcessor .class ) . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) . getBeanDefinition ( ) ; BeanDefinitionReaderUtils . registerWithGeneratedName ( org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return PoolFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder ) { void ( org.springframework.data.gemfire.config.xml.ParserContext ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; ParsingUtils . setPropertyValue ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , STRING ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElements ( org.w3c.dom.Element ) ; ManagedList < BeanDefinition > org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> = new ManagedList < BeanDefinition > ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; ManagedList < BeanDefinition > org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> = new ManagedList < BeanDefinition > ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> . add ( org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element ) ) ; } if ( java.lang.String . boolean ( java.lang.String ) ) { org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> . add ( org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element ) ) ; } } boolean boolean = boolean ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( org.springframework.data.gemfire.config.xml.ParserContext ) ) ; boolean boolean = boolean ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( org.springframework.data.gemfire.config.xml.ParserContext ) ) ; if ( java.util.List<org.w3c.dom.Element> . boolean ( ) && ! ( boolean || boolean ) ) { org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> . add ( org.springframework.data.gemfire.config.xml.BeanDefinition ( java.lang.String , java.lang.String . java.lang.String ( int ) , true ) ) ; } if ( ! org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> . isEmpty ( ) ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> ) ; } if ( ! org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> . isEmpty ( ) ) { org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.ManagedList<org.springframework.data.gemfire.config.xml.BeanDefinition> ) ; } }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ( ParserContext org.springframework.data.gemfire.config.xml.ParserContext ) { return org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.config.xml.BeanDefinition org.springframework.data.gemfire.config.xml.BeanDefinition ( java.lang.String java.lang.String , java.lang.String java.lang.String , boolean boolean ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ConnectionEndpoint .class ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ( java.lang.String ) ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ( java.lang.String , boolean ) ) ; return org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.config.xml.BeanDefinition org.springframework.data.gemfire.config.xml.BeanDefinition ( java.lang.String java.lang.String , boolean boolean ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ConnectionEndpointList .class ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ( null , boolean ) ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; return org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String , boolean boolean ) { return ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : ( boolean ? java.lang.String . java.lang.String ( int ) : java.lang.String . java.lang.String ( int ) ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.config.xml.BeanDefinition org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { return org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) , org.w3c.dom.Element . java.lang.String ( java.lang.String ) , false ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MethodInvokingBean .class ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ( org.w3c.dom.Element ) ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.BeanDefinition ( java.lang.String , false ) ) ; AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition = org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; BeanDefinitionReaderUtils . registerWithGeneratedName ( org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) ; return true ; } return false ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.config.xml.BeanDefinition org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { return org.springframework.data.gemfire.config.xml.BeanDefinition ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) , org.w3c.dom.Element . java.lang.String ( java.lang.String ) , true ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionRegistry org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MethodInvokingBean .class ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ( org.w3c.dom.Element ) ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.BeanDefinition ( java.lang.String , true ) ) ; AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition = org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; BeanDefinitionReaderUtils . registerWithGeneratedName ( org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , org.springframework.data.gemfire.config.xml.BeanDefinitionRegistry ) ; return true ; } return false ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ; return ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : GemfireConstants . DEFAULT_GEMFIRE_POOL_NAME ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return SpringUtils . dereferenceBean ( java.lang.String ( org.w3c.dom.Element ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , ParserContext org.springframework.data.gemfire.config.xml.ParserContext )			throws org.springframework.data.gemfire.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.AbstractBeanDefinition , org.springframework.data.gemfire.config.xml.ParserContext ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = GemfireConstants . DEFAULT_GEMFIRE_POOL_NAME ; org.springframework.data.gemfire.config.xml.ParserContext . getRegistry ( ) . registerAlias ( GemfireConstants . DEFAULT_GEMFIRE_POOL_NAME , STRING ) ; } return java.lang.String ; }  <METHOD_END>