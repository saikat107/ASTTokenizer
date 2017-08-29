<METHOD_START> void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.amqp.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.amqp.config.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { void ( org.w3c.dom.Element , org.springframework.integration.amqp.config.ParserContext ) ; org.springframework.integration.amqp.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } else { BeanDefinition org.springframework.integration.amqp.config.BeanDefinition = this . org.springframework.integration.amqp.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.integration.amqp.config.ParserContext ) ; org.springframework.integration.amqp.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.amqp.config.BeanDefinition ) ; } IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; BeanDefinitionBuilder org.springframework.integration.amqp.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DefaultAmqpHeaderMapper .class ) ; org.springframework.integration.amqp.config.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; IntegrationNamespaceUtils . configureHeaderMapper ( org.w3c.dom.Element , org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.springframework.integration.amqp.config.ParserContext , org.springframework.integration.amqp.config.BeanDefinitionBuilder , null ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; this . void ( org.w3c.dom.Element , org.springframework.integration.amqp.config.ParserContext , org.springframework.integration.amqp.config.BeanDefinitionBuilder ) ; }  <METHOD_END>
<METHOD_START> protected abstract void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.amqp.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.amqp.config.BeanDefinitionBuilder );  <METHOD_END>
<METHOD_START> private org.springframework.integration.amqp.config.BeanDefinition org.springframework.integration.amqp.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.amqp.config.ParserContext ) { if ( ! org.w3c.dom.Element . boolean ( STRING ) ) { org.springframework.integration.amqp.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; BeanDefinitionBuilder org.springframework.integration.amqp.config.BeanDefinitionBuilder ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.amqp.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DirectMessageListenerContainer .class ) ; if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.amqp.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.amqp.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.amqp.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } org.springframework.integration.amqp.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } else { org.springframework.integration.amqp.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SimpleMessageListenerContainer .class ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = STRING ; } org.springframework.integration.amqp.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.amqp.config.BeanDefinitionBuilder , org.w3c.dom.Element , java.lang.String ) ; } return org.springframework.integration.amqp.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.amqp.config.ParserContext ) { java.lang.Object java.lang.Object = org.springframework.integration.amqp.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; java.util.List<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ) { org.springframework.integration.amqp.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , java.lang.Object ) ; } } }  <METHOD_END>