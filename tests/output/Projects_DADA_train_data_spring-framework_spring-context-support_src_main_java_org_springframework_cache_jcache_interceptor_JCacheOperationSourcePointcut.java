<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource = org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) ; return ( org.springframework.cache.jcache.interceptor.JCacheOperationSource != null && org.springframework.cache.jcache.interceptor.JCacheOperationSource . getCacheOperation ( java.lang.reflect.Method , java.lang.Class<> ) != null ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.cache.jcache.interceptor.JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource ( )  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut ) ) { return false ; } org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut = ( org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut ) java.lang.Object ; return ObjectUtils . nullSafeEquals ( org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) , org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut . org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut .class . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.cache.jcache.interceptor.JCacheOperationSourcePointcut> ( ) . java.lang.String ( ) + STRING + org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) ; }  <METHOD_END>