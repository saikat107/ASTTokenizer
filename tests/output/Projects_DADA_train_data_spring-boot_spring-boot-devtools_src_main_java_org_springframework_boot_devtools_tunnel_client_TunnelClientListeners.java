<METHOD_START> public void void ( TunnelClientListener org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) { Assert . notNull ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener , STRING ) ; this . java.util.List<org.springframework.boot.devtools.tunnel.client.TunnelClientListener> . add ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) ; }  <METHOD_END>
<METHOD_START> public void void ( TunnelClientListener org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) { Assert . notNull ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener , STRING ) ; this . java.util.List<org.springframework.boot.devtools.tunnel.client.TunnelClientListener> . remove ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.nio.channels.SocketChannel java.nio.channels.SocketChannel ) { for ( TunnelClientListener org.springframework.boot.devtools.tunnel.client.TunnelClientListener : this . java.util.List<org.springframework.boot.devtools.tunnel.client.TunnelClientListener> ) { org.springframework.boot.devtools.tunnel.client.TunnelClientListener . onOpen ( java.nio.channels.SocketChannel ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.nio.channels.SocketChannel java.nio.channels.SocketChannel ) { for ( TunnelClientListener org.springframework.boot.devtools.tunnel.client.TunnelClientListener : this . java.util.List<org.springframework.boot.devtools.tunnel.client.TunnelClientListener> ) { org.springframework.boot.devtools.tunnel.client.TunnelClientListener . onClose ( java.nio.channels.SocketChannel ) ; } }  <METHOD_END>