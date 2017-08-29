<METHOD_START> @ Before @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { this . org.springframework.web.socket.sockjs.client.InfoReceiver = mock ( InfoReceiver .class ) ; this . org.springframework.web.socket.sockjs.client.TestTransport = new TestTransport ( STRING ) ; this . org.springframework.web.socket.sockjs.client.XhrTestTransport = new XhrTestTransport ( STRING ) ; java.util.List<org.springframework.web.socket.sockjs.client.Transport> < Transport > java.util.List<org.springframework.web.socket.sockjs.client.Transport> = new java.util.ArrayList<org.springframework.web.socket.sockjs.client.Transport> <> ( ) ; java.util.List<org.springframework.web.socket.sockjs.client.Transport> . add ( this . org.springframework.web.socket.sockjs.client.TestTransport ) ; java.util.List<org.springframework.web.socket.sockjs.client.Transport> . add ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient = new SockJsClient ( java.util.List<org.springframework.web.socket.sockjs.client.Transport> ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . setInfoReceiver ( this . org.springframework.web.socket.sockjs.client.InfoReceiver ) ; this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> = mock ( ListenableFutureCallback .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( true ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession = mock ( WebSocketSession .class ) ; this . org.springframework.web.socket.sockjs.client.TestTransport . getConnectCallback ( ) . onSuccess ( org.springframework.web.socket.sockjs.client.WebSocketSession ) ; verify ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) . onSuccess ( org.springframework.web.socket.sockjs.client.WebSocketSession ) ; verifyNoMoreInteractions ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( false ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport . invoked ( ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport . getRequest ( ) . getTransportUrl ( ) . toString ( ) . endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( false ) ; this . org.springframework.web.socket.sockjs.client.XhrTestTransport . setStreamingDisabled ( true ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport . invoked ( ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport . getRequest ( ) . getTransportUrl ( ) . toString ( ) . endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ArgumentCaptor < HttpHeaders > org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> = org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( false ) ; this . org.springframework.web.socket.sockjs.client.XhrTestTransport . setStreamingDisabled ( true ) ; WebSocketHttpHeaders org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders = new WebSocketHttpHeaders ( ) ; org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders . set ( STRING , STRING ) ; org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders . set ( STRING , STRING ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders , new java.net.URI ( java.lang.String ) ) . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders = org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> . getValue ( ) ; assertEquals ( NUMBER , org.springframework.web.socket.sockjs.client.HttpHeaders . size ( ) ) ; assertEquals ( STRING , org.springframework.web.socket.sockjs.client.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.socket.sockjs.client.HttpHeaders . getFirst ( STRING ) ) ; org.springframework.web.socket.sockjs.client.HttpHeaders = this . org.springframework.web.socket.sockjs.client.XhrTestTransport . getRequest ( ) . getHttpRequestHeaders ( ) ; assertEquals ( NUMBER , org.springframework.web.socket.sockjs.client.HttpHeaders . size ( ) ) ; assertEquals ( STRING , org.springframework.web.socket.sockjs.client.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.socket.sockjs.client.HttpHeaders . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ArgumentCaptor < HttpHeaders > org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> = org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( false ) ; this . org.springframework.web.socket.sockjs.client.XhrTestTransport . setStreamingDisabled ( true ) ; WebSocketHttpHeaders org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders = new WebSocketHttpHeaders ( ) ; org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders . set ( STRING , STRING ) ; org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders . set ( STRING , STRING ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . setHttpHeaderNames ( STRING ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders , new java.net.URI ( java.lang.String ) ) . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; assertEquals ( NUMBER , org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> . getValue ( ) . size ( ) ) ; assertEquals ( STRING , org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> . getValue ( ) . getFirst ( STRING ) ) ; assertEquals ( NUMBER , this . org.springframework.web.socket.sockjs.client.XhrTestTransport . getRequest ( ) . getHttpRequestHeaders ( ) . size ( ) ) ; assertEquals ( STRING , this . org.springframework.web.socket.sockjs.client.XhrTestTransport . getRequest ( ) . getHttpRequestHeaders ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( true ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) ; verify ( this . org.springframework.web.socket.sockjs.client.InfoReceiver , times ( NUMBER ) ) . executeInfoRequest ( any ( ) , any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( true ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) ; verify ( this . org.springframework.web.socket.sockjs.client.InfoReceiver , times ( NUMBER ) ) . executeInfoRequest ( any ( ) , any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { HttpServerErrorException org.springframework.web.socket.sockjs.client.HttpServerErrorException = new HttpServerErrorException ( HttpStatus . SERVICE_UNAVAILABLE ) ; given ( this . org.springframework.web.socket.sockjs.client.InfoReceiver . executeInfoRequest ( any ( ) , any ( ) ) ) . willThrow ( org.springframework.web.socket.sockjs.client.HttpServerErrorException ) ; this . org.springframework.web.socket.sockjs.client.SockJsClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , java.lang.String ) . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; verify ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) . onFailure ( org.springframework.web.socket.sockjs.client.HttpServerErrorException ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.XhrTestTransport . invoked ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> < HttpHeaders > org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ( boolean boolean ) { ArgumentCaptor < HttpHeaders > org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> = ArgumentCaptor . forClass ( HttpHeaders .class ) ; when ( this . org.springframework.web.socket.sockjs.client.InfoReceiver . executeInfoRequest ( any ( ) , org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> . capture ( ) ) ) . thenReturn ( STRING + STRING + STRING + STRING + boolean + STRING ) ; return org.springframework.web.socket.sockjs.client.ArgumentCaptor<org.springframework.web.socket.sockjs.client.HttpHeaders> ; }  <METHOD_END>