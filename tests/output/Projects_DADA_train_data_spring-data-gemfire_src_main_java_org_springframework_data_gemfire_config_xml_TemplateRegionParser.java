<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return RegionFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.gemfire.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , boolean boolean ) { BeanDefinitionBuilder org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( RegionAttributesFactoryBean .class ) ; doParseRegionConfiguration ( org.w3c.dom.Element , org.springframework.data.gemfire.config.xml.ParserContext , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder , boolean ) ; org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.data.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; }  <METHOD_END>