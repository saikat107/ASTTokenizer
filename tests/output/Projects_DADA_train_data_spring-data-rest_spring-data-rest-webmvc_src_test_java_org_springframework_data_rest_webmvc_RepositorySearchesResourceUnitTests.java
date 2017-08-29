<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new RepositorySearchesResource ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new RepositorySearchesResource ( java.lang.String .class ) . getDomainType ( ) ) . isAssignableFrom ( java.lang.String .class ) ; }  <METHOD_END>
