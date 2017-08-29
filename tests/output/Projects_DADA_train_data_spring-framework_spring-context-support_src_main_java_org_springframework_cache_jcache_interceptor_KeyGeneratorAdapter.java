<METHOD_START> public void ( JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource , KeyGenerator org.springframework.cache.jcache.interceptor.KeyGenerator ) { Assert . notNull ( org.springframework.cache.jcache.interceptor.JCacheOperationSource , STRING ) ; Assert . notNull ( org.springframework.cache.jcache.interceptor.KeyGenerator , STRING ) ; this . org.springframework.cache.jcache.interceptor.JCacheOperationSource = org.springframework.cache.jcache.interceptor.JCacheOperationSource ; this . org.springframework.cache.jcache.interceptor.KeyGenerator = org.springframework.cache.jcache.interceptor.KeyGenerator ; }  <METHOD_END>
<METHOD_START> public void ( JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource , CacheKeyGenerator org.springframework.cache.jcache.interceptor.CacheKeyGenerator ) { Assert . notNull ( org.springframework.cache.jcache.interceptor.JCacheOperationSource , STRING ) ; Assert . notNull ( org.springframework.cache.jcache.interceptor.CacheKeyGenerator , STRING ) ; this . org.springframework.cache.jcache.interceptor.JCacheOperationSource = org.springframework.cache.jcache.interceptor.JCacheOperationSource ; this . org.springframework.cache.jcache.interceptor.CacheKeyGenerator = org.springframework.cache.jcache.interceptor.CacheKeyGenerator ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return ( this . org.springframework.cache.jcache.interceptor.KeyGenerator != null ? this . org.springframework.cache.jcache.interceptor.KeyGenerator : this . org.springframework.cache.jcache.interceptor.CacheKeyGenerator ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object ... java.lang.Object[] ) { JCacheOperation < ? > org.springframework.cache.jcache.interceptor.JCacheOperation<?> = this . org.springframework.cache.jcache.interceptor.JCacheOperationSource . getCacheOperation ( java.lang.reflect.Method , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; if ( ! ( AbstractJCacheKeyOperation .class . boolean ( org.springframework.cache.jcache.interceptor.JCacheOperation<> ) ) ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.cache.jcache.interceptor.JCacheOperation<> ) ; } CacheKeyInvocationContext < ? > org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<?> = org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<?> ( java.lang.Object , org.springframework.cache.jcache.interceptor.JCacheOperation<> , java.lang.Object[] ) ; if ( this . org.springframework.cache.jcache.interceptor.CacheKeyGenerator != null ) { return this . org.springframework.cache.jcache.interceptor.CacheKeyGenerator . generateCacheKey ( org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> ) ; } else { return java.lang.Object ( this . org.springframework.cache.jcache.interceptor.KeyGenerator , org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static java.lang.Object java.lang.Object ( KeyGenerator org.springframework.cache.jcache.interceptor.KeyGenerator , CacheKeyInvocationContext < ? > org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<?> ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; for ( CacheInvocationParameter org.springframework.cache.jcache.interceptor.CacheInvocationParameter : org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> . getKeyParameters ( ) ) { java.lang.Object java.lang.Object = org.springframework.cache.jcache.interceptor.CacheInvocationParameter . getValue ( ) ; if ( org.springframework.cache.jcache.interceptor.CacheInvocationParameter . getParameterPosition ( ) == org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> . getAllParameters ( ) . length - NUMBER && org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> . getMethod ( ) . isVarArgs ( ) ) { java.util.List<java.lang.Object> . boolean ( ( java.util.List<java.lang.Object> < java.lang.Object > ) CollectionUtils . arrayToList ( java.lang.Object ) ) ; } else { java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } } return org.springframework.cache.jcache.interceptor.KeyGenerator . generate ( org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> . getTarget ( ) , org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<> . getMethod ( ) , java.util.List<java.lang.Object> . java.lang.Object[] ( new java.lang.Object [ java.util.List<java.lang.Object> . int ( ) ] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<?> < ? > org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<?> ( java.lang.Object java.lang.Object , JCacheOperation < ? > org.springframework.cache.jcache.interceptor.JCacheOperation<?> , java.lang.Object [] java.lang.Object[] ) { AbstractJCacheKeyOperation < java.lang.annotation.Annotation > org.springframework.cache.jcache.interceptor.AbstractJCacheKeyOperation<java.lang.annotation.Annotation> = ( AbstractJCacheKeyOperation < java.lang.annotation.Annotation > ) org.springframework.cache.jcache.interceptor.JCacheOperation<> ; return new DefaultCacheKeyInvocationContext <> ( org.springframework.cache.jcache.interceptor.AbstractJCacheKeyOperation<java.lang.annotation.Annotation> , java.lang.Object , java.lang.Object[] ) ; }  <METHOD_END>