<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test @ Ignore public void void ( ) java.lang.Exception { PropertiesFactoryBean org.springframework.integration.twitter.inbound.PropertiesFactoryBean = new PropertiesFactoryBean ( ) ; org.springframework.integration.twitter.inbound.PropertiesFactoryBean . setLocation ( new ClassPathResource ( STRING ) ) ; org.springframework.integration.twitter.inbound.PropertiesFactoryBean . afterPropertiesSet ( ) ; java.util.Properties java.util.Properties = org.springframework.integration.twitter.inbound.PropertiesFactoryBean . getObject ( ) ; TwitterTemplate org.springframework.integration.twitter.inbound.TwitterTemplate = new TwitterTemplate ( java.util.Properties . java.lang.String ( STRING ) , java.util.Properties . java.lang.String ( STRING ) , java.util.Properties . java.lang.String ( STRING ) , java.util.Properties . java.lang.String ( STRING ) ) ; DirectMessageReceivingMessageSource org.springframework.integration.twitter.inbound.DirectMessageReceivingMessageSource = new DirectMessageReceivingMessageSource ( org.springframework.integration.twitter.inbound.TwitterTemplate , STRING ) ; org.springframework.integration.twitter.inbound.DirectMessageReceivingMessageSource . afterPropertiesSet ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < DirectMessage > org.springframework.integration.twitter.inbound.Message<org.springframework.integration.twitter.inbound.DirectMessage> = ( Message < DirectMessage > ) org.springframework.integration.twitter.inbound.DirectMessageReceivingMessageSource . receive ( ) ; if ( org.springframework.integration.twitter.inbound.Message<org.springframework.integration.twitter.inbound.DirectMessage> != null ) { DirectMessage org.springframework.integration.twitter.inbound.DirectMessage = org.springframework.integration.twitter.inbound.Message<org.springframework.integration.twitter.inbound.DirectMessage> . getPayload ( ) ; org.springframework.integration.twitter.inbound.Log . info ( org.springframework.integration.twitter.inbound.DirectMessage . getSender ( ) . getScreenName ( ) + STRING + org.springframework.integration.twitter.inbound.DirectMessage . getText ( ) + STRING + org.springframework.integration.twitter.inbound.DirectMessage . getCreatedAt ( ) ) ; } } }  <METHOD_END>