<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { void ( ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; assertThat ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getConfigurationUrl ( ) ) . isEqualTo ( new ClassPathResource ( STRING ) . getURL ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.System . java.lang.String ( HazelcastConfigResourceCondition . CONFIG_SYSTEM_PROPERTY , STRING ) ; try { void ( ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> < java.lang.String , QueueConfig > java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> = org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getQueueConfigs ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> ) . hasSize ( NUMBER ) . containsKey ( STRING ) ; } finally { java.lang.System . java.lang.String ( HazelcastConfigResourceCondition . CONFIG_SYSTEM_PROPERTY ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { void ( STRING + STRING ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; assertThat ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getConfigurationFile ( ) ) . isEqualTo ( new ClassPathResource ( STRING + STRING ) . getFile ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { void ( STRING ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; assertThat ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getConfigurationUrl ( ) ) . isEqualTo ( new ClassPathResource ( STRING ) . getURL ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.hazelcast.ExpectedException . expect ( BeanCreationException .class ) ; this . org.springframework.boot.autoconfigure.hazelcast.ExpectedException . expectMessage ( STRING ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Config org.springframework.boot.autoconfigure.hazelcast.Config = new Config ( STRING ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = Hazelcast . newHazelcastInstance ( org.springframework.boot.autoconfigure.hazelcast.Config ) ; try { void ( org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfigurationTests.HazelcastConfigWithName .class , STRING ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; assertThat ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getInstanceName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance ) . isEqualTo ( org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance ) ; } finally { org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . shutdown ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfigurationTests.HazelcastConfigNoName .class , STRING ) ; HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance = this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . getBean ( HazelcastInstance .class ) ; java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> < java.lang.String , QueueConfig > java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> = org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance . getConfig ( ) . getQueueConfigs ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.hazelcast.QueueConfig> ) . hasSize ( NUMBER ) . containsKey ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { void ( null , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext , java.lang.String[] ) ; if ( java.lang.Class<> != null ) { org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; } org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . register ( HazelcastAutoConfiguration .class ) ; org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext = org.springframework.boot.autoconfigure.hazelcast.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.hazelcast.Config org.springframework.boot.autoconfigure.hazelcast.Config ( ) { return new Config ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.hazelcast.Config org.springframework.boot.autoconfigure.hazelcast.Config ( ) { Config org.springframework.boot.autoconfigure.hazelcast.Config = new Config ( ) ; org.springframework.boot.autoconfigure.hazelcast.Config . addQueueConfig ( new QueueConfig ( STRING ) ) ; return org.springframework.boot.autoconfigure.hazelcast.Config ; }  <METHOD_END>