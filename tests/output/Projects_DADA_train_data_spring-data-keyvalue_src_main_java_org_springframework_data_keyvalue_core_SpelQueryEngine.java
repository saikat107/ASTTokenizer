<METHOD_START> public void ( ) { super( new SpelCriteriaAccessor ( org.springframework.data.keyvalue.core.SpelExpressionParser ) , new SpelSortAccessor ( org.springframework.data.keyvalue.core.SpelExpressionParser ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<?> < ? > java.util.Collection<?> ( SpelCriteria org.springframework.data.keyvalue.core.SpelCriteria , java.util.Comparator<?> < ? > java.util.Comparator<?> , long long , int int , java.io.Serializable java.io.Serializable ) { return java.util.List<?> ( getAdapter ( ) . getAllOf ( java.io.Serializable ) , org.springframework.data.keyvalue.core.SpelCriteria , java.util.Comparator<> , long , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( SpelCriteria org.springframework.data.keyvalue.core.SpelCriteria , java.io.Serializable java.io.Serializable ) { return java.util.List ( getAdapter ( ) . getAllOf ( java.io.Serializable ) , org.springframework.data.keyvalue.core.SpelCriteria , - NUMBER , - NUMBER ) . size ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private java.util.List<?> < ? > java.util.List<?> ( java.lang.Iterable<?> < ? > java.lang.Iterable<?> , SpelCriteria org.springframework.data.keyvalue.core.SpelCriteria , java.util.Comparator java.util.Comparator , long long , int int ) { java.util.List<?> < ? > java.util.List<?> = IterableConverter . toList ( java.lang.Iterable<> ) ; if ( java.util.Comparator != null ) { java.util.Collections . void ( java.util.List<> , java.util.Comparator ) ; } return java.util.List ( java.util.List<> , org.springframework.data.keyvalue.core.SpelCriteria , long , int ) ; }  <METHOD_END>
<METHOD_START> private static < S > java.util.List<S> < S > java.util.List<S> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> , SpelCriteria org.springframework.data.keyvalue.core.SpelCriteria , long long , int int ) { java.util.List<S> < S > java.util.List<S> = new java.util.ArrayList<S> < S > ( ) ; boolean boolean = NUMBER < long || NUMBER <= int ; int int = int ; int int = NUMBER ; for ( S S : java.lang.Iterable<S> ) { boolean boolean = org.springframework.data.keyvalue.core.SpelCriteria == null ; if ( ! boolean ) { try { boolean = org.springframework.data.keyvalue.core.SpelCriteria . getExpression ( ) . getValue ( org.springframework.data.keyvalue.core.SpelCriteria . getContext ( ) , S , java.lang.Boolean .class ) ; } catch ( SpelEvaluationException org.springframework.data.keyvalue.core.SpelEvaluationException ) { org.springframework.data.keyvalue.core.SpelCriteria . getContext ( ) . setVariable ( STRING , S ) ; boolean = org.springframework.data.keyvalue.core.SpelCriteria . getExpression ( ) . getValue ( org.springframework.data.keyvalue.core.SpelCriteria . getContext ( ) ) == null ? false : org.springframework.data.keyvalue.core.SpelCriteria . getExpression ( ) . getValue ( org.springframework.data.keyvalue.core.SpelCriteria . getContext ( ) , java.lang.Boolean .class ) ; } } if ( boolean ) { if ( boolean ) { if ( int >= long && int > NUMBER ) { java.util.List<S> . boolean ( S ) ; int -- ; if ( int <= NUMBER ) { break; } } int ++ ; } else { java.util.List<S> . boolean ( S ) ; } } } return java.util.List<S> ; }  <METHOD_END>