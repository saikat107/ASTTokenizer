<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { if ( org.w3c.dom.Element . boolean ( java.lang.String ) ) { return org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.context.config.AbstractBeanDefinition , ParserContext org.springframework.context.config.ParserContext ) { return ConfigurableApplicationContext . LOAD_TIME_WEAVER_BEAN_NAME ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.context.config.ParserContext , BeanDefinitionBuilder org.springframework.context.config.BeanDefinitionBuilder ) { org.springframework.context.config.BeanDefinitionBuilder . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; if ( boolean ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) , org.springframework.context.config.ParserContext ) ) { if ( ! org.springframework.context.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( java.lang.String ) ) { RootBeanDefinition org.springframework.context.config.RootBeanDefinition = new RootBeanDefinition ( java.lang.String ) ; org.springframework.context.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.context.config.RootBeanDefinition , java.lang.String ) ) ; } if ( boolean ( org.springframework.context.config.ParserContext . getReaderContext ( ) . getBeanClassLoader ( ) ) ) { new SpringConfiguredBeanDefinitionParser ( ) . parse ( org.w3c.dom.Element , org.springframework.context.config.ParserContext ) ; } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.String java.lang.String , ParserContext org.springframework.context.config.ParserContext ) { if ( STRING . boolean ( java.lang.String ) ) { return true ; } else if ( STRING . boolean ( java.lang.String ) ) { return false ; } else { java.lang.ClassLoader java.lang.ClassLoader = org.springframework.context.config.ParserContext . getReaderContext ( ) . getResourceLoader ( ) . getClassLoader ( ) ; return ( java.lang.ClassLoader . java.net.URL ( AspectJWeavingEnabler . ASPECTJ_AOP_XML_RESOURCE ) != null ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.ClassLoader java.lang.ClassLoader ) { return ClassUtils . isPresent ( SpringConfiguredBeanDefinitionParser . BEAN_CONFIGURER_ASPECT_CLASS_NAME , java.lang.ClassLoader ) ; }  <METHOD_END>