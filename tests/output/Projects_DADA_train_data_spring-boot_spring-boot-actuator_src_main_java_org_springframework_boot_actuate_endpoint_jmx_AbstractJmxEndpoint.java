<METHOD_START> public void ( ObjectMapper org.springframework.boot.actuate.endpoint.jmx.ObjectMapper ) { this . org.springframework.boot.actuate.endpoint.jmx.DataConverter = new DataConverter ( org.springframework.boot.actuate.endpoint.jmx.ObjectMapper ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.actuate.endpoint.jmx.Environment ) { this . org.springframework.boot.actuate.endpoint.jmx.Environment = org.springframework.boot.actuate.endpoint.jmx.Environment ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.actuate.endpoint.jmx.Environment org.springframework.boot.actuate.endpoint.jmx.Environment ( ) { return this . org.springframework.boot.actuate.endpoint.jmx.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return EndpointProperties . isEnabled ( this . org.springframework.boot.actuate.endpoint.jmx.Environment , this . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return ObjectUtils . getIdentityHexString ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.lang.Class<? extends org.springframework.boot.actuate.endpoint.jmx.Endpoint> < ? extends Endpoint > java.lang.Class<? extends org.springframework.boot.actuate.endpoint.jmx.Endpoint> ( ) { return null ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . org.springframework.boot.actuate.endpoint.jmx.DataConverter . convert ( java.lang.Object ) ; }  <METHOD_END>