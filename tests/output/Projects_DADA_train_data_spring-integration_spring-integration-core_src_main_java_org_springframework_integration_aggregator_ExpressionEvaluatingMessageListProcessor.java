<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { this( java.lang.String ); this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { try { this . org.springframework.integration.aggregator.Expression = EXPRESSION_PARSER . parseExpression ( java.lang.String ) ; } catch ( ParseException org.springframework.integration.aggregator.ParseException ) { throw new java.lang.IllegalArgumentException ( STRING , org.springframework.integration.aggregator.ParseException ) ; } }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.aggregator.Expression , java.lang.Class<?> < ? > java.lang.Class<?> ) { this( org.springframework.integration.aggregator.Expression ); this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.aggregator.Expression ) { Assert . notNull ( org.springframework.integration.aggregator.Expression , STRING ) ; this . org.springframework.integration.aggregator.Expression = org.springframework.integration.aggregator.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.util.Collection<? extends org.springframework.integration.aggregator.Message<?>> < ? extends Message < ? > > java.util.Collection<? extends org.springframework.integration.aggregator.Message<?>> ) { return this . evaluateExpression ( this . org.springframework.integration.aggregator.Expression , java.util.Collection<> , this . java.lang.Class<> ) ; }  <METHOD_END>