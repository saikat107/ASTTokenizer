<METHOD_START> public void ( ) { this . org.springframework.expression.spel.support.ConversionService = DefaultConversionService . getSharedInstance ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ConversionService org.springframework.expression.spel.support.ConversionService ) { Assert . notNull ( org.springframework.expression.spel.support.ConversionService , STRING ) ; this . org.springframework.expression.spel.support.ConversionService = org.springframework.expression.spel.support.ConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.expression.spel.support.TypeDescriptor , TypeDescriptor org.springframework.expression.spel.support.TypeDescriptor ) { return this . org.springframework.expression.spel.support.ConversionService . canConvert ( org.springframework.expression.spel.support.TypeDescriptor , org.springframework.expression.spel.support.TypeDescriptor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.expression.spel.support.TypeDescriptor , TypeDescriptor org.springframework.expression.spel.support.TypeDescriptor ) { try { return this . org.springframework.expression.spel.support.ConversionService . convert ( java.lang.Object , org.springframework.expression.spel.support.TypeDescriptor , org.springframework.expression.spel.support.TypeDescriptor ) ; } catch ( ConversionException org.springframework.expression.spel.support.ConversionException ) { throw new SpelEvaluationException ( org.springframework.expression.spel.support.ConversionException , SpelMessage . TYPE_CONVERSION_ERROR , org.springframework.expression.spel.support.TypeDescriptor . toString ( ) , org.springframework.expression.spel.support.TypeDescriptor . toString ( ) ) ; } }  <METHOD_END>