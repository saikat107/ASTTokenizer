<METHOD_START> @ BeforeClass public static void void ( ) { org.springframework.http.client.EventLoopGroup = new NioEventLoopGroup ( ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) java.lang.InterruptedException { org.springframework.http.client.EventLoopGroup . shutdownGracefully ( ) . sync ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ClientHttpRequestFactory org.springframework.http.client.ClientHttpRequestFactory ( ) { return new Netty4ClientHttpRequestFactory ( org.springframework.http.client.EventLoopGroup ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Test public void void ( ) java.lang.Exception { super. httpMethods ( ) ; assertHttpMethod ( STRING , HttpMethod . PATCH ) ; }  <METHOD_END>
