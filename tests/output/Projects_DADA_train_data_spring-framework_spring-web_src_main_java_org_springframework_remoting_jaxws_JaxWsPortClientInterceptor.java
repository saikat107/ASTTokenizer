<METHOD_START> public void void ( javax.xml.ws.Service javax.xml.ws.Service ) { this . javax.xml.ws.Service = javax.xml.ws.Service ; }  <METHOD_END>
<METHOD_START> public javax.xml.ws.Service javax.xml.ws.Service ( ) { return this . javax.xml.ws.Service ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { this . java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { if ( this . java.util.Map<java.lang.String,java.lang.Object> == null ) { this . java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; } return this . java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { java.util.Map<java.lang.String,java.lang.Object> ( ) . java.lang.Object ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( javax.xml.ws.WebServiceFeature ... javax.xml.ws.WebServiceFeature[] ) { this . javax.xml.ws.WebServiceFeature[] = javax.xml.ws.WebServiceFeature[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> != null && ! java.lang.Class<> . boolean ( ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> protected java.lang.ClassLoader java.lang.ClassLoader ( ) { return this . java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . boolean ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( ) ; if ( java.lang.Class<> == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } javax.jws.WebService javax.jws.WebService = java.lang.Class<> . javax.jws.WebService ( javax.jws.WebService .class ) ; if ( javax.jws.WebService != null ) { void ( javax.jws.WebService ) ; } javax.xml.ws.Service javax.xml.ws.Service = javax.xml.ws.Service ( ) ; if ( javax.xml.ws.Service == null ) { javax.xml.ws.Service = createJaxWsService ( ) ; } this . javax.xml.namespace.QName = getQName ( java.lang.String ( ) != null ? java.lang.String ( ) : java.lang.Class<?> ( ) . java.lang.String ( ) ) ; java.lang.Object java.lang.Object = java.lang.Object ( javax.xml.ws.Service , ( java.lang.String ( ) != null ? this . javax.xml.namespace.QName : null ) ) ; void ( java.lang.Object ) ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected void void ( javax.jws.WebService javax.jws.WebService ) { if ( getWsdlDocumentUrl ( ) == null ) { java.lang.String java.lang.String = javax.jws.WebService . java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { try { setWsdlDocumentUrl ( new java.net.URL ( java.lang.String ) ) ; } catch ( java.net.MalformedURLException java.net.MalformedURLException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING , java.net.MalformedURLException ) ; } } } if ( getNamespaceUri ( ) == null ) { java.lang.String java.lang.String = javax.jws.WebService . java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { setNamespaceUri ( java.lang.String ) ; } } if ( getServiceName ( ) == null ) { java.lang.String java.lang.String = javax.jws.WebService . java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { setServiceName ( java.lang.String ) ; } } if ( java.lang.String ( ) == null ) { java.lang.String java.lang.String = javax.jws.WebService . java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { void ( java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { synchronized ( this . java.lang.Object ) { return ( this . java.lang.Object != null ) ; } }  <METHOD_END>
<METHOD_START> protected final javax.xml.namespace.QName javax.xml.namespace.QName ( ) { return this . javax.xml.namespace.QName ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( javax.xml.ws.Service javax.xml.ws.Service , javax.xml.namespace.QName javax.xml.namespace.QName ) { if ( this . javax.xml.ws.WebServiceFeature[] != null ) { return ( javax.xml.namespace.QName != null ? javax.xml.ws.Service . getPort ( javax.xml.namespace.QName , java.lang.Class<?> ( ) , this . javax.xml.ws.WebServiceFeature[] ) : javax.xml.ws.Service . getPort ( java.lang.Class<?> ( ) , this . javax.xml.ws.WebServiceFeature[] ) ) ; } else { return ( javax.xml.namespace.QName != null ? javax.xml.ws.Service . getPort ( javax.xml.namespace.QName , java.lang.Class<?> ( ) ) : javax.xml.ws.Service . getPort ( java.lang.Class<?> ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.String ) ; } java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.String ) ; } java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.String ) ; } if ( boolean ( ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.Boolean . java.lang.Boolean ) ; } if ( boolean ( ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.Boolean . java.lang.Boolean ) ; } java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.xml.ws.BindingProvider . java.lang.String , java.lang.String ) ; } java.util.Map<java.lang.String,java.lang.Object> . void ( java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; if ( ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( ) ) { if ( ! ( java.lang.Object instanceof javax.xml.ws.BindingProvider ) ) { throw new RemoteLookupFailureException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING ) ; } ( ( javax.xml.ws.BindingProvider ) java.lang.Object ) . java.util.Map<java.lang.String,java.lang.Object> ( ) . void ( java.util.Map<java.lang.String,java.lang.Object> ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.remoting.jaxws.MethodInvocation ) throws java.lang.Throwable { if ( AopUtils . isToStringMethod ( org.springframework.remoting.jaxws.MethodInvocation . getMethod ( ) ) ) { return STRING + java.lang.String ( ) + STRING + getServiceName ( ) + STRING ; } synchronized ( this . java.lang.Object ) { if ( ! boolean ( ) ) { void ( ) ; } } return java.lang.Object ( org.springframework.remoting.jaxws.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.remoting.jaxws.MethodInvocation ) throws java.lang.Throwable { try { return java.lang.Object ( org.springframework.remoting.jaxws.MethodInvocation , java.lang.Object ( ) ) ; } catch ( javax.xml.ws.soap.SOAPFaultException javax.xml.ws.soap.SOAPFaultException ) { throw new JaxWsSoapFaultException ( javax.xml.ws.soap.SOAPFaultException ) ; } catch ( javax.xml.ws.ProtocolException javax.xml.ws.ProtocolException ) { throw new RemoteConnectFailureException ( STRING + java.lang.String ( ) + STRING , javax.xml.ws.ProtocolException ) ; } catch ( javax.xml.ws.WebServiceException javax.xml.ws.WebServiceException ) { throw new RemoteAccessException ( STRING + java.lang.String ( ) + STRING , javax.xml.ws.WebServiceException ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.remoting.jaxws.MethodInvocation , java.lang.Object java.lang.Object ) throws java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.remoting.jaxws.MethodInvocation . getMethod ( ) ; try { return java.lang.reflect.Method . java.lang.Object ( java.lang.Object , org.springframework.remoting.jaxws.MethodInvocation . getArguments ( ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new RemoteProxyFailureException ( STRING + java.lang.reflect.Method , java.lang.Throwable ) ; } }  <METHOD_END>