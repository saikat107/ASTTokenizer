<METHOD_START> @ Autowired public void ( PersistentEntityToJsonSchemaConverter org.springframework.data.rest.webmvc.PersistentEntityToJsonSchemaConverter ) { Assert . notNull ( org.springframework.data.rest.webmvc.PersistentEntityToJsonSchemaConverter , STRING ) ; this . org.springframework.data.rest.webmvc.PersistentEntityToJsonSchemaConverter = org.springframework.data.rest.webmvc.PersistentEntityToJsonSchemaConverter ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = ProfileController . RESOURCE_PROFILE_MAPPING , method = GET , produces = RestMediaTypes . SCHEMA_JSON_VALUE ) public org.springframework.data.rest.webmvc.HttpEntity<org.springframework.data.rest.webmvc.JsonSchema> < JsonSchema > org.springframework.data.rest.webmvc.HttpEntity<org.springframework.data.rest.webmvc.JsonSchema> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation ) { JsonSchema org.springframework.data.rest.webmvc.JsonSchema = org.springframework.data.rest.webmvc.PersistentEntityToJsonSchemaConverter . convert ( org.springframework.data.rest.webmvc.RootResourceInformation . getDomainType ( ) ) ; return new ResponseEntity < JsonSchema > ( org.springframework.data.rest.webmvc.JsonSchema , HttpStatus . OK ) ; }  <METHOD_END>