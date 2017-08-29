<METHOD_START> @ Before public void void ( ) { SolrTemplate org.springframework.data.solr.repository.support.SolrTemplate = new SolrTemplate ( server ) ; org.springframework.data.solr.repository.support.SolrTemplate . afterPropertiesSet ( ) ; org.springframework.data.solr.repository.support.SolrRepositoryFactory = new SolrRepositoryFactory ( org.springframework.data.solr.repository.support.SolrTemplate ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) org.springframework.data.solr.repository.support.SolrServerException , java.io.IOException { cleanDataInSolr ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; Assert . assertNotNull ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( org.springframework.data.solr.repository.support.ProductBean ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . findOne ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) ) . get ( ) ; Assert . assertEquals ( org.springframework.data.solr.repository.support.ProductBean . getName ( ) , org.springframework.data.solr.repository.support.ProductBean . getName ( ) ) ; org.springframework.data.solr.repository.support.ProductBean . setName ( STRING ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( org.springframework.data.solr.repository.support.ProductBean ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . findOne ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) ) . get ( ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.repository.support.ProductBean . getName ( ) ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . delete ( org.springframework.data.solr.repository.support.ProductBean ) ; java.lang.Thread . void ( NUMBER ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( org.springframework.data.solr.repository.support.ProductBean ) ; Page < ProductBean > org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> ( STRING , new PageRequest ( NUMBER , NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> . getContent ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( org.springframework.data.solr.repository.support.ProductBean ) ; ScoredPage < ProductBean > org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> ( STRING , new PageRequest ( NUMBER , NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> . getContent ( ) . size ( ) ) ; Assert . assertEquals ( java.lang.Float . java.lang.Float ( NUMBER ) , org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> . getMaxScore ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ProductBean . setAvailable ( false ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( java.util.Arrays . java.util.List ( org.springframework.data.solr.repository.support.ProductBean , org.springframework.data.solr.repository.support.ProductBean ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; Page < ProductBean > org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> ( new PageRequest ( NUMBER , NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> . getTotalElements ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) , org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> . getContent ( ) . get ( NUMBER ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ProductBean . setAvailable ( false ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( java.util.Arrays . java.util.List ( org.springframework.data.solr.repository.support.ProductBean , org.springframework.data.solr.repository.support.ProductBean ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . count ( ) ) ; java.util.List<org.springframework.data.solr.repository.support.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.support.ProductBean> = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . java.util.List<org.springframework.data.solr.repository.support.ProductBean> ( ) ; Assert . assertEquals ( NUMBER , java.util.List<org.springframework.data.solr.repository.support.ProductBean> . size ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) , java.util.List<org.springframework.data.solr.repository.support.ProductBean> . get ( NUMBER ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ProductBean ( STRING ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository = org.springframework.data.solr.repository.support.SolrRepositoryFactory . getRepository ( org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository .class ) ; org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . save ( org.springframework.data.solr.repository.support.ProductBean ) ; ProductBean org.springframework.data.solr.repository.support.ProductBean = org.springframework.data.solr.repository.support.ITestSolrRepositoryFactory.ProductBeanRepository . org.springframework.data.solr.repository.support.ProductBean ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.repository.support.ProductBean . getId ( ) , org.springframework.data.solr.repository.support.ProductBean . getId ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.repository.support.ProductBean . getName ( ) , org.springframework.data.solr.repository.support.ProductBean . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.support.ProductBean org.springframework.data.solr.repository.support.ProductBean ( java.lang.String java.lang.String ) { ProductBean org.springframework.data.solr.repository.support.ProductBean = new ProductBean ( ) ; org.springframework.data.solr.repository.support.ProductBean . setId ( java.lang.String ) ; org.springframework.data.solr.repository.support.ProductBean . setAvailable ( true ) ; org.springframework.data.solr.repository.support.ProductBean . setName ( STRING + java.lang.String ) ; return org.springframework.data.solr.repository.support.ProductBean ; }  <METHOD_END>
<METHOD_START> org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> < ProductBean > org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> ( Pageable org.springframework.data.solr.repository.support.Pageable );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> < ProductBean > org.springframework.data.solr.repository.support.Page<org.springframework.data.solr.repository.support.ProductBean> ( java.lang.String java.lang.String , Pageable org.springframework.data.solr.repository.support.Pageable );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) java.util.List<org.springframework.data.solr.repository.support.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.support.ProductBean> ( )  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.solr.repository.support.ProductBean org.springframework.data.solr.repository.support.ProductBean ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , fields = { STRING , STRING } ) org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> < ProductBean > org.springframework.data.solr.repository.support.ScoredPage<org.springframework.data.solr.repository.support.ProductBean> ( java.lang.String java.lang.String , Pageable org.springframework.data.solr.repository.support.Pageable );  <METHOD_END>