<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig = org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig ( java.lang.Class<> ) ; return java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( java.lang.reflect.Method java.lang.reflect.Method ) { org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig = org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ; return java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> = null ; java.util.Collection<org.springframework.cache.annotation.Cacheable> < Cacheable > java.util.Collection<org.springframework.cache.annotation.Cacheable> = AnnotatedElementUtils . getAllMergedAnnotations ( java.lang.reflect.AnnotatedElement , Cacheable .class ) ; if ( ! java.util.Collection<org.springframework.cache.annotation.Cacheable> . isEmpty ( ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( Cacheable org.springframework.cache.annotation.Cacheable : java.util.Collection<org.springframework.cache.annotation.Cacheable> ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheableOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.Cacheable ) ) ; } } java.util.Collection<org.springframework.cache.annotation.CacheEvict> < CacheEvict > java.util.Collection<org.springframework.cache.annotation.CacheEvict> = AnnotatedElementUtils . getAllMergedAnnotations ( java.lang.reflect.AnnotatedElement , CacheEvict .class ) ; if ( ! java.util.Collection<org.springframework.cache.annotation.CacheEvict> . isEmpty ( ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( CacheEvict org.springframework.cache.annotation.CacheEvict : java.util.Collection<org.springframework.cache.annotation.CacheEvict> ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheEvictOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.CacheEvict ) ) ; } } java.util.Collection<org.springframework.cache.annotation.CachePut> < CachePut > java.util.Collection<org.springframework.cache.annotation.CachePut> = AnnotatedElementUtils . getAllMergedAnnotations ( java.lang.reflect.AnnotatedElement , CachePut .class ) ; if ( ! java.util.Collection<org.springframework.cache.annotation.CachePut> . isEmpty ( ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( CachePut org.springframework.cache.annotation.CachePut : java.util.Collection<org.springframework.cache.annotation.CachePut> ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.CachePut ) ) ; } } java.util.Collection<org.springframework.cache.annotation.Caching> < Caching > java.util.Collection<org.springframework.cache.annotation.Caching> = AnnotatedElementUtils . getAllMergedAnnotations ( java.lang.reflect.AnnotatedElement , Caching .class ) ; if ( ! java.util.Collection<org.springframework.cache.annotation.Caching> . isEmpty ( ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( Caching org.springframework.cache.annotation.Caching : java.util.Collection<org.springframework.cache.annotation.Caching> ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.Caching ) ; if ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> != null ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . addAll ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; } } } return java.util.Collection<org.springframework.cache.annotation.CacheOperation> ; }  <METHOD_END>
<METHOD_START> private < T extends java.lang.annotation.Annotation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) { return ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> != null ? java.util.Collection<org.springframework.cache.annotation.CacheOperation> : new java.util.ArrayList<org.springframework.cache.annotation.CacheOperation> <> ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.cache.annotation.CacheableOperation org.springframework.cache.annotation.CacheableOperation ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , Cacheable org.springframework.cache.annotation.Cacheable ) { CacheableOperation . CacheableOperation CacheableOperation.Builder = new CacheableOperation . CacheableOperation ( ) ; CacheableOperation.Builder . setName ( java.lang.reflect.AnnotatedElement . java.lang.String ( ) ) ; CacheableOperation.Builder . setCacheNames ( org.springframework.cache.annotation.Cacheable . cacheNames ( ) ) ; CacheableOperation.Builder . setCondition ( org.springframework.cache.annotation.Cacheable . condition ( ) ) ; CacheableOperation.Builder . setUnless ( org.springframework.cache.annotation.Cacheable . unless ( ) ) ; CacheableOperation.Builder . setKey ( org.springframework.cache.annotation.Cacheable . key ( ) ) ; CacheableOperation.Builder . setKeyGenerator ( org.springframework.cache.annotation.Cacheable . keyGenerator ( ) ) ; CacheableOperation.Builder . setCacheManager ( org.springframework.cache.annotation.Cacheable . cacheManager ( ) ) ; CacheableOperation.Builder . setCacheResolver ( org.springframework.cache.annotation.Cacheable . cacheResolver ( ) ) ; CacheableOperation.Builder . setSync ( org.springframework.cache.annotation.Cacheable . sync ( ) ) ; org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig . void ( CacheableOperation.Builder ) ; CacheableOperation org.springframework.cache.annotation.CacheableOperation = CacheableOperation.Builder . build ( ) ; void ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.CacheableOperation ) ; return org.springframework.cache.annotation.CacheableOperation ; }  <METHOD_END>
<METHOD_START> org.springframework.cache.annotation.CacheEvictOperation org.springframework.cache.annotation.CacheEvictOperation ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , CacheEvict org.springframework.cache.annotation.CacheEvict ) { CacheEvictOperation . CacheEvictOperation CacheEvictOperation.Builder = new CacheEvictOperation . CacheEvictOperation ( ) ; CacheEvictOperation.Builder . setName ( java.lang.reflect.AnnotatedElement . java.lang.String ( ) ) ; CacheEvictOperation.Builder . setCacheNames ( org.springframework.cache.annotation.CacheEvict . cacheNames ( ) ) ; CacheEvictOperation.Builder . setCondition ( org.springframework.cache.annotation.CacheEvict . condition ( ) ) ; CacheEvictOperation.Builder . setKey ( org.springframework.cache.annotation.CacheEvict . key ( ) ) ; CacheEvictOperation.Builder . setKeyGenerator ( org.springframework.cache.annotation.CacheEvict . keyGenerator ( ) ) ; CacheEvictOperation.Builder . setCacheManager ( org.springframework.cache.annotation.CacheEvict . cacheManager ( ) ) ; CacheEvictOperation.Builder . setCacheResolver ( org.springframework.cache.annotation.CacheEvict . cacheResolver ( ) ) ; CacheEvictOperation.Builder . setCacheWide ( org.springframework.cache.annotation.CacheEvict . allEntries ( ) ) ; CacheEvictOperation.Builder . setBeforeInvocation ( org.springframework.cache.annotation.CacheEvict . beforeInvocation ( ) ) ; org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig . void ( CacheEvictOperation.Builder ) ; CacheEvictOperation org.springframework.cache.annotation.CacheEvictOperation = CacheEvictOperation.Builder . build ( ) ; void ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.CacheEvictOperation ) ; return org.springframework.cache.annotation.CacheEvictOperation ; }  <METHOD_END>
<METHOD_START> org.springframework.cache.annotation.CacheOperation org.springframework.cache.annotation.CacheOperation ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , CachePut org.springframework.cache.annotation.CachePut ) { CachePutOperation . CachePutOperation CachePutOperation.Builder = new CachePutOperation . CachePutOperation ( ) ; CachePutOperation.Builder . setName ( java.lang.reflect.AnnotatedElement . java.lang.String ( ) ) ; CachePutOperation.Builder . setCacheNames ( org.springframework.cache.annotation.CachePut . cacheNames ( ) ) ; CachePutOperation.Builder . setCondition ( org.springframework.cache.annotation.CachePut . condition ( ) ) ; CachePutOperation.Builder . setUnless ( org.springframework.cache.annotation.CachePut . unless ( ) ) ; CachePutOperation.Builder . setKey ( org.springframework.cache.annotation.CachePut . key ( ) ) ; CachePutOperation.Builder . setKeyGenerator ( org.springframework.cache.annotation.CachePut . keyGenerator ( ) ) ; CachePutOperation.Builder . setCacheManager ( org.springframework.cache.annotation.CachePut . cacheManager ( ) ) ; CachePutOperation.Builder . setCacheResolver ( org.springframework.cache.annotation.CachePut . cacheResolver ( ) ) ; org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig . void ( CachePutOperation.Builder ) ; CachePutOperation org.springframework.cache.annotation.CachePutOperation = CachePutOperation.Builder . build ( ) ; void ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.CachePutOperation ) ; return org.springframework.cache.annotation.CachePutOperation ; }  <METHOD_END>
<METHOD_START> java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , Caching org.springframework.cache.annotation.Caching ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> < CacheOperation > java.util.Collection<org.springframework.cache.annotation.CacheOperation> = null ; Cacheable [] org.springframework.cache.annotation.Cacheable[] = org.springframework.cache.annotation.Caching . cacheable ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.cache.annotation.Cacheable[] ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( Cacheable org.springframework.cache.annotation.Cacheable : org.springframework.cache.annotation.Cacheable[] ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheableOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.Cacheable ) ) ; } } CacheEvict [] org.springframework.cache.annotation.CacheEvict[] = org.springframework.cache.annotation.Caching . evict ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.cache.annotation.CacheEvict[] ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( CacheEvict org.springframework.cache.annotation.CacheEvict : org.springframework.cache.annotation.CacheEvict[] ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheEvictOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.CacheEvict ) ) ; } } CachePut [] org.springframework.cache.annotation.CachePut[] = org.springframework.cache.annotation.Caching . put ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.cache.annotation.CachePut[] ) ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> = java.util.Collection ( java.util.Collection<org.springframework.cache.annotation.CacheOperation> ) ; for ( CachePut org.springframework.cache.annotation.CachePut : org.springframework.cache.annotation.CachePut[] ) { java.util.Collection<org.springframework.cache.annotation.CacheOperation> . add ( org.springframework.cache.annotation.CacheOperation ( java.lang.reflect.AnnotatedElement , org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig , org.springframework.cache.annotation.CachePut ) ) ; } } return java.util.Collection<org.springframework.cache.annotation.CacheOperation> ; }  <METHOD_END>
<METHOD_START> org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig ( java.lang.Class<?> < ? > java.lang.Class<?> ) { CacheConfig org.springframework.cache.annotation.CacheConfig = AnnotatedElementUtils . getMergedAnnotation ( java.lang.Class<> , CacheConfig .class ) ; if ( org.springframework.cache.annotation.CacheConfig != null ) { return new org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig ( org.springframework.cache.annotation.CacheConfig . cacheNames ( ) , org.springframework.cache.annotation.CacheConfig . keyGenerator ( ) , org.springframework.cache.annotation.CacheConfig . cacheManager ( ) , org.springframework.cache.annotation.CacheConfig . cacheResolver ( ) ) ; } return new org.springframework.cache.annotation.SpringCacheAnnotationParser.DefaultCacheConfig ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , CacheOperation org.springframework.cache.annotation.CacheOperation ) { if ( StringUtils . hasText ( org.springframework.cache.annotation.CacheOperation . getKey ( ) ) && StringUtils . hasText ( org.springframework.cache.annotation.CacheOperation . getKeyGenerator ( ) ) ) { throw new java.lang.IllegalStateException ( STRING + java.lang.reflect.AnnotatedElement . java.lang.String ( ) + STRING + STRING + STRING ) ; } if ( StringUtils . hasText ( org.springframework.cache.annotation.CacheOperation . getCacheManager ( ) ) && StringUtils . hasText ( org.springframework.cache.annotation.CacheOperation . getCacheResolver ( ) ) ) { throw new java.lang.IllegalStateException ( STRING + java.lang.reflect.AnnotatedElement . java.lang.String ( ) + STRING + STRING + STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( this == java.lang.Object || java.lang.Object instanceof org.springframework.cache.annotation.SpringCacheAnnotationParser ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.cache.annotation.SpringCacheAnnotationParser .class . int ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { this( null , null , null , null ); }  <METHOD_END>
<METHOD_START> private void ( java.lang.String [] java.lang.String[] , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String[] = java.lang.String[] ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( CacheOperation . CacheOperation CacheOperation.Builder ) { if ( CacheOperation.Builder . getCacheNames ( ) . isEmpty ( ) && this . java.lang.String[] != null ) { CacheOperation.Builder . setCacheNames ( this . java.lang.String[] ) ; } if ( ! StringUtils . hasText ( CacheOperation.Builder . getKey ( ) ) && ! StringUtils . hasText ( CacheOperation.Builder . getKeyGenerator ( ) ) && StringUtils . hasText ( this . java.lang.String ) ) { CacheOperation.Builder . setKeyGenerator ( this . java.lang.String ) ; } if ( StringUtils . hasText ( CacheOperation.Builder . getCacheManager ( ) ) || StringUtils . hasText ( CacheOperation.Builder . getCacheResolver ( ) ) ) { } else if ( StringUtils . hasText ( this . java.lang.String ) ) { CacheOperation.Builder . setCacheResolver ( this . java.lang.String ) ; } else if ( StringUtils . hasText ( this . java.lang.String ) ) { CacheOperation.Builder . setCacheManager ( this . java.lang.String ) ; } }  <METHOD_END>