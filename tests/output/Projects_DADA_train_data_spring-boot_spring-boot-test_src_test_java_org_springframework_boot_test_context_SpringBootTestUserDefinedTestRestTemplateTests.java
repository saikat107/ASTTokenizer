<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( getContext ( ) . getBean ( STRING ) ) . isInstanceOf ( RestTemplate .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.test.context.RestTemplate org.springframework.boot.test.context.RestTemplate ( ) { return new RestTemplate ( ) ; }  <METHOD_END>
