<METHOD_START> @ Bean public org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ( ) { return new MockServerRestTemplateCustomizer ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer ( MockServerRestTemplateCustomizer org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ) { try { return org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer ( org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer ( MockServerRestTemplateCustomizer org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ) throws java.lang.Exception { java.lang.reflect.Constructor<org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer> < MockRestServiceServer > java.lang.reflect.Constructor<org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer> = MockRestServiceServer .class . java.lang.reflect.Constructor<org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer> ( RequestExpectationManager .class ) ; java.lang.reflect.Constructor<org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer> . setAccessible ( true ) ; return java.lang.reflect.Constructor<org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer> . newInstance ( new org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerAutoConfiguration.DeferredRequestExpectationManager ( org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ) ) ; }  <METHOD_END>
<METHOD_START> void ( MockServerRestTemplateCustomizer org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ) { this . org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer = org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.test.autoconfigure.web.client.ResponseActions org.springframework.boot.test.autoconfigure.web.client.ResponseActions ( ExpectedCount org.springframework.boot.test.autoconfigure.web.client.ExpectedCount , RequestMatcher org.springframework.boot.test.autoconfigure.web.client.RequestMatcher ) { return org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager ( ) . expectRequest ( org.springframework.boot.test.autoconfigure.web.client.ExpectedCount , org.springframework.boot.test.autoconfigure.web.client.RequestMatcher ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.test.autoconfigure.web.client.ClientHttpResponse org.springframework.boot.test.autoconfigure.web.client.ClientHttpResponse ( ClientHttpRequest org.springframework.boot.test.autoconfigure.web.client.ClientHttpRequest )				throws java.io.IOException { return org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager ( ) . validateRequest ( org.springframework.boot.test.autoconfigure.web.client.ClientHttpRequest ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> < RestTemplate , RequestExpectationManager > java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> = this . org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer . getExpectationManagers ( ) ; if ( java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> . size ( ) == NUMBER ) { org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager ( ) . reset ( ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager ( ) { java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> < RestTemplate , RequestExpectationManager > java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> = this . org.springframework.boot.test.autoconfigure.web.client.MockServerRestTemplateCustomizer . getExpectationManagers ( ) ; Assert . state ( java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> . size ( ) > NUMBER , STRING + STRING + STRING ) ; Assert . state ( java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> . size ( ) == NUMBER , STRING + STRING + STRING ) ; return java.util.Map<org.springframework.boot.test.autoconfigure.web.client.RestTemplate,org.springframework.boot.test.autoconfigure.web.client.RequestExpectationManager> . values ( ) . iterator ( ) . next ( ) ; }  <METHOD_END>