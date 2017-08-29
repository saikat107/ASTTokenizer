<METHOD_START> @ Before public void void ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler = new org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler ( ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . setApplicationContext ( new StaticApplicationContext ( ) ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . setDestinationPrefixes ( java.util.List<java.lang.String> ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . afterPropertiesSet ( ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController = new org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController ( ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . void ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . void ( new org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.DuplicateMappingsController ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.messaging.handler.invocation.HandlerMethod> < java.lang.String , HandlerMethod > java.util.Map<java.lang.String,org.springframework.messaging.handler.invocation.HandlerMethod> = this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . getHandlerMethods ( ) ; assertNotNull ( java.util.Map<java.lang.String,org.springframework.messaging.handler.invocation.HandlerMethod> ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.messaging.handler.invocation.HandlerMethod> . keySet ( ) , Matchers . hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.Class<? extends org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController> ( ) . java.lang.reflect.Method ( STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . void ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController , java.lang.reflect.Method , STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . handleMessage ( org.springframework.messaging.handler.invocation.Message<?> ( STRING ) ) ; assertEquals ( STRING , this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.Class<? extends org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController> ( ) . java.lang.reflect.Method ( STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . void ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController , java.lang.reflect.Method , STRING ) ; java.lang.reflect.Method = this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.Class<? extends org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController> ( ) . java.lang.reflect.Method ( STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . void ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController , java.lang.reflect.Method , STRING STRING ) ; this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . handleMessage ( org.springframework.messaging.handler.invocation.Message<?> ( STRING ) ) ; assertEquals ( STRING , this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . handleMessage ( org.springframework.messaging.handler.invocation.Message<?> ( STRING ) ) ; assertEquals ( STRING , this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.String ) ; assertNotNull ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestMethodMessageHandler . handleMessage ( org.springframework.messaging.handler.invocation.Message<?> ( STRING ) ) ; assertEquals ( STRING , this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.lang.String ) ; assertNotNull ( this . org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestController . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.messaging.handler.invocation.Message<?> < ? > org.springframework.messaging.handler.invocation.Message<?> ( java.lang.String java.lang.String ) { return MessageBuilder . withPayload ( new byte [ NUMBER ] ) . setHeader ( java.lang.String , java.lang.String ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( Message org.springframework.messaging.handler.invocation.Message ) { this . java.lang.String = STRING ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , org.springframework.messaging.handler.invocation.Message ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { throw new java.lang.IllegalStateException ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.IllegalStateException java.lang.IllegalStateException ) { this . java.lang.String = STRING ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.IllegalStateException ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { super. detectHandlerMethods ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String ) { super. registerHandlerMethod ( java.lang.Object , java.lang.reflect.Method , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> < ? extends HandlerMethodArgumentResolver > java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ( ) { java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> = new java.util.ArrayList<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> <> ( ) ; java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . add ( new MessageMethodArgumentResolver ( new SimpleMessageConverter ( ) ) ) ; java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . addAll ( getCustomArgumentResolvers ( ) ) ; return java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> < ? extends HandlerMethodReturnValueHandler > java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> ( ) { java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> < HandlerMethodReturnValueHandler > java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> = new java.util.ArrayList<org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> <> ( ) ; java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> . addAll ( getCustomReturnValueHandlers ( ) ) ; return java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> . java.lang.String ( ) . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.String java.lang.String = java.lang.reflect.Method . java.lang.String ( ) ; if ( java.lang.String . boolean ( STRING ) ) { return STRING + java.lang.String ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( java.lang.String java.lang.String ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; if ( ! this . org.springframework.messaging.handler.invocation.PathMatcher . isPattern ( java.lang.String ) ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( Message < ? > org.springframework.messaging.handler.invocation.Message<?> ) { return ( java.lang.String ) org.springframework.messaging.handler.invocation.Message<> . getHeaders ( ) . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String , Message < ? > org.springframework.messaging.handler.invocation.Message<?> ) { java.lang.String java.lang.String = getLookupDestination ( java.lang.String ( org.springframework.messaging.handler.invocation.Message<> ) ) ; if ( java.lang.String . boolean ( java.lang.String ) || this . org.springframework.messaging.handler.invocation.PathMatcher . match ( java.lang.String , java.lang.String ) ) { return java.lang.String ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Comparator<java.lang.String> < java.lang.String > java.util.Comparator<java.lang.String> ( final Message < ? > org.springframework.messaging.handler.invocation.Message<?> ) { return new java.util.Comparator<java.lang.String> < java.lang.String > ( ) { @ java.lang.Override public int int ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { DestinationPatternsMessageCondition org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition = new DestinationPatternsMessageCondition ( java.lang.String ) ; DestinationPatternsMessageCondition org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition = new DestinationPatternsMessageCondition ( java.lang.String ) ; return org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition . compareTo ( org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition , org.springframework.messaging.handler.invocation.Message<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { DestinationPatternsMessageCondition org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition = new DestinationPatternsMessageCondition ( java.lang.String ) ; DestinationPatternsMessageCondition org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition = new DestinationPatternsMessageCondition ( java.lang.String ) ; return org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition . compareTo ( org.springframework.messaging.handler.invocation.DestinationPatternsMessageCondition , org.springframework.messaging.handler.invocation.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.messaging.handler.invocation.AbstractExceptionHandlerMethodResolver org.springframework.messaging.handler.invocation.AbstractExceptionHandlerMethodResolver ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return new org.springframework.messaging.handler.invocation.MethodMessageHandlerTests.TestExceptionHandlerMethodResolver ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { super( java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> ( java.lang.Class<> ) ); }  <METHOD_END>
<METHOD_START> private static java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> < java.lang.Class<? extends java.lang.Throwable> < ? extends java.lang.Throwable > , java.lang.reflect.Method > java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> < java.lang.Class<? extends java.lang.Throwable> < ? extends java.lang.Throwable > , java.lang.reflect.Method > java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> = new java.util.HashMap<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> <> ( ) ; for ( java.lang.reflect.Method java.lang.reflect.Method : MethodIntrospector . selectMethods ( java.lang.Class<> , org.springframework.messaging.handler.invocation.MethodFilter ) ) { for ( java.lang.Class<? extends java.lang.Throwable> < ? extends java.lang.Throwable > java.lang.Class<? extends java.lang.Throwable> : getExceptionsFromMethodSignature ( java.lang.reflect.Method ) ) { java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> . java.lang.reflect.Method ( java.lang.Class<> , java.lang.reflect.Method ) ; } } return java.util.Map<java.lang.Class<? extends java.lang.Throwable>,java.lang.reflect.Method> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ; }  <METHOD_END>