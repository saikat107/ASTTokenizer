<METHOD_START> public void void ( java.net.Proxy . java.net.Proxy.Type java.net.Proxy.Type ) { this . java.net.Proxy.Type = java.net.Proxy.Type ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.IllegalArgumentException { Assert . notNull ( this . java.net.Proxy.Type , STRING ) ; Assert . hasLength ( this . java.lang.String , STRING ) ; if ( this . int < NUMBER || this . int > NUMBER ) { throw new java.lang.IllegalArgumentException ( STRING + this . int ) ; } java.net.SocketAddress java.net.SocketAddress = new java.net.InetSocketAddress ( this . java.lang.String , this . int ) ; this . java.net.Proxy = new java.net.Proxy ( this . java.net.Proxy.Type , java.net.SocketAddress ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.Proxy java.net.Proxy ( ) { return this . java.net.Proxy ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return java.net.Proxy .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
