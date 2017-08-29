<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . increment ( new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . increment ( new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . flush ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . findOne ( STRING ) . getValue ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.actuate.metrics.export.MetricCopyExporterTests.SimpleGaugeWriter org.springframework.boot.actuate.metrics.export.MetricCopyExporterTests.SimpleGaugeWriter = new org.springframework.boot.actuate.metrics.export.MetricCopyExporterTests.SimpleGaugeWriter ( ) ; MetricCopyExporter org.springframework.boot.actuate.metrics.export.MetricCopyExporter = new MetricCopyExporter ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository , org.springframework.boot.actuate.metrics.export.MetricCopyExporterTests.SimpleGaugeWriter ) ; try { this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . increment ( new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . increment ( new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; org.springframework.boot.actuate.metrics.export.MetricCopyExporter . flush ( ) ; assertThat ( org.springframework.boot.actuate.metrics.export.MetricCopyExporterTests.SimpleGaugeWriter . org.springframework.boot.actuate.metrics.export.Metric<?> ( ) . getValue ( ) ) . isEqualTo ( NUMBER ) ; } finally { org.springframework.boot.actuate.metrics.export.MetricCopyExporter . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setIncludes ( STRING ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setIncludes ( STRING ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setExcludes ( STRING ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setExcludes ( STRING ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setEarliestTimestamp ( new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . set ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setIgnoreTimestamps ( true ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . setEarliestTimestamp ( new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricCopyExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMetricRepository . count ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.export.Metric<?> ) { this . org.springframework.boot.actuate.metrics.export.Metric<?> = org.springframework.boot.actuate.metrics.export.Metric<> ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.metrics.export.Metric<?> < ? > org.springframework.boot.actuate.metrics.export.Metric<?> ( ) { return this . org.springframework.boot.actuate.metrics.export.Metric<> ; }  <METHOD_END>