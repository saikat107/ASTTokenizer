<METHOD_START> public void ( MBeanObjectConverter org.springframework.integration.jmx.MBeanObjectConverter ) { this . org.springframework.integration.jmx.MBeanObjectConverter = org.springframework.integration.jmx.MBeanObjectConverter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { Assert . notNull ( this . javax.management.MBeanServerConnection , STRING ) ; try { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Set<javax.management.ObjectInstance> < javax.management.ObjectInstance > java.util.Set<javax.management.ObjectInstance> = this . javax.management.MBeanServerConnection . java.util.Set<javax.management.ObjectInstance> ( this . javax.management.ObjectName , this . javax.management.QueryExp ) ; for ( javax.management.ObjectInstance javax.management.ObjectInstance : java.util.Set<javax.management.ObjectInstance> ) { java.lang.Object java.lang.Object = this . org.springframework.integration.jmx.MBeanObjectConverter . convert ( this . javax.management.MBeanServerConnection , javax.management.ObjectInstance ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.management.ObjectInstance . javax.management.ObjectName ( ) . java.lang.String ( ) , java.lang.Object ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessagingException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public void void ( javax.management.MBeanServerConnection javax.management.MBeanServerConnection ) { this . javax.management.MBeanServerConnection = javax.management.MBeanServerConnection ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; try { void ( javax.management.ObjectName . javax.management.ObjectName ( java.lang.String ) ) ; } catch ( javax.management.MalformedObjectNameException javax.management.MalformedObjectNameException ) { throw new java.lang.IllegalArgumentException ( javax.management.MalformedObjectNameException ) ; } }  <METHOD_END>
<METHOD_START> public void void ( javax.management.ObjectName javax.management.ObjectName ) { this . javax.management.ObjectName = javax.management.ObjectName ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; try { void ( javax.management.ObjectName . javax.management.ObjectName ( java.lang.String ) ) ; } catch ( javax.management.MalformedObjectNameException javax.management.MalformedObjectNameException ) { throw new java.lang.IllegalArgumentException ( javax.management.MalformedObjectNameException ) ; } }  <METHOD_END>
<METHOD_START> public void void ( javax.management.QueryExp javax.management.QueryExp ) { this . javax.management.QueryExp = javax.management.QueryExp ; }  <METHOD_END>