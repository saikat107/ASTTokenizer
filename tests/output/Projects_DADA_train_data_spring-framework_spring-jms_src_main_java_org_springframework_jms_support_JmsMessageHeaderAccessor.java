<METHOD_START> protected void ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> ) { super( java.util.Map<java.lang.String,java.util.List<java.lang.String>> ); }  <METHOD_END>
<METHOD_START> protected void ( Message < ? > org.springframework.jms.support.Message<?> ) { super( org.springframework.jms.support.Message<> ); }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( JmsHeaders . CORRELATION_ID ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.support.Destination org.springframework.jms.support.Destination ( ) { return ( Destination ) getHeader ( JmsHeaders . DESTINATION ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return ( java.lang.Integer ) getHeader ( JmsHeaders . DELIVERY_MODE ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Long java.lang.Long ( ) { return ( java.lang.Long ) getHeader ( JmsHeaders . EXPIRATION ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( JmsHeaders . MESSAGE_ID ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return ( java.lang.Integer ) getHeader ( JmsHeaders . PRIORITY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.support.Destination org.springframework.jms.support.Destination ( ) { return ( Destination ) getHeader ( JmsHeaders . REPLY_TO ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Boolean java.lang.Boolean ( ) { return ( java.lang.Boolean ) getHeader ( JmsHeaders . REDELIVERED ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( JmsHeaders . TYPE ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Long java.lang.Long ( ) { return ( java.lang.Long ) getHeader ( JmsHeaders . TIMESTAMP ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.jms.support.JmsMessageHeaderAccessor org.springframework.jms.support.JmsMessageHeaderAccessor ( Message < ? > org.springframework.jms.support.Message<?> ) { return new org.springframework.jms.support.JmsMessageHeaderAccessor ( org.springframework.jms.support.Message<> ) ; }  <METHOD_END>
