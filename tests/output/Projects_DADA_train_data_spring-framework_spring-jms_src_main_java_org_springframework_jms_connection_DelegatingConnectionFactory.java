<METHOD_START> public void void ( ConnectionFactory org.springframework.jms.connection.ConnectionFactory ) { Assert . notNull ( org.springframework.jms.connection.ConnectionFactory , STRING ) ; this . org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.connection.ConnectionFactory org.springframework.jms.connection.ConnectionFactory ( ) { return this . org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( org.springframework.jms.connection.ConnectionFactory ( ) == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( ) org.springframework.jms.connection.JMSException { return org.springframework.jms.connection.ConnectionFactory ( ) . createConnection ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { return org.springframework.jms.connection.ConnectionFactory ( ) . createConnection ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.QueueConnection org.springframework.jms.connection.QueueConnection ( ) org.springframework.jms.connection.JMSException { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; if ( org.springframework.jms.connection.ConnectionFactory instanceof QueueConnectionFactory ) { return ( ( QueueConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createQueueConnection ( ) ; } else { Connection org.springframework.jms.connection.Connection = org.springframework.jms.connection.ConnectionFactory . createConnection ( ) ; if ( ! ( org.springframework.jms.connection.Connection instanceof QueueConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING ) ; } return ( QueueConnection ) org.springframework.jms.connection.Connection ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.QueueConnection org.springframework.jms.connection.QueueConnection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; if ( org.springframework.jms.connection.ConnectionFactory instanceof QueueConnectionFactory ) { return ( ( QueueConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createQueueConnection ( java.lang.String , java.lang.String ) ; } else { Connection org.springframework.jms.connection.Connection = org.springframework.jms.connection.ConnectionFactory . createConnection ( java.lang.String , java.lang.String ) ; if ( ! ( org.springframework.jms.connection.Connection instanceof QueueConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING ) ; } return ( QueueConnection ) org.springframework.jms.connection.Connection ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.TopicConnection org.springframework.jms.connection.TopicConnection ( ) org.springframework.jms.connection.JMSException { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; if ( org.springframework.jms.connection.ConnectionFactory instanceof TopicConnectionFactory ) { return ( ( TopicConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createTopicConnection ( ) ; } else { Connection org.springframework.jms.connection.Connection = org.springframework.jms.connection.ConnectionFactory . createConnection ( ) ; if ( ! ( org.springframework.jms.connection.Connection instanceof TopicConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING ) ; } return ( TopicConnection ) org.springframework.jms.connection.Connection ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.TopicConnection org.springframework.jms.connection.TopicConnection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; if ( org.springframework.jms.connection.ConnectionFactory instanceof TopicConnectionFactory ) { return ( ( TopicConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createTopicConnection ( java.lang.String , java.lang.String ) ; } else { Connection org.springframework.jms.connection.Connection = org.springframework.jms.connection.ConnectionFactory . createConnection ( java.lang.String , java.lang.String ) ; if ( ! ( org.springframework.jms.connection.Connection instanceof TopicConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING ) ; } return ( TopicConnection ) org.springframework.jms.connection.Connection ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( java.lang.String , java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( int int ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( int ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.connection.ConnectionFactory org.springframework.jms.connection.ConnectionFactory ( ) { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; Assert . state ( org.springframework.jms.connection.ConnectionFactory != null , STRING ) ; return org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Connection org.springframework.jms.connection.Connection ) { return this . boolean ; }  <METHOD_END>