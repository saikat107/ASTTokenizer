<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( int int ) { super( int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.web.embedded.undertow.WebServer org.springframework.boot.web.embedded.undertow.WebServer ( HttpHandler org.springframework.boot.web.embedded.undertow.HttpHandler ) { Undertow . Undertow Undertow.Builder = Undertow.Builder ( getPort ( ) ) ; UndertowHttpHandlerAdapter org.springframework.boot.web.embedded.undertow.UndertowHttpHandlerAdapter = new UndertowHttpHandlerAdapter ( org.springframework.boot.web.embedded.undertow.HttpHandler ) ; Undertow.Builder . setHandler ( org.springframework.boot.web.embedded.undertow.UndertowHttpHandlerAdapter ) ; return new UndertowWebServer ( Undertow.Builder , getPort ( ) >= NUMBER ) ; }  <METHOD_END>
<METHOD_START> private Undertow . Undertow.Builder Undertow.Builder ( int int ) { Undertow . Undertow Undertow.Builder = Undertow . builder ( ) ; if ( this . java.lang.Integer != null ) { Undertow.Builder . setBufferSize ( this . java.lang.Integer ) ; } if ( this . java.lang.Integer != null ) { Undertow.Builder . setIoThreads ( this . java.lang.Integer ) ; } if ( this . java.lang.Integer != null ) { Undertow.Builder . setWorkerThreads ( this . java.lang.Integer ) ; } if ( this . java.lang.Boolean != null ) { Undertow.Builder . setDirectBuffers ( this . java.lang.Boolean ) ; } Undertow.Builder . addHttpListener ( int , java.lang.String ( ) ) ; return Undertow.Builder ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { if ( getAddress ( ) == null ) { return STRING ; } return getAddress ( ) . getHostAddress ( ) ; }  <METHOD_END>