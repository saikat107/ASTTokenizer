<METHOD_START> public void ( java.lang.String ... java.lang.String[] ) { this( java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ( java.lang.String[] ) ); }  <METHOD_END>
<METHOD_START> private void ( java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> < org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression > java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) { this . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> = java.util.Collections . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ( new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> <> ( java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> < org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression > java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ( java.lang.String ... java.lang.String[] ) { java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> < org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> <> ( ) ; if ( java.lang.String[] != null ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression = new org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression ( java.lang.String ) ; if ( STRING . boolean ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression . name ) || STRING . boolean ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression . name ) ) { continue; } java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> . boolean ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression ) ; } } return java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.web.servlet.mvc.condition.NameValueExpression<java.lang.String>> < NameValueExpression < java.lang.String > > java.util.Set<org.springframework.web.servlet.mvc.condition.NameValueExpression<java.lang.String>> ( ) { return new java.util.LinkedHashSet <> ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> < org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression > java.util.Collection<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ( ) { return this . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.HeadersRequestCondition org.springframework.web.servlet.mvc.condition.HeadersRequestCondition ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition org.springframework.web.servlet.mvc.condition.HeadersRequestCondition ) { java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> < org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> <> ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) ; java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> . boolean ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) ; return new org.springframework.web.servlet.mvc.condition.HeadersRequestCondition ( java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.HeadersRequestCondition org.springframework.web.servlet.mvc.condition.HeadersRequestCondition ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { if ( CorsUtils . isPreFlightRequest ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ) { return org.springframework.web.servlet.mvc.condition.HeadersRequestCondition ; } for ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression : java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> ) { if ( ! org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression . match ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ) { return null ; } } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( org.springframework.web.servlet.mvc.condition.HeadersRequestCondition org.springframework.web.servlet.mvc.condition.HeadersRequestCondition , HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { return org.springframework.web.servlet.mvc.condition.HeadersRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> . int ( ) - this . java.util.Set<org.springframework.web.servlet.mvc.condition.HeadersRequestCondition.HeaderExpression> . int ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { return org.springframework.web.servlet.mvc.condition.HttpServletRequest . getHeader ( name ) != null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { return value . equals ( org.springframework.web.servlet.mvc.condition.HttpServletRequest . getHeader ( name ) ) ; }  <METHOD_END>