<METHOD_START> @ java.lang.Override protected org.springframework.integration.stream.config.BeanMetadataElement org.springframework.integration.stream.config.BeanMetadataElement ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.stream.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.stream.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CharacterStreamReadingMessageSource .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.stream.config.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; } else { org.springframework.integration.stream.config.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.stream.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } return org.springframework.integration.stream.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>