<METHOD_START> @ Test public void void ( ) { assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getCount ( ) ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { long long = NUMBER ; long long = java.lang.System . long ( ) - NUMBER * long * NUMBER ; for ( int int = NUMBER ; int < TestUtils . getPropertyValue ( org.springframework.integration.support.management.ExponentialMovingAverageRate , STRING , java.lang.Integer .class ) ; int ++ ) { org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( long ) ; } final java.util.Deque<java.lang.Long> < java.lang.Long > java.util.Deque<java.lang.Long> = TestUtils . getPropertyValue ( org.springframework.integration.support.management.ExponentialMovingAverageRate , STRING , java.util.Deque .class ) ; assertEquals ( java.lang.Long . java.lang.Long ( long ) , java.util.Deque<java.lang.Long> . java.lang.Long ( ) ) ; assertEquals ( java.lang.Long . java.lang.Long ( long ) , java.util.Deque<java.lang.Long> . java.lang.Long ( ) ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( java.lang.System . long ( ) - long * NUMBER ) ; assertNotEquals ( java.util.Deque<java.lang.Long> . java.lang.Long ( ) , java.util.Deque<java.lang.Long> . java.lang.Long ( ) ) ; double double = org.springframework.integration.support.management.ExponentialMovingAverageRate . getTimeSinceLastMeasurement ( ) ; assertTrue ( double > long ) ; assertTrue ( double <= ( NUMBER * long ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { long long = java.lang.System . long ( ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) , NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; long long = java.lang.System . long ( ) - long ; if ( long < NUMBER ) { assertTrue ( org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) > NUMBER ) ; } else { org.springframework.integration.support.management.Log . warn ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { long long = java.lang.System . long ( ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) , NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; double double = org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) ; Statistics org.springframework.integration.support.management.Statistics = org.springframework.integration.support.management.ExponentialMovingAverageRate . getStatistics ( ) ; long long = java.lang.System . long ( ) - long ; if ( long < NUMBER ) { assertTrue ( double > NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; long = java.lang.System . long ( ) - long ; if ( long < NUMBER ) { assertThat ( org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) , lessThan ( double ) ) ; assertThat ( org.springframework.integration.support.management.ExponentialMovingAverageRate . getStatistics ( ) . getMean ( ) , lessThan ( org.springframework.integration.support.management.Statistics . getMean ( ) ) ) ; } else { org.springframework.integration.support.management.Log . warn ( STRING ) ; } } else { org.springframework.integration.support.management.Log . warn ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getStandardDeviation ( ) , NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; java.lang.Thread . void ( NUMBER ) ; assertTrue ( STRING + org.springframework.integration.support.management.ExponentialMovingAverageRate , org.springframework.integration.support.management.ExponentialMovingAverageRate . getStandardDeviation ( ) > NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getStandardDeviation ( ) , NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; assertFalse ( NUMBER == org.springframework.integration.support.management.ExponentialMovingAverageRate . getStandardDeviation ( ) ) ; org.springframework.integration.support.management.ExponentialMovingAverageRate . reset ( ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getStandardDeviation ( ) , NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getTimeSinceLastMeasurement ( ) , NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) , NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMin ( ) , NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMax ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { ExponentialMovingAverageRate org.springframework.integration.support.management.ExponentialMovingAverageRate = new ExponentialMovingAverageRate ( NUMBER , NUMBER , NUMBER ) ; int int = NUMBER ; StopWatch org.springframework.integration.support.management.StopWatch = new StopWatch ( ) ; org.springframework.integration.support.management.StopWatch . start ( ) ; for ( int int = NUMBER ; int < int ; int ++ ) { org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; } org.springframework.integration.support.management.StopWatch . stop ( ) ; double double = int / ( double ) org.springframework.integration.support.management.StopWatch . getTotalTimeMillis ( ) * NUMBER ; assertEquals ( double , org.springframework.integration.support.management.ExponentialMovingAverageRate . getMean ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { ExponentialMovingAverageRate org.springframework.integration.support.management.ExponentialMovingAverageRate = new ExponentialMovingAverageRate ( NUMBER , NUMBER , NUMBER ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { org.springframework.integration.support.management.ExponentialMovingAverageRate . increment ( ) ; } }  <METHOD_END>