<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.List<java.lang.String> ( org.springframework.boot.autoconfigure.ImportAutoConfigurationTests.Config .class ) ) . containsExactly ( STRING , STRING , STRING , STRING ) ; assertThat ( java.util.List<java.lang.String> ( org.springframework.boot.autoconfigure.ImportAutoConfigurationTests.AnotherConfig .class ) ) . containsExactly ( STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( java.util.List<java.lang.String> ( org.springframework.boot.autoconfigure.ImportAutoConfigurationTests.AnotherConfigUsingClasses .class ) ) . containsExactly ( STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( java.util.List<java.lang.String> ( org.springframework.boot.autoconfigure.ImportAutoConfigurationTests.ExcludingConfig .class ) ) . containsExactly ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<> ) ; java.lang.String java.lang.String = ClassUtils . getShortName ( org.springframework.boot.autoconfigure.ImportAutoConfigurationTests .class ) ; int int = java.lang.String . int ( ) + NUMBER ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : org.springframework.boot.autoconfigure.AnnotationConfigApplicationContext . getBeanDefinitionNames ( ) ) { if ( java.lang.String . boolean ( STRING ) ) { java.lang.String java.lang.String = ClassUtils . getShortName ( java.lang.String ) ; java.util.List<java.lang.String> . boolean ( java.lang.String . java.lang.String ( int ) ) ; } } org.springframework.boot.autoconfigure.AnnotationConfigApplicationContext . close ( ) ; return java.util.List<java.lang.String> ; }  <METHOD_END>