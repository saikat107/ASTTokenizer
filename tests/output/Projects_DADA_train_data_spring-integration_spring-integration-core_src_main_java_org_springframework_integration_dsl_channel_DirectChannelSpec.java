<METHOD_START> @ java.lang.Override protected org.springframework.integration.dsl.channel.DirectChannel org.springframework.integration.dsl.channel.DirectChannel ( ) { this . channel = new DirectChannel ( this . loadBalancingStrategy ) ; if ( this . failover != null ) { this . channel . setFailover ( this . failover ) ; } if ( this . maxSubscribers != null ) { this . channel . setMaxSubscribers ( this . maxSubscribers ) ; } return super. doGet ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>