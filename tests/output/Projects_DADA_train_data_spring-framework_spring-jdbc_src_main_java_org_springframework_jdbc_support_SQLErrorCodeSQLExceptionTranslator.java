<METHOD_START> public void ( ) { setFallbackTranslator ( new SQLExceptionSubclassTranslator ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource ) { this(); void ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this(); void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( SQLErrorCodes org.springframework.jdbc.support.SQLErrorCodes ) { this(); this . org.springframework.jdbc.support.SQLErrorCodes = org.springframework.jdbc.support.SQLErrorCodes ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.jdbc.support.SQLErrorCodes = SQLErrorCodesFactory . getInstance ( ) . getErrorCodes ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.jdbc.support.SQLErrorCodes = SQLErrorCodesFactory . getInstance ( ) . getErrorCodes ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( SQLErrorCodes org.springframework.jdbc.support.SQLErrorCodes ) { this . org.springframework.jdbc.support.SQLErrorCodes = org.springframework.jdbc.support.SQLErrorCodes ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.support.SQLErrorCodes org.springframework.jdbc.support.SQLErrorCodes ( ) { return this . org.springframework.jdbc.support.SQLErrorCodes ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.jdbc.support.DataAccessException org.springframework.jdbc.support.DataAccessException ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.sql.SQLException java.sql.SQLException ) { java.sql.SQLException java.sql.SQLException = java.sql.SQLException ; if ( java.sql.SQLException instanceof java.sql.BatchUpdateException && java.sql.SQLException . java.sql.SQLException ( ) != null ) { java.sql.SQLException java.sql.SQLException = java.sql.SQLException . java.sql.SQLException ( ) ; if ( java.sql.SQLException . int ( ) > NUMBER || java.sql.SQLException . java.lang.String ( ) != null ) { logger . debug ( STRING ) ; java.sql.SQLException = java.sql.SQLException ; } } DataAccessException org.springframework.jdbc.support.DataAccessException = org.springframework.jdbc.support.DataAccessException ( java.lang.String , java.lang.String , java.sql.SQLException ) ; if ( org.springframework.jdbc.support.DataAccessException != null ) { return org.springframework.jdbc.support.DataAccessException ; } if ( this . org.springframework.jdbc.support.SQLErrorCodes != null ) { SQLExceptionTranslator org.springframework.jdbc.support.SQLExceptionTranslator = this . org.springframework.jdbc.support.SQLErrorCodes . getCustomSqlExceptionTranslator ( ) ; if ( org.springframework.jdbc.support.SQLExceptionTranslator != null ) { DataAccessException org.springframework.jdbc.support.DataAccessException = org.springframework.jdbc.support.SQLExceptionTranslator . translate ( java.lang.String , java.lang.String , java.sql.SQLException ) ; if ( org.springframework.jdbc.support.DataAccessException != null ) { return org.springframework.jdbc.support.DataAccessException ; } } } if ( this . org.springframework.jdbc.support.SQLErrorCodes != null ) { java.lang.String java.lang.String ; if ( this . org.springframework.jdbc.support.SQLErrorCodes . isUseSqlStateForTranslation ( ) ) { java.lang.String = java.sql.SQLException . java.lang.String ( ) ; } else { java.sql.SQLException java.sql.SQLException = java.sql.SQLException ; while ( java.sql.SQLException . int ( ) == NUMBER && java.sql.SQLException . java.lang.Throwable ( ) instanceof java.sql.SQLException ) { java.sql.SQLException = ( java.sql.SQLException ) java.sql.SQLException . java.lang.Throwable ( ) ; } java.lang.String = java.lang.Integer . java.lang.String ( java.sql.SQLException . int ( ) ) ; } if ( java.lang.String != null ) { CustomSQLErrorCodesTranslation [] org.springframework.jdbc.support.CustomSQLErrorCodesTranslation[] = this . org.springframework.jdbc.support.SQLErrorCodes . getCustomTranslations ( ) ; if ( org.springframework.jdbc.support.CustomSQLErrorCodesTranslation[] != null ) { for ( CustomSQLErrorCodesTranslation org.springframework.jdbc.support.CustomSQLErrorCodesTranslation : org.springframework.jdbc.support.CustomSQLErrorCodesTranslation[] ) { if ( java.util.Arrays . int ( org.springframework.jdbc.support.CustomSQLErrorCodesTranslation . getErrorCodes ( ) , java.lang.String ) >= NUMBER ) { if ( org.springframework.jdbc.support.CustomSQLErrorCodesTranslation . getExceptionClass ( ) != null ) { DataAccessException org.springframework.jdbc.support.DataAccessException = org.springframework.jdbc.support.DataAccessException ( java.lang.String , java.lang.String , java.sql.SQLException , org.springframework.jdbc.support.CustomSQLErrorCodesTranslation . getExceptionClass ( ) ) ; if ( org.springframework.jdbc.support.DataAccessException != null ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , true ) ; return org.springframework.jdbc.support.DataAccessException ; } } } } } if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getBadSqlGrammarCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new BadSqlGrammarException ( java.lang.String , java.lang.String , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getInvalidResultSetAccessCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new InvalidResultSetAccessException ( java.lang.String , java.lang.String , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getDuplicateKeyCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new DuplicateKeyException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getDataIntegrityViolationCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new DataIntegrityViolationException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getPermissionDeniedCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new PermissionDeniedDataAccessException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getDataAccessResourceFailureCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new DataAccessResourceFailureException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getTransientDataAccessResourceCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new TransientDataAccessResourceException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getCannotAcquireLockCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new CannotAcquireLockException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getDeadlockLoserCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new DeadlockLoserDataAccessException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } else if ( java.util.Arrays . int ( this . org.springframework.jdbc.support.SQLErrorCodes . getCannotSerializeTransactionCodes ( ) , java.lang.String ) >= NUMBER ) { void ( java.lang.String , java.lang.String , java.sql.SQLException , false ) ; return new CannotSerializeTransactionException ( buildMessage ( java.lang.String , java.lang.String , java.sql.SQLException ) , java.sql.SQLException ) ; } } } if ( logger . isDebugEnabled ( ) ) { java.lang.String java.lang.String ; if ( this . org.springframework.jdbc.support.SQLErrorCodes != null && this . org.springframework.jdbc.support.SQLErrorCodes . isUseSqlStateForTranslation ( ) ) { java.lang.String = STRING + java.sql.SQLException . java.lang.String ( ) + STRING + java.sql.SQLException . int ( ) ; } else { java.lang.String = STRING + java.sql.SQLException . int ( ) + STRING ; } logger . debug ( STRING + java.lang.String + STRING ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jdbc.support.DataAccessException org.springframework.jdbc.support.DataAccessException ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.sql.SQLException java.sql.SQLException ) { return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jdbc.support.DataAccessException org.springframework.jdbc.support.DataAccessException ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.sql.SQLException java.sql.SQLException , java.lang.Class<?> < ? > java.lang.Class<?> ) { try { int int = NUMBER ; java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] = java.lang.Class<> . java.lang.reflect.Constructor<?>[] ( ) ; for ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> : java.lang.reflect.Constructor<?>[] ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) ; if ( java.lang.Class<?>[] . int == NUMBER && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] ) { if ( int < int ) int = int ; } if ( java.lang.Class<?>[] . int == NUMBER && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.lang.Throwable .class == java.lang.Class<?>[] [ NUMBER ] ) { if ( int < int ) int = int ; } if ( java.lang.Class<?>[] . int == NUMBER && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.sql.SQLException .class == java.lang.Class<?>[] [ NUMBER ] ) { if ( int < int ) int = int ; } if ( java.lang.Class<?>[] . int == NUMBER && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.lang.Throwable .class == java.lang.Class<?>[] [ NUMBER ] ) { if ( int < int ) int = int ; } if ( java.lang.Class<?>[] . int == NUMBER && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.lang.String .class == java.lang.Class<?>[] [ NUMBER ] && java.sql.SQLException .class == java.lang.Class<?>[] [ NUMBER ] ) { if ( int < int ) int = int ; } } java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ; switch ( int ) { case int : java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.String .class , java.lang.String .class , java.sql.SQLException .class } ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.String , java.lang.String , java.sql.SQLException } ; java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.Class<?>[] ) ; return ( DataAccessException ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; case int : java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.String .class , java.lang.String .class , java.lang.Throwable .class } ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.String , java.lang.String , java.sql.SQLException } ; java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.Class<?>[] ) ; return ( DataAccessException ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; case int : java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.String .class , java.sql.SQLException .class } ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.String + STRING + java.sql.SQLException . java.lang.String ( ) , java.sql.SQLException } ; java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.Class<?>[] ) ; return ( DataAccessException ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; case int : java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.String .class , java.lang.Throwable .class } ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.String + STRING + java.sql.SQLException . java.lang.String ( ) , java.sql.SQLException } ; java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.Class<?>[] ) ; return ( DataAccessException ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; case int : java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.String .class } ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.String + STRING + java.sql.SQLException . java.lang.String ( ) } ; java.lang.reflect.Constructor<?> = java.lang.Class<> . java.lang.reflect.Constructor<> ( java.lang.Class<?>[] ) ; return ( DataAccessException ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; default: if ( logger . isWarnEnabled ( ) ) { logger . warn ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } return null ; } } catch ( java.lang.Throwable java.lang.Throwable ) { if ( logger . isWarnEnabled ( ) ) { logger . warn ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING , java.lang.Throwable ) ; } return null ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.sql.SQLException java.sql.SQLException , boolean boolean ) { if ( logger . isDebugEnabled ( ) ) { java.lang.String java.lang.String = boolean ? STRING : STRING ; logger . debug ( java.lang.String + STRING + java.sql.SQLException . java.lang.String ( ) + STRING + java.sql.SQLException . int ( ) + STRING + java.sql.SQLException . java.lang.String ( ) + STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } }  <METHOD_END>