<METHOD_START> public void void ( ConnectionFactory org.springframework.jms.support.ConnectionFactory ) { this . org.springframework.jms.support.ConnectionFactory = org.springframework.jms.support.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.support.ConnectionFactory org.springframework.jms.support.ConnectionFactory ( ) { return this . org.springframework.jms.support.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { void ( org.springframework.jms.support.Constants . asNumber ( java.lang.String ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( org.springframework.jms.support.ConnectionFactory ( ) == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.support.JmsException org.springframework.jms.support.JmsException ( JMSException org.springframework.jms.support.JMSException ) { return JmsUtils . convertJmsAccessException ( org.springframework.jms.support.JMSException ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.support.Connection org.springframework.jms.support.Connection ( ) org.springframework.jms.support.JMSException { return org.springframework.jms.support.ConnectionFactory ( ) . createConnection ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.support.Session org.springframework.jms.support.Session ( Connection org.springframework.jms.support.Connection ) throws org.springframework.jms.support.JMSException { return org.springframework.jms.support.Connection . createSession ( boolean ( ) , int ( ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( Session org.springframework.jms.support.Session ) throws org.springframework.jms.support.JMSException { return ( org.springframework.jms.support.Session . getAcknowledgeMode ( ) == Session . CLIENT_ACKNOWLEDGE ) ; }  <METHOD_END>
