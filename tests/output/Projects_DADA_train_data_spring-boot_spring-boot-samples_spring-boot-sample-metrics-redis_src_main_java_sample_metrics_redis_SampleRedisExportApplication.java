<METHOD_START> @ Bean @ ExportMetricWriter public sample.metrics.redis.RedisMetricRepository sample.metrics.redis.RedisMetricRepository ( RedisConnectionFactory sample.metrics.redis.RedisConnectionFactory ) { return new RedisMetricRepository ( sample.metrics.redis.RedisConnectionFactory , this . sample.metrics.redis.MetricExportProperties . getRedis ( ) . getPrefix ( ) , this . sample.metrics.redis.MetricExportProperties . getRedis ( ) . getKey ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ExportMetricWriter public sample.metrics.redis.JmxMetricWriter sample.metrics.redis.JmxMetricWriter ( @ Qualifier ( STRING ) MBeanExporter sample.metrics.redis.MBeanExporter ) { return new JmxMetricWriter ( sample.metrics.redis.MBeanExporter ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { SpringApplication . run ( sample.metrics.redis.SampleRedisExportApplication .class , java.lang.String[] ) ; }  <METHOD_END>