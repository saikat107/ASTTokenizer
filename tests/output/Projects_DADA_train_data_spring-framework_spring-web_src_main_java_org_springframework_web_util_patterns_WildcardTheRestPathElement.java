<METHOD_START> void ( int int , char char ) { super( int , char ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( int int , MatchingContext org.springframework.web.util.patterns.MatchingContext ) { if ( int < matchingContext . candidateLength && matchingContext . candidate [ int ] != separator ) { return false ; } if ( matchingContext . determineRemaining ) { matchingContext . remainingPathIndex = matchingContext . candidateLength ; } return true ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING + separator + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
