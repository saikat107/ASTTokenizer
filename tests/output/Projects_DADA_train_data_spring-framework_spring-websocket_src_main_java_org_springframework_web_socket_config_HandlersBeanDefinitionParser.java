<METHOD_START> @ java.lang.Override public org.springframework.web.socket.config.BeanDefinition org.springframework.web.socket.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.web.socket.config.ParserContext ) { java.lang.Object java.lang.Object = org.springframework.web.socket.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; CompositeComponentDefinition org.springframework.web.socket.config.CompositeComponentDefinition = new CompositeComponentDefinition ( org.w3c.dom.Element . java.lang.String ( ) , java.lang.Object ) ; org.springframework.web.socket.config.ParserContext . pushContainingComponent ( org.springframework.web.socket.config.CompositeComponentDefinition ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; int int = java.lang.String . boolean ( ) ? int : java.lang.Integer . java.lang.Integer ( java.lang.String ) ; RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( WebSocketHandlerMapping .class ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , int ) ; java.lang.String java.lang.String = org.springframework.web.socket.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.web.socket.config.RootBeanDefinition ) ; RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = WebSocketNamespaceUtils . registerSockJsService ( org.w3c.dom.Element , java.lang.String , org.springframework.web.socket.config.ParserContext , java.lang.Object ) ; org.springframework.web.socket.config.HandlersBeanDefinitionParser.HandlerMappingStrategy org.springframework.web.socket.config.HandlersBeanDefinitionParser.HandlerMappingStrategy ; if ( org.springframework.web.socket.config.RuntimeBeanReference != null ) { org.springframework.web.socket.config.HandlersBeanDefinitionParser.HandlerMappingStrategy = new org.springframework.web.socket.config.HandlersBeanDefinitionParser.SockJsHandlerMappingStrategy ( org.springframework.web.socket.config.RuntimeBeanReference ) ; } else { RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = WebSocketNamespaceUtils . registerHandshakeHandler ( org.w3c.dom.Element , org.springframework.web.socket.config.ParserContext , java.lang.Object ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; ManagedList < ? super java.lang.Object > org.springframework.web.socket.config.ManagedList<? super java.lang.Object> = WebSocketNamespaceUtils . parseBeanSubElements ( org.w3c.dom.Element , org.springframework.web.socket.config.ParserContext ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List ( StringUtils . tokenizeToStringArray ( java.lang.String , STRING ) ) ; org.springframework.web.socket.config.ManagedList<java.lang.Object> . add ( new OriginHandshakeInterceptor ( java.util.List<java.lang.String> ) ) ; org.springframework.web.socket.config.HandlersBeanDefinitionParser.HandlerMappingStrategy = new org.springframework.web.socket.config.HandlersBeanDefinitionParser.WebSocketHandlerMappingStrategy ( org.springframework.web.socket.config.RuntimeBeanReference , org.springframework.web.socket.config.ManagedList<java.lang.Object> ) ; } ManagedMap < java.lang.String , java.lang.Object > org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> = new ManagedMap <> ( ) ; org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> . setSource ( java.lang.Object ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ) { org.springframework.web.socket.config.HandlersBeanDefinitionParser.HandlerMappingStrategy . void ( org.w3c.dom.Element , org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> , org.springframework.web.socket.config.ParserContext ) ; } org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> ) ; org.springframework.web.socket.config.ParserContext . registerComponent ( new BeanComponentDefinition ( org.springframework.web.socket.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.web.socket.config.ParserContext . popAndRegisterContainingComponent ( ) ; return null ; }  <METHOD_END>
<METHOD_START> void void ( org.w3c.dom.Element org.w3c.dom.Element , ManagedMap < java.lang.String , java.lang.Object > org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> , ParserContext org.springframework.web.socket.config.ParserContext );  <METHOD_END>
<METHOD_START> private void ( RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference , ManagedList < ? > org.springframework.web.socket.config.ManagedList<?> ) { this . org.springframework.web.socket.config.RuntimeBeanReference = org.springframework.web.socket.config.RuntimeBeanReference ; this . org.springframework.web.socket.config.ManagedList<?> = org.springframework.web.socket.config.ManagedList<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org.w3c.dom.Element org.w3c.dom.Element , ManagedMap < java.lang.String , java.lang.Object > org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> , ParserContext org.springframework.web.socket.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List ( StringUtils . tokenizeToStringArray ( java.lang.String , STRING ) ) ; RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; ConstructorArgumentValues org.springframework.web.socket.config.ConstructorArgumentValues = new ConstructorArgumentValues ( ) ; org.springframework.web.socket.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , org.springframework.web.socket.config.RuntimeBeanReference ) ; if ( this . org.springframework.web.socket.config.RuntimeBeanReference != null ) { org.springframework.web.socket.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , this . org.springframework.web.socket.config.RuntimeBeanReference ) ; } RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( WebSocketHttpRequestHandler .class , org.springframework.web.socket.config.ConstructorArgumentValues , null ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( org.springframework.web.socket.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , this . org.springframework.web.socket.config.ManagedList<> ) ; java.lang.String java.lang.String = org.springframework.web.socket.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.web.socket.config.RootBeanDefinition ) ; RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( java.lang.String ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.web.socket.config.RuntimeBeanReference ) ; } }  <METHOD_END>
<METHOD_START> private void ( RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference ) { this . org.springframework.web.socket.config.RuntimeBeanReference = org.springframework.web.socket.config.RuntimeBeanReference ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org.w3c.dom.Element org.w3c.dom.Element , ManagedMap < java.lang.String , java.lang.Object > org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> , ParserContext org.springframework.web.socket.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List ( StringUtils . tokenizeToStringArray ( java.lang.String , STRING ) ) ; RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; ConstructorArgumentValues org.springframework.web.socket.config.ConstructorArgumentValues = new ConstructorArgumentValues ( ) ; org.springframework.web.socket.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , this . org.springframework.web.socket.config.RuntimeBeanReference , STRING ) ; org.springframework.web.socket.config.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , org.springframework.web.socket.config.RuntimeBeanReference , STRING ) ; RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( SockJsHttpRequestHandler .class , org.springframework.web.socket.config.ConstructorArgumentValues , null ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( org.springframework.web.socket.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.web.socket.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.web.socket.config.RootBeanDefinition ) ; RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( java.lang.String ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = ( java.lang.String . boolean ( STRING ) ? java.lang.String + STRING : java.lang.String + STRING ) ; org.springframework.web.socket.config.ManagedMap<java.lang.String,java.lang.Object> . put ( java.lang.String , org.springframework.web.socket.config.RuntimeBeanReference ) ; } }  <METHOD_END>