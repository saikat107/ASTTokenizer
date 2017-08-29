<METHOD_START> public void ( int int , SpelNodeImpl ... org.springframework.expression.spel.ast.SpelNodeImpl[] ) { super( STRING , int , org.springframework.expression.spel.ast.SpelNodeImpl[] ); this . exitTypeDescriptor = STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.BooleanTypedValue org.springframework.expression.spel.ast.BooleanTypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { java.lang.Object java.lang.Object = getLeftOperand ( ) . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; java.lang.Object java.lang.Object = getRightOperand ( ) . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; this . leftActualDescriptor = CodeFlow . toDescriptorFromObject ( java.lang.Object ) ; this . rightActualDescriptor = CodeFlow . toDescriptorFromObject ( java.lang.Object ) ; return BooleanTypedValue . forValue ( equalityCheck ( org.springframework.expression.spel.ast.ExpressionState . getEvaluationContext ( ) , java.lang.Object , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = getLeftOperand ( ) ; SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl = getRightOperand ( ) ; if ( ! org.springframework.expression.spel.ast.SpelNodeImpl . isCompilable ( ) || ! org.springframework.expression.spel.ast.SpelNodeImpl . isCompilable ( ) ) { return false ; } java.lang.String java.lang.String = left . exitTypeDescriptor ; java.lang.String java.lang.String = right . exitTypeDescriptor ; DescriptorComparison org.springframework.expression.spel.ast.DescriptorComparison = DescriptorComparison . checkNumericCompatibility ( java.lang.String , java.lang.String , this . leftActualDescriptor , this . rightActualDescriptor ) ; return ( ! dc . areNumbers || dc . areCompatible ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { org.springframework.expression.spel.ast.CodeFlow . loadEvaluationContext ( org.springframework.expression.spel.ast.MethodVisitor ) ; java.lang.String java.lang.String = getLeftOperand ( ) . exitTypeDescriptor ; java.lang.String java.lang.String = getRightOperand ( ) . exitTypeDescriptor ; boolean boolean = CodeFlow . isPrimitive ( java.lang.String ) ; boolean boolean = CodeFlow . isPrimitive ( java.lang.String ) ; org.springframework.expression.spel.ast.CodeFlow . enterCompilationScope ( ) ; getLeftOperand ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; org.springframework.expression.spel.ast.CodeFlow . exitCompilationScope ( ) ; if ( boolean ) { CodeFlow . insertBoxIfNecessary ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String . char ( NUMBER ) ) ; } org.springframework.expression.spel.ast.CodeFlow . enterCompilationScope ( ) ; getRightOperand ( ) . generateCode ( org.springframework.expression.spel.ast.MethodVisitor , org.springframework.expression.spel.ast.CodeFlow ) ; org.springframework.expression.spel.ast.CodeFlow . exitCompilationScope ( ) ; if ( boolean ) { CodeFlow . insertBoxIfNecessary ( org.springframework.expression.spel.ast.MethodVisitor , java.lang.String . char ( NUMBER ) ) ; } java.lang.String java.lang.String = Operator .class . java.lang.String ( ) . java.lang.String ( '.' , '/' ) ; java.lang.String java.lang.String = EvaluationContext .class . java.lang.String ( ) . java.lang.String ( '.' , '/' ) ; org.springframework.expression.spel.ast.MethodVisitor . visitMethodInsn ( INVOKESTATIC , java.lang.String , STRING , STRING + java.lang.String + STRING , false ) ; org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( STRING ) ; }  <METHOD_END>