<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , this . java.util.Properties . java.lang.Object ( IntegrationProperties . THROW_EXCEPTION_ON_LATE_REPLY ) ) ; assertEquals ( STRING , this . java.util.Properties . java.lang.Object ( IntegrationProperties . TASK_SCHEDULER_POOL_SIZE ) ) ; assertEquals ( this . java.util.Properties , this . org.springframework.integration.context.IntegrationObjectSupport . getIntegrationProperties ( ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.context.ThreadPoolTaskScheduler , STRING ) ) ; }  <METHOD_END>