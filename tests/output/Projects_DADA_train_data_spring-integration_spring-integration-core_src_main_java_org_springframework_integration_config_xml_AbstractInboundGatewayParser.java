<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition , ParserContext org.springframework.integration.config.xml.ParserContext )			throws org.springframework.integration.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.integration.config.xml.AbstractBeanDefinition , org.springframework.integration.config.xml.ParserContext ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; } if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . generateBeanName ( org.springframework.integration.config.xml.AbstractBeanDefinition ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.String java.lang.String ) { return ! java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) && super. isEligibleAttribute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } this . void ( org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element ) ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) {	}  <METHOD_END>