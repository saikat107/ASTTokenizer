<METHOD_START> public void ( ) { this . org.springframework.messaging.converter.ConversionService = DefaultConversionService . getSharedInstance ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ConversionService org.springframework.messaging.converter.ConversionService ) { Assert . notNull ( org.springframework.messaging.converter.ConversionService , STRING ) ; this . org.springframework.messaging.converter.ConversionService = org.springframework.messaging.converter.ConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.messaging.converter.Message<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.Object java.lang.Object = org.springframework.messaging.converter.Message<> . getPayload ( ) ; if ( java.lang.Class<> == null ) { return java.lang.Object ; } if ( java.lang.Object != null && this . org.springframework.messaging.converter.ConversionService . canConvert ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , java.lang.Class<> ) ) { try { return this . org.springframework.messaging.converter.ConversionService . convert ( java.lang.Object , java.lang.Class<> ) ; } catch ( ConversionException org.springframework.messaging.converter.ConversionException ) { throw new MessageConversionException ( org.springframework.messaging.converter.Message<> , STRING + java.lang.Object + STRING + java.lang.Class<> . java.lang.String ( ) + STRING , org.springframework.messaging.converter.ConversionException ) ; } } return ( ClassUtils . isAssignableValue ( java.lang.Class<> , java.lang.Object ) ? java.lang.Object : null ) ; }  <METHOD_END>