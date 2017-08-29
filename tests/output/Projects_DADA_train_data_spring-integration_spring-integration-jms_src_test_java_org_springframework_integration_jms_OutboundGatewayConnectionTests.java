<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { BeanFactory org.springframework.integration.jms.BeanFactory = mock ( BeanFactory .class ) ; when ( org.springframework.integration.jms.BeanFactory . containsBean ( IntegrationContextUtils . TASK_SCHEDULER_BEAN_NAME ) ) . thenReturn ( true ) ; ThreadPoolTaskScheduler org.springframework.integration.jms.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; org.springframework.integration.jms.ThreadPoolTaskScheduler . initialize ( ) ; when ( org.springframework.integration.jms.BeanFactory . getBean ( IntegrationContextUtils . TASK_SCHEDULER_BEAN_NAME , TaskScheduler .class ) ) . thenReturn ( org.springframework.integration.jms.ThreadPoolTaskScheduler ) ; final JmsOutboundGateway org.springframework.integration.jms.JmsOutboundGateway = new JmsOutboundGateway ( ) ; org.springframework.integration.jms.JmsOutboundGateway . setBeanFactory ( org.springframework.integration.jms.BeanFactory ) ; BrokerService org.springframework.integration.jms.BrokerService = new BrokerService ( ) ; org.springframework.integration.jms.BrokerService . addConnector ( STRING ) ; org.springframework.integration.jms.BrokerService . start ( ) ; ActiveMQConnectionFactory org.springframework.integration.jms.ActiveMQConnectionFactory = new ActiveMQConnectionFactory ( STRING ) ; ConnectionFactory org.springframework.integration.jms.ConnectionFactory = new CachingConnectionFactory ( org.springframework.integration.jms.ActiveMQConnectionFactory ) ; org.springframework.integration.jms.JmsOutboundGateway . setConnectionFactory ( org.springframework.integration.jms.ConnectionFactory ) ; org.springframework.integration.jms.JmsOutboundGateway . setRequestDestination ( org.springframework.integration.jms.Destination ) ; org.springframework.integration.jms.JmsOutboundGateway . setReplyDestination ( org.springframework.integration.jms.Destination ) ; org.springframework.integration.jms.JmsOutboundGateway . setCorrelationKey ( STRING ) ; org.springframework.integration.jms.JmsOutboundGateway . setUseReplyContainer ( true ) ; org.springframework.integration.jms.JmsOutboundGateway . afterPropertiesSet ( ) ; org.springframework.integration.jms.JmsOutboundGateway . start ( ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Object> < java.lang.Object > java.util.concurrent.atomic.AtomicReference<java.lang.Object> = new java.util.concurrent.atomic.AtomicReference<java.lang.Object> < java.lang.Object > ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( org.springframework.integration.jms.JmsOutboundGateway . handleRequestMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; } finally { java.util.concurrent.CountDownLatch . void ( ) ; } } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; JmsTemplate org.springframework.integration.jms.JmsTemplate = new JmsTemplate ( ) ; org.springframework.integration.jms.JmsTemplate . setConnectionFactory ( org.springframework.integration.jms.ActiveMQConnectionFactory ) ; org.springframework.integration.jms.JmsTemplate . setReceiveTimeout ( NUMBER ) ; javax . javax.jms . javax.jms javax.jms.Message = org.springframework.integration.jms.JmsTemplate . receive ( org.springframework.integration.jms.Destination ) ; assertNotNull ( javax.jms.Message ) ; final javax . javax.jms . javax.jms javax.jms.Message = javax.jms.Message ; org.springframework.integration.jms.JmsTemplate . send ( javax.jms.Message . getJMSReplyTo ( ) , ( MessageCreator ) session -> jmsReply ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertNotNull ( java.util.concurrent.atomic.AtomicReference<java.lang.Object> . java.lang.Object ( ) ) ; org.springframework.integration.jms.BrokerService . stop ( ) ; org.springframework.integration.jms.BrokerService = new BrokerService ( ) ; org.springframework.integration.jms.BrokerService . addConnector ( STRING ) ; org.springframework.integration.jms.BrokerService . start ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( org.springframework.integration.jms.JmsOutboundGateway . handleRequestMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; } finally { java.util.concurrent.CountDownLatch . void ( ) ; } } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.jms.JmsTemplate = new JmsTemplate ( ) ; org.springframework.integration.jms.JmsTemplate . setConnectionFactory ( org.springframework.integration.jms.ActiveMQConnectionFactory ) ; org.springframework.integration.jms.JmsTemplate . setReceiveTimeout ( NUMBER ) ; javax.jms.Message = org.springframework.integration.jms.JmsTemplate . receive ( org.springframework.integration.jms.Destination ) ; assertNotNull ( javax.jms.Message ) ; final javax . javax.jms . javax.jms javax.jms.Message = javax.jms.Message ; org.springframework.integration.jms.JmsTemplate . send ( javax.jms.Message . getJMSReplyTo ( ) , ( MessageCreator ) session -> jmsReply2 ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertNotNull ( java.util.concurrent.atomic.AtomicReference<java.lang.Object> . java.lang.Object ( ) ) ; org.springframework.integration.jms.JmsOutboundGateway . stop ( ) ; org.springframework.integration.jms.BrokerService . stop ( ) ; org.springframework.integration.jms.ThreadPoolTaskScheduler . destroy ( ) ; }  <METHOD_END>