<METHOD_START> public void ( SpelExpressionParser org.springframework.data.keyvalue.core.SpelExpressionParser ) { Assert . notNull ( org.springframework.data.keyvalue.core.SpelExpressionParser , STRING ) ; this . org.springframework.data.keyvalue.core.SpelExpressionParser = org.springframework.data.keyvalue.core.SpelExpressionParser ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.keyvalue.core.SpelCriteria org.springframework.data.keyvalue.core.SpelCriteria ( KeyValueQuery < ? > org.springframework.data.keyvalue.core.KeyValueQuery<?> ) { if ( org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) == null ) { return null ; } if ( org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) instanceof SpelExpression ) { return new SpelCriteria ( ( SpelExpression ) org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) ) ; } if ( org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) instanceof java.lang.String ) { return new SpelCriteria ( org.springframework.data.keyvalue.core.SpelExpressionParser . parseRaw ( ( java.lang.String ) org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) ) ) ; } if ( org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) instanceof SpelCriteria ) { return ( SpelCriteria ) org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) ; } throw new java.lang.IllegalArgumentException ( STRING + org.springframework.data.keyvalue.core.KeyValueQuery<> . getCritieria ( ) ) ; }  <METHOD_END>