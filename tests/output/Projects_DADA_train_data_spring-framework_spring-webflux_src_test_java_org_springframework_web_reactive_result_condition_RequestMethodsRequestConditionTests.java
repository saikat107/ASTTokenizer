<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new RequestMethodsRequestCondition ( GET ) , GET ) ; void ( new RequestMethodsRequestCondition ( GET , POST ) , GET ) ; void ( new RequestMethodsRequestCondition ( GET ) , POST ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new RequestMethodsRequestCondition ( HEAD ) , HEAD ) ; void ( new RequestMethodsRequestCondition ( GET ) , HEAD ) ; void ( new RequestMethodsRequestCondition ( POST ) , HEAD ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( ) ; for ( RequestMethod org.springframework.web.reactive.result.condition.RequestMethod : RequestMethod . values ( ) ) { if ( ! OPTIONS . equals ( org.springframework.web.reactive.result.condition.RequestMethod ) ) { ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( org.springframework.web.reactive.result.condition.RequestMethod . name ( ) ) ; assertNotNull ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; } } void ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , OPTIONS ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( STRING ) ; assertNotNull ( new RequestMethodsRequestCondition ( ) . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; assertNull ( new RequestMethodsRequestCondition ( GET , POST ) . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( STRING ) ; org.springframework.web.reactive.result.condition.ServerWebExchange . getRequest ( ) . getHeaders ( ) . add ( STRING , STRING ) ; org.springframework.web.reactive.result.condition.ServerWebExchange . getRequest ( ) . getHeaders ( ) . add ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; assertNotNull ( new RequestMethodsRequestCondition ( ) . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; assertNotNull ( new RequestMethodsRequestCondition ( PUT ) . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; assertNull ( new RequestMethodsRequestCondition ( DELETE ) . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( GET , HEAD ) ; RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( POST ) ; RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( ) ; ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( STRING ) ; int int = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . compareTo ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , org.springframework.web.reactive.result.condition.ServerWebExchange ) ; assertTrue ( STRING + int , int < NUMBER ) ; int = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . compareTo ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , org.springframework.web.reactive.result.condition.ServerWebExchange ) ; assertTrue ( STRING + int , int > NUMBER ) ; int = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . compareTo ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , org.springframework.web.reactive.result.condition.ServerWebExchange ) ; assertTrue ( STRING + int , int < NUMBER ) ; int = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . compareTo ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , org.springframework.web.reactive.result.condition.ServerWebExchange ) ; assertEquals ( STRING , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( GET ) ; RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = new RequestMethodsRequestCondition ( POST ) ; RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . combine ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition ) ; assertEquals ( NUMBER , org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . getContent ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , RequestMethod org.springframework.web.reactive.result.condition.RequestMethod ) throws java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( org.springframework.web.reactive.result.condition.RequestMethod . name ( ) ) ; RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition = org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ; assertNotNull ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition ) ; assertEquals ( java.util.Collections . java.util.Set ( org.springframework.web.reactive.result.condition.RequestMethod ) , org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . getContent ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( RequestMethodsRequestCondition org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition , RequestMethod org.springframework.web.reactive.result.condition.RequestMethod ) throws java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange = org.springframework.web.reactive.result.condition.ServerWebExchange ( org.springframework.web.reactive.result.condition.RequestMethod . name ( ) ) ; assertNull ( org.springframework.web.reactive.result.condition.RequestMethodsRequestCondition . getMatchingCondition ( org.springframework.web.reactive.result.condition.ServerWebExchange ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.condition.ServerWebExchange org.springframework.web.reactive.result.condition.ServerWebExchange ( java.lang.String java.lang.String ) throws java.net.URISyntaxException { return MockServerHttpRequest . method ( HttpMethod . valueOf ( java.lang.String ) , STRING ) . toExchange ( ) ; }  <METHOD_END>