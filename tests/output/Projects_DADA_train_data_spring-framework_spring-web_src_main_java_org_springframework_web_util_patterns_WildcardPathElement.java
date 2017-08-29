<METHOD_START> public void ( int int , char char ) { super( int , char ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( int int , MatchingContext org.springframework.web.util.patterns.MatchingContext ) { int int = org.springframework.web.util.patterns.MatchingContext . scanAhead ( int ) ; if ( next == null ) { if ( matchingContext . determineRemaining ) { matchingContext . remainingPathIndex = int ; return true ; } else { return ( int == matchingContext . candidateLength ) ; } } else { if ( matchingContext . isMatchStartMatching && int == matchingContext . candidateLength ) { return true ; } return next . matches ( int , org.springframework.web.util.patterns.MatchingContext ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return WILDCARD_WEIGHT ; }  <METHOD_END>
