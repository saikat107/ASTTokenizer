<METHOD_START> private void void ( ContextConfigurationAttributes org.springframework.test.context.support.ContextConfigurationAttributes ) { assertAttributes ( org.springframework.test.context.support.ContextConfigurationAttributes , LocationsFoo .class , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( ContextConfigurationAttributes org.springframework.test.context.support.ContextConfigurationAttributes ) { assertAttributes ( org.springframework.test.context.support.ContextConfigurationAttributes , ClassesFoo .class , EMPTY_STRING_ARRAY , new java.lang.Class<?> < ? > [] { FooConfig .class } , ContextLoader .class , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( ContextConfigurationAttributes org.springframework.test.context.support.ContextConfigurationAttributes ) { assertAttributes ( org.springframework.test.context.support.ContextConfigurationAttributes , LocationsBar .class , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , AnnotationConfigContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> private void void ( ContextConfigurationAttributes org.springframework.test.context.support.ContextConfigurationAttributes ) { assertAttributes ( org.springframework.test.context.support.ContextConfigurationAttributes , ClassesBar .class , EMPTY_STRING_ARRAY , new java.lang.Class<?> < ? > [] { BarConfig .class } , AnnotationConfigContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.test.context.support.ExpectedException . expect ( AnnotationConfigurationException .class ) ; org.springframework.test.context.support.ExpectedException . expectMessage ( containsString ( org.springframework.test.context.support.ContextLoaderUtilsConfigurationAttributesTests.ConflictingLocations .class . java.lang.String ( ) ) ) ; org.springframework.test.context.support.ExpectedException . expectMessage ( either ( containsString ( STRING ) ) . or ( containsString ( STRING ) ) ) ; org.springframework.test.context.support.ExpectedException . expectMessage ( either ( containsString ( STRING ) ) . or ( containsString ( STRING ) ) ) ; org.springframework.test.context.support.ExpectedException . expectMessage ( containsString ( STRING ) ) ; resolveContextConfigurationAttributes ( org.springframework.test.context.support.ContextLoaderUtilsConfigurationAttributesTests.ConflictingLocations .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Class<org.springframework.test.context.support.BareAnnotations> < BareAnnotations > java.lang.Class<org.springframework.test.context.support.BareAnnotations> = BareAnnotations .class ; java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( java.lang.Class<org.springframework.test.context.support.BareAnnotations> ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , java.lang.Class<org.springframework.test.context.support.BareAnnotations> , EMPTY_STRING_ARRAY , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( LocationsFoo .class ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Class<org.springframework.test.context.support.MetaLocationsFoo> < MetaLocationsFoo > java.lang.Class<org.springframework.test.context.support.MetaLocationsFoo> = MetaLocationsFoo .class ; java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( java.lang.Class<org.springframework.test.context.support.MetaLocationsFoo> ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , java.lang.Class<org.springframework.test.context.support.MetaLocationsFoo> , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverrides> < MetaLocationsFooWithOverrides > java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverrides> = MetaLocationsFooWithOverrides .class ; java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverrides> ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverrides> , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverriddenAttributes> < MetaLocationsFooWithOverriddenAttributes > java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverriddenAttributes> = MetaLocationsFooWithOverriddenAttributes .class ; java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverriddenAttributes> ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , java.lang.Class<org.springframework.test.context.support.MetaLocationsFooWithOverriddenAttributes> , new java.lang.String [] { STRING , STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Class<org.springframework.test.context.support.MetaLocationsBar> < MetaLocationsBar > java.lang.Class<org.springframework.test.context.support.MetaLocationsBar> = MetaLocationsBar .class ; java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( java.lang.Class<org.springframework.test.context.support.MetaLocationsBar> ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , java.lang.Class<org.springframework.test.context.support.MetaLocationsBar> , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; assertAttributes ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) , MetaLocationsFoo .class , new java.lang.String [] { STRING } , EMPTY_CLASS_ARRAY , ContextLoader .class , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( ClassesFoo .class ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( LocationsBar .class ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( ClassesBar .class ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; void ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> < ContextConfigurationAttributes > java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> = resolveContextConfigurationAttributes ( org.springframework.test.context.support.ContextLoaderUtilsConfigurationAttributesTests.LocationsAndClasses .class ) ; assertNotNull ( java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.test.context.support.ContextConfigurationAttributes> . size ( ) ) ; }  <METHOD_END>