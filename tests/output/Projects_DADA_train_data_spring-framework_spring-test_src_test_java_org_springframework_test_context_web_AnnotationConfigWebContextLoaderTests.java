<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.test.context.web.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.test.context.web.ExpectedException . expectMessage ( containsString ( STRING ) ) ; AnnotationConfigWebContextLoader org.springframework.test.context.web.AnnotationConfigWebContextLoader = new AnnotationConfigWebContextLoader ( ) ; WebMergedContextConfiguration org.springframework.test.context.web.WebMergedContextConfiguration = new WebMergedContextConfiguration ( java.lang.Class<? extends org.springframework.test.context.web.AnnotationConfigWebContextLoaderTests> ( ) , new java.lang.String [] { STRING } , java.lang.Class<?>[] , null , java.lang.String[] , java.lang.String[] , java.lang.String[] , STRING , org.springframework.test.context.web.AnnotationConfigWebContextLoader , null , null ) ; org.springframework.test.context.web.AnnotationConfigWebContextLoader . loadContext ( org.springframework.test.context.web.WebMergedContextConfiguration ) ; }  <METHOD_END>