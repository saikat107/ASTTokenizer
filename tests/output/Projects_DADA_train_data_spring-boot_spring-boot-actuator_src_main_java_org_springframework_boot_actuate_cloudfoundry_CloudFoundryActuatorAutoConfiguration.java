<METHOD_START> @ Bean public org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping ( MvcEndpoints org.springframework.boot.actuate.cloudfoundry.MvcEndpoints , RestTemplateBuilder org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , Environment org.springframework.boot.actuate.cloudfoundry.Environment ) { java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> < NamedMvcEndpoint > java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> = new java.util.LinkedHashSet <> ( org.springframework.boot.actuate.cloudfoundry.MvcEndpoints . getEndpoints ( NamedMvcEndpoint .class ) ) ; HandlerInterceptor org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor = org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor ( org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , org.springframework.boot.actuate.cloudfoundry.Environment ) ; CorsConfiguration org.springframework.boot.actuate.cloudfoundry.CorsConfiguration = org.springframework.boot.actuate.cloudfoundry.CorsConfiguration ( ) ; CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping = new CloudFoundryEndpointHandlerMapping ( java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> , org.springframework.boot.actuate.cloudfoundry.CorsConfiguration , org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . setPrefix ( STRING ) ; return org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor ( RestTemplateBuilder org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , Environment org.springframework.boot.actuate.cloudfoundry.Environment ) { CloudFoundrySecurityService org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService = org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService ( org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , org.springframework.boot.actuate.cloudfoundry.Environment ) ; TokenValidator org.springframework.boot.actuate.cloudfoundry.TokenValidator = new TokenValidator ( org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService ) ; HandlerInterceptor org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor = new CloudFoundrySecurityInterceptor ( org.springframework.boot.actuate.cloudfoundry.TokenValidator , org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService , org.springframework.boot.actuate.cloudfoundry.Environment . getProperty ( STRING ) ) ; return org.springframework.boot.actuate.cloudfoundry.HandlerInterceptor ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService org.springframework.boot.actuate.cloudfoundry.CloudFoundrySecurityService ( RestTemplateBuilder org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , Environment org.springframework.boot.actuate.cloudfoundry.Environment ) { RelaxedPropertyResolver org.springframework.boot.actuate.cloudfoundry.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.actuate.cloudfoundry.Environment , STRING ) ; java.lang.String java.lang.String = org.springframework.boot.actuate.cloudfoundry.Environment . getProperty ( STRING ) ; boolean boolean = org.springframework.boot.actuate.cloudfoundry.RelaxedPropertyResolver . getProperty ( STRING , java.lang.Boolean .class , false ) ; return java.lang.String == null ? null : new CloudFoundrySecurityService ( org.springframework.boot.actuate.cloudfoundry.RestTemplateBuilder , java.lang.String , boolean ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.cloudfoundry.CorsConfiguration org.springframework.boot.actuate.cloudfoundry.CorsConfiguration ( ) { CorsConfiguration org.springframework.boot.actuate.cloudfoundry.CorsConfiguration = new CorsConfiguration ( ) ; org.springframework.boot.actuate.cloudfoundry.CorsConfiguration . addAllowedOrigin ( CorsConfiguration . ALL ) ; org.springframework.boot.actuate.cloudfoundry.CorsConfiguration . setAllowedMethods ( java.util.Arrays . java.util.List ( HttpMethod . GET . name ( ) , HttpMethod . POST . name ( ) ) ) ; org.springframework.boot.actuate.cloudfoundry.CorsConfiguration . setAllowedHeaders ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; return org.springframework.boot.actuate.cloudfoundry.CorsConfiguration ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.cloudfoundry.IgnoredRequestCustomizer org.springframework.boot.actuate.cloudfoundry.IgnoredRequestCustomizer ( ) { return new org.springframework.boot.actuate.cloudfoundry.CloudFoundryActuatorAutoConfiguration.CloudFoundryIgnoredRequestConfiguration.CloudFoundryIgnoredRequestCustomizer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSecurity . WebSecurity WebSecurity.IgnoredRequestConfigurer ) { WebSecurity.IgnoredRequestConfigurer . requestMatchers ( new AntPathRequestMatcher ( STRING ) ) ; }  <METHOD_END>