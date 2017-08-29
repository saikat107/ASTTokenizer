<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { SocketUtils . findAvailableTcpPort ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { SocketUtils . findAvailableTcpPort ( - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = SocketUtils . findAvailableTcpPort ( ) ; void ( int , PORT_RANGE_MIN , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { int int = SocketUtils . findAvailableTcpPort ( ) ; java.net.ServerSocket java.net.ServerSocket = javax.net.ServerSocketFactory . javax.net.ServerSocketFactory ( ) . java.net.ServerSocket ( int , NUMBER , java.net.InetAddress . java.net.InetAddress ( STRING ) ) ; try { SocketUtils . findAvailableTcpPort ( int , int ) ; } finally { java.net.ServerSocket . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = SocketUtils . findAvailableTcpPort ( NUMBER ) ; void ( int , NUMBER , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = NUMBER ; int int = int + NUMBER ; int int = SocketUtils . findAvailableTcpPort ( int , int ) ; void ( int , int , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { SocketUtils . findAvailableUdpPort ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { SocketUtils . findAvailableUdpPort ( - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = SocketUtils . findAvailableUdpPort ( ) ; void ( int , PORT_RANGE_MIN , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { int int = SocketUtils . findAvailableUdpPort ( ) ; java.net.DatagramSocket java.net.DatagramSocket = new java.net.DatagramSocket ( int , java.net.InetAddress . java.net.InetAddress ( STRING ) ) ; try { SocketUtils . findAvailableUdpPort ( int , int ) ; } finally { java.net.DatagramSocket . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = SocketUtils . findAvailableUdpPort ( NUMBER ) ; void ( int , NUMBER , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int int = NUMBER ; int int = int + NUMBER ; int int = SocketUtils . findAvailableUdpPort ( int , int ) ; void ( int , int , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { void ( NUMBER , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int ) { java.util.SortedSet<java.lang.Integer> < java.lang.Integer > java.util.SortedSet<java.lang.Integer> = SocketUtils . findAvailableTcpPorts ( int ) ; void ( java.util.SortedSet<java.lang.Integer> , int , PORT_RANGE_MIN , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int , int int , int int ) { java.util.SortedSet<java.lang.Integer> < java.lang.Integer > java.util.SortedSet<java.lang.Integer> = SocketUtils . findAvailableTcpPorts ( int , int , int ) ; void ( java.util.SortedSet<java.lang.Integer> , int , int , int ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int ) { java.util.SortedSet<java.lang.Integer> < java.lang.Integer > java.util.SortedSet<java.lang.Integer> = SocketUtils . findAvailableUdpPorts ( int ) ; void ( java.util.SortedSet<java.lang.Integer> , int , PORT_RANGE_MIN , PORT_RANGE_MAX ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int , int int , int int ) { java.util.SortedSet<java.lang.Integer> < java.lang.Integer > java.util.SortedSet<java.lang.Integer> = SocketUtils . findAvailableUdpPorts ( int , int , int ) ; void ( java.util.SortedSet<java.lang.Integer> , int , int , int ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int , int int , int int ) { assertTrue ( STRING + int + STRING + int , int >= int ) ; assertTrue ( STRING + int + STRING + int , int <= int ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.SortedSet<java.lang.Integer> < java.lang.Integer > java.util.SortedSet<java.lang.Integer> , int int , int int , int int ) { assertEquals ( STRING , int , java.util.SortedSet<java.lang.Integer> . int ( ) ) ; for ( int int : java.util.SortedSet<java.lang.Integer> ) { void ( int , int , int ) ; } }  <METHOD_END>
