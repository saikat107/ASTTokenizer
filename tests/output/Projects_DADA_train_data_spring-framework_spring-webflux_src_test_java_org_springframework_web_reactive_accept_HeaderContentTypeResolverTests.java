<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.reactive.accept.HeaderContentTypeResolver = new HeaderContentTypeResolver ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ServerWebExchange org.springframework.web.reactive.accept.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . header ( STRING , java.lang.String ) . toExchange ( ) ; java.util.List<org.springframework.web.reactive.accept.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.accept.MediaType> = this . org.springframework.web.reactive.accept.HeaderContentTypeResolver . resolveMediaTypes ( org.springframework.web.reactive.accept.ServerWebExchange ) ; assertEquals ( NUMBER , java.util.List<org.springframework.web.reactive.accept.MediaType> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.web.reactive.accept.MediaType> . get ( NUMBER ) . toString ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.web.reactive.accept.MediaType> . get ( NUMBER ) . toString ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.web.reactive.accept.MediaType> . get ( NUMBER ) . toString ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.web.reactive.accept.MediaType> . get ( NUMBER ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = NotAcceptableStatusException .class ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ServerWebExchange org.springframework.web.reactive.accept.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . header ( STRING , java.lang.String ) . toExchange ( ) ; this . org.springframework.web.reactive.accept.HeaderContentTypeResolver . resolveMediaTypes ( org.springframework.web.reactive.accept.ServerWebExchange ) ; }  <METHOD_END>