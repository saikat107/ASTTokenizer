<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( - NUMBER ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.core.annotation.OrderSourceProviderTests.C ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.core.annotation.OrderSourceProviderTests.C ) ; java.util.Collections . void ( java.util.List<java.lang.Object> , org.springframework.core.annotation.AnnotationAwareOrderComparator ) ; void ( java.util.List<java.lang.Object> , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.C ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( - NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.B org.springframework.core.annotation.OrderSourceProviderTests.B = new org.springframework.core.annotation.OrderSourceProviderTests.B ( ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Object> ( org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.B ) ; java.util.Collections . void ( java.util.List<> , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> null ) ) ; void ( java.util.List<> , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.B ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.B org.springframework.core.annotation.OrderSourceProviderTests.B = new org.springframework.core.annotation.OrderSourceProviderTests.B ( ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Object> ( org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.B ) ; java.util.Collections . void ( java.util.List<> , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> { if ( obj == a ) { return new C ( NUMBER ) ; } if ( obj == b ) { return new C ( NUMBER ) ; } return null ; } ) ) ; void ( java.util.List<> , org.springframework.core.annotation.OrderSourceProviderTests.B , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( - NUMBER ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Object> ( org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.C ) ; java.util.Collections . void ( java.util.List<> , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> { if ( obj == a ) { return NUMBER ; } if ( obj == c2 ) { return NUMBER ; } return null ; } ) ) ; void ( java.util.List<> , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( - NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.B org.springframework.core.annotation.OrderSourceProviderTests.B = new org.springframework.core.annotation.OrderSourceProviderTests.B ( ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.B } ; java.util.Arrays . void ( java.lang.Object[] , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> null ) ) ; void ( java.lang.Object[] , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.B ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.B org.springframework.core.annotation.OrderSourceProviderTests.B = new org.springframework.core.annotation.OrderSourceProviderTests.B ( ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.B } ; java.util.Arrays . void ( java.lang.Object[] , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> { if ( obj == a ) { return new C ( NUMBER ) ; } if ( obj == b ) { return new C ( NUMBER ) ; } return null ; } ) ) ; void ( java.lang.Object[] , org.springframework.core.annotation.OrderSourceProviderTests.B , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.annotation.OrderSourceProviderTests.A org.springframework.core.annotation.OrderSourceProviderTests.A = new org.springframework.core.annotation.OrderSourceProviderTests.A ( ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( NUMBER ) ; org.springframework.core.annotation.OrderSourceProviderTests.C org.springframework.core.annotation.OrderSourceProviderTests.C = new org.springframework.core.annotation.OrderSourceProviderTests.C ( - NUMBER ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.C } ; java.util.Arrays . void ( java.lang.Object[] , org.springframework.core.annotation.AnnotationAwareOrderComparator . withSourceProvider ( obj -> { if ( obj == a ) { return NUMBER ; } if ( obj == c2 ) { return NUMBER ; } return null ; } ) ) ; void ( java.lang.Object[] , org.springframework.core.annotation.OrderSourceProviderTests.C , org.springframework.core.annotation.OrderSourceProviderTests.A , org.springframework.core.annotation.OrderSourceProviderTests.C ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<?> < ? > java.util.List<?> , java.lang.Object ... java.lang.Object[] ) { for ( int int = NUMBER ; int < java.util.List<> . int ( ) ; int ++ ) { assertSame ( STRING + int + STRING , java.lang.Object[] [ int ] , java.util.List<> . get ( int ) ) ; } assertEquals ( STRING , java.lang.Object[] . int , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object [] java.lang.Object[] , java.lang.Object ... java.lang.Object[] ) { for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { assertSame ( STRING + int + STRING , java.lang.Object[] [ int ] , java.lang.Object[] [ int ] ) ; } assertEquals ( STRING , java.lang.Object[] . int , java.lang.Object[] . int ) ; }  <METHOD_END>
<METHOD_START> private void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ; }  <METHOD_END>