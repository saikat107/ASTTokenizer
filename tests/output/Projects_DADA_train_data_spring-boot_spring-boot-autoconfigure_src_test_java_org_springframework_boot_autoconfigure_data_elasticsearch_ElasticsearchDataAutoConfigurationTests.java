<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext , STRING , STRING ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . register ( PropertyPlaceholderAutoConfiguration .class , ElasticsearchAutoConfiguration .class , ElasticsearchDataAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . getBeanNamesForType ( ElasticsearchTemplate .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext , STRING , STRING ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . register ( PropertyPlaceholderAutoConfiguration .class , ElasticsearchAutoConfiguration .class , ElasticsearchDataAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . getBeanNamesForType ( SimpleElasticsearchMappingContext .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext , STRING , STRING ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . register ( PropertyPlaceholderAutoConfiguration .class , ElasticsearchAutoConfiguration .class , ElasticsearchDataAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.elasticsearch.AnnotationConfigApplicationContext . getBeanNamesForType ( ElasticsearchConverter .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>