<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.SolrQuery org.springframework.data.solr.core.SolrQuery ( SimpleQuery org.springframework.data.solr.core.SimpleQuery ) { return null ; }  <METHOD_END>
<METHOD_START> @ Parameters ( name = STRING ) public static java.util.Collection<java.lang.Object[]> < java.lang.Object [] > java.util.Collection<java.lang.Object[]> ( ) { java.lang.Object [] [] java.lang.Object[][] = new java.lang.Object [] [] { { CurrencyFunction . currency ( STRING ) , STRING } , { CurrencyFunction . currency ( STRING , STRING ) , STRING } , { CurrencyFunction . currency ( new SimpleField ( STRING ) ) , STRING } , { CurrencyFunction . currency ( new SimpleField ( STRING ) , STRING ) , STRING } , { DefaultValueFunction . defaultValue ( STRING , STRING ) , STRING } , { DefaultValueFunction . defaultValue ( STRING , NUMBER ) , STRING } , { DefaultValueFunction . defaultValue ( STRING , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) , STRING } , { DefaultValueFunction . defaultValue ( new SimpleField ( STRING ) , STRING ) , STRING } , { DefaultValueFunction . defaultValue ( new SimpleField ( STRING ) , NUMBER ) , STRING } , { DefaultValueFunction . defaultValue ( new SimpleField ( STRING ) , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) , STRING } , { DefaultValueFunction . defaultValue ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , STRING ) , STRING } , { DefaultValueFunction . defaultValue ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , NUMBER ) , STRING } , { DefaultValueFunction . defaultValue ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { DistanceFunction . euclideanDistance ( ) . between ( new Point ( NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . euclideanDistance ( ) . between ( new Point ( NUMBER , NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . infiniteNormDistance ( ) . between ( new Point ( NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . infiniteNormDistance ( ) . between ( new Point ( NUMBER , NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . manhattanDistance ( ) . between ( new Point ( NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . manhattanDistance ( ) . between ( new Point ( NUMBER , NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . sparsenessDistance ( ) . between ( new Point ( NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER ) ) , STRING } , { DistanceFunction . sparsenessDistance ( ) . between ( new Point ( NUMBER , NUMBER , NUMBER ) , new Point ( NUMBER , NUMBER , NUMBER ) ) , STRING } , { DivideFunction . divide ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . by ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { DivideFunction . divide ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . by ( NUMBER ) , STRING } , { DivideFunction . divide ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . by ( STRING ) , STRING } , { DivideFunction . divide ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . by ( new SimpleField ( STRING ) ) , STRING } , { DivideFunction . divide ( NUMBER ) . by ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { DivideFunction . divide ( NUMBER ) . by ( NUMBER ) , STRING } , { DivideFunction . divide ( NUMBER ) . by ( STRING ) , STRING } , { DivideFunction . divide ( NUMBER ) . by ( new SimpleField ( STRING ) ) , STRING } , { DivideFunction . divide ( STRING ) . by ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { DivideFunction . divide ( STRING ) . by ( NUMBER ) , STRING } , { DivideFunction . divide ( STRING ) . by ( STRING ) , STRING } , { DivideFunction . divide ( STRING ) . by ( new SimpleField ( STRING ) ) , STRING } , { DivideFunction . divide ( new SimpleField ( STRING ) ) . by ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { DivideFunction . divide ( new SimpleField ( STRING ) ) . by ( NUMBER ) , STRING } , { DivideFunction . divide ( new SimpleField ( STRING ) ) . by ( STRING ) , STRING } , { DivideFunction . divide ( new SimpleField ( STRING ) ) . by ( new SimpleField ( STRING ) ) , STRING } , { ExistsFunction . exists ( STRING ) , STRING } , { ExistsFunction . exists ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) , STRING } , { ExistsFunction . exists ( new SimpleField ( STRING ) ) , STRING } , { GeoDistanceFunction . distanceFrom ( STRING ) . to ( new org . springframework . data . org.springframework.data.geo . org.springframework.data.geo ( NUMBER , NUMBER ) ) , STRING } , { GeoDistanceFunction . distanceFrom ( new SimpleField ( STRING ) ) . to ( new org . springframework . data . org.springframework.data.geo . org.springframework.data.geo ( NUMBER , NUMBER ) ) , STRING } , { GeoDistanceFunction . distanceFrom ( STRING ) . to ( NUMBER , NUMBER ) , STRING } , { GeoHashFunction . geohash ( new org . springframework . data . org.springframework.data.geo . org.springframework.data.geo ( NUMBER , NUMBER ) ) , STRING } , { GeoHashFunction . geohash ( NUMBER , NUMBER ) , STRING } , { IfFunction . when ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . then ( STRING ) . otherwise ( NUMBER ) , STRING } , { IfFunction . when ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . then ( new SimpleField ( STRING ) ) . otherwise ( NUMBER ) , STRING } , { IfFunction . when ( STRING ) . then ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . otherwise ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { IfFunction . when ( new SimpleField ( STRING ) ) . then ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . otherwise ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { MaxFunction . max ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { MaxFunction . max ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , NUMBER ) , STRING } , { MaxFunction . max ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) , STRING ) , STRING } , { MaxFunction . max ( NUMBER , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { MaxFunction . max ( NUMBER , NUMBER ) , STRING } , { MaxFunction . max ( NUMBER , STRING ) , STRING } , { MaxFunction . max ( STRING , new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) , STRING } , { MaxFunction . max ( STRING , NUMBER ) , STRING } , { MaxFunction . max ( STRING , STRING ) , STRING } , { NotFunction . not ( STRING ) , STRING } , { NotFunction . not ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) , STRING } , { NotFunction . not ( new SimpleField ( STRING ) ) , STRING } , { ProductFunction . product ( STRING ) . times ( STRING ) . build ( ) , STRING } , { ProductFunction . product ( new SimpleField ( STRING ) ) . times ( STRING ) . build ( ) , STRING } , { ProductFunction . product ( NUMBER ) . times ( STRING ) . build ( ) , STRING } , { ProductFunction . product ( STRING ) . times ( STRING ) . build ( ) , STRING } , { ProductFunction . product ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . times ( new SimpleField ( STRING ) ) . build ( ) , STRING } , { ProductFunction . product ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . times ( new SimpleField ( STRING ) ) . times ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) . build ( ) , STRING } , { ProductFunction . product ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . times ( new SimpleField ( STRING ) ) . times ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) . times ( NUMBER ) . build ( ) , STRING } , { ProductFunction . product ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Foo ( ) ) . times ( new SimpleField ( STRING ) ) . times ( new org.springframework.data.solr.core.FunctionQueryFragmentTests.Bar ( ) ) . times ( NUMBER ) . times ( new SimpleField ( STRING ) ) . build ( ) , STRING } , { QueryFunction . query ( new Criteria ( STRING ) . is ( STRING ) ) , STRING } , { QueryFunction . query ( new SimpleQuery ( new Criteria ( STRING ) . is ( STRING ) ) ) , STRING } , { TermFrequencyFunction . termFequency ( STRING ) . inField ( new SimpleField ( STRING ) ) , STRING } , { TermFrequencyFunction . termFequency ( STRING ) . inField ( STRING ) , STRING } } ; return java.util.Arrays . java.util.List<java.lang.Object[]> ( java.lang.Object[][] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SimpleQuery> . createFunctionFragment ( this . org.springframework.data.solr.core.Function , NUMBER ) , IsEqual . equalTo ( this . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>