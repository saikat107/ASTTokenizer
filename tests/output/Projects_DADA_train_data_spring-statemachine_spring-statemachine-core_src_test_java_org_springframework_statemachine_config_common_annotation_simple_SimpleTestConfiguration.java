<METHOD_START> @ Bean ( name = STRING ) public org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig ( ) { SimpleTestConfig org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig = org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder . getOrBuild ( ) ; return org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public java.lang.String java.lang.String ( ) { SimpleTestConfig org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig = org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder . getOrBuild ( ) ; return config . simpleData ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBeanB org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBeanB ( ) { SimpleTestConfig org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig = org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder . getOrBuild ( ) ; return config . simpleBeanB ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.List<org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder>> < AnnotationConfigurer < SimpleTestConfig , SimpleTestConfigBuilder > > java.util.List<org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder>> )	throws java.lang.Exception { for ( AnnotationConfigurer < SimpleTestConfig , SimpleTestConfigBuilder > org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> : java.util.List<org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder>> ) { if ( org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> . isAssignable ( org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder ) ) { org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder . apply ( org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> ) ; } } }  <METHOD_END>