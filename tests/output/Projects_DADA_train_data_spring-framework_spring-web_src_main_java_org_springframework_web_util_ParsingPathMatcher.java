<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return org.springframework.web.util.PathPattern . matches ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return org.springframework.web.util.PathPattern . matchStart ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return org.springframework.web.util.PathPattern . extractPathWithinPattern ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return org.springframework.web.util.PathPattern . matchAndExtract ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return org.springframework.web.util.PathPattern . combine ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Comparator<java.lang.String> < java.lang.String > java.util.Comparator<java.lang.String> ( java.lang.String java.lang.String ) { return new org.springframework.web.util.ParsingPathMatcher.PathPatternStringComparatorConsideringPath ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . org.springframework.web.util.PatternComparatorConsideringPath = new PatternComparatorConsideringPath ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( java.lang.String == null ) { return ( java.lang.String == null ? NUMBER : + NUMBER ) ; } else if ( java.lang.String == null ) { return - NUMBER ; } PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; PathPattern org.springframework.web.util.PathPattern = org.springframework.web.util.PathPattern ( java.lang.String ) ; return this . org.springframework.web.util.PatternComparatorConsideringPath . compare ( org.springframework.web.util.PathPattern , org.springframework.web.util.PathPattern ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return ( java.lang.String . int ( '*' ) != - NUMBER || java.lang.String . int ( '?' ) != - NUMBER ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.util.PathPattern org.springframework.web.util.PathPattern ( java.lang.String java.lang.String ) { PathPattern org.springframework.web.util.PathPattern = this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.util.PathPattern> . get ( java.lang.String ) ; if ( org.springframework.web.util.PathPattern == null ) { org.springframework.web.util.PathPattern = this . org.springframework.web.util.PathPatternParser . parse ( java.lang.String ) ; this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.util.PathPattern> . put ( java.lang.String , org.springframework.web.util.PathPattern ) ; } return org.springframework.web.util.PathPattern ; }  <METHOD_END>