<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null || java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) != java.lang.Class<? extends org.springframework.boot.test.json.ExampleObject> ( ) ) { return false ; } org.springframework.boot.test.json.ExampleObject org.springframework.boot.test.json.ExampleObject = ( org.springframework.boot.test.json.ExampleObject ) java.lang.Object ; return ObjectUtils . nullSafeEquals ( this . java.lang.String , org.springframework.boot.test.json.ExampleObject . java.lang.String ) && ObjectUtils . nullSafeEquals ( this . int , org.springframework.boot.test.json.ExampleObject . int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String + STRING + this . int ; }  <METHOD_END>
