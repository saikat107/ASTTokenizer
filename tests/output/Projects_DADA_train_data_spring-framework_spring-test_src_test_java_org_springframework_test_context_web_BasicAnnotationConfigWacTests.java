<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.test.context.web.ServletContextAwareBean org.springframework.test.context.web.ServletContextAwareBean ( ) { return new ServletContextAwareBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , foo ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNotNull ( org.springframework.test.context.web.ServletContextAwareBean ) ; assertNotNull ( org.springframework.test.context.web.ServletContextAwareBean . servletContext ) ; }  <METHOD_END>
