<METHOD_START> @ Bean @ ConditionalOnMissingBean ( MockMvcRestDocumentationConfigurer .class ) public org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer ( ObjectProvider < RestDocsMockMvcConfigurationCustomizer > org.springframework.boot.test.autoconfigure.restdocs.ObjectProvider<org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer> , RestDocumentationContextProvider org.springframework.boot.test.autoconfigure.restdocs.RestDocumentationContextProvider ) { MockMvcRestDocumentationConfigurer org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer = MockMvcRestDocumentation . documentationConfiguration ( org.springframework.boot.test.autoconfigure.restdocs.RestDocumentationContextProvider ) ; RestDocsMockMvcConfigurationCustomizer org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer = org.springframework.boot.test.autoconfigure.restdocs.ObjectProvider<org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer> . getIfAvailable ( ) ; if ( org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer != null ) { org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer . customize ( org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer ) ; } return org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcBuilderCustomizer org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcBuilderCustomizer ( MockMvcRestDocumentationConfigurer org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer , ObjectProvider < RestDocumentationResultHandler > org.springframework.boot.test.autoconfigure.restdocs.ObjectProvider<org.springframework.boot.test.autoconfigure.restdocs.RestDocumentationResultHandler> ) { return new RestDocsMockMvcBuilderCustomizer ( org.springframework.boot.test.autoconfigure.restdocs.MockMvcRestDocumentationConfigurer , org.springframework.boot.test.autoconfigure.restdocs.ObjectProvider<org.springframework.boot.test.autoconfigure.restdocs.RestDocumentationResultHandler> . getIfAvailable ( ) ) ; }  <METHOD_END>