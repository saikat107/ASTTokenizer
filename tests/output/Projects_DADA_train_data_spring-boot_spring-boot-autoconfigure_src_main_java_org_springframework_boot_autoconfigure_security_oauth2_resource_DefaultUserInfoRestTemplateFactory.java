<METHOD_START> public void ( ObjectProvider < java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer> < UserInfoRestTemplateCustomizer > > org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer>> , ObjectProvider < OAuth2ProtectedResourceDetails > org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails> , ObjectProvider < OAuth2ClientContext > org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ClientContext> ) { this . java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer> = org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer>> . getIfAvailable ( ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails = org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails> . getIfAvailable ( ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ClientContext = org.springframework.boot.autoconfigure.security.oauth2.resource.ObjectProvider<org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ClientContext> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate ( ) { if ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate == null ) { this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate = org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails == null ? org.springframework.boot.autoconfigure.security.oauth2.resource.AuthorizationCodeResourceDetails : this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate . getInterceptors ( ) . add ( new AcceptJsonRequestInterceptor ( ) ) ; AuthorizationCodeAccessTokenProvider org.springframework.boot.autoconfigure.security.oauth2.resource.AuthorizationCodeAccessTokenProvider = new AuthorizationCodeAccessTokenProvider ( ) ; org.springframework.boot.autoconfigure.security.oauth2.resource.AuthorizationCodeAccessTokenProvider . setTokenRequestEnhancer ( new AcceptJsonRequestEnhancer ( ) ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate . setAccessTokenProvider ( org.springframework.boot.autoconfigure.security.oauth2.resource.AuthorizationCodeAccessTokenProvider ) ; if ( ! CollectionUtils . isEmpty ( this . java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer> ) ) { AnnotationAwareOrderComparator . sort ( this . java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer> ) ; for ( UserInfoRestTemplateCustomizer org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer : this . java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer> ) { org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer . customize ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate ) ; } } } return this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestTemplate ( OAuth2ProtectedResourceDetails org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails ) { if ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ClientContext == null ) { return new OAuth2RestTemplate ( org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails ) ; } return new OAuth2RestTemplate ( org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ProtectedResourceDetails , this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ClientContext ) ; }  <METHOD_END>