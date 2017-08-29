<METHOD_START> @ Before public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.jcache.interceptor.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.Config .class ) ; this . org.springframework.cache.jcache.interceptor.Cache = org.springframework.cache.jcache.interceptor.AnnotationConfigApplicationContext . getBean ( STRING , Cache .class ) ; this . org.springframework.cache.jcache.interceptor.Cache = org.springframework.cache.jcache.interceptor.AnnotationConfigApplicationContext . getBean ( STRING , Cache .class ) ; this . org.springframework.cache.jcache.interceptor.CacheErrorHandler = org.springframework.cache.jcache.interceptor.AnnotationConfigApplicationContext . getBean ( CacheErrorHandler .class ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService = org.springframework.cache.jcache.interceptor.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; java.lang.Object java.lang.Object = SimpleKeyGenerator . generateKey ( NUMBER ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . get ( java.lang.Object ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . java.lang.Object ( NUMBER ) ; verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCacheGetError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; java.lang.Object java.lang.Object = SimpleKeyGenerator . generateKey ( NUMBER ) ; given ( this . org.springframework.cache.jcache.interceptor.Cache . get ( java.lang.Object ) ) . willReturn ( null ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . put ( java.lang.Object , NUMBER ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . java.lang.Object ( NUMBER ) ; verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCachePutError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache , java.lang.Object , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; java.lang.Object java.lang.Object = SimpleKeyGenerator . generateKey ( NUMBER ) ; given ( this . org.springframework.cache.jcache.interceptor.Cache . get ( java.lang.Object ) ) . willReturn ( null ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . put ( java.lang.Object , org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . java.lang.IllegalStateException ) ; try { this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . java.lang.Object ( NUMBER ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertEquals ( STRING , java.lang.IllegalStateException . java.lang.String ( ) ) ; } verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCachePutError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache , java.lang.Object , org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . java.lang.IllegalStateException ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; java.lang.Object java.lang.Object = SimpleKeyGenerator . generateKey ( NUMBER ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . put ( java.lang.Object , NUMBER ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . void ( NUMBER , NUMBER ) ; verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCachePutError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache , java.lang.Object , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; java.lang.Object java.lang.Object = SimpleKeyGenerator . generateKey ( NUMBER ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . evict ( java.lang.Object ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . void ( NUMBER ) ; verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCacheEvictError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( STRING ) ; willThrow ( java.lang.UnsupportedOperationException ) . given ( this . org.springframework.cache.jcache.interceptor.Cache ) . clear ( ) ; this . org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService . void ( ) ; verify ( this . org.springframework.cache.jcache.interceptor.CacheErrorHandler ) . handleCacheClearError ( java.lang.UnsupportedOperationException , this . org.springframework.cache.jcache.interceptor.Cache ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.Override public org.springframework.cache.jcache.interceptor.CacheManager org.springframework.cache.jcache.interceptor.CacheManager ( ) { SimpleCacheManager org.springframework.cache.jcache.interceptor.SimpleCacheManager = new SimpleCacheManager ( ) ; org.springframework.cache.jcache.interceptor.SimpleCacheManager . setCaches ( java.util.Arrays . java.util.List ( org.springframework.cache.jcache.interceptor.Cache ( ) , org.springframework.cache.jcache.interceptor.Cache ( ) ) ) ; return org.springframework.cache.jcache.interceptor.SimpleCacheManager ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.Override public org.springframework.cache.jcache.interceptor.CacheErrorHandler org.springframework.cache.jcache.interceptor.CacheErrorHandler ( ) { return mock ( CacheErrorHandler .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService ( ) { return new org.springframework.cache.jcache.interceptor.JCacheErrorHandlerTests.SimpleService ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.interceptor.Cache org.springframework.cache.jcache.interceptor.Cache ( ) { Cache org.springframework.cache.jcache.interceptor.Cache = mock ( Cache .class ) ; given ( org.springframework.cache.jcache.interceptor.Cache . getName ( ) ) . willReturn ( STRING ) ; return org.springframework.cache.jcache.interceptor.Cache ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.jcache.interceptor.Cache org.springframework.cache.jcache.interceptor.Cache ( ) { Cache org.springframework.cache.jcache.interceptor.Cache = mock ( Cache .class ) ; given ( org.springframework.cache.jcache.interceptor.Cache . getName ( ) ) . willReturn ( STRING ) ; return org.springframework.cache.jcache.interceptor.Cache ; }  <METHOD_END>
<METHOD_START> @ CacheResult public java.lang.Object java.lang.Object ( long long ) { return this . java.util.concurrent.atomic.AtomicLong . long ( ) ; }  <METHOD_END>
<METHOD_START> @ CacheResult ( exceptionCacheName = STRING ) public java.lang.Object java.lang.Object ( long long ) { throw java.lang.IllegalStateException ; }  <METHOD_END>
<METHOD_START> @ CachePut public void void ( long long , @ CacheValue java.lang.Object java.lang.Object ) {		}  <METHOD_END>
<METHOD_START> @ CacheRemove public void void ( long long ) {		}  <METHOD_END>
<METHOD_START> @ CacheRemoveAll public void void ( ) {		}  <METHOD_END>