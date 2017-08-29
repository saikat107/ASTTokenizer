<METHOD_START> public void ( EntityManagerFactory org.springframework.integration.jpa.core.EntityManagerFactory ) { Assert . notNull ( org.springframework.integration.jpa.core.EntityManagerFactory , STRING ) ; DefaultJpaOperations org.springframework.integration.jpa.core.DefaultJpaOperations = new DefaultJpaOperations ( ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . setEntityManagerFactory ( org.springframework.integration.jpa.core.EntityManagerFactory ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . afterPropertiesSet ( ) ; this . org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.DefaultJpaOperations ; }  <METHOD_END>
<METHOD_START> public void ( EntityManager org.springframework.integration.jpa.core.EntityManager ) { Assert . notNull ( org.springframework.integration.jpa.core.EntityManager , STRING ) ; DefaultJpaOperations org.springframework.integration.jpa.core.DefaultJpaOperations = new DefaultJpaOperations ( ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . setEntityManager ( org.springframework.integration.jpa.core.EntityManager ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . afterPropertiesSet ( ) ; this . org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.DefaultJpaOperations ; }  <METHOD_END>
<METHOD_START> public void ( JpaOperations org.springframework.integration.jpa.core.JpaOperations ) { Assert . notNull ( org.springframework.integration.jpa.core.JpaOperations , STRING ) ; this . org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ; }  <METHOD_END>
<METHOD_START> public void void ( EvaluationContext org.springframework.integration.jpa.core.EvaluationContext ) { this . org.springframework.integration.jpa.core.EvaluationContext = org.springframework.integration.jpa.core.EvaluationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.jpa.core.BeanFactory ) throws org.springframework.integration.jpa.core.BeansException { this . org.springframework.integration.jpa.core.BeanFactory = org.springframework.integration.jpa.core.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( ! CollectionUtils . isEmpty ( this . java.util.List<org.springframework.integration.jpa.core.JpaParameter> ) ) { if ( this . org.springframework.integration.jpa.core.ParameterSourceFactory == null ) { ExpressionEvaluatingParameterSourceFactory org.springframework.integration.jpa.core.ExpressionEvaluatingParameterSourceFactory = new ExpressionEvaluatingParameterSourceFactory ( this . org.springframework.integration.jpa.core.BeanFactory ) ; org.springframework.integration.jpa.core.ExpressionEvaluatingParameterSourceFactory . setParameters ( this . java.util.List<org.springframework.integration.jpa.core.JpaParameter> ) ; this . org.springframework.integration.jpa.core.ParameterSourceFactory = org.springframework.integration.jpa.core.ExpressionEvaluatingParameterSourceFactory ; } else { if ( ! ( this . org.springframework.integration.jpa.core.ParameterSourceFactory instanceof ExpressionEvaluatingParameterSourceFactory ) ) { throw new java.lang.IllegalStateException ( STRING + STRING + STRING + STRING + this . org.springframework.integration.jpa.core.ParameterSourceFactory . getClass ( ) . getName ( ) + STRING ) ; } } if ( this . java.lang.Boolean == null ) { this . java.lang.Boolean = false ; } } else { if ( this . org.springframework.integration.jpa.core.ParameterSourceFactory == null ) { this . org.springframework.integration.jpa.core.ParameterSourceFactory = new BeanPropertyParameterSourceFactory ( ) ; } if ( this . java.lang.Boolean == null ) { this . java.lang.Boolean = true ; } } if ( this . int > NUMBER ) { this . boolean = true ; } else if ( this . boolean ) { this . int = NUMBER ; } if ( this . org.springframework.integration.jpa.core.EvaluationContext == null ) { this . org.springframework.integration.jpa.core.EvaluationContext = ExpressionUtils . createStandardEvaluationContext ( this . org.springframework.integration.jpa.core.BeanFactory ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( final Message < ? > org.springframework.integration.jpa.core.Message<?> ) { final java.lang.Object java.lang.Object ; ParameterSource org.springframework.integration.jpa.core.ParameterSource = null ; if ( this . java.lang.String != null || this . java.lang.String != null || this . java.lang.String != null ) { org.springframework.integration.jpa.core.ParameterSource = this . org.springframework.integration.jpa.core.ParameterSource ( org.springframework.integration.jpa.core.Message<> ) ; } if ( this . java.lang.String != null ) { java.lang.Object = this . org.springframework.integration.jpa.core.JpaOperations . executeUpdate ( this . java.lang.String , org.springframework.integration.jpa.core.ParameterSource ) ; } else if ( this . java.lang.String != null ) { java.lang.Object = this . org.springframework.integration.jpa.core.JpaOperations . executeUpdateWithNativeQuery ( this . java.lang.String , org.springframework.integration.jpa.core.ParameterSource ) ; } else if ( this . java.lang.String != null ) { java.lang.Object = this . org.springframework.integration.jpa.core.JpaOperations . executeUpdateWithNamedQuery ( this . java.lang.String , org.springframework.integration.jpa.core.ParameterSource ) ; } else { if ( PersistMode . PERSIST . equals ( this . org.springframework.integration.jpa.core.PersistMode ) ) { this . org.springframework.integration.jpa.core.JpaOperations . persist ( org.springframework.integration.jpa.core.Message<> . getPayload ( ) , this . int , this . boolean ) ; java.lang.Object = org.springframework.integration.jpa.core.Message<> . getPayload ( ) ; } else if ( PersistMode . MERGE . equals ( this . org.springframework.integration.jpa.core.PersistMode ) ) { java.lang.Object = this . org.springframework.integration.jpa.core.JpaOperations . merge ( org.springframework.integration.jpa.core.Message<> . getPayload ( ) , this . int , this . boolean ) ; } else if ( PersistMode . DELETE . equals ( this . org.springframework.integration.jpa.core.PersistMode ) ) { this . org.springframework.integration.jpa.core.JpaOperations . delete ( org.springframework.integration.jpa.core.Message<> . getPayload ( ) ) ; if ( this . boolean ) { this . org.springframework.integration.jpa.core.JpaOperations . flush ( ) ; } java.lang.Object = org.springframework.integration.jpa.core.Message<> . getPayload ( ) ; } else { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , this . org.springframework.integration.jpa.core.PersistMode . name ( ) ) ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.Object java.lang.Object ( final Message < ? > org.springframework.integration.jpa.core.Message<?> ) { final java.lang.Object java.lang.Object ; if ( this . org.springframework.integration.jpa.core.Expression != null ) { java.lang.Object java.lang.Object = this . org.springframework.integration.jpa.core.Expression . getValue ( this . org.springframework.integration.jpa.core.EvaluationContext , org.springframework.integration.jpa.core.Message<> ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . java.lang.Class<> ; if ( java.lang.Class<> == null ) { java.lang.Class<?> = org.springframework.integration.jpa.core.Message<> . getPayload ( ) . getClass ( ) ; } java.lang.Object = this . org.springframework.integration.jpa.core.JpaOperations . find ( java.lang.Class<> , java.lang.Object ) ; } else { final java.util.List<?> < ? > java.util.List<?> ; int int = this . int ( org.springframework.integration.jpa.core.Message<> , this . org.springframework.integration.jpa.core.Expression ) ; if ( org.springframework.integration.jpa.core.Message<> == null ) { java.util.List<?> = this . java.util.List<?> ( this . org.springframework.integration.jpa.core.ParameterSource , NUMBER , int ) ; } else { int int = NUMBER ; if ( this . org.springframework.integration.jpa.core.Expression != null ) { int = this . int ( org.springframework.integration.jpa.core.Message<> ) ; } ParameterSource org.springframework.integration.jpa.core.ParameterSource = this . org.springframework.integration.jpa.core.ParameterSource ( org.springframework.integration.jpa.core.Message<> ) ; java.util.List<?> = this . java.util.List<?> ( org.springframework.integration.jpa.core.ParameterSource , int , int ) ; } if ( java.util.List<> . boolean ( ) ) { java.lang.Object = null ; } else { if ( this . boolean ) { if ( java.util.List<> . int ( ) == NUMBER ) { java.lang.Object = java.util.List<> . java.util.Iterator<> ( ) . next ( ) ; } else { throw new MessagingException ( org.springframework.integration.jpa.core.Message<> , STRING ) ; } } else { java.lang.Object = java.util.List<> ; } } } if ( java.lang.Object != null && this . boolean ) { if ( java.lang.Object instanceof java.lang.Iterable ) { if ( this . boolean ) { this . org.springframework.integration.jpa.core.JpaOperations . deleteInBatch ( ( java.lang.Iterable<java.lang.Object> < java.lang.Object > ) java.lang.Object ) ; } else { for ( java.lang.Object java.lang.Object : ( java.lang.Iterable<?> < ? > ) java.lang.Object ) { this . org.springframework.integration.jpa.core.JpaOperations . delete ( java.lang.Object ) ; } } } else { this . org.springframework.integration.jpa.core.JpaOperations . delete ( java.lang.Object ) ; } if ( this . boolean ) { this . org.springframework.integration.jpa.core.JpaOperations . flush ( ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private int int ( final Message < ? > org.springframework.integration.jpa.core.Message<?> ) { return this . int ( org.springframework.integration.jpa.core.Message<> , this . org.springframework.integration.jpa.core.Expression ) ; }  <METHOD_END>
<METHOD_START> private int int ( final Message < ? > org.springframework.integration.jpa.core.Message<?> , Expression org.springframework.integration.jpa.core.Expression ) { int int = NUMBER ; if ( org.springframework.integration.jpa.core.Expression != null ) { java.lang.Object java.lang.Object = org.springframework.integration.jpa.core.Expression . getValue ( this . org.springframework.integration.jpa.core.EvaluationContext , org.springframework.integration.jpa.core.Message<> ) ; if ( java.lang.Object != null ) { if ( java.lang.Object instanceof java.lang.Number ) { int = ( ( java.lang.Number ) java.lang.Object ) . int ( ) ; } else if ( java.lang.Object instanceof java.lang.String ) { try { int = java.lang.Integer . int ( ( java.lang.String ) java.lang.Object ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING + STRING ) ; } } else { throw new java.lang.IllegalArgumentException ( STRING + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ) ; } } } return int ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.jpa.core.ParameterSource org.springframework.integration.jpa.core.ParameterSource ( final Message < ? > org.springframework.integration.jpa.core.Message<?> ) { ParameterSource org.springframework.integration.jpa.core.ParameterSource ; if ( this . java.lang.Boolean ) { org.springframework.integration.jpa.core.ParameterSource = this . org.springframework.integration.jpa.core.ParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.Message<> . getPayload ( ) ) ; } else { org.springframework.integration.jpa.core.ParameterSource = this . org.springframework.integration.jpa.core.ParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.Message<> ) ; } return org.springframework.integration.jpa.core.ParameterSource ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ( null ) ; }  <METHOD_END>
<METHOD_START> protected java.util.List<?> < ? > java.util.List<?> ( ParameterSource org.springframework.integration.jpa.core.ParameterSource , int int , int int ) { java.util.List<?> < ? > java.util.List<?> = null ; if ( this . java.lang.String != null ) { java.util.List<?> = this . org.springframework.integration.jpa.core.JpaOperations . getResultListForQuery ( this . java.lang.String , org.springframework.integration.jpa.core.ParameterSource , int , int ) ; } else if ( this . java.lang.String != null ) { java.util.List<?> = this . org.springframework.integration.jpa.core.JpaOperations . getResultListForNativeQuery ( this . java.lang.String , this . java.lang.Class<> , org.springframework.integration.jpa.core.ParameterSource , int , int ) ; } else if ( this . java.lang.String != null ) { java.util.List<?> = this . org.springframework.integration.jpa.core.JpaOperations . getResultListForNamedQuery ( this . java.lang.String , org.springframework.integration.jpa.core.ParameterSource , int , int ) ; } else if ( this . java.lang.Class<> != null ) { java.util.List<?> = this . org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( this . java.lang.Class<> , int , int ) ; } else { throw new java.lang.IllegalStateException ( STRING + STRING + STRING ) ; } return java.util.List<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . isTrue ( this . java.lang.String == null && this . java.lang.String == null , STRING + STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . isTrue ( this . java.lang.String == null && this . java.lang.String == null , STRING + STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . isTrue ( this . java.lang.String == null && this . java.lang.String == null , STRING + STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( PersistMode org.springframework.integration.jpa.core.PersistMode ) { this . org.springframework.integration.jpa.core.PersistMode = org.springframework.integration.jpa.core.PersistMode ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.integration.jpa.core.JpaParameter> < JpaParameter > java.util.List<org.springframework.integration.jpa.core.JpaParameter> ) { this . java.util.List<org.springframework.integration.jpa.core.JpaParameter> = java.util.List<org.springframework.integration.jpa.core.JpaParameter> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . state ( int >= NUMBER , STRING ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( ParameterSourceFactory org.springframework.integration.jpa.core.ParameterSourceFactory ) { Assert . notNull ( org.springframework.integration.jpa.core.ParameterSourceFactory , STRING ) ; this . org.springframework.integration.jpa.core.ParameterSourceFactory = org.springframework.integration.jpa.core.ParameterSourceFactory ; }  <METHOD_END>
<METHOD_START> public void void ( ParameterSource org.springframework.integration.jpa.core.ParameterSource ) { Assert . notNull ( org.springframework.integration.jpa.core.ParameterSource , STRING ) ; this . org.springframework.integration.jpa.core.ParameterSource = org.springframework.integration.jpa.core.ParameterSource ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.jpa.core.Expression ) { this . org.springframework.integration.jpa.core.Expression = org.springframework.integration.jpa.core.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.jpa.core.Expression ) { this . org.springframework.integration.jpa.core.Expression = org.springframework.integration.jpa.core.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.jpa.core.Expression ) { Assert . notNull ( org.springframework.integration.jpa.core.Expression , STRING ) ; this . org.springframework.integration.jpa.core.Expression = org.springframework.integration.jpa.core.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . void ( new LiteralExpression ( STRING + int ) ) ; }  <METHOD_END>