<METHOD_START> public void void ( D D ) { this . D = D ; }  <METHOD_END>
<METHOD_START> public D D ( ) { return this . D ; }  <METHOD_END>
<METHOD_START> public void void ( MessageConverter org.springframework.messaging.core.MessageConverter ) { Assert . notNull ( org.springframework.messaging.core.MessageConverter , STRING ) ; this . org.springframework.messaging.core.MessageConverter = org.springframework.messaging.core.MessageConverter ; }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.core.MessageConverter org.springframework.messaging.core.MessageConverter ( ) { return this . org.springframework.messaging.core.MessageConverter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.messaging.core.Message<?> ) { void ( D ( ) , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected final D D ( ) { Assert . state ( this . D != null , STRING ) ; return this . D ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( D D , Message < ? > org.springframework.messaging.core.Message<?> ) { void ( D , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected abstract void void ( D D , Message < ? > org.springframework.messaging.core.Message<?> );  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws org.springframework.messaging.core.MessagingException { void ( java.lang.Object , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( D D , java.lang.Object java.lang.Object ) throws org.springframework.messaging.core.MessagingException { void ( D , java.lang.Object , ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( D D , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) throws org.springframework.messaging.core.MessagingException { void ( D , java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) throws org.springframework.messaging.core.MessagingException { void ( D ( ) , java.lang.Object , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( D D , java.lang.Object java.lang.Object , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor )			throws org.springframework.messaging.core.MessagingException { void ( D , java.lang.Object , null , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( D D , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) throws org.springframework.messaging.core.MessagingException { Message < ? > org.springframework.messaging.core.Message<?> = org.springframework.messaging.core.Message<?> ( java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , org.springframework.messaging.core.MessagePostProcessor ) ; void ( D , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { MessageHeaders org.springframework.messaging.core.MessageHeaders = null ; java.lang.Object java.lang.Object = ( java.util.Map<java.lang.String,java.lang.Object> != null ? java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) : null ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> ) ; if ( java.util.Map<java.lang.String,java.lang.Object> != null ) { if ( java.util.Map<java.lang.String,java.lang.Object> instanceof MessageHeaders ) { org.springframework.messaging.core.MessageHeaders = ( MessageHeaders ) java.util.Map<java.lang.String,java.lang.Object> ; } else { org.springframework.messaging.core.MessageHeaders = new MessageHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; } } MessageConverter org.springframework.messaging.core.MessageConverter = org.springframework.messaging.core.MessageConverter ( ) ; Message < ? > org.springframework.messaging.core.Message<?> = ( org.springframework.messaging.core.MessageConverter instanceof SmartMessageConverter ? ( ( SmartMessageConverter ) org.springframework.messaging.core.MessageConverter ) . toMessage ( java.lang.Object , org.springframework.messaging.core.MessageHeaders , java.lang.Object ) : org.springframework.messaging.core.MessageConverter . toMessage ( java.lang.Object , org.springframework.messaging.core.MessageHeaders ) ) ; if ( org.springframework.messaging.core.Message<> == null ) { java.lang.String java.lang.String = ( java.lang.Object != null ? java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) : null ) ; java.lang.Object java.lang.Object = ( org.springframework.messaging.core.MessageHeaders != null ? org.springframework.messaging.core.MessageHeaders . get ( MessageHeaders . CONTENT_TYPE ) : null ) ; throw new MessageConversionException ( STRING + java.lang.String + STRING + java.lang.Object + STRING + org.springframework.messaging.core.MessageConverter ( ) + STRING ) ; } if ( org.springframework.messaging.core.MessagePostProcessor != null ) { org.springframework.messaging.core.Message<?> = org.springframework.messaging.core.MessagePostProcessor . postProcessMessage ( org.springframework.messaging.core.Message<> ) ; } return org.springframework.messaging.core.Message<> ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>