<METHOD_START> public void ( TypeAliasAccessor < S > org.springframework.data.convert.TypeAliasAccessor<S> ) { this( org.springframework.data.convert.TypeAliasAccessor<S> , java.util.Collections . java.util.List ( new SimpleTypeInformationMapper ( ) ) ); }  <METHOD_END>
<METHOD_START> public void ( TypeAliasAccessor < S > org.springframework.data.convert.TypeAliasAccessor<S> , java.util.List<? extends org.springframework.data.convert.TypeInformationMapper> < ? extends TypeInformationMapper > java.util.List<? extends org.springframework.data.convert.TypeInformationMapper> ) { this( org.springframework.data.convert.TypeAliasAccessor<S> , null , java.util.List<> ); }  <METHOD_END>
<METHOD_START> public void ( TypeAliasAccessor < S > org.springframework.data.convert.TypeAliasAccessor<S> , MappingContext < ? extends PersistentEntity < ? , ? > , ? > org.springframework.data.convert.MappingContext<? extends org.springframework.data.convert.PersistentEntity<?,?>,?> , java.util.List<? extends org.springframework.data.convert.TypeInformationMapper> < ? extends TypeInformationMapper > java.util.List<? extends org.springframework.data.convert.TypeInformationMapper> ) { Assert . notNull ( org.springframework.data.convert.TypeAliasAccessor<S> , STRING ) ; Assert . notNull ( java.util.List<> , STRING ) ; java.util.List<org.springframework.data.convert.TypeInformationMapper> < TypeInformationMapper > java.util.List<org.springframework.data.convert.TypeInformationMapper> = new java.util.ArrayList<org.springframework.data.convert.TypeInformationMapper> <> ( java.util.List<> . int ( ) + NUMBER ) ; if ( org.springframework.data.convert.MappingContext<,> != null ) { java.util.List<org.springframework.data.convert.TypeInformationMapper> . add ( new MappingContextTypeInformationMapper ( org.springframework.data.convert.MappingContext<,> ) ) ; } java.util.List<org.springframework.data.convert.TypeInformationMapper> . addAll ( java.util.List<> ) ; this . java.util.List<? extends org.springframework.data.convert.TypeInformationMapper> = java.util.Collections . java.util.List<org.springframework.data.convert.TypeInformationMapper> ( java.util.List<org.springframework.data.convert.TypeInformationMapper> ) ; this . org.springframework.data.convert.TypeAliasAccessor<S> = org.springframework.data.convert.TypeAliasAccessor<S> ; this . java.util.Map<org.springframework.data.convert.Alias,java.util.Optional<org.springframework.data.convert.TypeInformation<?>>> = new java.util.concurrent.ConcurrentHashMap <> ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<org.springframework.data.convert.TypeInformation<?>> < TypeInformation < ? > > java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( S S ) { Assert . notNull ( S , STRING ) ; return java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( org.springframework.data.convert.TypeAliasAccessor<S> . readAliasFrom ( S ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<org.springframework.data.convert.TypeInformation<?>> < TypeInformation < ? > > java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( Alias org.springframework.data.convert.Alias ) { return java.util.Map<org.springframework.data.convert.Alias,java.util.Optional<org.springframework.data.convert.TypeInformation<?>>> . computeIfAbsent ( org.springframework.data.convert.Alias , key -> Optionals . firstNonEmpty ( mappers , it -> it . resolveTypeFrom ( alias ) ) ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.data.convert.TypeInformation<? extends T> < ? extends T > org.springframework.data.convert.TypeInformation<? extends T> ( S S , TypeInformation < T > org.springframework.data.convert.TypeInformation<T> ) { Assert . notNull ( S , STRING ) ; Assert . notNull ( org.springframework.data.convert.TypeInformation<T> , STRING ) ; java.util.Optional<org.springframework.data.convert.TypeInformation<? extends T>> < TypeInformation < ? extends T > > java.util.Optional<org.springframework.data.convert.TypeInformation<? extends T>> = java.util.Optional<java.lang.Class<?>> ( S ) . java.util.Optional<org.springframework.data.convert.TypeInformation<? extends T>> ( java.lang.Class<?> -> org.springframework.data.convert.TypeInformation ( java.lang.Class<> , org.springframework.data.convert.TypeInformation<T> ) ) ; return java.util.Optional<org.springframework.data.convert.TypeInformation<? extends T>> . orElse ( org.springframework.data.convert.TypeInformation<T> ) ; }  <METHOD_END>
<METHOD_START> private static < T > org.springframework.data.convert.TypeInformation<? extends T> < ? extends T > org.springframework.data.convert.TypeInformation<? extends T> ( java.lang.Class<?> < ? > java.lang.Class<?> , TypeInformation < T > org.springframework.data.convert.TypeInformation<T> ) { ClassTypeInformation < ? > org.springframework.data.convert.ClassTypeInformation<?> = ClassTypeInformation . from ( java.lang.Class<> ) ; java.lang.Class<T> < T > java.lang.Class<T> = org.springframework.data.convert.TypeInformation<T> . getType ( ) ; return java.lang.Class<T> . boolean ( java.lang.Class<> ) && ! java.lang.Class<T> . boolean ( java.lang.Class<> ) ? org.springframework.data.convert.TypeInformation<T> . specialize ( org.springframework.data.convert.ClassTypeInformation<> ) : org.springframework.data.convert.TypeInformation<T> ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Optional<java.lang.Class<?>> ( S S ) { return java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( S ) . map ( it -> readType ( source ) ) . orElseGet ( ( ) getFallbackTypeFor ( source ) ) . map ( TypeInformation :: getType ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Optional<org.springframework.data.convert.TypeInformation<?>> < TypeInformation < ? > > java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( S S ) { return java.util.Optional . java.util.Optional<org.springframework.data.convert.TypeInformation<?>> ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> , S S ) { void ( ClassTypeInformation . from ( java.lang.Class<> ) , S ) ; }  <METHOD_END>
<METHOD_START> public void void ( TypeInformation < ? > org.springframework.data.convert.TypeInformation<?> , S S ) { Assert . notNull ( org.springframework.data.convert.TypeInformation<> , STRING ) ; org.springframework.data.convert.Alias ( org.springframework.data.convert.TypeInformation<> ) . getValue ( ) . ifPresent ( it -> accessor . writeTypeTo ( sink , it ) ) ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.data.convert.Alias org.springframework.data.convert.Alias ( TypeInformation < ? > org.springframework.data.convert.TypeInformation<?> ) { Assert . notNull ( org.springframework.data.convert.TypeInformation<> , STRING ) ; return Optionals . firstNonEmpty ( java.util.List<> , it -> it . createAliasFor ( info ) , Alias . NONE ) ; }  <METHOD_END>