<METHOD_START> @ Before public void void ( ) { java.io.StringWriter = new java.io.StringWriter ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandler = new CharacterStreamWritingMessageHandler ( java.io.StringWriter ) ; this . org.springframework.integration.stream.QueueChannel = new QueueChannel ( NUMBER ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; this . org.springframework.integration.stream.PollingConsumer = new PollingConsumer ( org.springframework.integration.stream.QueueChannel , org.springframework.integration.stream.CharacterStreamWritingMessageHandler ) ; org.springframework.integration.stream.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; this . org.springframework.integration.stream.PollingConsumer . setTaskScheduler ( org.springframework.integration.stream.ThreadPoolTaskScheduler ) ; org.springframework.integration.stream.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setBeanFactory ( mock ( BeanFactory .class ) ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { org.springframework.integration.stream.ThreadPoolTaskScheduler . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.CharacterStreamWritingMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.CharacterStreamWritingMessageHandler . setShouldAppendNewLine ( true ) ; org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; assertEquals ( STRING + java.lang.String , java.io.StringWriter . java.lang.String ( ) ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING + java.lang.String + STRING + java.lang.String , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.PollingConsumer . setReceiveTimeout ( NUMBER ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandler . setShouldAppendNewLine ( true ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < java.lang.String > ( STRING ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; assertEquals ( STRING + java.lang.String + STRING + java.lang.String , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject = new org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ( STRING ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject > ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ) ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.PollingConsumer . setReceiveTimeout ( NUMBER ) ; org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject = new org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ( STRING ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject = new org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ( STRING ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject > ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject > ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; assertEquals ( STRING , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.stream.CharacterStreamWritingMessageHandler . setShouldAppendNewLine ( true ) ; org.springframework.integration.stream.PollingConsumer . setReceiveTimeout ( NUMBER ) ; org.springframework.integration.stream.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.stream.PollingConsumer . setTrigger ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject = new org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ( STRING ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject = new org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ( STRING ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject > ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ) , NUMBER ) ; org.springframework.integration.stream.QueueChannel . send ( new GenericMessage < org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject > ( org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestObject ) , NUMBER ) ; org.springframework.integration.stream.PollingConsumer . start ( ) ; org.springframework.integration.stream.CharacterStreamWritingMessageHandlerTests.TestTrigger . void ( ) ; org.springframework.integration.stream.PollingConsumer . stop ( ) ; java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; assertEquals ( STRING + java.lang.String + STRING + java.lang.String , java.io.StringWriter . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.stream.TriggerContext ) { if ( ! java.util.concurrent.atomic.AtomicBoolean . boolean ( true ) ) { return new java.util.Date ( ) ; } this . java.util.concurrent.CountDownLatch . void ( ) ; return null ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; this . java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { try { this . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; if ( java.util.concurrent.CountDownLatch . long ( ) != NUMBER ) { throw new java.lang.RuntimeException ( STRING ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { throw new java.lang.RuntimeException ( STRING ) ; } }  <METHOD_END>