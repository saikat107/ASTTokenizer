<METHOD_START> public void ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { super( java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> public void void ( SolrOperations org.springframework.data.solr.repository.support.SolrOperations ) { this . org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrOperations ; }  <METHOD_END>
<METHOD_START> public void void ( SolrClient org.springframework.data.solr.repository.support.SolrClient ) { this . org.springframework.data.solr.repository.support.SolrClient = org.springframework.data.solr.repository.support.SolrClient ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( SolrConverter org.springframework.data.solr.repository.support.SolrConverter ) { this . org.springframework.data.solr.repository.support.SolrConverter = org.springframework.data.solr.repository.support.SolrConverter ; }  <METHOD_END>
<METHOD_START> public void void ( SimpleSolrMappingContext org.springframework.data.solr.repository.support.SimpleSolrMappingContext ) { this . org.springframework.data.solr.repository.support.SimpleSolrMappingContext = org.springframework.data.solr.repository.support.SimpleSolrMappingContext ; super. setMappingContext ( org.springframework.data.solr.repository.support.SimpleSolrMappingContext ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.repository.support.SimpleSolrMappingContext org.springframework.data.solr.repository.support.SimpleSolrMappingContext ( ) { return org.springframework.data.solr.repository.support.SimpleSolrMappingContext ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.solr.repository.support.SolrOperations org.springframework.data.solr.repository.support.SolrOperations ( ) { return this . org.springframework.data.solr.repository.support.SolrOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { super. afterPropertiesSet ( ) ; Assert . isTrue ( ( org.springframework.data.solr.repository.support.SolrOperations != null || org.springframework.data.solr.repository.support.SolrClient != null ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.repository.support.RepositoryFactorySupport org.springframework.data.solr.repository.support.RepositoryFactorySupport ( ) { SolrRepositoryFactory org.springframework.data.solr.repository.support.SolrRepositoryFactory = org.springframework.data.solr.repository.support.SolrOperations != null ? new SolrRepositoryFactory ( this . org.springframework.data.solr.repository.support.SolrOperations ) : new SolrRepositoryFactory ( this . org.springframework.data.solr.repository.support.SolrClient , org.springframework.data.solr.repository.support.SolrConverter ) ; org.springframework.data.solr.repository.support.SolrRepositoryFactory . setSchemaCreationSupport ( boolean ) ; return org.springframework.data.solr.repository.support.SolrRepositoryFactory ; }  <METHOD_END>