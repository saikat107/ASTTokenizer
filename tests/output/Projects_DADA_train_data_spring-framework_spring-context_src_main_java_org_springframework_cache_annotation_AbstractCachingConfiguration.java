<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.cache.annotation.AnnotationMetadata ) { this . org.springframework.cache.annotation.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.cache.annotation.AnnotationMetadata . getAnnotationAttributes ( EnableCaching .class . java.lang.String ( ) , false ) ) ; if ( this . org.springframework.cache.annotation.AnnotationAttributes == null ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.cache.annotation.AnnotationMetadata . getClassName ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Autowired ( required = false ) void void ( java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> < CachingConfigurer > java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> ) { if ( CollectionUtils . isEmpty ( java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> ) ) { return; } if ( java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> . size ( ) > NUMBER ) { throw new java.lang.IllegalStateException ( java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> . size ( ) + STRING + STRING + STRING + STRING ) ; } CachingConfigurer org.springframework.cache.annotation.CachingConfigurer = java.util.Collection<org.springframework.cache.annotation.CachingConfigurer> . iterator ( ) . next ( ) ; void ( org.springframework.cache.annotation.CachingConfigurer ) ; }  <METHOD_END>
<METHOD_START> protected void void ( CachingConfigurer org.springframework.cache.annotation.CachingConfigurer ) { this . org.springframework.cache.annotation.CacheManager = org.springframework.cache.annotation.CachingConfigurer . cacheManager ( ) ; this . org.springframework.cache.annotation.CacheResolver = org.springframework.cache.annotation.CachingConfigurer . cacheResolver ( ) ; this . org.springframework.cache.annotation.KeyGenerator = org.springframework.cache.annotation.CachingConfigurer . keyGenerator ( ) ; this . org.springframework.cache.annotation.CacheErrorHandler = org.springframework.cache.annotation.CachingConfigurer . errorHandler ( ) ; }  <METHOD_END>