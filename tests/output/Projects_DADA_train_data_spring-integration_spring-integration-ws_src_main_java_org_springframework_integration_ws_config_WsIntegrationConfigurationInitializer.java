<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.integration.ws.config.ConfigurableListableBeanFactory ) throws org.springframework.integration.ws.config.BeansException { if ( org.springframework.integration.ws.config.ConfigurableListableBeanFactory instanceof BeanDefinitionRegistry ) { if ( org.springframework.integration.ws.config.ConfigurableListableBeanFactory . getBeanNamesForType ( EndpointAdapter .class , false , false ) . length > NUMBER ) { BeanDefinitionBuilder org.springframework.integration.ws.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MessageEndpointAdapter .class ) ; org.springframework.integration.ws.config.BeanDefinitionBuilder . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; ( ( BeanDefinitionRegistry ) org.springframework.integration.ws.config.ConfigurableListableBeanFactory ) . registerBeanDefinition ( java.lang.String , org.springframework.integration.ws.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } } else { org.springframework.integration.ws.config.Log . warn ( STRING + STRING ) ; } }  <METHOD_END>