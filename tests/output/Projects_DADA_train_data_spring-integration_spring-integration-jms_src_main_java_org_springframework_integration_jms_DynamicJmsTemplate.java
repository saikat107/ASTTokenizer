<METHOD_START> @ java.lang.Override public int int ( ) { java.lang.Integer java.lang.Integer = DynamicJmsTemplateProperties . getPriority ( ) ; if ( java.lang.Integer == null ) { return super. getPriority ( ) ; } Assert . isTrue ( java.lang.Integer >= NUMBER && java.lang.Integer <= NUMBER , STRING ) ; return java.lang.Integer . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { java.lang.Long java.lang.Long = DynamicJmsTemplateProperties . getReceiveTimeout ( ) ; return ( java.lang.Long != null ) ? java.lang.Long . long ( ) : super. getReceiveTimeout ( ) ; }  <METHOD_END>