<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> ) throws java.lang.InstantiationException { WebApplicationContext org.springframework.web.socket.server.standard.WebApplicationContext = ContextLoader . getCurrentWebApplicationContext ( ) ; if ( org.springframework.web.socket.server.standard.WebApplicationContext == null ) { java.lang.String java.lang.String = STRING ; org.springframework.web.socket.server.standard.Log . error ( java.lang.String ) ; throw new java.lang.IllegalStateException ( java.lang.String ) ; } java.lang.String java.lang.String = ClassUtils . getShortNameAsProperty ( java.lang.Class<T> ) ; if ( org.springframework.web.socket.server.standard.WebApplicationContext . containsBean ( java.lang.String ) ) { T T = org.springframework.web.socket.server.standard.WebApplicationContext . getBean ( java.lang.String , java.lang.Class<T> ) ; if ( org.springframework.web.socket.server.standard.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.server.standard.Log . trace ( STRING + T ) ; } return T ; } Component org.springframework.web.socket.server.standard.Component = AnnotationUtils . findAnnotation ( java.lang.Class<T> , Component .class ) ; if ( org.springframework.web.socket.server.standard.Component != null && org.springframework.web.socket.server.standard.WebApplicationContext . containsBean ( org.springframework.web.socket.server.standard.Component . value ( ) ) ) { T T = org.springframework.web.socket.server.standard.WebApplicationContext . getBean ( org.springframework.web.socket.server.standard.Component . value ( ) , java.lang.Class<T> ) ; if ( org.springframework.web.socket.server.standard.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.server.standard.Log . trace ( STRING + T ) ; } return T ; } java.lang.String = java.lang.String ( org.springframework.web.socket.server.standard.WebApplicationContext , java.lang.Class<T> ) ; if ( java.lang.String != null ) { return ( T ) org.springframework.web.socket.server.standard.WebApplicationContext . getBean ( java.lang.String ) ; } if ( org.springframework.web.socket.server.standard.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.server.standard.Log . trace ( STRING + java.lang.Class<T> ) ; } return org.springframework.web.socket.server.standard.WebApplicationContext . getAutowireCapableBeanFactory ( ) . createBean ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( WebApplicationContext org.springframework.web.socket.server.standard.WebApplicationContext , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.String java.lang.String = org.springframework.web.socket.server.standard.WebApplicationContext . getId ( ) ; java.util.Map<java.lang.Class<?>,java.lang.String> < java.lang.Class<?> < ? > , java.lang.String > java.util.Map<java.lang.Class<?>,java.lang.String> = java.util.Map<java.lang.String,java.util.Map<java.lang.Class<?>,java.lang.String>> . java.util.Map<java.lang.Class<?>,java.lang.String> ( java.lang.String ) ; if ( java.util.Map<java.lang.Class<?>,java.lang.String> == null ) { java.util.Map<java.lang.Class<?>,java.lang.String> = new java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.util.Map<java.lang.Class<?>,java.lang.String>> . java.util.Map<java.lang.Class<?>,java.lang.String> ( java.lang.String , java.util.Map<java.lang.Class<?>,java.lang.String> ) ; } if ( ! java.util.Map<java.lang.Class<?>,java.lang.String> . boolean ( java.lang.Class<> ) ) { java.lang.String [] java.lang.String[] = org.springframework.web.socket.server.standard.WebApplicationContext . getBeanNamesForType ( java.lang.Class<> ) ; if ( java.lang.String[] . int == NUMBER ) { java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<> , java.lang.String[] [ NUMBER ] ) ; } else { java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<> , java.lang.String ) ; if ( java.lang.String[] . int > NUMBER ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING + java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; } } } java.lang.String java.lang.String = java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<> ) ; return ( java.lang.String . boolean ( java.lang.String ) ? null : java.lang.String ) ; }  <METHOD_END>