<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.config.xml.ApplicationContext . getBean ( IntegrationContextUtils . ERROR_CHANNEL_BEAN_NAME ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( PublishSubscribeChannel .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.config.xml.ApplicationContext . getBean ( IntegrationContextUtils . NULL_CHANNEL_BEAN_NAME ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( NullChannel .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.config.xml.ApplicationContext . getBean ( IntegrationContextUtils . TASK_SCHEDULER_BEAN_NAME ) ; assertEquals ( ThreadPoolTaskScheduler .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; ErrorHandler org.springframework.integration.config.xml.ErrorHandler = TestUtils . getPropertyValue ( java.lang.Object , STRING , ErrorHandler .class ) ; assertEquals ( MessagePublishingErrorHandler .class , org.springframework.integration.config.xml.ErrorHandler . getClass ( ) ) ; MessageChannel org.springframework.integration.config.xml.MessageChannel = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.ErrorHandler , STRING , MessageChannel .class ) ; assertNull ( org.springframework.integration.config.xml.MessageChannel ) ; org.springframework.integration.config.xml.ErrorHandler . handleError ( new java.lang.Throwable ( ) ) ; org.springframework.integration.config.xml.MessageChannel = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.ErrorHandler , STRING , MessageChannel .class ) ; assertNotNull ( org.springframework.integration.config.xml.MessageChannel ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( IntegrationContextUtils . ERROR_CHANNEL_BEAN_NAME ) , org.springframework.integration.config.xml.MessageChannel ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.integration.config.xml.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.config.xml.DefaultConfiguringBeanFactoryPostProcessorTests> ( ) ) ; ClassPathXmlApplicationContext org.springframework.integration.config.xml.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( new java.lang.String [] { STRING } , org.springframework.integration.config.xml.ClassPathXmlApplicationContext ) ; ClassPathXmlApplicationContext org.springframework.integration.config.xml.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( new java.lang.String [] { STRING } , org.springframework.integration.config.xml.ClassPathXmlApplicationContext ) ; TaskScheduler org.springframework.integration.config.xml.TaskScheduler = org.springframework.integration.config.xml.ClassPathXmlApplicationContext . getParent ( ) . getBean ( STRING , TaskScheduler .class ) ; TaskScheduler org.springframework.integration.config.xml.TaskScheduler = org.springframework.integration.config.xml.ClassPathXmlApplicationContext . getBean ( STRING , TaskScheduler .class ) ; assertNotNull ( STRING , org.springframework.integration.config.xml.TaskScheduler ) ; assertNotNull ( STRING , org.springframework.integration.config.xml.TaskScheduler ) ; assertEquals ( STRING , org.springframework.integration.config.xml.TaskScheduler , org.springframework.integration.config.xml.TaskScheduler ) ; org.springframework.integration.config.xml.ClassPathXmlApplicationContext . close ( ) ; org.springframework.integration.config.xml.ClassPathXmlApplicationContext . close ( ) ; org.springframework.integration.config.xml.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>