<METHOD_START> private static void void ( java.util.Properties java.util.Properties , java.lang.String java.lang.String , java.lang.String java.lang.String ) { assertThat ( java.util.Properties , is ( notNullValue ( ) ) ) ; assertThat ( java.util.Properties . boolean ( java.lang.String ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( java.lang.String ) , is ( equalTo ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Properties java.util.Properties ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( java.lang.String , java.lang.String ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected boolean boolean ( ) { return true ; } } ; try { org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . assertInitialized ( ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected boolean boolean ( ) { return false ; } } ; try { org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . getClass ( ) . getName ( ) ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . assertInitialized ( ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) ; try { org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . assertUninitialized ( ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected boolean boolean ( ) { return true ; } } ; try { org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . getClass ( ) . getName ( ) ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . assertUninitialized ( ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) ; try { assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . init ( java.util.Properties ( STRING , STRING ) ) ; void ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . nullSafeGetParameters ( ) , STRING , STRING ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . init ( java.util.Properties ( STRING , STRING ) ) ; void ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . nullSafeGetParameters ( ) , STRING , STRING ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected boolean boolean ( ) { return true ; } } ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isNotInitialized ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected boolean boolean ( ) { return false ; } } ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isNotInitialized ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) ; try { org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . init ( null ) ; java.util.Properties java.util.Properties = org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . nullSafeGetParameters ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = mock ( ConfigurableApplicationContext .class ) ; ConfigurableListableBeanFactory org.springframework.data.gemfire.support.ConfigurableListableBeanFactory = mock ( ConfigurableListableBeanFactory .class ) ; when ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBeanFactory ( ) ) . thenReturn ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( false ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , STRING , STRING ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; } } ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; try { org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . init ( java.util.Properties ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . onApplicationEvent ( new ContextRefreshedEvent ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( java.util.Properties ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( true ) ) ; verify ( org.springframework.data.gemfire.support.ConfigurableApplicationContext , times ( NUMBER ) ) . getBeanFactory ( ) ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , STRING , STRING ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { LazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) ; try { ContextRefreshedEvent org.springframework.data.gemfire.support.ContextRefreshedEvent = mock ( ContextRefreshedEvent .class ) ; when ( org.springframework.data.gemfire.support.ContextRefreshedEvent . getApplicationContext ( ) ) . thenReturn ( null ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . onApplicationEvent ( org.springframework.data.gemfire.support.ContextRefreshedEvent ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; throw java.lang.Throwable ; } finally { SpringContextBootstrappingInitializer . unregister ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupport ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = mock ( ConfigurableApplicationContext .class ) ; ConfigurableListableBeanFactory org.springframework.data.gemfire.support.ConfigurableListableBeanFactory = mock ( ConfigurableListableBeanFactory .class ) ; when ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBeanFactory ( ) ) . thenReturn ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( false ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , STRING , STRING ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; } } ; SpringContextBootstrappingInitializer org.springframework.data.gemfire.support.SpringContextBootstrappingInitializer = new SpringContextBootstrappingInitializer ( ) ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; try { org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . init ( java.util.Properties ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( sameInstance ( java.util.Properties ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( false ) ) ; org.springframework.data.gemfire.support.SpringContextBootstrappingInitializer . onApplicationEvent ( new ContextRefreshedEvent ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( true ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( java.util.Properties ) ; java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . destroy ( ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( false ) ) ; org.springframework.data.gemfire.support.SpringContextBootstrappingInitializer . onApplicationEvent ( new ContextRefreshedEvent ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( false ) ) ; verify ( org.springframework.data.gemfire.support.ConfigurableApplicationContext , times ( NUMBER ) ) . getBeanFactory ( ) ; } finally { org.springframework.data.gemfire.support.SpringContextBootstrappingInitializer . onApplicationEvent ( new ContextClosedEvent ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , STRING , STRING ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = mock ( BeanFactory .class ) ; ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = mock ( ConfigurableApplicationContext .class ) ; ConfigurableListableBeanFactory org.springframework.data.gemfire.support.ConfigurableListableBeanFactory = mock ( ConfigurableListableBeanFactory .class ) ; when ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBeanFactory ( ) ) . thenReturn ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; when ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( anyString ( ) ) ) . thenReturn ( new java.lang.String [ NUMBER ] ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( org.springframework.data.gemfire.support.BeanFactory , STRING ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( false ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = new java.util.concurrent.atomic.AtomicReference<java.lang.String> <> ( STRING ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = new java.util.concurrent.atomic.AtomicReference<java.lang.String> <> ( STRING ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport = new org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport ( ) { @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; } } ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; try { org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . afterPropertiesSet ( ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( false ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( false ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . init ( java.util.Properties ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( java.util.Properties ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( sameInstance ( java.util.Properties ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( true ) ) ; java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . onApplicationEvent ( new ContextRefreshedEvent ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( org.springframework.data.gemfire.support.ConfigurableListableBeanFactory ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( java.util.Properties ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( sameInstance ( java.util.Properties ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( true ) ) ; java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; java.util.concurrent.atomic.AtomicReference<java.lang.String> . void ( STRING ) ; java.util.concurrent.atomic.AtomicReference<java.lang.String> . void ( STRING ) ; java.util.Properties = java.util.Properties ( STRING , STRING ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . init ( java.util.Properties ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . void ( java.util.Properties ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . isInitialized ( ) , is ( true ) ) ; assertThat ( org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests.TestLazyWiringDeclarableSupport . nullSafeGetParameters ( ) , is ( sameInstance ( java.util.Properties ) ) ) ; assertThat ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) , is ( true ) ) ; verify ( org.springframework.data.gemfire.support.ConfigurableApplicationContext , times ( NUMBER ) ) . getBeanFactory ( ) ; } finally { org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final java.util.Properties java.util.Properties ) { super. doPostInit ( java.util.Properties ) ; void ( ) ; org.springframework.data.gemfire.support.LazyWiringDeclarableSupportUnitTests . void ( java.util.Properties , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; }  <METHOD_END>
<METHOD_START> private void void ( final BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { assertThat ( this . org.springframework.data.gemfire.support.BeanFactory , is ( sameInstance ( org.springframework.data.gemfire.support.BeanFactory ) ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( final java.util.Properties java.util.Properties ) { assertThat ( this . java.util.Properties , is ( equalTo ( java.util.Properties ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override void void ( BeanFactory org.springframework.data.gemfire.support.BeanFactory , java.util.Properties java.util.Properties ) { this . org.springframework.data.gemfire.support.BeanFactory = org.springframework.data.gemfire.support.BeanFactory ; this . java.util.Properties = java.util.Properties ; this . initialized = true ; doPostInit ( java.util.Properties ) ; }  <METHOD_END>