<METHOD_START> @ java.lang.Override protected org.springframework.integration.mongodb.config.AbstractBeanDefinition org.springframework.integration.mongodb.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.mongodb.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MongoDbStoringMessageHandler .class ) ; MongoParserUtils . processCommonAttributes ( org.w3c.dom.Element , org.springframework.integration.mongodb.config.ParserContext , org.springframework.integration.mongodb.config.BeanDefinitionBuilder ) ; return org.springframework.integration.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>