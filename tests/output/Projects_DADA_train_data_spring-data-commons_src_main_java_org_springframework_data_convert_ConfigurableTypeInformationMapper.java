<METHOD_START> public void ( java.util.Map<? extends java.lang.Class<?>,java.lang.String> < ? extends java.lang.Class<?> < ? > , java.lang.String > java.util.Map<? extends java.lang.Class<?>,java.lang.String> ) { Assert . notNull ( java.util.Map<,java.lang.String> , STRING ) ; this . java.util.Map<org.springframework.data.convert.ClassTypeInformation<?>,org.springframework.data.convert.Alias> = new java.util.HashMap <> ( java.util.Map<,java.lang.String> . int ( ) ) ; this . java.util.Map<org.springframework.data.convert.Alias,org.springframework.data.convert.ClassTypeInformation<?>> = new java.util.HashMap <> ( java.util.Map<,java.lang.String> . int ( ) ) ; for ( java.util.Map.Entry<? extends java.lang.Class<?>,java.lang.String> < ? extends java.lang.Class<?> < ? > , java.lang.String > java.util.Map.Entry<? extends java.lang.Class<?>,java.lang.String> : java.util.Map<,java.lang.String> . java.util.Set<java.util.Map.Entry<,java.lang.String>> ( ) ) { ClassTypeInformation < ? > org.springframework.data.convert.ClassTypeInformation<?> = ClassTypeInformation . from ( java.util.Map.Entry<,java.lang.String> . getKey ( ) ) ; Alias org.springframework.data.convert.Alias = Alias . of ( java.util.Map.Entry<,java.lang.String> . java.lang.String ( ) ) ; if ( java.util.Map<org.springframework.data.convert.ClassTypeInformation<?>,org.springframework.data.convert.Alias> . containsValue ( org.springframework.data.convert.Alias ) ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.convert.Alias ) ) ; } this . java.util.Map<org.springframework.data.convert.ClassTypeInformation<?>,org.springframework.data.convert.Alias> . put ( org.springframework.data.convert.ClassTypeInformation<> , org.springframework.data.convert.Alias ) ; this . java.util.Map<org.springframework.data.convert.Alias,org.springframework.data.convert.ClassTypeInformation<?>> . put ( org.springframework.data.convert.Alias , org.springframework.data.convert.ClassTypeInformation<> ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.data.convert.Alias org.springframework.data.convert.Alias ( TypeInformation < ? > org.springframework.data.convert.TypeInformation<?> ) { return java.util.Map<org.springframework.data.convert.ClassTypeInformation<?>,org.springframework.data.convert.Alias> . getOrDefault ( org.springframework.data.convert.TypeInformation<> , Alias . NONE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.data.convert.TypeInformation<?>> < TypeInformation < ? > > java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( Alias org.springframework.data.convert.Alias ) { return java.util.Optional . java.util.Optional ( java.util.Map<org.springframework.data.convert.Alias,org.springframework.data.convert.ClassTypeInformation<?>> . get ( org.springframework.data.convert.Alias ) ) ; }  <METHOD_END>