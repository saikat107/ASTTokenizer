<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.integration.router.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.router.config.SplitterAggregatorTests> ( ) ) ; MessageChannel org.springframework.integration.router.config.MessageChannel = ( MessageChannel ) org.springframework.integration.router.config.ClassPathXmlApplicationContext . getBean ( STRING ) ; PollableChannel org.springframework.integration.router.config.PollableChannel = ( PollableChannel ) org.springframework.integration.router.config.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.integration.router.config.MessageChannel . send ( new GenericMessage < Numbers > ( this . org.springframework.integration.router.config.Numbers ( ) ) ) ; Message < ? > org.springframework.integration.router.config.Message<?> = org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.router.config.Message<> ) ; assertEquals ( java.lang.Integer .class , org.springframework.integration.router.config.Message<> . getPayload ( ) . getClass ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.router.config.Message<> . getPayload ( ) ) ; org.springframework.integration.router.config.MessageChannel . send ( new GenericMessage < Numbers > ( this . org.springframework.integration.router.config.Numbers ( ) ) ) ; Message < ? > org.springframework.integration.router.config.Message<?> = org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.router.config.Message<> ) ; assertEquals ( java.lang.Integer .class , org.springframework.integration.router.config.Message<> . getPayload ( ) . getClass ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.router.config.Message<> . getPayload ( ) ) ; org.springframework.integration.router.config.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.router.config.Numbers org.springframework.integration.router.config.Numbers ( ) { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = new java.util.ArrayList<java.lang.Integer> < java.lang.Integer > ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.List<java.lang.Integer> . boolean ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; } return new Numbers ( java.util.List<java.lang.Integer> ) ; }  <METHOD_END>