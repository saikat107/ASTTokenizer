<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . target . setRemoteFileSeparator ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . target . setRemoteDirectory ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( Expression org.springframework.integration.file.dsl.Expression ) { this . target . setRemoteDirectoryExpression ( org.springframework.integration.file.dsl.Expression ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.function.Function<org.springframework.integration.file.dsl.Message<?>,java.lang.String> < Message < ? > , java.lang.String > java.util.function.Function<org.springframework.integration.file.dsl.Message<?>,java.lang.String> ) { this . target . setRemoteDirectoryExpression ( new FunctionExpression <> ( java.util.function.Function<org.springframework.integration.file.dsl.Message<?>,java.lang.String> ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( FileListFilter < F > org.springframework.integration.file.dsl.FileListFilter<F> ) { this . target . setFilter ( org.springframework.integration.file.dsl.FileListFilter<F> ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> = new ExpressionFileListFilter <> ( java.lang.String ) ; return S ( this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.function.Function<F,java.lang.Boolean> < F , java.lang.Boolean > java.util.function.Function<F,java.lang.Boolean> ) { this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> = new ExpressionFileListFilter <> ( new FunctionExpression <> ( java.util.function.Function<F,java.lang.Boolean> ) ) ; return S ( this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<java.lang.Object> < java.lang.Object > java.util.Collection<java.lang.Object> ( ) { if ( this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> != null ) { return java.util.Collections . java.util.Set ( this . org.springframework.integration.file.dsl.ExpressionFileListFilter<F> ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> public abstract S S ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> public abstract S S ( java.lang.String java.lang.String );  <METHOD_END>