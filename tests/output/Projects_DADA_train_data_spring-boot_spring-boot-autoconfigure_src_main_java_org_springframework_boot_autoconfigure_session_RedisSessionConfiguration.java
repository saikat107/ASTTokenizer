<METHOD_START> @ Autowired public void void ( SessionProperties org.springframework.boot.autoconfigure.session.SessionProperties ) { this . org.springframework.boot.autoconfigure.session.SessionProperties = org.springframework.boot.autoconfigure.session.SessionProperties ; java.lang.Integer java.lang.Integer = this . org.springframework.boot.autoconfigure.session.SessionProperties . getTimeout ( ) ; if ( java.lang.Integer != null ) { setMaxInactiveIntervalInSeconds ( java.lang.Integer ) ; } SessionProperties . SessionProperties SessionProperties.Redis = this . org.springframework.boot.autoconfigure.session.SessionProperties . getRedis ( ) ; setRedisNamespace ( SessionProperties.Redis . getNamespace ( ) ) ; setRedisFlushMode ( SessionProperties.Redis . getFlushMode ( ) ) ; }  <METHOD_END>