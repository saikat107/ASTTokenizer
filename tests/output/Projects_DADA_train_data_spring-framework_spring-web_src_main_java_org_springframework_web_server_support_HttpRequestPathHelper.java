<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ServerWebExchange org.springframework.web.server.support.ServerWebExchange ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.web.server.support.ServerWebExchange . getRequest ( ) ) ; return ( boolean ( ) ? java.lang.String ( org.springframework.web.server.support.ServerWebExchange , java.lang.String ) : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ServerHttpRequest org.springframework.web.server.support.ServerHttpRequest ) { java.lang.String java.lang.String = org.springframework.web.server.support.ServerHttpRequest . getContextPath ( ) ; java.lang.String java.lang.String = org.springframework.web.server.support.ServerHttpRequest . getURI ( ) . getRawPath ( ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } int int = java.lang.String . int ( ) ; return ( java.lang.String . int ( ) > int ? java.lang.String . java.lang.String ( int ) : STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ServerWebExchange org.springframework.web.server.support.ServerWebExchange , java.lang.String java.lang.String ) { try { return UriUtils . decode ( java.lang.String , STRING ) ; } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ServerWebExchange org.springframework.web.server.support.ServerWebExchange , java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { if ( this . boolean ) { return java.util.Map<java.lang.String,java.lang.String> ; } java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.LinkedHashMap<java.lang.String,java.lang.String> <> ( java.util.Map<java.lang.String,java.lang.String> . int ( ) ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map.Entry<java.lang.String,java.lang.String> : java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.String>> ( ) ) { java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) , java.lang.String ( org.springframework.web.server.support.ServerWebExchange , java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) ) ) ; } return java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> ( ServerWebExchange org.springframework.web.server.support.ServerWebExchange , MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> ) { if ( this . boolean ) { return org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> ; } MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> . size ( ) ) ; for ( java.lang.String java.lang.String : org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> . keySet ( ) ) { for ( java.lang.String java.lang.String : org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) ) { org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> . add ( java.lang.String , java.lang.String ( org.springframework.web.server.support.ServerWebExchange , java.lang.String ) ) ; } } return org.springframework.web.server.support.MultiValueMap<java.lang.String,java.lang.String> ; }  <METHOD_END>