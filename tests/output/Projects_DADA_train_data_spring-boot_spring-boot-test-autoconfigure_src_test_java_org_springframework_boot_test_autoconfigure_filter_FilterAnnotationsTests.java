<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations = org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.FilterByAnnotation .class ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithAnnotation .class ) ) . isTrue ( ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations = org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.FilterByType .class ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithAnnotation .class ) ) . isFalse ( ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations = org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.FilterByCustom .class ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithAnnotation .class ) ) . isFalse ( ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations = org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.FilterByAspectJ .class ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithAnnotation .class ) ) . isFalse ( ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations = org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.FilterByRegex .class ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithAnnotation .class ) ) . isFalse ( ) ; assertThat ( boolean ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.autoconfigure.filter.FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations ( java.lang.Class<?> < ? > java.lang.Class<?> ) { org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.Filters org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.Filters = AnnotatedElementUtils . getMergedAnnotation ( java.lang.Class<> , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.Filters .class ) ; return new FilterAnnotations ( java.lang.Class<? extends org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests> ( ) . java.lang.ClassLoader ( ) , org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.Filters . org.springframework.boot.test.autoconfigure.filter.Filter[] ( ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( FilterAnnotations org.springframework.boot.test.autoconfigure.filter.FilterAnnotations , java.lang.Class<?> < ? > java.lang.Class<?> )			throws java.io.IOException { MetadataReaderFactory org.springframework.boot.test.autoconfigure.filter.MetadataReaderFactory = new SimpleMetadataReaderFactory ( ) ; MetadataReader org.springframework.boot.test.autoconfigure.filter.MetadataReader = org.springframework.boot.test.autoconfigure.filter.MetadataReaderFactory . getMetadataReader ( java.lang.Class<> . java.lang.String ( ) ) ; return org.springframework.boot.test.autoconfigure.filter.FilterAnnotations . anyMatches ( org.springframework.boot.test.autoconfigure.filter.MetadataReader , org.springframework.boot.test.autoconfigure.filter.MetadataReaderFactory ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MetadataReader org.springframework.boot.test.autoconfigure.filter.MetadataReader , MetadataReaderFactory org.springframework.boot.test.autoconfigure.filter.MetadataReaderFactory ) throws java.io.IOException { return org.springframework.boot.test.autoconfigure.filter.MetadataReader . getClassMetadata ( ) . getClassName ( ) . equals ( org.springframework.boot.test.autoconfigure.filter.FilterAnnotationsTests.ExampleWithoutAnnotation .class . java.lang.String ( ) ) ; }  <METHOD_END>