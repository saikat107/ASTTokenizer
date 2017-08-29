<METHOD_START> public void void ( java.nio.charset.Charset java.nio.charset.Charset ) { Assert . notNull ( java.nio.charset.Charset , STRING ) ; this . java.nio.charset.Charset = java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public java.nio.charset.Charset java.nio.charset.Charset ( ) { return this . java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.http.codec.ResolvableType , MediaType org.springframework.http.codec.MediaType ) { return org.springframework.http.codec.ResolvableType . isAssignableFrom ( org.springframework.http.codec.ResolvableType ) && ( org.springframework.http.codec.MediaType == null || MediaType . APPLICATION_FORM_URLENCODED . isCompatibleWith ( org.springframework.http.codec.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.codec.Flux<org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String>> < MultiValueMap < java.lang.String , java.lang.String > > org.springframework.http.codec.Flux<org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String>> ( ResolvableType org.springframework.http.codec.ResolvableType , ReactiveHttpInputMessage org.springframework.http.codec.ReactiveHttpInputMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return Flux . from ( org.springframework.http.codec.Mono<org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String>> ( org.springframework.http.codec.ResolvableType , org.springframework.http.codec.ReactiveHttpInputMessage , java.util.Map<java.lang.String,java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.codec.Mono<org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String>> < MultiValueMap < java.lang.String , java.lang.String > > org.springframework.http.codec.Mono<org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String>> ( ResolvableType org.springframework.http.codec.ResolvableType , ReactiveHttpInputMessage org.springframework.http.codec.ReactiveHttpInputMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { MediaType org.springframework.http.codec.MediaType = org.springframework.http.codec.ReactiveHttpInputMessage . getHeaders ( ) . getContentType ( ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( org.springframework.http.codec.MediaType ) ; return org.springframework.http.codec.ReactiveHttpInputMessage . getBody ( ) . reduce ( DataBuffer :: write ) . map ( buffer -> { CharBuffer charBuffer = charset . decode ( buffer . asByteBuffer ( ) ) ; String body = charBuffer . toString ( ) ; DataBufferUtils . release ( buffer ) ; return parseFormData ( charset , body ) ; } ) ; }  <METHOD_END>
<METHOD_START> private java.nio.charset.Charset java.nio.charset.Charset ( MediaType org.springframework.http.codec.MediaType ) { if ( org.springframework.http.codec.MediaType != null && org.springframework.http.codec.MediaType . getCharset ( ) != null ) { return org.springframework.http.codec.MediaType . getCharset ( ) ; } else { return java.nio.charset.Charset ( ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> ( java.nio.charset.Charset java.nio.charset.Charset , java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = StringUtils . tokenizeToStringArray ( java.lang.String , STRING ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( java.lang.String[] . int ) ; try { for ( java.lang.String java.lang.String : java.lang.String[] ) { int int = java.lang.String . int ( '=' ) ; if ( int == - NUMBER ) { org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> . add ( java.net.URLDecoder . java.lang.String ( java.lang.String , java.nio.charset.Charset . java.lang.String ( ) ) , null ) ; } else { java.lang.String java.lang.String = java.net.URLDecoder . java.lang.String ( java.lang.String . java.lang.String ( NUMBER , int ) , java.nio.charset.Charset . java.lang.String ( ) ) ; java.lang.String java.lang.String = java.net.URLDecoder . java.lang.String ( java.lang.String . java.lang.String ( int + NUMBER ) , java.nio.charset.Charset . java.lang.String ( ) ) ; org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> . add ( java.lang.String , java.lang.String ) ; } } } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { throw new java.lang.IllegalStateException ( java.io.UnsupportedEncodingException ) ; } return org.springframework.http.codec.MultiValueMap<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.http.codec.MediaType> < MediaType > java.util.List<org.springframework.http.codec.MediaType> ( ) { return java.util.Collections . java.util.List ( MediaType . APPLICATION_FORM_URLENCODED ) ; }  <METHOD_END>