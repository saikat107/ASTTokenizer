<METHOD_START> @ Test public void void ( ) java.lang.Exception { DelegatingHandlerMapping org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping = new DelegatingHandlerMapping ( java.util.Arrays . java.util.List ( org.springframework.data.rest.webmvc.support.HandlerMapping , org.springframework.data.rest.webmvc.support.HandlerMapping ) ) ; void ( org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping , HttpMediaTypeNotAcceptableException .class ) ; void ( org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping , HttpRequestMethodNotSupportedException .class ) ; void ( org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping , UnsatisfiedServletRequestParameterException .class ) ; }  <METHOD_END>
<METHOD_START> private final void void ( HandlerMapping org.springframework.data.rest.webmvc.support.HandlerMapping , java.lang.Class<? extends java.lang.Exception> < ? extends java.lang.Exception > java.lang.Class<? extends java.lang.Exception> )			throws java.lang.Exception { when ( org.springframework.data.rest.webmvc.support.HandlerMapping . getHandler ( org.springframework.data.rest.webmvc.support.HttpServletRequest ) ) . thenThrow ( java.lang.Class<> ) ; try { org.springframework.data.rest.webmvc.support.HandlerMapping . getHandler ( org.springframework.data.rest.webmvc.support.HttpServletRequest ) ; fail ( java.lang.String . java.lang.String ( STRING , java.lang.Class<> . java.lang.String ( ) ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception ) . isInstanceOf ( java.lang.Class<> ) ; verify ( org.springframework.data.rest.webmvc.support.HandlerMapping , times ( NUMBER ) ) . getHandler ( org.springframework.data.rest.webmvc.support.HttpServletRequest ) ; } finally { reset ( org.springframework.data.rest.webmvc.support.HandlerMapping , org.springframework.data.rest.webmvc.support.HandlerMapping ) ; } }  <METHOD_END>