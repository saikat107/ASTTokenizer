<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata . getAnnotationAttributes ( ConditionalOnJava .class . java.lang.String ( ) ) ; Range org.springframework.boot.autoconfigure.condition.Range = ( Range ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; JavaVersion org.springframework.boot.autoconfigure.condition.JavaVersion = ( JavaVersion ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; return org.springframework.boot.autoconfigure.condition.ConditionOutcome ( org.springframework.boot.autoconfigure.condition.Range , org.springframework.boot.autoconfigure.condition.JavaVersion , org.springframework.boot.autoconfigure.condition.JavaVersion ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( Range org.springframework.boot.autoconfigure.condition.Range , JavaVersion org.springframework.boot.autoconfigure.condition.JavaVersion , JavaVersion org.springframework.boot.autoconfigure.condition.JavaVersion ) { boolean boolean = org.springframework.boot.autoconfigure.condition.JavaVersion . isWithin ( org.springframework.boot.autoconfigure.condition.Range , org.springframework.boot.autoconfigure.condition.JavaVersion ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( org.springframework.boot.autoconfigure.condition.Range == Range . EQUAL_OR_NEWER ? STRING : STRING , org.springframework.boot.autoconfigure.condition.JavaVersion ) ; ConditionMessage org.springframework.boot.autoconfigure.condition.ConditionMessage = ConditionMessage . forCondition ( ConditionalOnJava .class , java.lang.String ) . foundExactly ( org.springframework.boot.autoconfigure.condition.JavaVersion ) ; return new ConditionOutcome ( boolean , org.springframework.boot.autoconfigure.condition.ConditionMessage ) ; }  <METHOD_END>