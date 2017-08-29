<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext != null ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . close ( ) ; } if ( org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.Config . org.springframework.boot.actuate.autoconfigure.MockServletWebServerFactory != null ) { org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.Config . org.springframework.boot.actuate.autoconfigure.MockServletWebServerFactory = null ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext , STRING , STRING ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.Config .class , WebMvcAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , HttpMessageConvertersAutoConfiguration .class , JolokiaAutoConfiguration .class ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . getBeanNamesForType ( JolokiaMvcEndpoint .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext , STRING ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.EndpointsConfig .class , WebMvcAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , HttpMessageConvertersAutoConfiguration .class , JolokiaAutoConfiguration .class ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . getBeanNamesForType ( JolokiaMvcEndpoint .class ) ) . hasSize ( NUMBER ) ; MockMvc org.springframework.boot.actuate.autoconfigure.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext ) . build ( ) ; org.springframework.boot.actuate.autoconfigure.MockMvc . perform ( MockMvcRequestBuilders . get ( STRING ) ) . andExpect ( MockMvcResultMatchers . content ( ) . string ( Matchers . containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext , java.lang.String[] ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.Config .class , WebMvcAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , HttpMessageConvertersAutoConfiguration .class , JolokiaAutoConfiguration .class ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . getBeanNamesForType ( JolokiaMvcEndpoint .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext , java.lang.String[] ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfigurationTests.Config .class , WebMvcAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , HttpMessageConvertersAutoConfiguration .class , JolokiaAutoConfiguration .class ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigServletWebServerApplicationContext . getBeanNamesForType ( JolokiaMvcEndpoint .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.EndpointHandlerMapping org.springframework.boot.actuate.autoconfigure.EndpointHandlerMapping ( java.util.Collection<? extends org.springframework.boot.actuate.autoconfigure.MvcEndpoint> < ? extends MvcEndpoint > java.util.Collection<? extends org.springframework.boot.actuate.autoconfigure.MvcEndpoint> ) { EndpointHandlerMapping org.springframework.boot.actuate.autoconfigure.EndpointHandlerMapping = new EndpointHandlerMapping ( java.util.Collection<> ) ; org.springframework.boot.actuate.autoconfigure.EndpointHandlerMapping . setSecurityInterceptor ( new MvcEndpointSecurityInterceptor ( false , java.util.Collections .< java.lang.String > java.util.List<java.lang.String> ( ) ) ) ; return org.springframework.boot.actuate.autoconfigure.EndpointHandlerMapping ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.ServletWebServerFactory org.springframework.boot.actuate.autoconfigure.ServletWebServerFactory ( ) { if ( org.springframework.boot.actuate.autoconfigure.MockServletWebServerFactory == null ) { org.springframework.boot.actuate.autoconfigure.MockServletWebServerFactory = new MockServletWebServerFactory ( ) ; } return org.springframework.boot.actuate.autoconfigure.MockServletWebServerFactory ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.WebServerFactoryCustomizerBeanPostProcessor org.springframework.boot.actuate.autoconfigure.WebServerFactoryCustomizerBeanPostProcessor ( ) { return new WebServerFactoryCustomizerBeanPostProcessor ( ) ; }  <METHOD_END>