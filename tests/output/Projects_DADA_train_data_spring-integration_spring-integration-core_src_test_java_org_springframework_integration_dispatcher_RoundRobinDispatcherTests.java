<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.dispatcher.UnicastingDispatcher . setLoadBalancingStrategy ( new RoundRobinLoadBalancingStrategy ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; verify ( org.springframework.integration.dispatcher.MessageHandler ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; verify ( org.springframework.integration.dispatcher.MessageHandler ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; } verify ( org.springframework.integration.dispatcher.MessageHandler , times ( NUMBER ) ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; verify ( org.springframework.integration.dispatcher.MessageHandler , times ( NUMBER ) ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; DirectFieldAccessor org.springframework.integration.dispatcher.DirectFieldAccessor = new DirectFieldAccessor ( new DirectFieldAccessor ( org.springframework.integration.dispatcher.UnicastingDispatcher ) . getPropertyValue ( STRING ) ) ; ( ( java.util.concurrent.atomic.AtomicInteger ) org.springframework.integration.dispatcher.DirectFieldAccessor . getPropertyValue ( STRING ) ) . void ( java.lang.Integer . int - NUMBER ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; } verify ( org.springframework.integration.dispatcher.MessageHandler , atLeast ( NUMBER ) ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; verify ( org.springframework.integration.dispatcher.MessageHandler , atLeast ( NUMBER ) ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; doThrow ( new MessagingException ( STRING ) ) . when ( org.springframework.integration.dispatcher.MessageHandler ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; try { org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; fail ( STRING ) ; } catch ( MessagingException org.springframework.integration.dispatcher.MessagingException ) { assertEquals ( org.springframework.integration.dispatcher.Message<> , org.springframework.integration.dispatcher.MessagingException . getFailedMessage ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.dispatcher.UnicastingDispatcher . addHandler ( org.springframework.integration.dispatcher.MessageHandler ) ; Message < java.lang.String > org.springframework.integration.dispatcher.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; doThrow ( new MessagingException ( org.springframework.integration.dispatcher.Message<java.lang.String> , STRING ) ) . when ( org.springframework.integration.dispatcher.MessageHandler ) . handleMessage ( org.springframework.integration.dispatcher.Message<> ) ; try { org.springframework.integration.dispatcher.UnicastingDispatcher . dispatch ( org.springframework.integration.dispatcher.Message<> ) ; fail ( STRING ) ; } catch ( MessagingException org.springframework.integration.dispatcher.MessagingException ) { assertEquals ( org.springframework.integration.dispatcher.Message<java.lang.String> , org.springframework.integration.dispatcher.MessagingException . getFailedMessage ( ) ) ; } }  <METHOD_END>
