<METHOD_START> public static java.lang.ClassLoader java.lang.ClassLoader ( java.lang.ClassLoader java.lang.ClassLoader ) { return new org.springframework.context.index.CandidateComponentsTestClassLoader ( java.lang.ClassLoader , java.util.Collections . java.util.Enumeration<java.net.URL> ( java.util.Collections . java.util.List<java.net.URL> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.ClassLoader java.lang.ClassLoader ( java.lang.ClassLoader java.lang.ClassLoader , Resource ... org.springframework.context.index.Resource[] ) { return new org.springframework.context.index.CandidateComponentsTestClassLoader ( java.lang.ClassLoader , java.util.Collections . java.util.Enumeration ( java.util.stream.Stream . java.util.stream.Stream ( org.springframework.context.index.Resource[] ) . map ( r -> { try { return r . getURL ( ) ; } catch ( Exception ex ) { throw new IllegalArgumentException ( STRING + r , ex ) ; } } ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader , java.util.Enumeration<java.net.URL> < java.net.URL > java.util.Enumeration<java.net.URL> ) { super( java.lang.ClassLoader ); this . java.util.Enumeration<java.net.URL> = java.util.Enumeration<java.net.URL> ; this . java.io.IOException = null ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader , java.io.IOException java.io.IOException ) { super( java.lang.ClassLoader ); this . java.util.Enumeration<java.net.URL> = null ; this . java.io.IOException = java.io.IOException ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.net.URL> < java.net.URL > java.util.Enumeration<java.net.URL> ( java.lang.String java.lang.String ) throws java.io.IOException { if ( CandidateComponentsIndexLoader . COMPONENTS_RESOURCE_LOCATION . equals ( java.lang.String ) ) { if ( this . java.util.Enumeration<java.net.URL> != null ) { return this . java.util.Enumeration<java.net.URL> ; } throw this . java.io.IOException ; } return super. java.util.Enumeration<java.net.URL> ( java.lang.String ) ; }  <METHOD_END>