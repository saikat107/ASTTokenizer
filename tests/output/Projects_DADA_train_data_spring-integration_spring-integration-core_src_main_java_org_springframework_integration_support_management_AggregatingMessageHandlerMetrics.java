<METHOD_START> public void ( ) { this( null , int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { super( java.lang.String ); this . int = int ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , ExponentialMovingAverage org.springframework.integration.support.management.ExponentialMovingAverage , int int ) { super( java.lang.String , org.springframework.integration.support.management.ExponentialMovingAverage ); this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized org.springframework.integration.support.management.MetricsContext org.springframework.integration.support.management.MetricsContext ( ) { long long = this . handleCount . getAndIncrement ( ) ; if ( isFullStatsEnabled ( ) && long % this . int == NUMBER ) { this . long = java.lang.System . long ( ) ; } this . activeCount . incrementAndGet ( ) ; return new org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext ( this . long , long + NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MetricsContext org.springframework.integration.support.management.MetricsContext , boolean boolean ) { this . activeCount . decrementAndGet ( ) ; org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext = ( org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext ) org.springframework.integration.support.management.MetricsContext ; if ( boolean ) { if ( isFullStatsEnabled ( ) && org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext . long % this . int == NUMBER ) { this . duration . append ( java.lang.System . long ( ) - org.springframework.integration.support.management.AggregatingMessageHandlerMetrics.AggregatingHandlerMetricsContext . start ) ; } } else { this . errorCount . incrementAndGet ( ) ; } }  <METHOD_END>
<METHOD_START> public void ( long long , long long ) { super( long ); this . long = long ; }  <METHOD_END>