<METHOD_START> @ Bean public org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean ( Cache org.springframework.data.gemfire.config.annotation.Cache ) { CacheServerFactoryBean org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean = new CacheServerFactoryBean ( ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setCache ( org.springframework.data.gemfire.config.annotation.Cache ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setAutoStartup ( boolean ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setBindAddress ( java.lang.String ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setHostNameForClients ( java.lang.String ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setListeners ( java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setLoadPollInterval ( java.lang.Long ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setMaxConnections ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setMaxMessageCount ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setMaxThreads ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setMaxTimeBetweenPings ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setMessageTimeToLive ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setPort ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setServerLoadProbe ( org.springframework.data.gemfire.config.annotation.ServerLoadProbe ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setSocketBufferSize ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setSubscriptionCapacity ( java.lang.Integer ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setSubscriptionDiskStore ( java.lang.String ( ) ) ; org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean . setSubscriptionEvictionPolicy ( org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy ( ) ) ; return org.springframework.data.gemfire.config.annotation.CacheServerFactoryBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( AnnotationMetadata org.springframework.data.gemfire.config.annotation.AnnotationMetadata ) { super. configureCache ( org.springframework.data.gemfire.config.annotation.AnnotationMetadata ) ; if ( isCacheServerApplication ( org.springframework.data.gemfire.config.annotation.AnnotationMetadata ) ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.data.gemfire.config.annotation.AnnotationMetadata . getAnnotationAttributes ( getAnnotationTypeName ( ) ) ; void ( java.lang.Boolean . java.lang.Boolean . boolean ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ) ; void ( ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Long ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; void ( ( SubscriptionEvictionPolicy ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class java.lang.Class ( ) { return CacheServerApplication .class ; }  <METHOD_END>
<METHOD_START> void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return SpringUtils . defaultIfNull ( this . java.lang.String , CacheServer . DEFAULT_BIND_ADDRESS ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return SpringUtils . defaultIfNull ( this . java.lang.String , CacheServer . DEFAULT_HOSTNAME_FOR_CLIENTS ) ; }  <METHOD_END>
<METHOD_START> void void ( java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> < InterestRegistrationListener > java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> ) { this . java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> = java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> ; }  <METHOD_END>
<METHOD_START> protected java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> < InterestRegistrationListener > java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> ( ) { return CollectionUtils . nullSafeSet ( this . java.util.Set<org.springframework.data.gemfire.config.annotation.InterestRegistrationListener> ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> protected java.lang.Long java.lang.Long ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Long , CacheServer . DEFAULT_LOAD_POLL_INTERVAL ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_MAX_CONNECTIONS ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_MAXIMUM_MESSAGE_COUNT ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_MAX_THREADS ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_MAXIMUM_TIME_BETWEEN_PINGS ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_MESSAGE_TIME_TO_LIVE ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_PORT ) ; }  <METHOD_END>
<METHOD_START> void void ( ServerLoadProbe org.springframework.data.gemfire.config.annotation.ServerLoadProbe ) { this . org.springframework.data.gemfire.config.annotation.ServerLoadProbe = org.springframework.data.gemfire.config.annotation.ServerLoadProbe ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.config.annotation.ServerLoadProbe org.springframework.data.gemfire.config.annotation.ServerLoadProbe ( ) { return SpringUtils . defaultIfNull ( this . org.springframework.data.gemfire.config.annotation.ServerLoadProbe , CacheServer . DEFAULT_LOAD_PROBE ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , CacheServer . DEFAULT_SOCKET_BUFFER_SIZE ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return SpringUtils . defaultIfNull ( this . java.lang.Integer , ClientSubscriptionConfig . DEFAULT_CAPACITY ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> void void ( SubscriptionEvictionPolicy org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy ) { this . org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy = org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy ( ) { return SpringUtils . defaultIfNull ( this . org.springframework.data.gemfire.config.annotation.SubscriptionEvictionPolicy , SubscriptionEvictionPolicy . DEFAULT ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>