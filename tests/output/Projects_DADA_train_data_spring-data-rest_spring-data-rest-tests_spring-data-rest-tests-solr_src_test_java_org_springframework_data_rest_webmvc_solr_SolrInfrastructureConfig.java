<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.solr.SolrClientFactory org.springframework.data.rest.webmvc.solr.SolrClientFactory ( final java.lang.String java.lang.String )			throws javax.xml.parsers.ParserConfigurationException , java.io.IOException , org.xml.sax.SAXException { void ( java.lang.String ) ; return new EmbeddedSolrServerFactory ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.solr.SolrTemplate org.springframework.data.rest.webmvc.solr.SolrTemplate ( SolrClientFactory org.springframework.data.rest.webmvc.solr.SolrClientFactory ) { void ( org.springframework.data.rest.webmvc.solr.SolrClientFactory ) ; return new SolrTemplate ( org.springframework.data.rest.webmvc.solr.SolrClientFactory ) ; }  <METHOD_END>
<METHOD_START> private static void void ( final java.lang.String java.lang.String ) throws java.io.IOException { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; Resource org.springframework.data.rest.webmvc.solr.Resource = filterResource ( org.springframework.data.rest.webmvc.solr.Resource , java.util.Map<java.lang.String,java.lang.String> ) ; Resource org.springframework.data.rest.webmvc.solr.Resource = org.springframework.data.rest.webmvc.solr.Resource ; Resource org.springframework.data.rest.webmvc.solr.Resource = org.springframework.data.rest.webmvc.solr.Resource ; Resource org.springframework.data.rest.webmvc.solr.Resource = org.springframework.data.rest.webmvc.solr.Resource ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; FileCopyUtils . copy ( org.springframework.data.rest.webmvc.solr.Resource . getInputStream ( ) , new java.io.FileOutputStream ( java.io.File ( java.io.File , STRING ) ) ) ; FileCopyUtils . copy ( java.lang.String . byte[] ( ) , new java.io.FileOutputStream ( java.io.File ( java.io.File , STRING ) ) ) ; FileCopyUtils . copy ( org.springframework.data.rest.webmvc.solr.Resource . getInputStream ( ) , new java.io.FileOutputStream ( java.io.File ( java.io.File , STRING ) ) ) ; FileCopyUtils . copy ( org.springframework.data.rest.webmvc.solr.Resource . getInputStream ( ) , new java.io.FileOutputStream ( java.io.File ( java.io.File , STRING ) ) ) ; FileCopyUtils . copy ( org.springframework.data.rest.webmvc.solr.Resource . getInputStream ( ) , new java.io.FileOutputStream ( java.io.File ( java.io.File , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> private static java.io.File java.io.File ( java.io.File java.io.File , java.lang.String java.lang.String ) throws java.io.IOException { java.io.File java.io.File = new java.io.File ( java.io.File , java.lang.String ) ; if ( ! java.io.File . boolean ( ) ) { java.io.File . boolean ( ) ; } return java.io.File ; }  <METHOD_END>
<METHOD_START> private void void ( SolrClientFactory org.springframework.data.rest.webmvc.solr.SolrClientFactory ) { EmbeddedSolrServer org.springframework.data.rest.webmvc.solr.EmbeddedSolrServer = ( EmbeddedSolrServer ) org.springframework.data.rest.webmvc.solr.SolrClientFactory . getSolrClient ( ) ; for ( SolrCore org.springframework.data.rest.webmvc.solr.SolrCore : org.springframework.data.rest.webmvc.solr.EmbeddedSolrServer . getCoreContainer ( ) . getCores ( ) ) { org.springframework.data.rest.webmvc.solr.SolrCore . addCloseHook ( new CloseHook ( ) { private java.lang.String java.lang.String ; @ java.lang.Override public void void ( SolrCore org.springframework.data.rest.webmvc.solr.SolrCore ) { CoreDescriptor org.springframework.data.rest.webmvc.solr.CoreDescriptor = org.springframework.data.rest.webmvc.solr.SolrCore . getCoreDescriptor ( ) ; if ( org.springframework.data.rest.webmvc.solr.CoreDescriptor == null ) { return; } java.io.File java.io.File = new java.io.File ( org.springframework.data.rest.webmvc.solr.SolrCore . getIndexDir ( ) ) . java.io.File ( ) ; if ( java.io.File . boolean ( ) ) { return; } try { java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; this . java.lang.String = java.io.File . java.lang.String ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception . void ( ) ; } } @ java.lang.Override public void void ( SolrCore org.springframework.data.rest.webmvc.solr.SolrCore ) { if ( ! StringUtils . hasText ( this . java.lang.String ) ) { return; } java.io.File java.io.File = new java.io.File ( this . java.lang.String ) ; if ( java.io.File . boolean ( ) && java.io.File . java.lang.String ( ) . boolean ( FileUtils . getTempDirectoryPath ( ) ) ) { try { FileUtils . deleteDirectory ( java.io.File ) ; } catch ( java.io.IOException java.io.IOException ) { java.io.IOException . void ( ) ; } } } } ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SolrCore org.springframework.data.rest.webmvc.solr.SolrCore ) { CoreDescriptor org.springframework.data.rest.webmvc.solr.CoreDescriptor = org.springframework.data.rest.webmvc.solr.SolrCore . getCoreDescriptor ( ) ; if ( org.springframework.data.rest.webmvc.solr.CoreDescriptor == null ) { return; } java.io.File java.io.File = new java.io.File ( org.springframework.data.rest.webmvc.solr.SolrCore . getIndexDir ( ) ) . java.io.File ( ) ; if ( java.io.File . boolean ( ) ) { return; } try { java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; this . java.lang.String = java.io.File . java.lang.String ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SolrCore org.springframework.data.rest.webmvc.solr.SolrCore ) { if ( ! StringUtils . hasText ( this . java.lang.String ) ) { return; } java.io.File java.io.File = new java.io.File ( this . java.lang.String ) ; if ( java.io.File . boolean ( ) && java.io.File . java.lang.String ( ) . boolean ( FileUtils . getTempDirectoryPath ( ) ) ) { try { FileUtils . deleteDirectory ( java.io.File ) ; } catch ( java.io.IOException java.io.IOException ) { java.io.IOException . void ( ) ; } } }  <METHOD_END>