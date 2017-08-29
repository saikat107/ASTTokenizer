<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { this . java.lang.Object = java.lang.Object ; this . java.lang.String = java.lang.String ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ Parameters ( name = STRING ) public static java.util.List<java.lang.Object[]> < java.lang.Object [] > java.util.List<java.lang.Object[]> ( ) { java.util.List<java.lang.Object[]> < java.lang.Object [] > java.util.List<java.lang.Object[]> = new java.util.ArrayList<java.lang.Object[]> <> ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerPrivateType ( ) , java.util.List<java.lang.String> , java.lang.Object .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerTypeWithPrivateAncestor ( ) , java.util.List<java.lang.String> , org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerTypeWithPrivateAncestor .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerPackageDefaultType ( ) , java.util.List<java.lang.String> , org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerPackageDefaultType .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerProtectedType ( ) , java.util.List<java.lang.String> , org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerProtectedType .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerPublicType ( ) , java.util.List<java.lang.String> , org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.InnerPublicType .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new ClassGeneratingPropertyAccessorPackageDefaultType ( ) , java.util.List<java.lang.String> , ClassGeneratingPropertyAccessorPackageDefaultType .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new ClassGeneratingPropertyAccessorPublicType ( ) , java.util.List<java.lang.String> , ClassGeneratingPropertyAccessorPublicType .class ) ) ; java.util.List<java.lang.Object[]> . boolean ( java.util.List<java.lang.Object[]> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.SubtypeOfTypeInOtherPackage ( ) , java.util.List<java.lang.String> , org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.SubtypeOfTypeInOtherPackage .class ) ) ; return java.util.List<java.lang.Object[]> ; }  <METHOD_END>
<METHOD_START> private static java.util.List<java.lang.Object[]> < java.lang.Object [] > java.util.List<java.lang.Object[]> ( java.lang.Object java.lang.Object , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.List<java.lang.Object[]> < java.lang.Object [] > java.util.List<java.lang.Object[]> = new java.util.ArrayList<java.lang.Object[]> <> ( ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.util.List<java.lang.Object[]> . boolean ( new java.lang.Object [] { java.lang.Object , java.lang.String , java.lang.Class<> , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING + java.lang.String } ) ; } return java.util.List<java.lang.Object[]> ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( java.util.Optional<? extends org.springframework.data.mapping.model.PersistentProperty<?>> ( java.lang.Object , java.lang.String ) ) . hasValueSatisfying ( property -> { PersistentPropertyAccessor persistentPropertyAccessor = getPersistentPropertyAccessor ( bean ) ; persistentPropertyAccessor . setProperty ( property , Optional . of ( STRING ) ) ; assertThat ( persistentPropertyAccessor . getProperty ( property ) ) . isEqualTo ( Optional . of ( STRING ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { PersistentPropertyAccessor org.springframework.data.mapping.model.PersistentPropertyAccessor = org.springframework.data.mapping.model.PersistentPropertyAccessor ( java.lang.Object ) ; java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] = org.springframework.data.mapping.model.PersistentPropertyAccessor . getClass ( ) . getDeclaredConstructors ( ) ; assertThat ( java.lang.reflect.Constructor<?>[] . int ) . isEqualTo ( NUMBER ) ; assertThat ( java.lang.reflect.Constructor<?>[] [ NUMBER ] . int ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( java.lang.reflect.Constructor<?>[] [ NUMBER ] . java.lang.Class<?>[] ( ) [ NUMBER ] ) . isEqualTo ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactory . getPropertyAccessor ( org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<? extends org.springframework.data.mapping.model.PersistentProperty<?>> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.Dummy ( ) , STRING ) ) . hasValueSatisfying ( property -> assertThatExceptionOfType ( UnsupportedOperationException .class ) . isThrownBy ( ( ) getPersistentPropertyAccessor ( bean ) . getProperty ( property ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<? extends org.springframework.data.mapping.model.PersistentProperty<?>> ( new org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactoryTests.Dummy ( ) , STRING ) ) . hasValueSatisfying ( property -> assertThatExceptionOfType ( UnsupportedOperationException .class ) . isThrownBy ( ( ) getPersistentPropertyAccessor ( bean ) . setProperty ( property , Optional . empty ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> = org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> , STRING ) ) . isInstanceOf ( ClassGeneratingPropertyAccessorFactory .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mapping.model.PersistentPropertyAccessor org.springframework.data.mapping.model.PersistentPropertyAccessor ( java.lang.Object java.lang.Object ) { return org.springframework.data.mapping.model.ClassGeneratingPropertyAccessorFactory . getPropertyAccessor ( org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<? extends org.springframework.data.mapping.model.PersistentProperty<?>> < ? extends PersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.mapping.model.PersistentProperty<?>> ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> = org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; return org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . PROPERTY ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . PROPERTY ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . PROPERTY ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . PROPERTY ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.String = java.lang.String ; }  <METHOD_END>