<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationContext org.springframework.scheduling.concurrent.ApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBeanTests.ExecutorConfig .class ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = org.springframework.scheduling.concurrent.ApplicationContext . getBean ( STRING , java.util.concurrent.ExecutorService .class ) ; java.util.concurrent.FutureTask<java.lang.String> < java.lang.String > java.util.concurrent.FutureTask<java.lang.String> = new java.util.concurrent.FutureTask<java.lang.String> <> ( new java.util.concurrent.Callable<java.lang.String> < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) java.lang.Exception { return STRING ; } } ) ; java.util.concurrent.ExecutorService . void ( java.util.concurrent.FutureTask<java.lang.String> ) ; assertEquals ( STRING , java.util.concurrent.FutureTask<java.lang.String> . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) java.lang.Exception { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean ( ) { return new ThreadPoolExecutorFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService ( ) { return org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean ( ) . getObject ( ) ; }  <METHOD_END>