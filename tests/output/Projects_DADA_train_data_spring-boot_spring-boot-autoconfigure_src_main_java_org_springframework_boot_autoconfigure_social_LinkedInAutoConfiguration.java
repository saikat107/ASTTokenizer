<METHOD_START> protected void ( LinkedInProperties org.springframework.boot.autoconfigure.social.LinkedInProperties ) { this . org.springframework.boot.autoconfigure.social.LinkedInProperties = org.springframework.boot.autoconfigure.social.LinkedInProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean ( LinkedIn .class ) @ Scope ( value = STRING , proxyMode = ScopedProxyMode . INTERFACES ) public org.springframework.boot.autoconfigure.social.LinkedIn org.springframework.boot.autoconfigure.social.LinkedIn ( ConnectionRepository org.springframework.boot.autoconfigure.social.ConnectionRepository ) { Connection < LinkedIn > org.springframework.boot.autoconfigure.social.Connection<org.springframework.boot.autoconfigure.social.LinkedIn> = org.springframework.boot.autoconfigure.social.ConnectionRepository . findPrimaryConnection ( LinkedIn .class ) ; return org.springframework.boot.autoconfigure.social.Connection<org.springframework.boot.autoconfigure.social.LinkedIn> != null ? org.springframework.boot.autoconfigure.social.Connection<org.springframework.boot.autoconfigure.social.LinkedIn> . getApi ( ) : null ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = { STRING , STRING } ) @ ConditionalOnProperty ( prefix = STRING , name = STRING ) public org.springframework.boot.autoconfigure.social.GenericConnectionStatusView org.springframework.boot.autoconfigure.social.GenericConnectionStatusView ( ) { return new GenericConnectionStatusView ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.autoconfigure.social.ConnectionFactory<?> < ? > org.springframework.boot.autoconfigure.social.ConnectionFactory<?> ( ) { return new LinkedInConnectionFactory ( this . org.springframework.boot.autoconfigure.social.LinkedInProperties . getAppId ( ) , this . org.springframework.boot.autoconfigure.social.LinkedInProperties . getAppSecret ( ) ) ; }  <METHOD_END>