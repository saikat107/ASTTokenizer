<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.data.mongo.ReactiveAndBlockingMongoRepositoriesAutoConfigurationTests.BlockingAndReactiveConfiguration .class , org.springframework.boot.autoconfigure.data.mongo.ReactiveAndBlockingMongoRepositoriesAutoConfigurationTests.BaseConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext . getBean ( CityRepository .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.mongo.AnnotationConfigApplicationContext . getBean ( ReactiveCityRepository .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.boot.autoconfigure.data.mongo.AnnotationMetadata ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : new java.lang.Class<?> < ? > [] { MongoAutoConfiguration .class , ReactiveMongoAutoConfiguration .class , MongoDataAutoConfiguration .class , MongoRepositoriesAutoConfiguration .class , ReactiveMongoDataAutoConfiguration .class , ReactiveMongoRepositoriesAutoConfiguration .class } ) { java.util.List<java.lang.String> . boolean ( java.lang.Class<> . java.lang.String ( ) ) ; } return java.util.List<java.lang.String> . java.lang.String[] ( new java.lang.String [ NUMBER ] ) ; }  <METHOD_END>