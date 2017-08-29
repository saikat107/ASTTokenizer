<METHOD_START> public void ( MessageChannel org.springframework.integration.scattergather.MessageChannel , MessageHandler org.springframework.integration.scattergather.MessageHandler ) { Assert . notNull ( org.springframework.integration.scattergather.MessageChannel , STRING ) ; Assert . notNull ( org.springframework.integration.scattergather.MessageHandler , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> = AopUtils . getTargetClass ( org.springframework.integration.scattergather.MessageHandler ) ; void ( java.lang.Class<> , STRING , STRING ) ; this . org.springframework.integration.scattergather.MessageChannel = org.springframework.integration.scattergather.MessageChannel ; this . org.springframework.integration.scattergather.MessageHandler = org.springframework.integration.scattergather.MessageHandler ; }  <METHOD_END>
<METHOD_START> public void ( MessageHandler org.springframework.integration.scattergather.MessageHandler , MessageHandler org.springframework.integration.scattergather.MessageHandler ) { this( new FixedSubscriberChannel ( org.springframework.integration.scattergather.MessageHandler ) , org.springframework.integration.scattergather.MessageHandler ); Assert . notNull ( org.springframework.integration.scattergather.MessageHandler , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> = AopUtils . getTargetClass ( org.springframework.integration.scattergather.MessageHandler ) ; void ( java.lang.Class<> , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.scattergather.MessageChannel ) { this . org.springframework.integration.scattergather.MessageChannel = org.springframework.integration.scattergather.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( this . org.springframework.integration.scattergather.MessageChannel == null ) { this . org.springframework.integration.scattergather.MessageChannel = new FixedSubscriberChannel ( this . org.springframework.integration.scattergather.MessageHandler ) ; } else { if ( this . org.springframework.integration.scattergather.MessageChannel instanceof SubscribableChannel ) { this . org.springframework.integration.scattergather.AbstractEndpoint = new EventDrivenConsumer ( ( SubscribableChannel ) this . org.springframework.integration.scattergather.MessageChannel , this . org.springframework.integration.scattergather.MessageHandler ) ; } else if ( this . org.springframework.integration.scattergather.MessageChannel instanceof PollableChannel ) { this . org.springframework.integration.scattergather.AbstractEndpoint = new PollingConsumer ( ( PollableChannel ) this . org.springframework.integration.scattergather.MessageChannel , this . org.springframework.integration.scattergather.MessageHandler ) ; ( ( PollingConsumer ) this . org.springframework.integration.scattergather.AbstractEndpoint ) . setReceiveTimeout ( this . long ) ; } else { throw new MessagingException ( STRING + this . org.springframework.integration.scattergather.MessageChannel . getClass ( ) + STRING + STRING ) ; } this . org.springframework.integration.scattergather.AbstractEndpoint . setBeanFactory ( this . getBeanFactory ( ) ) ; this . org.springframework.integration.scattergather.AbstractEndpoint . afterPropertiesSet ( ) ; } ( ( MessageProducer ) this . org.springframework.integration.scattergather.MessageHandler ) . setOutputChannel ( new FixedSubscriberChannel ( message -> { MessageHeaders headers = message . getHeaders ( ) ; if ( headers . containsKey ( GATHER_RESULT_CHANNEL ) ) { Object gatherResultChannel = headers . get ( GATHER_RESULT_CHANNEL ) ; if ( gatherResultChannel instanceof MessageChannel ) { messagingTemplate . send ( ( MessageChannel ) gatherResultChannel , message ) ; } else if ( gatherResultChannel instanceof String ) { messagingTemplate . send ( ( String ) gatherResultChannel , message ) ; } } else { throw new MessageDeliveryException ( message , STRING ) ; } } ) ) ; this . org.springframework.integration.scattergather.HeaderChannelRegistry = getBeanFactory ( ) . getBean ( IntegrationContextUtils . INTEGRATION_HEADER_CHANNEL_REGISTRY_BEAN_NAME , HeaderChannelRegistry .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.scattergather.Message<?> ) { PollableChannel org.springframework.integration.scattergather.PollableChannel = new QueueChannel ( ) ; java.lang.Object java.lang.Object = this . org.springframework.integration.scattergather.HeaderChannelRegistry . channelToChannelName ( org.springframework.integration.scattergather.PollableChannel ) ; Message < ? > org.springframework.integration.scattergather.Message<?> = getMessageBuilderFactory ( ) . fromMessage ( org.springframework.integration.scattergather.Message<> ) . setHeader ( java.lang.String , java.lang.Object ) . setReplyChannel ( this . org.springframework.integration.scattergather.MessageChannel ) . build ( ) ; this . messagingTemplate . send ( this . org.springframework.integration.scattergather.MessageChannel , org.springframework.integration.scattergather.Message<> ) ; Message < ? > org.springframework.integration.scattergather.Message<?> = org.springframework.integration.scattergather.PollableChannel . receive ( this . long ) ; if ( org.springframework.integration.scattergather.Message<> != null ) { return org.springframework.integration.scattergather.Message<> ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.scattergather.AbstractEndpoint != null ) { this . org.springframework.integration.scattergather.AbstractEndpoint . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.scattergather.AbstractEndpoint != null ) { this . org.springframework.integration.scattergather.AbstractEndpoint . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.scattergather.AbstractEndpoint == null || this . org.springframework.integration.scattergather.AbstractEndpoint . isRunning ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.lang.LinkageError { java.lang.Class<?> < ? > java.lang.Class<?> = null ; try { java.lang.Class<?> = ClassUtils . forName ( java.lang.String , java.lang.Class<? extends org.springframework.integration.scattergather.ScatterGatherHandler> ( ) . java.lang.ClassLoader ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) {		} Assert . isAssignable ( java.lang.Class<> , java.lang.Class<> , STRING + java.lang.String + STRING + java.lang.String + STRING ) ; }  <METHOD_END>