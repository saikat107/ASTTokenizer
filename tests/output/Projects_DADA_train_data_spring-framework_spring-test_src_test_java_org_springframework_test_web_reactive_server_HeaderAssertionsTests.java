<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.test.web.reactive.server.HttpHeaders . add ( STRING , STRING ) ; HeaderAssertions org.springframework.test.web.reactive.server.HeaderAssertions = org.springframework.test.web.reactive.server.HeaderAssertions ( org.springframework.test.web.reactive.server.HttpHeaders ) ; org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING ) ; try { org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } try { org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } try { org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.test.web.reactive.server.HttpHeaders . add ( STRING , STRING ) ; org.springframework.test.web.reactive.server.HttpHeaders . add ( STRING , STRING ) ; HeaderAssertions org.springframework.test.web.reactive.server.HeaderAssertions = org.springframework.test.web.reactive.server.HeaderAssertions ( org.springframework.test.web.reactive.server.HttpHeaders ) ; org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING , STRING ) ; try { org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } try { org.springframework.test.web.reactive.server.HeaderAssertions . valueEquals ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.test.web.reactive.server.HttpHeaders . setContentType ( MediaType . APPLICATION_JSON_UTF8 ) ; HeaderAssertions org.springframework.test.web.reactive.server.HeaderAssertions = org.springframework.test.web.reactive.server.HeaderAssertions ( org.springframework.test.web.reactive.server.HttpHeaders ) ; org.springframework.test.web.reactive.server.HeaderAssertions . valueMatches ( STRING , STRING ) ; try { org.springframework.test.web.reactive.server.HeaderAssertions . valueMatches ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { java.lang.Throwable java.lang.Throwable = java.lang.AssertionError . java.lang.Throwable ( ) ; assertNotNull ( java.lang.Throwable ) ; assertEquals ( STRING + STRING , java.lang.Throwable . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.test.web.reactive.server.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . noTransform ( ) ; HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.test.web.reactive.server.HttpHeaders . setCacheControl ( org.springframework.test.web.reactive.server.CacheControl . getHeaderValue ( ) ) ; HeaderAssertions org.springframework.test.web.reactive.server.HeaderAssertions = org.springframework.test.web.reactive.server.HeaderAssertions ( org.springframework.test.web.reactive.server.HttpHeaders ) ; org.springframework.test.web.reactive.server.HeaderAssertions . cacheControl ( org.springframework.test.web.reactive.server.CacheControl ) ; try { org.springframework.test.web.reactive.server.HeaderAssertions . cacheControl ( CacheControl . noStore ( ) ) ; fail ( STRING ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { } }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.reactive.server.HeaderAssertions org.springframework.test.web.reactive.server.HeaderAssertions ( HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders ) { MockClientHttpRequest org.springframework.test.web.reactive.server.MockClientHttpRequest = new MockClientHttpRequest ( HttpMethod . GET , java.net.URI . java.net.URI ( STRING ) ) ; MockClientHttpResponse org.springframework.test.web.reactive.server.MockClientHttpResponse = new MockClientHttpResponse ( HttpStatus . OK ) ; org.springframework.test.web.reactive.server.MockClientHttpResponse . getHeaders ( ) . putAll ( org.springframework.test.web.reactive.server.HttpHeaders ) ; WiretapClientHttpRequest org.springframework.test.web.reactive.server.WiretapClientHttpRequest = new WiretapClientHttpRequest ( org.springframework.test.web.reactive.server.MockClientHttpRequest ) ; WiretapClientHttpResponse org.springframework.test.web.reactive.server.WiretapClientHttpResponse = new WiretapClientHttpResponse ( org.springframework.test.web.reactive.server.MockClientHttpResponse ) ; ExchangeResult org.springframework.test.web.reactive.server.ExchangeResult = new ExchangeResult ( org.springframework.test.web.reactive.server.WiretapClientHttpRequest , org.springframework.test.web.reactive.server.WiretapClientHttpResponse ) ; return new HeaderAssertions ( org.springframework.test.web.reactive.server.ExchangeResult , mock ( WebTestClient . WebTestClient .class ) ) ; }  <METHOD_END>