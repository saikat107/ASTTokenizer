<METHOD_START> protected void ( ) { super(); }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . target = new UnicastSendingMessageHandler ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> void ( java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,?> < Message < ? > , ? > java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,?> ) { this . target = new UnicastSendingMessageHandler ( new FunctionExpression <> ( java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,> ) ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . target . setSoTimeout ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . target . setSoSendBufferSize ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . target . setLocalAddress ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . target . setLengthCheck ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . target . setSoReceiveBufferSize ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . target . setAckCounter ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,java.net.DatagramSocket> < Message < ? > , java.net.DatagramSocket > java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,java.net.DatagramSocket> ) { this . target . setSocketExpression ( new FunctionExpression <> ( java.util.function.Function<org.springframework.integration.ip.dsl.Message<?>,java.net.DatagramSocket> ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . target . setSocketExpressionString ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
