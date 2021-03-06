<METHOD_START> @ Before public void void ( ) { org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver = AnnotationBasedKeySpaceResolver . INSTANCE ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.EntityWithDefaultKeySpace .class ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.EntityWithSetKeySpace .class ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( TypeWithInhteritedPersistentAnnotationNotHavingKeySpace .class ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( TypeWithPersistentAnnotationNotHavingKeySpace .class ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.TypeWithoutKeySpace .class ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.EntityWithInheritedKeySpace .class ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( TypeWithDirectKeySpaceAnnotation .class ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.EntityWithSetKeySpaceUsingAliasFor .class ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolver . resolveKeySpace ( org.springframework.data.keyvalue.core.mapping.AnnotationBasedKeySpaceResolverUnitTests.EntityWithInheritedKeySpaceUsingAliasFor .class ) , is ( STRING ) ) ; }  <METHOD_END>
