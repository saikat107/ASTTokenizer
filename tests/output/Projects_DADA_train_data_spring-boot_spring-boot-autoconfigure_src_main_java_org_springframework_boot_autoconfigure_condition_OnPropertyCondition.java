<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> < AnnotationAttributes > java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> = java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> ( org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata . getAllAnnotationAttributes ( ConditionalOnProperty .class . java.lang.String ( ) ) ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> < ConditionMessage > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionMessage> <> ( ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> < ConditionMessage > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionMessage> <> ( ) ; for ( AnnotationAttributes org.springframework.boot.autoconfigure.condition.AnnotationAttributes : java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> ) { ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome = org.springframework.boot.autoconfigure.condition.ConditionOutcome ( org.springframework.boot.autoconfigure.condition.AnnotationAttributes , org.springframework.boot.autoconfigure.condition.ConditionContext . getEnvironment ( ) ) ; ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . isMatch ( ) ? java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> : java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> ) . add ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . getConditionMessage ( ) ) ; } if ( ! java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> . isEmpty ( ) ) { return ConditionOutcome . noMatch ( ConditionMessage . of ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> ) ) ; } return ConditionOutcome . match ( ConditionMessage . of ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionMessage> ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> < AnnotationAttributes > java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> ( MultiValueMap < java.lang.String , java.lang.Object > org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> ) { java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> = new java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>> <> ( ) ; for ( java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> < java.lang.String , java.util.List<java.lang.Object> < java.lang.Object > > java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> : org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> . entrySet ( ) ) { for ( int int = NUMBER ; int < java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> . java.util.List<java.lang.Object> ( ) . int ( ) ; int ++ ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ; if ( int < java.util.List<java.util.Map<java.lang.String,java.lang.Object>> . int ( ) ) { java.util.Map<java.lang.String,java.lang.Object> = java.util.List<java.util.Map<java.lang.String,java.lang.Object>> . java.util.Map<java.lang.String,java.lang.Object> ( int ) ; } else { java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.List<java.util.Map<java.lang.String,java.lang.Object>> . boolean ( java.util.Map<java.lang.String,java.lang.Object> ) ; } java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> . java.util.List<java.lang.Object> ( ) . java.lang.Object ( int ) ) ; } } java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> < AnnotationAttributes > java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> <> ( java.util.List<java.util.Map<java.lang.String,java.lang.Object>> . int ( ) ) ; for ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> : java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ) { java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> . add ( AnnotationAttributes . fromMap ( java.util.Map<java.lang.String,java.lang.Object> ) ) ; } return java.util.List<org.springframework.boot.autoconfigure.condition.AnnotationAttributes> ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( AnnotationAttributes org.springframework.boot.autoconfigure.condition.AnnotationAttributes , PropertyResolver org.springframework.boot.autoconfigure.condition.PropertyResolver ) { org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec = new org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec ( org.springframework.boot.autoconfigure.condition.AnnotationAttributes ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec . void ( org.springframework.boot.autoconfigure.condition.PropertyResolver , java.util.List<java.lang.String> , java.util.List<java.lang.String> ) ; if ( ! java.util.List<java.lang.String> . boolean ( ) ) { return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnProperty .class , org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec ) . didNotFind ( STRING , STRING ) . items ( Style . QUOTE , java.util.List<java.lang.String> ) ) ; } if ( ! java.util.List<java.lang.String> . boolean ( ) ) { return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnProperty .class , org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec ) . found ( STRING , STRING ) . items ( Style . QUOTE , java.util.List<java.lang.String> ) ) ; } return ConditionOutcome . match ( ConditionMessage . forCondition ( ConditionalOnProperty .class , org.springframework.boot.autoconfigure.condition.OnPropertyCondition.Spec ) . because ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> void ( AnnotationAttributes org.springframework.boot.autoconfigure.condition.AnnotationAttributes ) { java.lang.String java.lang.String = org.springframework.boot.autoconfigure.condition.AnnotationAttributes . getString ( STRING ) . trim ( ) ; if ( StringUtils . hasText ( java.lang.String ) && ! java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } this . java.lang.String = java.lang.String ; this . java.lang.String = org.springframework.boot.autoconfigure.condition.AnnotationAttributes . getString ( STRING ) ; this . java.lang.String[] = java.lang.String[] ( org.springframework.boot.autoconfigure.condition.AnnotationAttributes ) ; this . boolean = org.springframework.boot.autoconfigure.condition.AnnotationAttributes . getBoolean ( STRING ) ; this . boolean = org.springframework.boot.autoconfigure.condition.AnnotationAttributes . getBoolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.lang.String [] java.lang.String[] = ( java.lang.String [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; Assert . state ( java.lang.String[] . int > NUMBER || java.lang.String[] . int > NUMBER , STRING ) ; Assert . state ( java.lang.String[] . int == NUMBER || java.lang.String[] . int == NUMBER , STRING ) ; return ( java.lang.String[] . int > NUMBER ? java.lang.String[] : java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( PropertyResolver org.springframework.boot.autoconfigure.condition.PropertyResolver , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { if ( this . boolean ) { org.springframework.boot.autoconfigure.condition.PropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.autoconfigure.condition.PropertyResolver , this . java.lang.String ) ; } for ( java.lang.String java.lang.String : this . java.lang.String[] ) { java.lang.String java.lang.String = ( this . boolean ? java.lang.String : this . java.lang.String + java.lang.String ) ; if ( org.springframework.boot.autoconfigure.condition.PropertyResolver . containsProperty ( java.lang.String ) ) { if ( ! boolean ( org.springframework.boot.autoconfigure.condition.PropertyResolver . getProperty ( java.lang.String ) , this . java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } else { if ( ! this . boolean ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( StringUtils . hasLength ( java.lang.String ) ) { return java.lang.String . boolean ( java.lang.String ) ; } return ! STRING . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( this . java.lang.String ) ; if ( this . java.lang.String[] . int == NUMBER ) { java.lang.StringBuilder . java.lang.StringBuilder ( this . java.lang.String[] [ NUMBER ] ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( StringUtils . arrayToCommaDelimitedString ( this . java.lang.String[] ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } if ( StringUtils . hasLength ( this . java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . java.lang.String ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>