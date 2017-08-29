<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( MethodParameter org.springframework.core.MethodParameter , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( org.springframework.core.MethodParameter , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; org.springframework.core.MethodParameter . setContainingClass ( java.lang.Class<> ) ; ResolvableType . resolveMethodParameter ( org.springframework.core.MethodParameter ) ; return org.springframework.core.MethodParameter . getParameterType ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.reflect.Method , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; return ResolvableType . forMethodReturnType ( java.lang.reflect.Method , java.lang.Class<> ) . resolve ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.reflect.Method , STRING ) ; ResolvableType org.springframework.core.ResolvableType = ResolvableType . forMethodReturnType ( java.lang.reflect.Method ) . as ( java.lang.Class<> ) ; if ( ! org.springframework.core.ResolvableType . hasGenerics ( ) || org.springframework.core.ResolvableType . getType ( ) instanceof java.lang.reflect.WildcardType ) { return null ; } return java.lang.Class<?> ( org.springframework.core.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { ResolvableType org.springframework.core.ResolvableType = ResolvableType . forClass ( java.lang.Class<> ) . as ( java.lang.Class<> ) ; if ( ! org.springframework.core.ResolvableType . hasGenerics ( ) ) { return null ; } return java.lang.Class<?> ( org.springframework.core.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( ResolvableType org.springframework.core.ResolvableType ) { Assert . isTrue ( org.springframework.core.ResolvableType . getGenerics ( ) . length == NUMBER , ( ) STRING + resolvableType + STRING + resolvableType . getGenerics ( ) . length ) ; return org.springframework.core.ResolvableType . getGeneric ( ) . resolve ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { ResolvableType org.springframework.core.ResolvableType = ResolvableType . forClass ( java.lang.Class<> ) . as ( java.lang.Class<> ) ; if ( ! org.springframework.core.ResolvableType . hasGenerics ( ) || org.springframework.core.ResolvableType . isEntirelyUnresolvable ( ) ) { return null ; } return org.springframework.core.ResolvableType . resolveGenerics ( java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.reflect.Type java.lang.reflect.Type ( java.lang.reflect.Type java.lang.reflect.Type , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> != null ) { if ( java.lang.reflect.Type instanceof java.lang.reflect.TypeVariable ) { ResolvableType org.springframework.core.ResolvableType = org.springframework.core.ResolvableType ( ( java.lang.reflect.TypeVariable<?> < ? > ) java.lang.reflect.Type , ResolvableType . forClass ( java.lang.Class<> ) ) ; if ( org.springframework.core.ResolvableType != ResolvableType . NONE ) { return org.springframework.core.ResolvableType . resolve ( ) ; } } else if ( java.lang.reflect.Type instanceof java.lang.reflect.ParameterizedType ) { ResolvableType org.springframework.core.ResolvableType = ResolvableType . forType ( java.lang.reflect.Type ) ; if ( org.springframework.core.ResolvableType . hasUnresolvableGenerics ( ) ) { java.lang.reflect.ParameterizedType java.lang.reflect.ParameterizedType = ( java.lang.reflect.ParameterizedType ) java.lang.reflect.Type ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [ java.lang.reflect.ParameterizedType . java.lang.reflect.Type[] ( ) . int ] ; java.lang.reflect.Type [] java.lang.reflect.Type[] = java.lang.reflect.ParameterizedType . java.lang.reflect.Type[] ( ) ; for ( int int = NUMBER ; int < java.lang.reflect.Type[] . int ; int ++ ) { java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Type[] [ int ] ; if ( java.lang.reflect.Type instanceof java.lang.reflect.TypeVariable ) { ResolvableType org.springframework.core.ResolvableType = org.springframework.core.ResolvableType ( ( java.lang.reflect.TypeVariable<?> < ? > ) java.lang.reflect.Type , ResolvableType . forClass ( java.lang.Class<> ) ) ; if ( org.springframework.core.ResolvableType != ResolvableType . NONE ) { java.lang.Class<?>[] [ int ] = org.springframework.core.ResolvableType . resolve ( ) ; } else { java.lang.Class<?>[] [ int ] = ResolvableType . forType ( java.lang.reflect.Type ) . resolve ( ) ; } } else { java.lang.Class<?>[] [ int ] = ResolvableType . forType ( java.lang.reflect.Type ) . resolve ( ) ; } } return ResolvableType . forClassWithGenerics ( org.springframework.core.ResolvableType . getRawClass ( ) , java.lang.Class<?>[] ) . getType ( ) ; } } } return java.lang.reflect.Type ; }  <METHOD_END>
<METHOD_START> private static org.springframework.core.ResolvableType org.springframework.core.ResolvableType ( java.lang.reflect.TypeVariable<?> < ? > java.lang.reflect.TypeVariable<?> , ResolvableType org.springframework.core.ResolvableType ) { ResolvableType org.springframework.core.ResolvableType ; if ( org.springframework.core.ResolvableType . hasGenerics ( ) ) { org.springframework.core.ResolvableType = ResolvableType . forType ( java.lang.reflect.TypeVariable<> , org.springframework.core.ResolvableType ) ; if ( org.springframework.core.ResolvableType . resolve ( ) != null ) { return org.springframework.core.ResolvableType ; } } ResolvableType org.springframework.core.ResolvableType = org.springframework.core.ResolvableType . getSuperType ( ) ; if ( org.springframework.core.ResolvableType != ResolvableType . NONE ) { org.springframework.core.ResolvableType = org.springframework.core.ResolvableType ( java.lang.reflect.TypeVariable<> , org.springframework.core.ResolvableType ) ; if ( org.springframework.core.ResolvableType . resolve ( ) != null ) { return org.springframework.core.ResolvableType ; } } for ( ResolvableType org.springframework.core.ResolvableType : org.springframework.core.ResolvableType . getInterfaces ( ) ) { org.springframework.core.ResolvableType = org.springframework.core.ResolvableType ( java.lang.reflect.TypeVariable<> , org.springframework.core.ResolvableType ) ; if ( org.springframework.core.ResolvableType . resolve ( ) != null ) { return org.springframework.core.ResolvableType ; } } return ResolvableType . NONE ; }  <METHOD_END>