<METHOD_START> public void void ( javax.management.NotificationListener javax.management.NotificationListener ) { this . javax.management.NotificationListener = javax.management.NotificationListener ; }  <METHOD_END>
<METHOD_START> public javax.management.NotificationListener javax.management.NotificationListener ( ) { return this . javax.management.NotificationListener ; }  <METHOD_END>
<METHOD_START> public void void ( javax.management.NotificationFilter javax.management.NotificationFilter ) { this . javax.management.NotificationFilter = javax.management.NotificationFilter ; }  <METHOD_END>
<METHOD_START> public javax.management.NotificationFilter javax.management.NotificationFilter ( ) { return this . javax.management.NotificationFilter ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { void ( java.lang.Object != null ? new java.lang.Object [] { java.lang.Object } : null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object [] java.lang.Object[] ) { this . java.util.Set<java.lang.Object> = ( java.lang.Object[] != null ? new java.util.LinkedHashSet<java.lang.Object> <> ( java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) ) : null ) ; }  <METHOD_END>
<METHOD_START> public javax.management.ObjectName [] javax.management.ObjectName[] ( ) javax.management.MalformedObjectNameException { if ( this . java.util.Set<java.lang.Object> == null ) { return null ; } javax.management.ObjectName [] javax.management.ObjectName[] = new javax.management.ObjectName [ this . java.util.Set<java.lang.Object> . int ( ) ] ; int int = NUMBER ; for ( java.lang.Object java.lang.Object : this . java.util.Set<java.lang.Object> ) { javax.management.ObjectName[] [ int ] = ObjectNameManager . getInstance ( java.lang.Object ) ; int ++ ; } return javax.management.ObjectName[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.jmx.support.NotificationListenerHolder ) ) { return false ; } org.springframework.jmx.support.NotificationListenerHolder org.springframework.jmx.support.NotificationListenerHolder = ( org.springframework.jmx.support.NotificationListenerHolder ) java.lang.Object ; return ( ObjectUtils . nullSafeEquals ( this . javax.management.NotificationListener , org.springframework.jmx.support.NotificationListenerHolder . javax.management.NotificationListener ) && ObjectUtils . nullSafeEquals ( this . javax.management.NotificationFilter , org.springframework.jmx.support.NotificationListenerHolder . javax.management.NotificationFilter ) && ObjectUtils . nullSafeEquals ( this . java.lang.Object , org.springframework.jmx.support.NotificationListenerHolder . java.lang.Object ) && ObjectUtils . nullSafeEquals ( this . java.util.Set<java.lang.Object> , org.springframework.jmx.support.NotificationListenerHolder . java.util.Set<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = ObjectUtils . nullSafeHashCode ( this . javax.management.NotificationListener ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . javax.management.NotificationFilter ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . java.lang.Object ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . java.util.Set<java.lang.Object> ) ; return int ; }  <METHOD_END>