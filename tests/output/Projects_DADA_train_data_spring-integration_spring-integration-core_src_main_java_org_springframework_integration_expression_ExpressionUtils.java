<METHOD_START> private void ( ) { super(); }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.expression.StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext ( ConversionService org.springframework.integration.expression.ConversionService , BeanFactory org.springframework.integration.expression.BeanFactory ) { StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext = new StandardEvaluationContext ( ) ; org.springframework.integration.expression.StandardEvaluationContext . addPropertyAccessor ( new MapAccessor ( ) ) ; if ( org.springframework.integration.expression.ConversionService != null ) { org.springframework.integration.expression.StandardEvaluationContext . setTypeConverter ( new StandardTypeConverter ( org.springframework.integration.expression.ConversionService ) ) ; } if ( org.springframework.integration.expression.BeanFactory != null ) { org.springframework.integration.expression.StandardEvaluationContext . setBeanResolver ( new BeanFactoryResolver ( org.springframework.integration.expression.BeanFactory ) ) ; } return org.springframework.integration.expression.StandardEvaluationContext ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.expression.StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext ( ) { return org.springframework.integration.expression.StandardEvaluationContext ( null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.expression.StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext ( BeanFactory org.springframework.integration.expression.BeanFactory ) { if ( org.springframework.integration.expression.BeanFactory == null ) { org.springframework.integration.expression.Log . warn ( STRING , new java.lang.RuntimeException ( STRING ) ) ; } return org.springframework.integration.expression.StandardEvaluationContext ( org.springframework.integration.expression.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.expression.StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext ( BeanFactory org.springframework.integration.expression.BeanFactory ) { ConversionService org.springframework.integration.expression.ConversionService = null ; StandardEvaluationContext org.springframework.integration.expression.StandardEvaluationContext = null ; if ( org.springframework.integration.expression.BeanFactory != null ) { org.springframework.integration.expression.StandardEvaluationContext = IntegrationContextUtils . getEvaluationContext ( org.springframework.integration.expression.BeanFactory ) ; } if ( org.springframework.integration.expression.StandardEvaluationContext == null ) { if ( org.springframework.integration.expression.BeanFactory != null ) { org.springframework.integration.expression.ConversionService = IntegrationUtils . getConversionService ( org.springframework.integration.expression.BeanFactory ) ; } org.springframework.integration.expression.StandardEvaluationContext = org.springframework.integration.expression.StandardEvaluationContext ( org.springframework.integration.expression.ConversionService , org.springframework.integration.expression.BeanFactory ) ; } return org.springframework.integration.expression.StandardEvaluationContext ; }  <METHOD_END>
<METHOD_START> public static java.io.File java.io.File ( Expression org.springframework.integration.expression.Expression , EvaluationContext org.springframework.integration.expression.EvaluationContext , Message < ? > org.springframework.integration.expression.Message<?> , java.lang.String java.lang.String ) { java.io.File java.io.File ; java.lang.Object java.lang.Object = org.springframework.integration.expression.Expression . getValue ( org.springframework.integration.expression.EvaluationContext , org.springframework.integration.expression.Message<> ) ; if ( java.lang.Object == null ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.integration.expression.Expression . getExpressionString ( ) ) ) ; } else if ( java.lang.Object instanceof java.io.File ) { java.io.File = ( java.io.File ) java.lang.Object ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; Assert . hasText ( java.lang.String , java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.integration.expression.Expression . getExpressionString ( ) ) ) ; java.io.File = new java.io.File ( java.lang.String ) ; } else { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.integration.expression.Expression . getExpressionString ( ) , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ) ) ; } return java.io.File ; }  <METHOD_END>