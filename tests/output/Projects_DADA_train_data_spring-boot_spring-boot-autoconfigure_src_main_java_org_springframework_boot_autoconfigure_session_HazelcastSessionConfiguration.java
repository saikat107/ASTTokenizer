<METHOD_START> @ Autowired public void void ( SessionProperties org.springframework.boot.autoconfigure.session.SessionProperties ) { java.lang.Integer java.lang.Integer = org.springframework.boot.autoconfigure.session.SessionProperties . getTimeout ( ) ; if ( java.lang.Integer != null ) { setMaxInactiveIntervalInSeconds ( java.lang.Integer ) ; } SessionProperties . SessionProperties SessionProperties.Hazelcast = org.springframework.boot.autoconfigure.session.SessionProperties . getHazelcast ( ) ; setSessionMapName ( SessionProperties.Hazelcast . getMapName ( ) ) ; setHazelcastFlushMode ( SessionProperties.Hazelcast . getFlushMode ( ) ) ; }  <METHOD_END>