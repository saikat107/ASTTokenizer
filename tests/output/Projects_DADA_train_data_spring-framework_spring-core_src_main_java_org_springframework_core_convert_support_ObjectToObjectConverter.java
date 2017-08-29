<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.core.convert.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.core.convert.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.lang.Object .class , java.lang.Object .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { return ( org.springframework.core.convert.support.TypeDescriptor . getType ( ) != org.springframework.core.convert.support.TypeDescriptor . getType ( ) && boolean ( org.springframework.core.convert.support.TypeDescriptor . getType ( ) , org.springframework.core.convert.support.TypeDescriptor . getType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { if ( java.lang.Object == null ) { return null ; } java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.core.convert.support.TypeDescriptor . getType ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.core.convert.support.TypeDescriptor . getType ( ) ; java.lang.reflect.Member java.lang.reflect.Member = java.lang.reflect.Member ( java.lang.Class<> , java.lang.Class<> ) ; try { if ( java.lang.reflect.Member instanceof java.lang.reflect.Method ) { java.lang.reflect.Method java.lang.reflect.Method = ( java.lang.reflect.Method ) java.lang.reflect.Member ; ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; if ( ! java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ) { return java.lang.reflect.Method . java.lang.Object ( java.lang.Object ) ; } else { return java.lang.reflect.Method . java.lang.Object ( null , java.lang.Object ) ; } } else if ( java.lang.reflect.Member instanceof java.lang.reflect.Constructor ) { java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = ( java.lang.reflect.Constructor<?> < ? > ) java.lang.reflect.Member ; ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<> ) ; return java.lang.reflect.Constructor<> . newInstance ( java.lang.Object ) ; } } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw new ConversionFailedException ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor , java.lang.Object , java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new ConversionFailedException ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor , java.lang.Object , java.lang.Throwable ) ; } throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING + STRING , java.lang.Class<> . java.lang.String ( ) , java.lang.Class<> . java.lang.String ( ) , java.lang.Class<> . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> static boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.reflect.Member ( java.lang.Class<> , java.lang.Class<> ) != null ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.reflect.Member java.lang.reflect.Member ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.reflect.Member java.lang.reflect.Member = java.util.Map<java.lang.Class<?>,java.lang.reflect.Member> . java.lang.reflect.Member ( java.lang.Class<> ) ; if ( boolean ( java.lang.reflect.Member , java.lang.Class<> ) ) { return java.lang.reflect.Member ; } java.lang.reflect.Member = java.lang.reflect.Method ( java.lang.Class<> , java.lang.Class<> ) ; if ( java.lang.reflect.Member == null ) { java.lang.reflect.Member = java.lang.reflect.Method ( java.lang.Class<> , java.lang.Class<> ) ; if ( java.lang.reflect.Member == null ) { java.lang.reflect.Member = java.lang.reflect.Constructor<?> ( java.lang.Class<> , java.lang.Class<> ) ; if ( java.lang.reflect.Member == null ) { return null ; } } } java.util.Map<java.lang.Class<?>,java.lang.reflect.Member> . java.lang.reflect.Member ( java.lang.Class<> , java.lang.reflect.Member ) ; return java.lang.reflect.Member ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.lang.reflect.Member java.lang.reflect.Member , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.reflect.Member instanceof java.lang.reflect.Method ) { java.lang.reflect.Method java.lang.reflect.Method = ( java.lang.reflect.Method ) java.lang.reflect.Member ; return ( ! java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) ? ClassUtils . isAssignable ( java.lang.reflect.Method . java.lang.Class<?> ( ) , java.lang.Class<> ) : java.lang.reflect.Method . java.lang.Class<?>[] ( ) [ NUMBER ] == java.lang.Class<> ) ; } else if ( java.lang.reflect.Member instanceof java.lang.reflect.Constructor ) { java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = ( java.lang.reflect.Constructor<?> < ? > ) java.lang.reflect.Member ; return ( java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) [ NUMBER ] == java.lang.Class<> ) ; } else { return false ; } }  <METHOD_END>
<METHOD_START> private static java.lang.reflect.Method java.lang.reflect.Method ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.String .class == java.lang.Class<> || java.lang.String .class == java.lang.Class<> ) { return null ; } java.lang.reflect.Method java.lang.reflect.Method = ClassUtils . getMethodIfAvailable ( java.lang.Class<> , STRING + java.lang.Class<> . java.lang.String ( ) ) ; return ( java.lang.reflect.Method != null && ! java.lang.reflect.Modifier . boolean ( java.lang.reflect.Method . int ( ) ) && ClassUtils . isAssignable ( java.lang.Class<> , java.lang.reflect.Method . java.lang.Class<?> ( ) ) ? java.lang.reflect.Method : null ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.reflect.Method java.lang.reflect.Method ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.String .class == java.lang.Class<> ) { return null ; } java.lang.reflect.Method java.lang.reflect.Method = ClassUtils . getStaticMethod ( java.lang.Class<> , STRING , java.lang.Class<> ) ; if ( java.lang.reflect.Method == null ) { java.lang.reflect.Method = ClassUtils . getStaticMethod ( java.lang.Class<> , STRING , java.lang.Class<> ) ; if ( java.lang.reflect.Method == null ) { java.lang.reflect.Method = ClassUtils . getStaticMethod ( java.lang.Class<> , STRING , java.lang.Class<> ) ; } } return java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> private static java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return ClassUtils . getConstructorIfAvailable ( java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>