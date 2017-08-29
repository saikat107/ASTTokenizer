<METHOD_START> private void ( RequestExpectationManager org.springframework.test.web.client.RequestExpectationManager ) { this . org.springframework.test.web.client.RequestExpectationManager = org.springframework.test.web.client.RequestExpectationManager ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.ResponseActions org.springframework.test.web.client.ResponseActions ( RequestMatcher org.springframework.test.web.client.RequestMatcher ) { return org.springframework.test.web.client.ResponseActions ( ExpectedCount . once ( ) , org.springframework.test.web.client.RequestMatcher ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.ResponseActions org.springframework.test.web.client.ResponseActions ( ExpectedCount org.springframework.test.web.client.ExpectedCount , RequestMatcher org.springframework.test.web.client.RequestMatcher ) { return this . org.springframework.test.web.client.RequestExpectationManager . expectRequest ( org.springframework.test.web.client.ExpectedCount , org.springframework.test.web.client.RequestMatcher ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . org.springframework.test.web.client.RequestExpectationManager . verify ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . org.springframework.test.web.client.RequestExpectationManager . reset ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( RestTemplate org.springframework.test.web.client.RestTemplate ) { return new org.springframework.test.web.client.MockRestServiceServer.DefaultBuilder ( org.springframework.test.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( org . springframework . org.springframework.web . org.springframework.web . org.springframework.web org.springframework.web.client.AsyncRestTemplate ) { return new org.springframework.test.web.client.MockRestServiceServer.DefaultBuilder ( org.springframework.web.client.AsyncRestTemplate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( RestGatewaySupport org.springframework.test.web.client.RestGatewaySupport ) { Assert . notNull ( org.springframework.test.web.client.RestGatewaySupport , STRING ) ; return new org.springframework.test.web.client.MockRestServiceServer.DefaultBuilder ( org.springframework.test.web.client.RestGatewaySupport . getRestTemplate ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( RestTemplate org.springframework.test.web.client.RestTemplate ) { return org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( org.springframework.test.web.client.RestTemplate ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( org . springframework . org.springframework.web . org.springframework.web . org.springframework.web org.springframework.web.client.AsyncRestTemplate ) { return org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( org.springframework.web.client.AsyncRestTemplate ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( RestGatewaySupport org.springframework.test.web.client.RestGatewaySupport ) { return org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( org.springframework.test.web.client.RestGatewaySupport ) . build ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( boolean boolean );  <METHOD_END>
<METHOD_START> org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( )  <METHOD_END>
<METHOD_START> org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( RequestExpectationManager org.springframework.test.web.client.RequestExpectationManager );  <METHOD_END>
<METHOD_START> public void ( RestTemplate org.springframework.test.web.client.RestTemplate ) { Assert . notNull ( org.springframework.test.web.client.RestTemplate , STRING ) ; this . org.springframework.test.web.client.RestTemplate = org.springframework.test.web.client.RestTemplate ; this . org.springframework.web.client.AsyncRestTemplate = null ; }  <METHOD_END>
<METHOD_START> public void ( org . springframework . org.springframework.web . org.springframework.web . org.springframework.web org.springframework.web.client.AsyncRestTemplate ) { Assert . notNull ( org.springframework.web.client.AsyncRestTemplate , STRING ) ; this . org.springframework.test.web.client.RestTemplate = null ; this . org.springframework.web.client.AsyncRestTemplate = org.springframework.web.client.AsyncRestTemplate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder ( boolean boolean ) { this . boolean = boolean ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( ) { if ( this . boolean ) { return org.springframework.test.web.client.MockRestServiceServer ( new UnorderedRequestExpectationManager ( ) ) ; } else { return org.springframework.test.web.client.MockRestServiceServer ( new SimpleRequestExpectationManager ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer ( RequestExpectationManager org.springframework.test.web.client.RequestExpectationManager ) { org.springframework.test.web.client.MockRestServiceServer org.springframework.test.web.client.MockRestServiceServer = new org.springframework.test.web.client.MockRestServiceServer ( org.springframework.test.web.client.RequestExpectationManager ) ; org.springframework.test.web.client.MockRestServiceServer.MockClientHttpRequestFactory org.springframework.test.web.client.MockRestServiceServer.MockClientHttpRequestFactory = org.springframework.test.web.client.MockRestServiceServer .new org.springframework.test.web.client.MockRestServiceServer.MockClientHttpRequestFactory ( ) ; if ( this . org.springframework.test.web.client.RestTemplate != null ) { this . org.springframework.test.web.client.RestTemplate . setRequestFactory ( org.springframework.test.web.client.MockRestServiceServer.MockClientHttpRequestFactory ) ; } if ( this . org.springframework.web.client.AsyncRestTemplate != null ) { this . org.springframework.web.client.AsyncRestTemplate . setAsyncRequestFactory ( org.springframework.test.web.client.MockRestServiceServer.MockClientHttpRequestFactory ) ; } return org.springframework.test.web.client.MockRestServiceServer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.ClientHttpRequest org.springframework.test.web.client.ClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.test.web.client.HttpMethod ) { return org.springframework.mock.http.client.MockAsyncClientHttpRequest ( java.net.URI , org.springframework.test.web.client.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org . springframework . org.springframework.http . org.springframework.http . org.springframework.http.client.AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.test.web.client.HttpMethod ) { return org.springframework.mock.http.client.MockAsyncClientHttpRequest ( java.net.URI , org.springframework.test.web.client.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> private org . springframework . org.springframework.mock . org.springframework.mock . org.springframework.mock . org.springframework.mock.http.client.MockAsyncClientHttpRequest org.springframework.mock.http.client.MockAsyncClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.test.web.client.HttpMethod ) { Assert . notNull ( java.net.URI , STRING ) ; Assert . notNull ( org.springframework.test.web.client.HttpMethod , STRING ) ; return new org . springframework . org.springframework.mock . org.springframework.mock . org.springframework.mock . org.springframework.mock ( org.springframework.test.web.client.HttpMethod , java.net.URI ) { @ java.lang.Override protected org.springframework.test.web.client.ClientHttpResponse org.springframework.test.web.client.ClientHttpResponse ( ) java.io.IOException { ClientHttpResponse org.springframework.test.web.client.ClientHttpResponse = org.springframework.test.web.client.RequestExpectationManager . validateRequest ( this ) ; setResponse ( org.springframework.test.web.client.ClientHttpResponse ) ; return org.springframework.test.web.client.ClientHttpResponse ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.web.client.ClientHttpResponse org.springframework.test.web.client.ClientHttpResponse ( ) java.io.IOException { ClientHttpResponse org.springframework.test.web.client.ClientHttpResponse = org.springframework.test.web.client.RequestExpectationManager . validateRequest ( this ) ; setResponse ( org.springframework.test.web.client.ClientHttpResponse ) ; return org.springframework.test.web.client.ClientHttpResponse ; }  <METHOD_END>