<METHOD_START> public void ( int int , SpelNodeImpl ... org.springframework.expression.spel.ast.SpelNodeImpl[] ) { super( STRING , int , org.springframework.expression.spel.ast.SpelNodeImpl[] ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = getLeftOperand ( ) ; SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = org.springframework.expression.spel.ast.SpelNodeImpl ( ) ; if ( org.springframework.expression.spel.ast.SpelNodeImpl == null ) { java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; if ( java.lang.Object instanceof java.lang.Number ) { if ( java.lang.Object instanceof java.math.BigDecimal ) { return new TypedValue ( ( ( java.math.BigDecimal ) java.lang.Object ) . java.math.BigDecimal ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Double ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . double ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Float ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . float ( ) ) ; } else if ( java.lang.Object instanceof java.math.BigInteger ) { return new TypedValue ( ( ( java.math.BigInteger ) java.lang.Object ) . java.math.BigInteger ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Long ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . long ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Integer ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . int ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Short ) { return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . short ( ) ) ; } else if ( java.lang.Object instanceof java.lang.Byte ) { return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . byte ( ) ) ; } else { return new TypedValue ( NUMBER - ( ( java.lang.Number ) java.lang.Object ) . double ( ) ) ; } } return org.springframework.expression.spel.ast.ExpressionState . operate ( Operation . SUBTRACT , java.lang.Object , null ) ; } java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.SpelNodeImpl . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; if ( java.lang.Object instanceof java.lang.Number && java.lang.Object instanceof java.lang.Number ) { java.lang.Number java.lang.Number = ( java.lang.Number ) java.lang.Object ; java.lang.Number java.lang.Number = ( java.lang.Number ) java.lang.Object ; if ( java.lang.Number instanceof java.math.BigDecimal || java.lang.Number instanceof java.math.BigDecimal ) { java.math.BigDecimal java.math.BigDecimal = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigDecimal .class ) ; java.math.BigDecimal java.math.BigDecimal = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigDecimal .class ) ; return new TypedValue ( java.math.BigDecimal . java.math.BigDecimal ( java.math.BigDecimal ) ) ; } else if ( java.lang.Number instanceof java.lang.Double || java.lang.Number instanceof java.lang.Double ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . double ( ) - java.lang.Number . double ( ) ) ; } else if ( java.lang.Number instanceof java.lang.Float || java.lang.Number instanceof java.lang.Float ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . float ( ) - java.lang.Number . float ( ) ) ; } else if ( java.lang.Number instanceof java.math.BigInteger || java.lang.Number instanceof java.math.BigInteger ) { java.math.BigInteger java.math.BigInteger = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigInteger .class ) ; java.math.BigInteger java.math.BigInteger = NumberUtils . convertNumberToTargetClass ( java.lang.Number , java.math.BigInteger .class ) ; return new TypedValue ( java.math.BigInteger . java.math.BigInteger ( java.math.BigInteger ) ) ; } else if ( java.lang.Number instanceof java.lang.Long || java.lang.Number instanceof java.lang.Long ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . long ( ) - java.lang.Number . long ( ) ) ; } else if ( CodeFlow . isIntegerForNumericOp ( java.lang.Number ) || CodeFlow . isIntegerForNumericOp ( java.lang.Number ) ) { this . exitTypeDescriptor = STRING ; return new TypedValue ( java.lang.Number . int ( ) - java.lang.Number . int ( ) ) ; } else { return new TypedValue ( java.lang.Number . double ( ) - java.lang.Number . double ( ) ) ; } } if ( java.lang.Object instanceof java.lang.String && java.lang.Object instanceof java.lang.Integer && ( ( java.lang.String ) java.lang.Object ) . int ( ) == NUMBER ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; java.lang.Integer java.lang.Integer = ( java.lang.Integer ) java.lang.Object ; return new TypedValue ( java.lang.Character . java.lang.String ( ( char ) ( java.lang.String . char ( NUMBER ) - java.lang.Integer ) ) ) ; } return org.springframework.expression.spel.ast.ExpressionState . operate ( Operation . SUBTRACT , java.lang.Object , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { if ( org.springframework.expression.spel.ast.SpelNodeImpl ( ) == null ) { return STRING + getLeftOperand ( ) . toStringAST ( ) ; } return super. toStringAST ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl ( ) { if ( this . children . length < NUMBER ) { return null ; } return this . children [ NUMBER ] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { if ( ! getLeftOperand ( ) . isCompilable ( ) ) { return false ; } if ( this . children . length > NUMBER ) { if ( ! org.springframework.expression.spel.ast.SpelNodeImpl ( ) . isCompilable ( ) ) { return false ; } } return ( this . exitTypeDescriptor != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { getLeftOperand ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; java.lang.String java.lang.String = getLeftOperand ( ) . exitTypeDescriptor ; CodeFlow . insertNumericUnboxOrPrimitiveTypeCoercion ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String , this . exitTypeDescriptor . charAt ( NUMBER ) ) ; if ( this . children . length > NUMBER ) { org.springframework.expression.spel.ast.CodeFlow . enterCompilationScope ( ) ; org.springframework.expression.spel.ast.SpelNodeImpl ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; java.lang.String java.lang.String = org.springframework.expression.spel.ast.SpelNodeImpl ( ) . exitTypeDescriptor ; org.springframework.expression.spel.ast.CodeFlow . exitCompilationScope ( ) ; CodeFlow . insertNumericUnboxOrPrimitiveTypeCoercion ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String , this . exitTypeDescriptor . charAt ( NUMBER ) ) ; switch ( this . exitTypeDescriptor . charAt ( NUMBER ) ) { case 'I' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( ISUB ) ; break; case 'J' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( LSUB ) ; break; case 'F' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( FSUB ) ; break; case 'D' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( DSUB ) ; break; default: throw new java.lang.IllegalStateException ( STRING + this . exitTypeDescriptor + STRING ) ; } } else { switch ( this . exitTypeDescriptor . charAt ( NUMBER ) ) { case 'I' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( INEG ) ; break; case 'J' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( LNEG ) ; break; case 'F' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( FNEG ) ; break; case 'D' : org.springframework.expression.spel.ast.MethodVisitor . visitInsn ( DNEG ) ; break; default: throw new java.lang.IllegalStateException ( STRING + this . exitTypeDescriptor + STRING ) ; } } org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( this . exitTypeDescriptor ) ; }  <METHOD_END>