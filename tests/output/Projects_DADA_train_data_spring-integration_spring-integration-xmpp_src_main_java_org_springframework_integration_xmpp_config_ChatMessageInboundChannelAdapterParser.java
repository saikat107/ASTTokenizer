<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.xmpp.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.xmpp.config.BeanDefinitionBuilder ) { BeanDefinition org.springframework.integration.xmpp.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefIfAttributeDefined ( STRING , org.w3c.dom.Element ) ; if ( org.springframework.integration.xmpp.config.BeanDefinition != null ) { org.springframework.integration.xmpp.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.xmpp.config.BeanDefinition ) ; } IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.xmpp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; }  <METHOD_END>