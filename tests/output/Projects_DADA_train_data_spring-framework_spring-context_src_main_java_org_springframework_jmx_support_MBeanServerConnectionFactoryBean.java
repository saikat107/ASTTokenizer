<METHOD_START> public void void ( java.lang.String java.lang.String ) throws java.net.MalformedURLException { this . javax.management.remote.JMXServiceURL = new javax.management.remote.JMXServiceURL ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { CollectionUtils . mergePropertiesIntoMap ( java.util.Properties , this . java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { this . java.util.Map<java.lang.String,java.lang.Object> . void ( java.util.Map<java.lang.String,> ) ; } }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { if ( this . javax.management.remote.JMXServiceURL == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } if ( this . boolean ) { void ( ) ; } else { void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.io.IOException { this . javax.management.remote.JMXConnector = javax.management.remote.JMXConnectorFactory . javax.management.remote.JMXConnector ( this . javax.management.remote.JMXServiceURL , this . java.util.Map<java.lang.String,java.lang.Object> ) ; this . javax.management.MBeanServerConnection = this . javax.management.remote.JMXConnector . javax.management.MBeanServerConnection ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . org.springframework.jmx.support.MBeanServerConnectionFactoryBean.JMXConnectorLazyInitTargetSource = new org.springframework.jmx.support.MBeanServerConnectionFactoryBean.JMXConnectorLazyInitTargetSource ( ) ; TargetSource org.springframework.jmx.support.TargetSource = new org.springframework.jmx.support.MBeanServerConnectionFactoryBean.MBeanServerConnectionLazyInitTargetSource ( ) ; this . javax.management.remote.JMXConnector = ( javax.management.remote.JMXConnector ) new ProxyFactory ( javax.management.remote.JMXConnector .class , this . org.springframework.jmx.support.MBeanServerConnectionFactoryBean.JMXConnectorLazyInitTargetSource ) . getProxy ( this . java.lang.ClassLoader ) ; this . javax.management.MBeanServerConnection = ( javax.management.MBeanServerConnection ) new ProxyFactory ( javax.management.MBeanServerConnection .class , org.springframework.jmx.support.TargetSource ) . getProxy ( this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.management.MBeanServerConnection javax.management.MBeanServerConnection ( ) { return this . javax.management.MBeanServerConnection ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends javax.management.MBeanServerConnection> < ? extends javax.management.MBeanServerConnection > java.lang.Class<? extends javax.management.MBeanServerConnection> ( ) { return ( this . javax.management.MBeanServerConnection != null ? this . javax.management.MBeanServerConnection . java.lang.Class<? extends javax.management.MBeanServerConnection> ( ) : javax.management.MBeanServerConnection .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { if ( this . org.springframework.jmx.support.MBeanServerConnectionFactoryBean.JMXConnectorLazyInitTargetSource == null || this . org.springframework.jmx.support.MBeanServerConnectionFactoryBean.JMXConnectorLazyInitTargetSource . isInitialized ( ) ) { this . javax.management.remote.JMXConnector . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) java.lang.Exception { return javax.management.remote.JMXConnectorFactory . javax.management.remote.JMXConnector ( javax.management.remote.JMXServiceURL , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return javax.management.remote.JMXConnector .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) java.lang.Exception { return javax.management.remote.JMXConnector . javax.management.MBeanServerConnection ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return javax.management.MBeanServerConnection .class ; }  <METHOD_END>