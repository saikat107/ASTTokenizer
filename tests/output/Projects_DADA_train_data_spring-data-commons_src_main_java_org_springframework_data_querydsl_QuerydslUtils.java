<METHOD_START> public static java.lang.String java.lang.String ( Path < ? > org.springframework.data.querydsl.Path<?> ) { return java.lang.String ( org.springframework.data.querydsl.Path<> , STRING ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( Path < ? > org.springframework.data.querydsl.Path<?> , java.lang.String java.lang.String ) { if ( org.springframework.data.querydsl.Path<> == null ) { return java.lang.String ; } PathMetadata org.springframework.data.querydsl.PathMetadata = org.springframework.data.querydsl.Path<> . getMetadata ( ) ; Path < ? > org.springframework.data.querydsl.Path<?> = org.springframework.data.querydsl.PathMetadata . getParent ( ) ; if ( org.springframework.data.querydsl.Path<> == null ) { return java.lang.String ; } if ( org.springframework.data.querydsl.PathMetadata . getPathType ( ) . equals ( PathType . DELEGATE ) ) { return java.lang.String ( org.springframework.data.querydsl.Path<> , java.lang.String ) ; } java.lang.Object java.lang.Object = org.springframework.data.querydsl.PathMetadata . getElement ( ) ; if ( java.lang.Object == null || ! StringUtils . hasText ( java.lang.Object . java.lang.String ( ) ) ) { return java.lang.String ( org.springframework.data.querydsl.Path<> , java.lang.String ) ; } return java.lang.String ( org.springframework.data.querydsl.Path<> , StringUtils . hasText ( java.lang.String ) ? java.lang.String . java.lang.String ( STRING , java.lang.Object , java.lang.String ) : java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>