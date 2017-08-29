<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.boot.autoconfigure.session.AnnotationMetadata ) { StoreType [] org.springframework.boot.autoconfigure.session.StoreType[] = StoreType . values ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [ types . length ] ; for ( int int = NUMBER ; int < types . length ; int ++ ) { java.lang.String[] [ int ] = SessionStoreMappings . getConfigurationClass ( org.springframework.boot.autoconfigure.session.StoreType[] [ int ] ) ; } return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> void ( SessionProperties org.springframework.boot.autoconfigure.session.SessionProperties , ObjectProvider < SessionRepository < ? > > org.springframework.boot.autoconfigure.session.ObjectProvider<org.springframework.boot.autoconfigure.session.SessionRepository<?>> ) { this . org.springframework.boot.autoconfigure.session.SessionProperties = org.springframework.boot.autoconfigure.session.SessionProperties ; this . org.springframework.boot.autoconfigure.session.ObjectProvider<org.springframework.boot.autoconfigure.session.SessionRepository<?>> = org.springframework.boot.autoconfigure.session.ObjectProvider<org.springframework.boot.autoconfigure.session.SessionRepository<?>> ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PostConstruct public void void ( ) { StoreType org.springframework.boot.autoconfigure.session.StoreType = this . org.springframework.boot.autoconfigure.session.SessionProperties . getStoreType ( ) ; if ( org.springframework.boot.autoconfigure.session.StoreType != StoreType . NONE ) { Assert . notNull ( this . org.springframework.boot.autoconfigure.session.ObjectProvider<org.springframework.boot.autoconfigure.session.SessionRepository<?>> . getIfAvailable ( ) , STRING + STRING + org.springframework.boot.autoconfigure.session.StoreType + STRING ) ; } }  <METHOD_END>