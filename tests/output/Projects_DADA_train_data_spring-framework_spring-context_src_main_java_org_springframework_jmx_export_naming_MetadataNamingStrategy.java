<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( JmxAttributeSource org.springframework.jmx.export.naming.JmxAttributeSource ) { Assert . notNull ( org.springframework.jmx.export.naming.JmxAttributeSource , STRING ) ; this . org.springframework.jmx.export.naming.JmxAttributeSource = org.springframework.jmx.export.naming.JmxAttributeSource ; }  <METHOD_END>
<METHOD_START> public void void ( JmxAttributeSource org.springframework.jmx.export.naming.JmxAttributeSource ) { Assert . notNull ( org.springframework.jmx.export.naming.JmxAttributeSource , STRING ) ; this . org.springframework.jmx.export.naming.JmxAttributeSource = org.springframework.jmx.export.naming.JmxAttributeSource ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.jmx.export.naming.JmxAttributeSource == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.management.ObjectName javax.management.ObjectName ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws javax.management.MalformedObjectNameException { java.lang.Class<?> < ? > java.lang.Class<?> = AopUtils . getTargetClass ( java.lang.Object ) ; ManagedResource org.springframework.jmx.export.naming.ManagedResource = this . org.springframework.jmx.export.naming.JmxAttributeSource . getManagedResource ( java.lang.Class<> ) ; if ( org.springframework.jmx.export.naming.ManagedResource != null && StringUtils . hasText ( org.springframework.jmx.export.naming.ManagedResource . getObjectName ( ) ) ) { return ObjectNameManager . getInstance ( org.springframework.jmx.export.naming.ManagedResource . getObjectName ( ) ) ; } else { try { return ObjectNameManager . getInstance ( java.lang.String ) ; } catch ( javax.management.MalformedObjectNameException javax.management.MalformedObjectNameException ) { java.lang.String java.lang.String = this . java.lang.String ; if ( java.lang.String == null ) { java.lang.String = ClassUtils . getPackageName ( java.lang.Class<> ) ; } java.util.Hashtable<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Hashtable<java.lang.String,java.lang.String> = new java.util.Hashtable<java.lang.String,java.lang.String> <> ( ) ; java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING , ClassUtils . getShortName ( java.lang.Class<> ) ) ; java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String ) ; return ObjectNameManager . getInstance ( java.lang.String , java.util.Hashtable<java.lang.String,java.lang.String> ) ; } } }  <METHOD_END>