<METHOD_START> public void ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) { this( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , null ); }  <METHOD_END>
<METHOD_START> public void ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ) { Assert . notEmpty ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , STRING ) ; this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> = java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ; this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; this . org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain = new RequestResponseBodyAdviceChain ( java.util.List<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> private static java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) { java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.method.annotation.MediaType> <> ( ) ; for ( HttpMessageConverter < ? > org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?> : java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) { java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> . addAll ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getSupportedMediaTypes ( ) ) ; } java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = new java.util.ArrayList <> ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; MediaType . sortBySpecificity ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; return java.util.Collections . java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) { return this . org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ; }  <METHOD_END>
<METHOD_START> protected < T > java.lang.Object java.lang.Object ( NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type java.lang.reflect.Type ) throws java.io.IOException , org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotSupportedException , org.springframework.web.servlet.mvc.method.annotation.HttpMessageNotReadableException { HttpInputMessage org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; return java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > java.lang.Object java.lang.Object ( HttpInputMessage org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type java.lang.reflect.Type ) throws java.io.IOException , org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotSupportedException , org.springframework.web.servlet.mvc.method.annotation.HttpMessageNotReadableException { MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType ; boolean boolean = false ; try { org.springframework.web.servlet.mvc.method.annotation.MediaType = org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getHeaders ( ) . getContentType ( ) ; } catch ( InvalidMediaTypeException org.springframework.web.servlet.mvc.method.annotation.InvalidMediaTypeException ) { throw new HttpMediaTypeNotSupportedException ( org.springframework.web.servlet.mvc.method.annotation.InvalidMediaTypeException . getMessage ( ) ) ; } if ( org.springframework.web.servlet.mvc.method.annotation.MediaType == null ) { boolean = true ; org.springframework.web.servlet.mvc.method.annotation.MediaType = MediaType . APPLICATION_OCTET_STREAM ; } java.lang.Class<?> < ? > java.lang.Class<?> = ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter != null ? org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getContainingClass ( ) : null ) ; java.lang.Class<T> < T > java.lang.Class<T> = ( java.lang.reflect.Type instanceof java.lang.Class ? ( java.lang.Class<T> < T > ) java.lang.reflect.Type : null ) ; if ( java.lang.Class<T> == null ) { ResolvableType org.springframework.web.servlet.mvc.method.annotation.ResolvableType = ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter != null ? ResolvableType . forMethodParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) : ResolvableType . forType ( java.lang.reflect.Type ) ) ; java.lang.Class<T> = ( java.lang.Class<T> < T > ) org.springframework.web.servlet.mvc.method.annotation.ResolvableType . resolve ( ) ; } HttpMethod org.springframework.web.servlet.mvc.method.annotation.HttpMethod = ( ( HttpRequest ) org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) . getMethod ( ) ; java.lang.Object java.lang.Object = java.lang.Object ; try { org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage = new org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodArgumentResolver.EmptyBodyCheckingHttpInputMessage ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) ; for ( HttpMessageConverter < ? > org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?> : this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) { java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> = ( java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getClass ( ) ; if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> instanceof GenericHttpMessageConverter ) { GenericHttpMessageConverter < ? > org.springframework.web.servlet.mvc.method.annotation.GenericHttpMessageConverter<?> = ( GenericHttpMessageConverter < ? > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ; if ( org.springframework.web.servlet.mvc.method.annotation.GenericHttpMessageConverter<> . canRead ( java.lang.reflect.Type , java.lang.Class<> , org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + java.lang.reflect.Type + STRING + org.springframework.web.servlet.mvc.method.annotation.MediaType + STRING + org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> + STRING ) ; } if ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getBody ( ) != null ) { org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . beforeBodyRead ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.GenericHttpMessageConverter<> . read ( java.lang.reflect.Type , java.lang.Class<> , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) ; java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . afterBodyRead ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; } else { java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . handleEmptyBody ( null , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; } break; } } else if ( java.lang.Class<T> != null ) { if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . canRead ( java.lang.Class<T> , org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + java.lang.reflect.Type + STRING + org.springframework.web.servlet.mvc.method.annotation.MediaType + STRING + org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> + STRING ) ; } if ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getBody ( ) != null ) { org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . beforeBodyRead ( org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; java.lang.Object = ( ( HttpMessageConverter < T > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ) . read ( java.lang.Class<T> , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) ; java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . afterBodyRead ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; } else { java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyAdviceChain ( ) . handleEmptyBody ( null , org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , java.lang.reflect.Type , java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ; } break; } } } } catch ( java.io.IOException java.io.IOException ) { throw new HttpMessageNotReadableException ( STRING + java.io.IOException . java.lang.String ( ) , java.io.IOException ) ; } if ( java.lang.Object == java.lang.Object ) { if ( org.springframework.web.servlet.mvc.method.annotation.HttpMethod == null || ! java.util.Set<org.springframework.web.servlet.mvc.method.annotation.HttpMethod> . contains ( org.springframework.web.servlet.mvc.method.annotation.HttpMethod ) || ( boolean && org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getBody ( ) == null ) ) { return null ; } throw new HttpMediaTypeNotSupportedException ( org.springframework.web.servlet.mvc.method.annotation.MediaType , this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest ( NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest = org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getNativeRequest ( HttpServletRequest .class ) ; return new ServletServerHttpRequest ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest ) ; }  <METHOD_END>
<METHOD_START> protected void void ( WebDataBinder org.springframework.web.servlet.mvc.method.annotation.WebDataBinder , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] = org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterAnnotations ( ) ; for ( java.lang.annotation.Annotation java.lang.annotation.Annotation : java.lang.annotation.Annotation[] ) { Validated org.springframework.web.servlet.mvc.method.annotation.Validated = AnnotationUtils . getAnnotation ( java.lang.annotation.Annotation , Validated .class ) ; if ( org.springframework.web.servlet.mvc.method.annotation.Validated != null || java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . java.lang.String ( ) . boolean ( STRING ) ) { java.lang.Object java.lang.Object = ( org.springframework.web.servlet.mvc.method.annotation.Validated != null ? org.springframework.web.servlet.mvc.method.annotation.Validated . value ( ) : AnnotationUtils . getValue ( java.lang.annotation.Annotation ) ) ; java.lang.Object [] java.lang.Object[] = ( java.lang.Object instanceof java.lang.Object [] ? ( java.lang.Object [] ) java.lang.Object : new java.lang.Object [] { java.lang.Object } ) ; org.springframework.web.servlet.mvc.method.annotation.WebDataBinder . validate ( java.lang.Object[] ) ; break; } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( WebDataBinder org.springframework.web.servlet.mvc.method.annotation.WebDataBinder , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { int int = org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterIndex ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getMethod ( ) . getParameterTypes ( ) ; boolean boolean = ( java.lang.Class<?>[] . int > ( int + NUMBER ) && Errors .class . boolean ( java.lang.Class<?>[] [ int + NUMBER ] ) ) ; return ! boolean ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { if ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) == java.util.Optional .class ) { if ( java.lang.Object == null || ( java.lang.Object instanceof java.util.Collection && ( ( java.util.Collection ) java.lang.Object ) . boolean ( ) ) || ( java.lang.Object instanceof java.lang.Object [] && ( ( java.lang.Object [] ) java.lang.Object ) . int == NUMBER ) ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( ) ; } else { return java.util.Optional . java.util.Optional<java.lang.Object> ( java.lang.Object ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void ( HttpInputMessage org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) throws java.io.IOException { this . org.springframework.web.servlet.mvc.method.annotation.HttpHeaders = org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getHeaders ( ) ; java.io.InputStream java.io.InputStream = org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage . getBody ( ) ; if ( java.io.InputStream == null ) { this . java.io.InputStream = null ; } else if ( java.io.InputStream . boolean ( ) ) { java.io.InputStream . void ( NUMBER ) ; this . java.io.InputStream = ( java.io.InputStream . int ( ) != - NUMBER ? java.io.InputStream : null ) ; java.io.InputStream . void ( ) ; } else { java.io.PushbackInputStream java.io.PushbackInputStream = new java.io.PushbackInputStream ( java.io.InputStream ) ; int int = java.io.PushbackInputStream . int ( ) ; if ( int == - NUMBER ) { this . java.io.InputStream = null ; } else { this . java.io.InputStream = java.io.PushbackInputStream ; java.io.PushbackInputStream . void ( int ) ; } } this . org.springframework.web.servlet.mvc.method.annotation.HttpMethod = ( ( HttpRequest ) org.springframework.web.servlet.mvc.method.annotation.HttpInputMessage ) . getMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.method.annotation.HttpHeaders org.springframework.web.servlet.mvc.method.annotation.HttpHeaders ( ) { return this . org.springframework.web.servlet.mvc.method.annotation.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return this . java.io.InputStream ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.HttpMethod org.springframework.web.servlet.mvc.method.annotation.HttpMethod ( ) { return this . org.springframework.web.servlet.mvc.method.annotation.HttpMethod ; }  <METHOD_END>