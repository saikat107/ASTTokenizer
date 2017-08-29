<METHOD_START> public static org.springframework.web.socket.config.RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.web.socket.config.ParserContext , java.lang.Object java.lang.Object ) { RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } else { RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( DefaultHandshakeHandler .class ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.web.socket.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.web.socket.config.RootBeanDefinition ) ; org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( java.lang.String ) ; } return org.springframework.web.socket.config.RuntimeBeanReference ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.config.RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference ( org.w3c.dom.Element org.w3c.dom.Element , java.lang.String java.lang.String , ParserContext org.springframework.web.socket.config.ParserContext , java.lang.Object java.lang.Object ) { org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( DefaultSockJsService .class ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( java.lang.Object ) ; java.lang.Object java.lang.Object ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { java.lang.Object = new RuntimeBeanReference ( java.lang.String ) ; } else { java.lang.Object = org.springframework.web.socket.config.RuntimeBeanReference ( java.lang.String , org.springframework.web.socket.config.ParserContext , java.lang.Object ) ; } org.springframework.web.socket.config.RootBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , java.lang.Object ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( org.w3c.dom.Element != null ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( java.lang.String . boolean ( STRING ) ) { org.springframework.web.socket.config.RootBeanDefinition . setBeanClass ( TransportHandlingSockJsService .class ) ; } ManagedList < ? > org.springframework.web.socket.config.ManagedList<?> = org.springframework.web.socket.config.ManagedList<? super java.lang.Object> ( org.w3c.dom.Element , org.springframework.web.socket.config.ParserContext ) ; org.springframework.web.socket.config.RootBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , org.springframework.web.socket.config.ManagedList<> ) ; } else if ( org.w3c.dom.Element != null ) { RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference = new RuntimeBeanReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( WebSocketTransportHandler .class ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.web.socket.config.RootBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , org.springframework.web.socket.config.RuntimeBeanReference ) ; org.springframework.web.socket.config.RootBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , org.springframework.web.socket.config.RootBeanDefinition ) ; } org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; ManagedList < ? super java.lang.Object > org.springframework.web.socket.config.ManagedList<? super java.lang.Object> = org.springframework.web.socket.config.WebSocketNamespaceUtils . org.springframework.web.socket.config.ManagedList<? super java.lang.Object> ( org.w3c.dom.Element , org.springframework.web.socket.config.ParserContext ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List ( StringUtils . tokenizeToStringArray ( java.lang.String , STRING ) ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.util.List<java.lang.String> ) ; RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( OriginHandshakeInterceptor .class ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.util.List<java.lang.String> ) ; org.springframework.web.socket.config.ManagedList<java.lang.Object> . add ( org.springframework.web.socket.config.RootBeanDefinition ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.springframework.web.socket.config.ManagedList<java.lang.Object> ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Boolean . java.lang.Boolean ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Boolean . java.lang.Boolean ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Integer . java.lang.Integer ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Long . java.lang.Long ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Integer . java.lang.Integer ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Long . java.lang.Long ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; } java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! java.lang.String . boolean ( ) ) { org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Boolean . java.lang.Boolean ( java.lang.String ) ) ; } org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.web.socket.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.web.socket.config.RootBeanDefinition ) ; return new RuntimeBeanReference ( java.lang.String ) ; } return null ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.config.RuntimeBeanReference org.springframework.web.socket.config.RuntimeBeanReference ( java.lang.String java.lang.String , ParserContext org.springframework.web.socket.config.ParserContext , java.lang.Object java.lang.Object ) { if ( ! org.springframework.web.socket.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( java.lang.String ) ) { RootBeanDefinition org.springframework.web.socket.config.RootBeanDefinition = new RootBeanDefinition ( ThreadPoolTaskScheduler .class ) ; org.springframework.web.socket.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.web.socket.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Runtime . java.lang.Runtime ( ) . int ( ) ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String + STRING ) ; org.springframework.web.socket.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , true ) ; org.springframework.web.socket.config.ParserContext . getRegistry ( ) . registerBeanDefinition ( java.lang.String , org.springframework.web.socket.config.RootBeanDefinition ) ; org.springframework.web.socket.config.ParserContext . registerComponent ( new BeanComponentDefinition ( org.springframework.web.socket.config.RootBeanDefinition , java.lang.String ) ) ; } return new RuntimeBeanReference ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.config.ManagedList<? super java.lang.Object> < ? super java.lang.Object > org.springframework.web.socket.config.ManagedList<? super java.lang.Object> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.web.socket.config.ParserContext ) { ManagedList < ? super java.lang.Object > org.springframework.web.socket.config.ManagedList<? super java.lang.Object> = new ManagedList <> ( ) ; if ( org.w3c.dom.Element != null ) { org.springframework.web.socket.config.ManagedList<java.lang.Object> . setSource ( org.springframework.web.socket.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING , STRING ) ) { org.springframework.web.socket.config.ManagedList<java.lang.Object> . add ( org.springframework.web.socket.config.ParserContext . getDelegate ( ) . parsePropertySubElement ( org.w3c.dom.Element , null ) ) ; } } return org.springframework.web.socket.config.ManagedList<java.lang.Object> ; }  <METHOD_END>