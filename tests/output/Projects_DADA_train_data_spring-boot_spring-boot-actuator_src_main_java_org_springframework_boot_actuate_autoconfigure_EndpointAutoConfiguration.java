<METHOD_START> public void ( ObjectProvider < HealthAggregator > org.springframework.boot.actuate.autoconfigure.ObjectProvider<org.springframework.boot.actuate.autoconfigure.HealthAggregator> , ObjectProvider < java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator> < java.lang.String , HealthIndicator > > org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator>> , ObjectProvider < java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor> < InfoContributor > > org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor>> , ObjectProvider < java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics> < PublicMetrics > > org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics>> , ObjectProvider < TraceRepository > org.springframework.boot.actuate.autoconfigure.ObjectProvider<org.springframework.boot.actuate.autoconfigure.TraceRepository> ) { this . org.springframework.boot.actuate.autoconfigure.HealthAggregator = org.springframework.boot.actuate.autoconfigure.ObjectProvider<org.springframework.boot.actuate.autoconfigure.HealthAggregator> . getIfAvailable ( ) ; this . java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator> = org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator>> . getIfAvailable ( ) ; this . java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor> = org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor>> . getIfAvailable ( ) ; this . java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics> = org.springframework.boot.actuate.autoconfigure.ObjectProvider<java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics>> . getIfAvailable ( ) ; this . org.springframework.boot.actuate.autoconfigure.TraceRepository = org.springframework.boot.actuate.autoconfigure.ObjectProvider<org.springframework.boot.actuate.autoconfigure.TraceRepository> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.EnvironmentEndpoint org.springframework.boot.actuate.autoconfigure.EnvironmentEndpoint ( ) { return new EnvironmentEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.HealthEndpoint org.springframework.boot.actuate.autoconfigure.HealthEndpoint ( ) { return new HealthEndpoint ( this . org.springframework.boot.actuate.autoconfigure.HealthAggregator == null ? new OrderedHealthAggregator ( ) : this . org.springframework.boot.actuate.autoconfigure.HealthAggregator , this . java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator> == null ? java.util.Collections .< java.lang.String , HealthIndicator > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator> ( ) : this . java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.HealthIndicator> ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.BeansEndpoint org.springframework.boot.actuate.autoconfigure.BeansEndpoint ( ) { return new BeansEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.InfoEndpoint org.springframework.boot.actuate.autoconfigure.InfoEndpoint ( ) java.lang.Exception { return new InfoEndpoint ( this . java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor> == null ? java.util.Collections .< InfoContributor > java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor> ( ) : this . java.util.List<org.springframework.boot.actuate.autoconfigure.InfoContributor> ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnBean ( LoggingSystem .class ) @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.LoggersEndpoint org.springframework.boot.actuate.autoconfigure.LoggersEndpoint ( LoggingSystem org.springframework.boot.actuate.autoconfigure.LoggingSystem ) { return new LoggersEndpoint ( org.springframework.boot.actuate.autoconfigure.LoggingSystem ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.MetricsEndpoint org.springframework.boot.actuate.autoconfigure.MetricsEndpoint ( ) { java.util.List<org.springframework.boot.actuate.autoconfigure.PublicMetrics> < PublicMetrics > java.util.List<org.springframework.boot.actuate.autoconfigure.PublicMetrics> = new java.util.ArrayList<org.springframework.boot.actuate.autoconfigure.PublicMetrics> <> ( ) ; if ( this . java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics> != null ) { java.util.List<org.springframework.boot.actuate.autoconfigure.PublicMetrics> . addAll ( this . java.util.Collection<org.springframework.boot.actuate.autoconfigure.PublicMetrics> ) ; } java.util.Collections . void ( java.util.List<org.springframework.boot.actuate.autoconfigure.PublicMetrics> , AnnotationAwareOrderComparator . INSTANCE ) ; return new MetricsEndpoint ( java.util.List<org.springframework.boot.actuate.autoconfigure.PublicMetrics> ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.TraceEndpoint org.springframework.boot.actuate.autoconfigure.TraceEndpoint ( ) { return new TraceEndpoint ( this . org.springframework.boot.actuate.autoconfigure.TraceRepository == null ? new InMemoryTraceRepository ( ) : this . org.springframework.boot.actuate.autoconfigure.TraceRepository ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.DumpEndpoint org.springframework.boot.actuate.autoconfigure.DumpEndpoint ( ) { return new DumpEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnBean ( ConditionEvaluationReport .class ) @ ConditionalOnMissingBean ( search = SearchStrategy . CURRENT ) public org.springframework.boot.actuate.autoconfigure.AutoConfigurationReportEndpoint org.springframework.boot.actuate.autoconfigure.AutoConfigurationReportEndpoint ( ) { return new AutoConfigurationReportEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.ShutdownEndpoint org.springframework.boot.actuate.autoconfigure.ShutdownEndpoint ( ) { return new ShutdownEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.autoconfigure.ConfigurationPropertiesReportEndpoint ( ) { return new ConfigurationPropertiesReportEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.FlywayEndpoint org.springframework.boot.actuate.autoconfigure.FlywayEndpoint ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.Flyway> < java.lang.String , Flyway > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.Flyway> ) { return new FlywayEndpoint ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.Flyway> ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.LiquibaseEndpoint org.springframework.boot.actuate.autoconfigure.LiquibaseEndpoint ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.SpringLiquibase> < java.lang.String , SpringLiquibase > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.SpringLiquibase> ) { return new LiquibaseEndpoint ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.SpringLiquibase> ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.RequestMappingEndpoint org.springframework.boot.actuate.autoconfigure.RequestMappingEndpoint ( ) { RequestMappingEndpoint org.springframework.boot.actuate.autoconfigure.RequestMappingEndpoint = new RequestMappingEndpoint ( ) ; return org.springframework.boot.actuate.autoconfigure.RequestMappingEndpoint ; }  <METHOD_END>