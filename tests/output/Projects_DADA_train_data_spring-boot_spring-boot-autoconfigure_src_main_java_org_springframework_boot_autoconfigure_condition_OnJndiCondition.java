<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { AnnotationAttributes org.springframework.boot.autoconfigure.condition.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata . getAnnotationAttributes ( ConditionalOnJndi .class . java.lang.String ( ) ) ) ; java.lang.String [] java.lang.String[] = org.springframework.boot.autoconfigure.condition.AnnotationAttributes . getStringArray ( STRING ) ; try { return org.springframework.boot.autoconfigure.condition.ConditionOutcome ( java.lang.String[] ) ; } catch ( java.lang.NoClassDefFoundError java.lang.NoClassDefFoundError ) { return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnJndi .class ) . because ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( java.lang.String [] java.lang.String[] ) { if ( ! boolean ( ) ) { return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnJndi .class ) . notAvailable ( STRING ) ) ; } if ( java.lang.String[] . int == NUMBER ) { return ConditionOutcome . match ( ConditionMessage . forCondition ( ConditionalOnJndi .class ) . available ( STRING ) ) ; } org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator = org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator ( java.lang.String[] ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator . java.lang.String ( ) ; java.lang.String java.lang.String = STRING + StringUtils . arrayToCommaDelimitedString ( java.lang.String[] ) + STRING ; if ( java.lang.String != null ) { return ConditionOutcome . match ( ConditionMessage . forCondition ( ConditionalOnJndi .class , java.lang.String ) . foundExactly ( STRING + java.lang.String + STRING ) ) ; } return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnJndi .class , java.lang.String ) . didNotFind ( STRING ) . atAll ( ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return JndiLocatorDelegate . isDefaultJndiEnvironmentAvailable ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator ( java.lang.String [] java.lang.String[] ) { return new org.springframework.boot.autoconfigure.condition.OnJndiCondition.JndiLocator ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String [] java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { try { lookup ( java.lang.String ) ; return java.lang.String ; } catch ( javax.naming.NamingException javax.naming.NamingException ) { } } return null ; }  <METHOD_END>