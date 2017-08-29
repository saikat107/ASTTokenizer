<METHOD_START> @ Bean ( name = CacheManagementConfigUtils . JCACHE_ADVISOR_BEAN_NAME ) @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor ( ) { BeanFactoryJCacheOperationSourceAdvisor org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor = new BeanFactoryJCacheOperationSourceAdvisor ( ) ; org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor . setCacheOperationSource ( cacheOperationSource ( ) ) ; org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor . setAdvice ( org.springframework.cache.jcache.config.JCacheInterceptor ( ) ) ; org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor . setOrder ( this . enableCaching .< java.lang.Integer > getNumber ( STRING ) ) ; return org.springframework.cache.jcache.config.BeanFactoryJCacheOperationSourceAdvisor ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.cache.jcache.config.JCacheInterceptor org.springframework.cache.jcache.config.JCacheInterceptor ( ) { JCacheInterceptor org.springframework.cache.jcache.config.JCacheInterceptor = new JCacheInterceptor ( ) ; org.springframework.cache.jcache.config.JCacheInterceptor . setCacheOperationSource ( cacheOperationSource ( ) ) ; if ( this . errorHandler != null ) { org.springframework.cache.jcache.config.JCacheInterceptor . setErrorHandler ( this . errorHandler ) ; } return org.springframework.cache.jcache.config.JCacheInterceptor ; }  <METHOD_END>