<METHOD_START> public org.springframework.data.web.TemplateVariables org.springframework.data.web.TemplateVariables ( MethodParameter org.springframework.data.web.MethodParameter , UriComponents org.springframework.data.web.UriComponents ) { java.lang.String java.lang.String = getSortParameter ( org.springframework.data.web.MethodParameter ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.data.web.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.data.web.UriComponents . getQueryParams ( ) ; boolean boolean = ! org.springframework.data.web.MultiValueMap<java.lang.String,java.lang.String> . isEmpty ( ) ; if ( org.springframework.data.web.MultiValueMap<java.lang.String,java.lang.String> . containsKey ( java.lang.String ) ) { return TemplateVariables . NONE ; } java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING , java.lang.String ) ; VariableType org.springframework.data.web.VariableType = boolean ? REQUEST_PARAM_CONTINUED : REQUEST_PARAM ; return new TemplateVariables ( new TemplateVariable ( java.lang.String , org.springframework.data.web.VariableType , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( UriComponentsBuilder org.springframework.data.web.UriComponentsBuilder , MethodParameter org.springframework.data.web.MethodParameter , java.lang.Object java.lang.Object ) { if ( ! ( java.lang.Object instanceof Sort ) ) { return; } Sort org.springframework.data.web.Sort = ( Sort ) java.lang.Object ; java.lang.String java.lang.String = getSortParameter ( org.springframework.data.web.MethodParameter ) ; org.springframework.data.web.UriComponentsBuilder . replaceQueryParam ( java.lang.String ) ; for ( java.lang.String java.lang.String : foldIntoExpressions ( org.springframework.data.web.Sort ) ) { org.springframework.data.web.UriComponentsBuilder . queryParam ( java.lang.String , java.lang.String ) ; } }  <METHOD_END>