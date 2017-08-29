<METHOD_START> @ java.lang.Override protected org.springframework.integration.xmpp.config.AbstractBeanDefinition org.springframework.integration.xmpp.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.xmpp.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.xmpp.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( this . java.lang.String ( ) ) ; IntegrationNamespaceUtils . configureHeaderMapper ( org.w3c.dom.Element , org.springframework.integration.xmpp.config.BeanDefinitionBuilder , org.springframework.integration.xmpp.config.ParserContext , DefaultXmppHeaderMapper .class , null ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.xmpp.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } else if ( org.springframework.integration.xmpp.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( XmppNamespaceHandler . XMPP_CONNECTION_BEAN_NAME ) ) { org.springframework.integration.xmpp.config.BeanDefinitionBuilder . addConstructorArgReference ( XmppNamespaceHandler . XMPP_CONNECTION_BEAN_NAME ) ; } else { throw new BeanCreationException ( STRING + STRING + STRING ) ; } return org.springframework.integration.xmpp.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>