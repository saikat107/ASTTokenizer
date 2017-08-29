<METHOD_START> public org.springframework.data.mongodb.config.BeanDefinition org.springframework.data.mongodb.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = BeanNames . MONGO_BEAN_NAME ; } void ( java.lang.String , org.w3c.dom.Element , org.springframework.data.mongodb.config.ParserContext ) ; return null ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.mongodb.config.ParserContext ) { java.lang.Object java.lang.Object = org.springframework.data.mongodb.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; CompositeComponentDefinition org.springframework.data.mongodb.config.CompositeComponentDefinition = new CompositeComponentDefinition ( org.w3c.dom.Element . java.lang.String ( ) , java.lang.Object ) ; void ( AssertMetrics .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( BackgroundFlushingMetrics .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( BtreeIndexCounters .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( ConnectionMetrics .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( GlobalLockMetrics .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( MemoryMetrics .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( OperationCounters .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( ServerInfo .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; void ( MongoAdmin .class , org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String , java.lang.Object , org.springframework.data.mongodb.config.ParserContext ) ; org.springframework.data.mongodb.config.ParserContext . registerComponent ( org.springframework.data.mongodb.config.CompositeComponentDefinition ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Class<?> < ? > java.lang.Class<?> , CompositeComponentDefinition org.springframework.data.mongodb.config.CompositeComponentDefinition , java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParserContext org.springframework.data.mongodb.config.ParserContext ) { BeanDefinitionBuilder org.springframework.data.mongodb.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( java.lang.Class<> ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setSource ( java.lang.Object ) ; org.springframework.data.mongodb.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = org.springframework.data.mongodb.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; java.lang.String java.lang.String = org.springframework.data.mongodb.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.data.mongodb.config.BeanDefinition ) ; org.springframework.data.mongodb.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.data.mongodb.config.BeanDefinition , java.lang.String ) ) ; }  <METHOD_END>