<METHOD_START> public void ( java.util.List<T> < T > java.util.List<T> , Pageable org.springframework.data.domain.Pageable ) { Assert . notNull ( java.util.List<T> , STRING ) ; Assert . notNull ( org.springframework.data.domain.Pageable , STRING ) ; this . java.util.List<T> . boolean ( java.util.List<T> ) ; this . org.springframework.data.domain.Pageable = org.springframework.data.domain.Pageable ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return org.springframework.data.domain.Pageable . isPaged ( ) ? org.springframework.data.domain.Pageable . getPageNumber ( ) : NUMBER ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return org.springframework.data.domain.Pageable . isPaged ( ) ? org.springframework.data.domain.Pageable . getPageSize ( ) : NUMBER ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return java.util.List<T> . int ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return int ( ) > NUMBER ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! hasNext ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.domain.Pageable org.springframework.data.domain.Pageable ( ) { return hasNext ( ) ? org.springframework.data.domain.Pageable . next ( ) : Pageable . unpaged ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.domain.Pageable org.springframework.data.domain.Pageable ( ) { return boolean ( ) ? org.springframework.data.domain.Pageable . previousOrFirst ( ) : Pageable . unpaged ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! java.util.List<T> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<T> < T > java.util.List<T> ( ) { return java.util.Collections . java.util.List<T> ( java.util.List<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.domain.Sort org.springframework.data.domain.Sort ( ) { return org.springframework.data.domain.Pageable . getSort ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Iterator<T> < T > java.util.Iterator<T> ( ) { return java.util.List<T> . java.util.Iterator<T> ( ) ; }  <METHOD_END>
<METHOD_START> protected < U > java.util.List<U> < U > java.util.List<U> ( java.util.function.Function<? super T,? extends U> < ? super T , ? extends U > java.util.function.Function<? super T,? extends U> ) { Assert . notNull ( java.util.function.Function<,> , STRING ) ; return this . stream ( ) . map ( java.util.function.Function<,> :: apply ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.data.domain.Chunk<?> < ? > ) ) { return false ; } org.springframework.data.domain.Chunk<?> < ? > org.springframework.data.domain.Chunk<?> = ( org.springframework.data.domain.Chunk<?> < ? > ) java.lang.Object ; boolean boolean = this . java.util.List<T> . boolean ( org.springframework.data.domain.Chunk<> . java.util.List<> ) ; boolean boolean = this . org.springframework.data.domain.Pageable . equals ( org.springframework.data.domain.Chunk<> . org.springframework.data.domain.Pageable ) ; return boolean && boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; int += NUMBER * org.springframework.data.domain.Pageable . hashCode ( ) ; int += NUMBER * java.util.List<T> . int ( ) ; return int ; }  <METHOD_END>