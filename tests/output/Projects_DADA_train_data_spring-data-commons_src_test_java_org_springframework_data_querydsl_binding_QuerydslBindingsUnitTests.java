<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.querydsl.binding.QuerydslPredicateBuilder = new QuerydslPredicateBuilder ( new DefaultConversionService ( ) , SimpleEntityPathResolver . INSTANCE ) ; this . org.springframework.data.querydsl.binding.QuerydslBindings = new QuerydslBindings ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PathInformation org.springframework.data.querydsl.binding.PathInformation = PropertyPathInformation . of ( STRING , User .class ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . firstname ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = PropertyPathInformation . of ( STRING , User .class ) ; void ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) , org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address . street ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = PropertyPathInformation . of ( STRING , User .class ) ; void ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) , org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( java.lang.String .class ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = PropertyPathInformation . of ( STRING , User .class ) ; void ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) , org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( java.lang.String .class ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = PropertyPathInformation . of ( STRING , User .class ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( java.lang.String .class ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . inceptionYear ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . inceptionYear ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . inceptionYear ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . inceptionYear ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . firstname ) ; org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . firstname ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . address ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . address ) ; org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . address . city ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . excluding ( QUser . user . address ) ; org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . address . city ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . firstname , QUser . user . address . street ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address ) . as ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address ) . as ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address . city ) . as ( STRING ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = org.springframework.data.querydsl.binding.QuerydslBindings . getPropertyPath ( STRING , ClassTypeInformation . from ( User .class ) ) ; assertThat ( org.springframework.data.querydsl.binding.PathInformation ) . isNotNull ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . including ( QUser . user . address . city ) ; org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address . city ) . as ( STRING ) . first ( org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = org.springframework.data.querydsl.binding.QuerydslBindings . getPropertyPath ( STRING , ClassTypeInformation . from ( User .class ) ) ; assertThat ( org.springframework.data.querydsl.binding.PathInformation ) . isNotNull ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = org.springframework.data.querydsl.binding.QuerydslBindings . getPropertyPath ( STRING , ClassTypeInformation . from ( User .class ) ) ; assertThat ( org.springframework.data.querydsl.binding.PathInformation ) . isNotNull ( ) ; void ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) , org.springframework.data.querydsl.binding.SingleValueBinding<org.springframework.data.querydsl.binding.StringPath,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . address . city ) . as ( STRING ) . withDefaultBinding ( ) ; PathInformation org.springframework.data.querydsl.binding.PathInformation = org.springframework.data.querydsl.binding.QuerydslBindings . getPropertyPath ( STRING , ClassTypeInformation . from ( User .class ) ) ; assertThat ( org.springframework.data.querydsl.binding.PathInformation ) . isNotNull ( ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . getBindingForPath ( org.springframework.data.querydsl.binding.PathInformation ) ) . isNotPresent ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . as ( QSpecialUser .class ) . specialProperty ) . first ( org.springframework.data.querydsl.binding.QuerydslBindingsUnitTests.ContainsBinding . org.springframework.data.querydsl.binding.QuerydslBindingsUnitTests.ContainsBinding ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslBindings . isPathAvailable ( STRING , User .class ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private static < P extends org.springframework.data.querydsl.binding.Path<? extends S> < ? extends S > , S > void void ( java.util.Optional<org.springframework.data.querydsl.binding.MultiValueBinding<P,S>> < MultiValueBinding < P , S > > java.util.Optional<org.springframework.data.querydsl.binding.MultiValueBinding<P,S>> , SingleValueBinding < ? extends Path < ? > , ? > org.springframework.data.querydsl.binding.SingleValueBinding<? extends org.springframework.data.querydsl.binding.Path<?>,?> ) { assertThat ( java.util.Optional<org.springframework.data.querydsl.binding.MultiValueBinding<P,S>> ) . hasValueSatisfying ( it -> { } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.data.querydsl.binding.Predicate> < Predicate > java.util.Optional<org.springframework.data.querydsl.binding.Predicate> ( StringPath org.springframework.data.querydsl.binding.StringPath , java.lang.String java.lang.String ) { return java.util.Optional . java.util.Optional ( org.springframework.data.querydsl.binding.StringPath . contains ( java.lang.String ) ) ; }  <METHOD_END>