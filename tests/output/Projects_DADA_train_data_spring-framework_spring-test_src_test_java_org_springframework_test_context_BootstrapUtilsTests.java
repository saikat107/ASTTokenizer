<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.BootstrapUtilsTests.NonAnnotatedClass .class , DefaultTestContextBootstrapper .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.BootstrapUtilsTests.WebAppConfigurationAnnotatedClass .class , WebTestContextBootstrapper .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BootstrapContext org.springframework.test.context.BootstrapContext = BootstrapTestUtils . buildBootstrapContext ( org.springframework.test.context.BootstrapUtilsTests.EmptyBootstrapWithAnnotationClass .class , org.springframework.test.context.CacheAwareContextLoaderDelegate ) ; org.springframework.test.context.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.test.context.ExpectedException . expectMessage ( containsString ( STRING ) ) ; resolveTestContextBootstrapper ( org.springframework.test.context.BootstrapContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.BootstrapUtilsTests.DirectBootstrapWithAnnotationClass .class , org.springframework.test.context.BootstrapUtilsTests.FooBootstrapper .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.BootstrapUtilsTests.InheritedBootstrapWithAnnotationClass .class , org.springframework.test.context.BootstrapUtilsTests.FooBootstrapper .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.BootstrapUtilsTests.MetaAnnotatedBootstrapWithAnnotationClass .class , org.springframework.test.context.BootstrapUtilsTests.BarBootstrapper .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BootstrapContext org.springframework.test.context.BootstrapContext = BootstrapTestUtils . buildBootstrapContext ( org.springframework.test.context.BootstrapUtilsTests.DoubleMetaAnnotatedBootstrapWithAnnotationClass .class , org.springframework.test.context.CacheAwareContextLoaderDelegate ) ; org.springframework.test.context.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.test.context.ExpectedException . expectMessage ( containsString ( STRING ) ) ; org.springframework.test.context.ExpectedException . expectMessage ( containsString ( org.springframework.test.context.BootstrapUtilsTests.FooBootstrapper .class . java.lang.String ( ) ) ) ; org.springframework.test.context.ExpectedException . expectMessage ( containsString ( org.springframework.test.context.BootstrapUtilsTests.BarBootstrapper .class . java.lang.String ( ) ) ) ; resolveTestContextBootstrapper ( org.springframework.test.context.BootstrapContext ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { BootstrapContext org.springframework.test.context.BootstrapContext = BootstrapTestUtils . buildBootstrapContext ( java.lang.Class<> , org.springframework.test.context.CacheAwareContextLoaderDelegate ) ; TestContextBootstrapper org.springframework.test.context.TestContextBootstrapper = resolveTestContextBootstrapper ( org.springframework.test.context.BootstrapContext ) ; assertNotNull ( org.springframework.test.context.TestContextBootstrapper ) ; assertEquals ( java.lang.Class<> , org.springframework.test.context.TestContextBootstrapper . getClass ( ) ) ; }  <METHOD_END>