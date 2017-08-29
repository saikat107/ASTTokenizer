<METHOD_START> @ Bean public sample.amqp.Sender sample.amqp.Sender ( ) { return new Sender ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.amqp.Queue sample.amqp.Queue ( ) { return new Queue ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ RabbitHandler public void void ( @ Payload java.lang.String java.lang.String ) { java.lang.System . java.io.PrintStream . void ( new java.util.Date ( ) + STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { SpringApplication . run ( sample.amqp.SampleAmqpSimpleApplication .class , java.lang.String[] ) ; }  <METHOD_END>
