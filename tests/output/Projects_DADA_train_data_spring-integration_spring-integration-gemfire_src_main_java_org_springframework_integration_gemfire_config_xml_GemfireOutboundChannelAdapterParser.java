<METHOD_START> @ java.lang.Override protected org.springframework.integration.gemfire.config.xml.AbstractBeanDefinition org.springframework.integration.gemfire.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.gemfire.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CacheWritingMessageHandler .class ) ; if ( ! org.w3c.dom.Element . boolean ( java.lang.String ) ) { org.springframework.integration.gemfire.config.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , java.lang.String ) ; if ( org.w3c.dom.Element != null ) { java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = org.springframework.integration.gemfire.config.xml.ParserContext . getDelegate ( ) . parseMapElement ( org.w3c.dom.Element , org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , java.util.Map<,> ) ; } return org.springframework.integration.gemfire.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>