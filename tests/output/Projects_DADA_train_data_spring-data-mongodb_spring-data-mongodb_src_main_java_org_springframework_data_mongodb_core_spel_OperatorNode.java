<METHOD_START> void ( Operator org.springframework.data.mongodb.core.spel.Operator , ExpressionState org.springframework.data.mongodb.core.spel.ExpressionState ) { super( org.springframework.data.mongodb.core.spel.Operator , org.springframework.data.mongodb.core.spel.ExpressionState ); this . org.springframework.data.mongodb.core.spel.Operator = org.springframework.data.mongodb.core.spel.Operator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return java.util.Set<java.lang.Class> . boolean ( org.springframework.data.mongodb.core.spel.Operator . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.mongodb.core.spel.Operator instanceof OpOr || org.springframework.data.mongodb.core.spel.Operator instanceof OpAnd ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.data.mongodb.core.spel.Operator . getRightOperand ( ) == null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( ! java.util.Map<java.lang.String,java.lang.String> . boolean ( org.springframework.data.mongodb.core.spel.Operator . getOperatorName ( ) ) ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.spel.Operator . getOperatorName ( ) ) ) ; } return java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( org.springframework.data.mongodb.core.spel.Operator . getOperatorName ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ( ) && org.springframework.data.mongodb.core.spel.Operator instanceof OpMinus ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.spel.ExpressionNode org.springframework.data.mongodb.core.spel.ExpressionNode ( ) { return from ( org.springframework.data.mongodb.core.spel.Operator . getLeftOperand ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.spel.ExpressionNode org.springframework.data.mongodb.core.spel.ExpressionNode ( ) { return from ( org.springframework.data.mongodb.core.spel.Operator . getRightOperand ( ) ) ; }  <METHOD_END>