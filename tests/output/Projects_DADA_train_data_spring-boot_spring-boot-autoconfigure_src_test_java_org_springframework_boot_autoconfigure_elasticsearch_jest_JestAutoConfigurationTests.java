<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBeansOfType ( JestClient .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.CustomJestClient .class , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBeansOfType ( JestClient .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.CustomGson .class , STRING ) ; JestHttpClient org.springframework.boot.autoconfigure.elasticsearch.jest.JestHttpClient = ( JestHttpClient ) this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBean ( JestClient .class ) ; assertThat ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestHttpClient . getGson ( ) ) . isSameAs ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.BuilderCustomizer .class , STRING ) ; JestHttpClient org.springframework.boot.autoconfigure.elasticsearch.jest.JestHttpClient = ( JestHttpClient ) this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBean ( JestClient .class ) ; assertThat ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestHttpClient . getGson ( ) ) . isSameAs ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.BuilderCustomizer .class ) . getGson ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.elasticsearch.jest.ExpectedException . expect ( BeanCreationException .class ) ; this . org.springframework.boot.autoconfigure.elasticsearch.jest.ExpectedException . expectMessage ( STRING ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { int int = SocketUtils . findAvailableTcpPort ( ) ; void ( ElasticsearchAutoConfiguration .class , STRING , STRING , STRING + int , STRING + int ) ; JestClient org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient = this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . getBean ( JestClient .class ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; Index org.springframework.boot.autoconfigure.elasticsearch.jest.Index = new Index . Index ( java.util.Map<java.lang.String,java.lang.String> ) . index ( STRING ) . type ( STRING ) . build ( ) ; org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient . execute ( org.springframework.boot.autoconfigure.elasticsearch.jest.Index ) ; SearchSourceBuilder org.springframework.boot.autoconfigure.elasticsearch.jest.SearchSourceBuilder = new SearchSourceBuilder ( ) ; org.springframework.boot.autoconfigure.elasticsearch.jest.SearchSourceBuilder . query ( QueryBuilders . matchQuery ( STRING , STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient . execute ( new Search . Search ( org.springframework.boot.autoconfigure.elasticsearch.jest.SearchSourceBuilder . toString ( ) ) . addIndex ( STRING ) . build ( ) ) . getResponseCode ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { void ( null , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext , java.lang.String[] ) ; if ( java.lang.Class<> != null ) { org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; } org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . register ( GsonAutoConfiguration .class , JestAutoConfiguration .class ) ; org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext = org.springframework.boot.autoconfigure.elasticsearch.jest.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient ( ) { return mock ( JestClient .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.elasticsearch.jest.Gson org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ( ) { return new Gson ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer ( ) { return new HttpClientConfigBuilderCustomizer ( ) { @ java.lang.Override public void void ( HttpClientConfig . HttpClientConfig HttpClientConfig.Builder ) { HttpClientConfig.Builder . gson ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.BuilderCustomizer .this . org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( HttpClientConfig . HttpClientConfig HttpClientConfig.Builder ) { HttpClientConfig.Builder . gson ( org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfigurationTests.BuilderCustomizer .this . org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ) ; }  <METHOD_END>
<METHOD_START> org.springframework.boot.autoconfigure.elasticsearch.jest.Gson org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ( ) { return this . org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ; }  <METHOD_END>