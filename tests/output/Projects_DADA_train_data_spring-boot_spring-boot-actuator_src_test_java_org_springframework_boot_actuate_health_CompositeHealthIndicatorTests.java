<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; given ( this . org.springframework.boot.actuate.health.HealthIndicator . health ( ) ) . willReturn ( new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; given ( this . org.springframework.boot.actuate.health.HealthIndicator . health ( ) ) . willReturn ( new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; given ( this . org.springframework.boot.actuate.health.HealthIndicator . health ( ) ) . willReturn ( new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; this . org.springframework.boot.actuate.health.HealthAggregator = new OrderedHealthAggregator ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> < java.lang.String , HealthIndicator > java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> = new java.util.HashMap<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> <> ( ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; CompositeHealthIndicator org.springframework.boot.actuate.health.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.health.HealthAggregator , java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> ) ; Health org.springframework.boot.actuate.health.Health = org.springframework.boot.actuate.health.CompositeHealthIndicator . health ( ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> < java.lang.String , HealthIndicator > java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> = new java.util.HashMap<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> <> ( ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; CompositeHealthIndicator org.springframework.boot.actuate.health.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.health.HealthAggregator , java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> ) ; org.springframework.boot.actuate.health.CompositeHealthIndicator . addHealthIndicator ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; Health org.springframework.boot.actuate.health.Health = org.springframework.boot.actuate.health.CompositeHealthIndicator . health ( ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CompositeHealthIndicator org.springframework.boot.actuate.health.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.health.HealthAggregator ) ; org.springframework.boot.actuate.health.CompositeHealthIndicator . addHealthIndicator ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; org.springframework.boot.actuate.health.CompositeHealthIndicator . addHealthIndicator ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; Health org.springframework.boot.actuate.health.Health = org.springframework.boot.actuate.health.CompositeHealthIndicator . health ( ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.boot.actuate.health.Health . getDetails ( ) ) . containsEntry ( STRING , new Health . Health ( ) . unknown ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> < java.lang.String , HealthIndicator > java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> = new java.util.HashMap<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> <> ( ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> . put ( STRING , this . org.springframework.boot.actuate.health.HealthIndicator ) ; CompositeHealthIndicator org.springframework.boot.actuate.health.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.health.HealthAggregator , java.util.Map<java.lang.String,org.springframework.boot.actuate.health.HealthIndicator> ) ; CompositeHealthIndicator org.springframework.boot.actuate.health.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.health.HealthAggregator ) ; org.springframework.boot.actuate.health.CompositeHealthIndicator . addHealthIndicator ( STRING , org.springframework.boot.actuate.health.CompositeHealthIndicator ) ; Health org.springframework.boot.actuate.health.Health = org.springframework.boot.actuate.health.CompositeHealthIndicator . health ( ) ; ObjectMapper org.springframework.boot.actuate.health.ObjectMapper = new ObjectMapper ( ) ; assertThat ( org.springframework.boot.actuate.health.ObjectMapper . writeValueAsString ( org.springframework.boot.actuate.health.Health ) ) . isEqualTo ( STRING + STRING + STRING ) ; }  <METHOD_END>