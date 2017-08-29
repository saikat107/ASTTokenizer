<METHOD_START> @ Before public void void ( ) { org.springframework.cache.jcache.config.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.jcache.config.JCacheCustomInterceptorTests.EnableCachingConfig .class ) ; org.springframework.cache.jcache.config.JCacheableService<?> = org.springframework.cache.jcache.config.ConfigurableApplicationContext . getBean ( STRING , JCacheableService .class ) ; org.springframework.cache.jcache.config.Cache = org.springframework.cache.jcache.config.ConfigurableApplicationContext . getBean ( STRING , Cache .class ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.cache.jcache.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.cache.jcache.config.JCacheInterceptor> < java.lang.String , JCacheInterceptor > java.util.Map<java.lang.String,org.springframework.cache.jcache.config.JCacheInterceptor> = org.springframework.cache.jcache.config.ConfigurableApplicationContext . getBeansOfType ( JCacheInterceptor .class ) ; assertEquals ( STRING , NUMBER , java.util.Map<java.lang.String,org.springframework.cache.jcache.config.JCacheInterceptor> . size ( ) ) ; JCacheInterceptor org.springframework.cache.jcache.config.JCacheInterceptor = java.util.Map<java.lang.String,org.springframework.cache.jcache.config.JCacheInterceptor> . values ( ) . iterator ( ) . next ( ) ; assertEquals ( STRING , org.springframework.cache.jcache.config.JCacheCustomInterceptorTests.TestCacheInterceptor .class , org.springframework.cache.jcache.config.JCacheInterceptor . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.cache.jcache.config.JCacheableService<> . cacheWithException ( STRING , true ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.cache.jcache.config.JCacheableService<> . cacheWithCheckedException ( STRING , true ) ; fail ( STRING ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { assertNotNull ( STRING , java.lang.RuntimeException . java.lang.Throwable ( ) ) ; assertEquals ( java.io.IOException .class , java.lang.RuntimeException . java.lang.Throwable ( ) . java.lang.Class<? extends java.lang.Throwable> ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { fail ( STRING + java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.config.CacheManager org.springframework.cache.jcache.config.CacheManager ( ) { SimpleCacheManager org.springframework.cache.jcache.config.SimpleCacheManager = new SimpleCacheManager ( ) ; org.springframework.cache.jcache.config.SimpleCacheManager . setCaches ( java.util.Arrays . java.util.List ( org.springframework.cache.jcache.config.Cache ( ) , org.springframework.cache.jcache.config.Cache ( ) ) ) ; return org.springframework.cache.jcache.config.SimpleCacheManager ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.config.JCacheableService<?> < ? > org.springframework.cache.jcache.config.JCacheableService<?> ( ) { return new AnnotatedJCacheableService ( org.springframework.cache.jcache.config.Cache ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.config.Cache org.springframework.cache.jcache.config.Cache ( ) { return new ConcurrentMapCache ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.config.Cache org.springframework.cache.jcache.config.Cache ( ) { return new ConcurrentMapCache ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.config.JCacheInterceptor org.springframework.cache.jcache.config.JCacheInterceptor ( JCacheOperationSource org.springframework.cache.jcache.config.JCacheOperationSource ) { JCacheInterceptor org.springframework.cache.jcache.config.JCacheInterceptor = new org.springframework.cache.jcache.config.JCacheCustomInterceptorTests.TestCacheInterceptor ( ) ; org.springframework.cache.jcache.config.JCacheInterceptor . setCacheOperationSource ( org.springframework.cache.jcache.config.JCacheOperationSource ) ; return org.springframework.cache.jcache.config.JCacheInterceptor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( CacheOperationInvoker org.springframework.cache.jcache.config.CacheOperationInvoker ) { try { return super. invokeOperation ( org.springframework.cache.jcache.config.CacheOperationInvoker ) ; } catch ( CacheOperationInvoker . CacheOperationInvoker CacheOperationInvoker.ThrowableWrapper ) { java.lang.Throwable java.lang.Throwable = CacheOperationInvoker.ThrowableWrapper . getOriginal ( ) ; if ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) == java.lang.UnsupportedOperationException .class ) { return NUMBER ; } else { throw new CacheOperationInvoker . CacheOperationInvoker ( new java.lang.RuntimeException ( STRING , java.lang.Throwable ) ) ; } } }  <METHOD_END>