<METHOD_START> @ java.lang.Deprecated public void ( MappingContext < ? extends PersistentEntity < ? , ? > , ? extends PersistentProperty < ? > > org.springframework.data.auditing.MappingContext<? extends org.springframework.data.auditing.PersistentEntity<?,?>,? extends org.springframework.data.auditing.PersistentProperty<?>> ) { this( new PersistentEntities ( java.util.Collections . java.util.List ( org.springframework.data.auditing.MappingContext<,> ) ) ); }  <METHOD_END>
<METHOD_START> public void ( PersistentEntities org.springframework.data.auditing.PersistentEntities ) { super( org.springframework.data.auditing.PersistentEntities ); this . org.springframework.data.auditing.IsNewStrategyFactory = new MappingContextIsNewStrategyFactory ( org.springframework.data.auditing.PersistentEntities ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; if ( ! isAuditable ( java.lang.Object ) ) { return; } IsNewStrategy org.springframework.data.auditing.IsNewStrategy = org.springframework.data.auditing.IsNewStrategyFactory . getIsNewStrategy ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; if ( org.springframework.data.auditing.IsNewStrategy . isNew ( java.lang.Object ) ) { markCreated ( java.lang.Object ) ; } else { markModified ( java.lang.Object ) ; } }  <METHOD_END>