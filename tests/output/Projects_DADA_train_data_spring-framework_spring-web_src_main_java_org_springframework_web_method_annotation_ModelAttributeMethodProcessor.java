<METHOD_START> public void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { return ( org.springframework.web.method.annotation.MethodParameter . hasParameterAnnotation ( ModelAttribute .class ) || ( this . boolean && ! BeanUtils . isSimpleProperty ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final java.lang.Object java.lang.Object ( MethodParameter org.springframework.web.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest , WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory ) throws java.lang.Exception { java.lang.String java.lang.String = ModelFactory . getNameForParameter ( org.springframework.web.method.annotation.MethodParameter ) ; java.lang.Object java.lang.Object = ( org.springframework.web.method.annotation.ModelAndViewContainer . containsAttribute ( java.lang.String ) ? org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . get ( java.lang.String ) : java.lang.Object ( java.lang.String , org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.WebDataBinderFactory , org.springframework.web.method.annotation.NativeWebRequest ) ) ; if ( ! org.springframework.web.method.annotation.ModelAndViewContainer . isBindingDisabled ( java.lang.String ) ) { ModelAttribute org.springframework.web.method.annotation.ModelAttribute = org.springframework.web.method.annotation.MethodParameter . getParameterAnnotation ( ModelAttribute .class ) ; if ( org.springframework.web.method.annotation.ModelAttribute != null && ! org.springframework.web.method.annotation.ModelAttribute . binding ( ) ) { org.springframework.web.method.annotation.ModelAndViewContainer . setBindingDisabled ( java.lang.String ) ; } } WebDataBinder org.springframework.web.method.annotation.WebDataBinder = org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ; if ( org.springframework.web.method.annotation.WebDataBinder . getTarget ( ) != null ) { if ( ! org.springframework.web.method.annotation.ModelAndViewContainer . isBindingDisabled ( java.lang.String ) ) { void ( org.springframework.web.method.annotation.WebDataBinder , org.springframework.web.method.annotation.NativeWebRequest ) ; } void ( org.springframework.web.method.annotation.WebDataBinder , org.springframework.web.method.annotation.MethodParameter ) ; if ( org.springframework.web.method.annotation.WebDataBinder . getBindingResult ( ) . hasErrors ( ) && boolean ( org.springframework.web.method.annotation.WebDataBinder , org.springframework.web.method.annotation.MethodParameter ) ) { throw new BindException ( org.springframework.web.method.annotation.WebDataBinder . getBindingResult ( ) ) ; } } java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.web.method.annotation.WebDataBinder . getBindingResult ( ) . getModel ( ) ; org.springframework.web.method.annotation.ModelAndViewContainer . removeAttributes ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.web.method.annotation.ModelAndViewContainer . addAllAttributes ( java.util.Map<java.lang.String,java.lang.Object> ) ; return ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) . isInstance ( java.lang.Object ) ? java.lang.Object : org.springframework.web.method.annotation.WebDataBinder . convertIfNecessary ( org.springframework.web.method.annotation.WebDataBinder . getTarget ( ) , org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) , org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String , MethodParameter org.springframework.web.method.annotation.MethodParameter , WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ) throws java.lang.Exception { java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] = org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) . getConstructors ( ) ; if ( java.lang.reflect.Constructor<?>[] . int != NUMBER ) { return BeanUtils . instantiateClass ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) ) ; } java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = java.lang.reflect.Constructor<?>[] [ NUMBER ] ; if ( java.lang.reflect.Constructor<> . int ( ) == NUMBER ) { return BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> ) ; } java.beans.ConstructorProperties java.beans.ConstructorProperties = java.lang.reflect.Constructor<> . java.beans.ConstructorProperties ( java.beans.ConstructorProperties .class ) ; java.lang.String [] java.lang.String[] = ( java.beans.ConstructorProperties != null ? java.beans.ConstructorProperties . java.lang.String[] ( ) : org.springframework.web.method.annotation.ParameterNameDiscoverer . getParameterNames ( java.lang.reflect.Constructor<> ) ) ; Assert . state ( java.lang.String[] != null , ( ) STRING + ctor ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) ; Assert . state ( java.lang.String[] . int == java.lang.Class<?>[] . int , ( ) STRING + paramNames . length + STRING + ctor ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [ java.lang.Class<?>[] . int ] ; WebDataBinder org.springframework.web.method.annotation.WebDataBinder = org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( org.springframework.web.method.annotation.NativeWebRequest , null , java.lang.String ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.lang.Object[] [ int ] = org.springframework.web.method.annotation.WebDataBinder . convertIfNecessary ( org.springframework.web.method.annotation.NativeWebRequest . getParameterValues ( java.lang.String[] [ int ] ) , java.lang.Class<?>[] [ int ] , new MethodParameter ( java.lang.reflect.Constructor<> , int ) ) ; } return BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( WebDataBinder org.springframework.web.method.annotation.WebDataBinder , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ) { ( ( WebRequestDataBinder ) org.springframework.web.method.annotation.WebDataBinder ) . bind ( org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> protected void void ( WebDataBinder org.springframework.web.method.annotation.WebDataBinder , MethodParameter org.springframework.web.method.annotation.MethodParameter ) { java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] = org.springframework.web.method.annotation.MethodParameter . getParameterAnnotations ( ) ; for ( java.lang.annotation.Annotation java.lang.annotation.Annotation : java.lang.annotation.Annotation[] ) { Validated org.springframework.web.method.annotation.Validated = AnnotationUtils . getAnnotation ( java.lang.annotation.Annotation , Validated .class ) ; if ( org.springframework.web.method.annotation.Validated != null || java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . java.lang.String ( ) . boolean ( STRING ) ) { java.lang.Object java.lang.Object = ( org.springframework.web.method.annotation.Validated != null ? org.springframework.web.method.annotation.Validated . value ( ) : AnnotationUtils . getValue ( java.lang.annotation.Annotation ) ) ; java.lang.Object [] java.lang.Object[] = ( java.lang.Object instanceof java.lang.Object [] ? ( java.lang.Object [] ) java.lang.Object : new java.lang.Object [] { java.lang.Object } ) ; org.springframework.web.method.annotation.WebDataBinder . validate ( java.lang.Object[] ) ; break; } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( WebDataBinder org.springframework.web.method.annotation.WebDataBinder , MethodParameter org.springframework.web.method.annotation.MethodParameter ) { int int = org.springframework.web.method.annotation.MethodParameter . getParameterIndex ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.web.method.annotation.MethodParameter . getMethod ( ) . getParameterTypes ( ) ; boolean boolean = ( java.lang.Class<?>[] . int > ( int + NUMBER ) && Errors .class . boolean ( java.lang.Class<?>[] [ int + NUMBER ] ) ) ; return ! boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { return ( org.springframework.web.method.annotation.MethodParameter . hasMethodAnnotation ( ModelAttribute .class ) || ( this . boolean && ! BeanUtils . isSimpleProperty ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ) throws java.lang.Exception { if ( java.lang.Object != null ) { java.lang.String java.lang.String = ModelFactory . getNameForReturnValue ( java.lang.Object , org.springframework.web.method.annotation.MethodParameter ) ; org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>