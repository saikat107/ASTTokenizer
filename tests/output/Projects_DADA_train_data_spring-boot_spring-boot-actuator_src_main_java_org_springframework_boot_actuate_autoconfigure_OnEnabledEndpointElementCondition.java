<METHOD_START> void ( java.lang.String java.lang.String , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { this . java.lang.String = java.lang.String ; this . java.lang.Class<? extends java.lang.annotation.Annotation> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.autoconfigure.ConditionOutcome org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( ConditionContext org.springframework.boot.actuate.autoconfigure.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.actuate.autoconfigure.AnnotatedTypeMetadata ) { AnnotationAttributes org.springframework.boot.actuate.autoconfigure.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.boot.actuate.autoconfigure.AnnotatedTypeMetadata . getAnnotationAttributes ( this . java.lang.Class<> . java.lang.String ( ) ) ) ; java.lang.String java.lang.String = org.springframework.boot.actuate.autoconfigure.AnnotationAttributes . getString ( STRING ) ; ConditionOutcome org.springframework.boot.actuate.autoconfigure.ConditionOutcome = org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( org.springframework.boot.actuate.autoconfigure.ConditionContext , java.lang.String ) ; if ( org.springframework.boot.actuate.autoconfigure.ConditionOutcome != null ) { return org.springframework.boot.actuate.autoconfigure.ConditionOutcome ; } return org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( org.springframework.boot.actuate.autoconfigure.ConditionContext ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.actuate.autoconfigure.ConditionOutcome org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( ConditionContext org.springframework.boot.actuate.autoconfigure.ConditionContext , java.lang.String java.lang.String ) { RelaxedPropertyResolver org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.actuate.autoconfigure.ConditionContext . getEnvironment ( ) , this . java.lang.String + java.lang.String + STRING ) ; if ( org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver . containsProperty ( STRING ) ) { boolean boolean = org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver . getProperty ( STRING , java.lang.Boolean .class , true ) ; return new ConditionOutcome ( boolean , ConditionMessage . forCondition ( this . java.lang.Class<> ) . because ( this . java.lang.String + java.lang.String + STRING + boolean ) ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.actuate.autoconfigure.ConditionOutcome org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( ConditionContext org.springframework.boot.actuate.autoconfigure.ConditionContext ) { RelaxedPropertyResolver org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.actuate.autoconfigure.ConditionContext . getEnvironment ( ) , this . java.lang.String + STRING ) ; boolean boolean = java.lang.Boolean . java.lang.Boolean ( org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver . getProperty ( STRING , STRING ) ) ; return new ConditionOutcome ( boolean , ConditionMessage . forCondition ( this . java.lang.Class<> ) . because ( this . java.lang.String + STRING + boolean ) ) ; }  <METHOD_END>