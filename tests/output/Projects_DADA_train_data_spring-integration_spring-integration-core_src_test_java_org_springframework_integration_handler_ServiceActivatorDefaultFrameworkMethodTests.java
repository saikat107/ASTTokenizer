<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; try { this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( MessageTransformationException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) . java.lang.Throwable ( ) , instanceOf ( java . lang . java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.handler.EventDrivenConsumer , STRING ) ; assertSame ( org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.TestMessageProcessor , java.lang.Object ) ; QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( this . java.lang.Class<? extends org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests> ( ) . java.lang.String ( ) + STRING , this . java.lang.Class<? extends org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests> ( ) ) . close ( ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , Matchers . instanceOf ( BeanCreationException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , Matchers . instanceOf ( BeanCreationException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) , Matchers . instanceOf ( java.lang.IllegalArgumentException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) . java.lang.String ( ) , Matchers . containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNull ( org.springframework.integration.handler.Message<> ) ; this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . set ( this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . java.lang.String . java.lang.String ( ) ) ; org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.handler.DirectChannel = new DirectChannel ( ) ; final java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> < Message < ? > > java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> = new java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> < Message < ? > > ( ) ; org.springframework.integration.handler.DirectChannel . subscribe ( java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> :: set ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.DirectChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; assertNull ( java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> . get ( ) ) ; this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . set ( this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . java.lang.String . java.lang.String ( ) ) ; assertNotNull ( java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> . get ( ) ) ; assertEquals ( STRING , java.util.concurrent.atomic.AtomicReference<org.springframework.integration.handler.Message<?>> . get ( ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setErrorChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new java.lang.RuntimeException ( STRING ) ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertThat ( org.springframework.integration.handler.Message<> , instanceOf ( ErrorMessage .class ) ) ; assertThat ( org.springframework.integration.handler.Message<> . getPayload ( ) , instanceOf ( MessagingException .class ) ) ; assertThat ( ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getCause ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getCause ( ) . getMessage ( ) , equalTo ( STRING ) ) ; assertEquals ( STRING , ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getFailedMessage ( ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.handler.MessageChannel . send ( org.springframework.integration.handler.Message<> ) ; this . org.springframework.integration.handler.ServiceActivatorDefaultFrameworkMethodTests.AsyncService . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new java.lang.RuntimeException ( STRING ) ) ; Message < ? > org.springframework.integration.handler.Message<?> = this . org.springframework.integration.handler.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertThat ( org.springframework.integration.handler.Message<> , instanceOf ( ErrorMessage .class ) ) ; assertThat ( org.springframework.integration.handler.Message<> . getPayload ( ) , instanceOf ( MessagingException .class ) ) ; assertThat ( ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getCause ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getCause ( ) . getMessage ( ) , equalTo ( STRING ) ) ; assertEquals ( STRING , ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getFailedMessage ( ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String java.lang.String ) { throw new java.lang.IllegalStateException ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; return MessageBuilder . withPayload ( org.springframework.integration.handler.Message<> . getPayload ( ) . toString ( ) . toUpperCase ( ) ) . setHeader ( STRING , java.lang.StackTraceElement[] ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; assertFalse ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.handler.Message<?> ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.handler.Message<?> ) { return java.lang.String + STRING + org.springframework.integration.handler.Message<> . getPayload ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public org.springframework.integration.handler.ListenableFuture<java.lang.String> < java.lang.String > org.springframework.integration.handler.ListenableFuture<java.lang.String> ( java.lang.String java.lang.String ) { this . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> = new SettableListenableFuture < java.lang.String > ( ) ; this . java.lang.String = java.lang.String ; return this . org.springframework.integration.handler.SettableListenableFuture<java.lang.String> ; }  <METHOD_END>