<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . org.springframework.integration.handler.advice.Expression = new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) ; this . org.springframework.integration.handler.advice.StandardEvaluationContext = ExpressionUtils . createStandardEvaluationContext ( ) ; if ( java.lang.String == null ) { this . org.springframework.integration.handler.advice.Expression = null ; } else { this . org.springframework.integration.handler.advice.Expression = new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public void void ( BeanFactory org.springframework.integration.handler.advice.BeanFactory ) throws org.springframework.integration.handler.advice.BeansException { this . org.springframework.integration.handler.advice.StandardEvaluationContext = ExpressionUtils . createStandardEvaluationContext ( org.springframework.integration.handler.advice.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> public void void ( Classifier < ? super java.lang.Throwable , java.lang.Boolean > org.springframework.integration.handler.advice.Classifier<? super java.lang.Throwable,java.lang.Boolean> ) { this . org.springframework.integration.handler.advice.Classifier<? super java.lang.Throwable,java.lang.Boolean> = org.springframework.integration.handler.advice.Classifier<,java.lang.Boolean> ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.handler.advice.RetryState org.springframework.integration.handler.advice.RetryState ( Message < ? > org.springframework.integration.handler.advice.Message<?> ) { return new DefaultRetryState ( this . org.springframework.integration.handler.advice.Expression . getValue ( this . org.springframework.integration.handler.advice.StandardEvaluationContext , org.springframework.integration.handler.advice.Message<> ) , this . org.springframework.integration.handler.advice.Expression == null ? false : this . org.springframework.integration.handler.advice.Expression . getValue ( this . org.springframework.integration.handler.advice.StandardEvaluationContext , org.springframework.integration.handler.advice.Message<> , java.lang.Boolean .class ) , this . org.springframework.integration.handler.advice.Classifier<,java.lang.Boolean> ) ; }  <METHOD_END>