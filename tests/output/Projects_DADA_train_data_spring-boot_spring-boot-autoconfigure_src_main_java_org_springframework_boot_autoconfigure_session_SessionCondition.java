<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.session.ConditionOutcome org.springframework.boot.autoconfigure.session.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.session.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.session.AnnotatedTypeMetadata ) { ConditionMessage . ConditionMessage ConditionMessage.Builder = ConditionMessage . forCondition ( STRING ) ; RelaxedPropertyResolver org.springframework.boot.autoconfigure.session.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.autoconfigure.session.ConditionContext . getEnvironment ( ) , STRING ) ; StoreType org.springframework.boot.autoconfigure.session.StoreType = SessionStoreMappings . getType ( ( ( AnnotationMetadata ) org.springframework.boot.autoconfigure.session.AnnotatedTypeMetadata ) . getClassName ( ) ) ; if ( ! org.springframework.boot.autoconfigure.session.RelaxedPropertyResolver . containsProperty ( STRING ) ) { return ConditionOutcome . noMatch ( ConditionMessage.Builder . didNotFind ( STRING ) . atAll ( ) ) ; } java.lang.String java.lang.String = org.springframework.boot.autoconfigure.session.RelaxedPropertyResolver . getProperty ( STRING ) . replace ( '-' , '_' ) . toUpperCase ( ) ; if ( java.lang.String . boolean ( org.springframework.boot.autoconfigure.session.StoreType . name ( ) ) ) { return ConditionOutcome . match ( ConditionMessage.Builder . found ( STRING ) . items ( org.springframework.boot.autoconfigure.session.StoreType ) ) ; } return ConditionOutcome . noMatch ( ConditionMessage.Builder . found ( STRING ) . items ( java.lang.String ) ) ; }  <METHOD_END>