<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { if ( StringUtils . hasLength ( java.lang.String ) ) { java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ; RuleBasedTransactionAttribute org.springframework.transaction.interceptor.RuleBasedTransactionAttribute = new RuleBasedTransactionAttribute ( ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.lang.String java.lang.String = StringUtils . trimWhitespace ( java.lang.String[] [ int ] . java.lang.String ( ) ) ; if ( StringUtils . containsWhitespace ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . PREFIX_PROPAGATION ) ) { org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setPropagationBehaviorName ( java.lang.String ) ; } else if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . PREFIX_ISOLATION ) ) { org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setIsolationLevelName ( java.lang.String ) ; } else if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . PREFIX_TIMEOUT ) ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( DefaultTransactionAttribute . PREFIX_TIMEOUT . length ( ) ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setTimeout ( java.lang.Integer . int ( java.lang.String ) ) ; } else if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . READ_ONLY_MARKER ) ) { org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setReadOnly ( true ) ; } else if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . PREFIX_COMMIT_RULE ) ) { org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new NoRollbackRuleAttribute ( java.lang.String . java.lang.String ( NUMBER ) ) ) ; } else if ( java.lang.String . boolean ( RuleBasedTransactionAttribute . PREFIX_ROLLBACK_RULE ) ) { org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new RollbackRuleAttribute ( java.lang.String . java.lang.String ( NUMBER ) ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } } void ( org.springframework.transaction.interceptor.RuleBasedTransactionAttribute ) ; } else { void ( null ) ; } }  <METHOD_END>