<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathResource org.springframework.web.reactive.function.server.ClassPathResource = new ClassPathResource ( STRING ) ; PathResourceLookupFunction org.springframework.web.reactive.function.server.PathResourceLookupFunction = new PathResourceLookupFunction ( STRING , org.springframework.web.reactive.function.server.ClassPathResource ) ; MockServerRequest org.springframework.web.reactive.function.server.MockServerRequest = MockServerRequest . builder ( ) . uri ( new java.net.URI ( STRING ) ) . build ( ) ; Mono < Resource > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> = org.springframework.web.reactive.function.server.PathResourceLookupFunction . apply ( org.springframework.web.reactive.function.server.MockServerRequest ) ; java.io.File java.io.File = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.function.server.PathResourceLookupFunctionTests> ( ) ) . getFile ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> ) . expectNextMatches ( resource -> { try { return expected . equals ( resource . getFile ( ) ) ; } catch ( IOException ex ) { return false ; } } ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathResource org.springframework.web.reactive.function.server.ClassPathResource = new ClassPathResource ( STRING ) ; PathResourceLookupFunction org.springframework.web.reactive.function.server.PathResourceLookupFunction = new PathResourceLookupFunction ( STRING , org.springframework.web.reactive.function.server.ClassPathResource ) ; MockServerRequest org.springframework.web.reactive.function.server.MockServerRequest = MockServerRequest . builder ( ) . uri ( new java.net.URI ( STRING ) ) . build ( ) ; Mono < Resource > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> = org.springframework.web.reactive.function.server.PathResourceLookupFunction . apply ( org.springframework.web.reactive.function.server.MockServerRequest ) ; java.io.File java.io.File = new ClassPathResource ( STRING ) . getFile ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> ) . expectNextMatches ( resource -> { try { return expected . equals ( resource . getFile ( ) ) ; } catch ( IOException ex ) { return false ; } } ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathResource org.springframework.web.reactive.function.server.ClassPathResource = new ClassPathResource ( STRING ) ; PathResourceLookupFunction org.springframework.web.reactive.function.server.PathResourceLookupFunction = new PathResourceLookupFunction ( STRING , org.springframework.web.reactive.function.server.ClassPathResource ) ; MockServerRequest org.springframework.web.reactive.function.server.MockServerRequest = MockServerRequest . builder ( ) . uri ( new java.net.URI ( STRING ) ) . build ( ) ; Mono < Resource > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> = org.springframework.web.reactive.function.server.PathResourceLookupFunction . apply ( org.springframework.web.reactive.function.server.MockServerRequest ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource> ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>