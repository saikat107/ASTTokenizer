<METHOD_START> public void ( ConversionService org.springframework.messaging.handler.annotation.support.ConversionService ) { super( org.springframework.messaging.handler.annotation.support.ConversionService , null ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter ) { return org.springframework.messaging.handler.annotation.support.MethodParameter . hasParameterAnnotation ( DestinationVariable .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.messaging.handler.annotation.support.NamedValueInfo org.springframework.messaging.handler.annotation.support.NamedValueInfo ( MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter ) { DestinationVariable org.springframework.messaging.handler.annotation.support.DestinationVariable = org.springframework.messaging.handler.annotation.support.MethodParameter . getParameterAnnotation ( DestinationVariable .class ) ; return new org.springframework.messaging.handler.annotation.support.DestinationVariableMethodArgumentResolver.DestinationVariableNamedValueInfo ( org.springframework.messaging.handler.annotation.support.DestinationVariable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter , Message < ? > org.springframework.messaging.handler.annotation.support.Message<?> , java.lang.String java.lang.String )			throws java.lang.Exception { @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) org.springframework.messaging.handler.annotation.support.Message<> . getHeaders ( ) . get ( java.lang.String ) ; return ( java.util.Map<java.lang.String,java.lang.String> != null ? java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter , Message < ? > org.springframework.messaging.handler.annotation.support.Message<?> ) { throw new MessageHandlingException ( org.springframework.messaging.handler.annotation.support.Message<> , STRING + java.lang.String + STRING + org.springframework.messaging.handler.annotation.support.MethodParameter . getParameterType ( ) + STRING ) ; }  <METHOD_END>
<METHOD_START> private void ( DestinationVariable org.springframework.messaging.handler.annotation.support.DestinationVariable ) { super( org.springframework.messaging.handler.annotation.support.DestinationVariable . value ( ) , true , ValueConstants . DEFAULT_NONE ); }  <METHOD_END>