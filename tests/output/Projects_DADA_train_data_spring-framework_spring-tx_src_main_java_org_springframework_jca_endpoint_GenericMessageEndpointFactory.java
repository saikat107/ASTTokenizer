<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jca.endpoint.MessageEndpoint org.springframework.jca.endpoint.MessageEndpoint ( javax.transaction.xa.XAResource javax.transaction.xa.XAResource ) throws org.springframework.jca.endpoint.UnavailableException { org.springframework.jca.endpoint.GenericMessageEndpointFactory.GenericMessageEndpoint org.springframework.jca.endpoint.GenericMessageEndpointFactory.GenericMessageEndpoint = ( org.springframework.jca.endpoint.GenericMessageEndpointFactory.GenericMessageEndpoint ) super. createEndpoint ( javax.transaction.xa.XAResource ) ; ProxyFactory org.springframework.jca.endpoint.ProxyFactory = new ProxyFactory ( this . java.lang.Object ) ; DelegatingIntroductionInterceptor org.springframework.jca.endpoint.DelegatingIntroductionInterceptor = new DelegatingIntroductionInterceptor ( org.springframework.jca.endpoint.GenericMessageEndpointFactory.GenericMessageEndpoint ) ; org.springframework.jca.endpoint.DelegatingIntroductionInterceptor . suppressInterface ( MethodInterceptor .class ) ; org.springframework.jca.endpoint.ProxyFactory . addAdvice ( org.springframework.jca.endpoint.DelegatingIntroductionInterceptor ) ; return ( MessageEndpoint ) org.springframework.jca.endpoint.ProxyFactory . getProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.jca.endpoint.AbstractMessageEndpoint org.springframework.jca.endpoint.AbstractMessageEndpoint ( ) org.springframework.jca.endpoint.UnavailableException { return new org.springframework.jca.endpoint.GenericMessageEndpointFactory.GenericMessageEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.jca.endpoint.MethodInvocation ) throws java.lang.Throwable { boolean boolean = ! hasBeforeDeliveryBeenCalled ( ) ; if ( boolean ) { try { beforeDelivery ( null ) ; } catch ( ResourceException org.springframework.jca.endpoint.ResourceException ) { if ( ReflectionUtils . declaresException ( org.springframework.jca.endpoint.MethodInvocation . getMethod ( ) , org.springframework.jca.endpoint.ResourceException . getClass ( ) ) ) { throw org.springframework.jca.endpoint.ResourceException ; } else { throw new org.springframework.jca.endpoint.GenericMessageEndpointFactory.InternalResourceException ( org.springframework.jca.endpoint.ResourceException ) ; } } } try { return org.springframework.jca.endpoint.MethodInvocation . proceed ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { onEndpointException ( java.lang.Throwable ) ; throw java.lang.Throwable ; } finally { if ( boolean ) { try { afterDelivery ( ) ; } catch ( ResourceException org.springframework.jca.endpoint.ResourceException ) { if ( ReflectionUtils . declaresException ( org.springframework.jca.endpoint.MethodInvocation . getMethod ( ) , org.springframework.jca.endpoint.ResourceException . getClass ( ) ) ) { throw org.springframework.jca.endpoint.ResourceException ; } else { throw new org.springframework.jca.endpoint.GenericMessageEndpointFactory.InternalResourceException ( org.springframework.jca.endpoint.ResourceException ) ; } } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.ClassLoader java.lang.ClassLoader ( ) { return java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.ClassLoader ( ) ; }  <METHOD_END>
<METHOD_START> protected void ( ResourceException org.springframework.jca.endpoint.ResourceException ) { super( org.springframework.jca.endpoint.ResourceException ); }  <METHOD_END>