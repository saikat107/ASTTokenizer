<METHOD_START> public static java.lang.String java.lang.String ( AlterUserTypeSpecification org.springframework.cassandra.core.cql.generator.AlterUserTypeSpecification ) { return new org.springframework.cassandra.core.cql.generator.AlterUserTypeCqlGenerator ( org.springframework.cassandra.core.cql.generator.AlterUserTypeSpecification ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void ( AlterUserTypeSpecification org.springframework.cassandra.core.cql.generator.AlterUserTypeSpecification ) { super( org.springframework.cassandra.core.cql.generator.AlterUserTypeSpecification ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { Assert . notNull ( getSpecification ( ) . getName ( ) , STRING ) ; Assert . isTrue ( ! getSpecification ( ) . getChanges ( ) . isEmpty ( ) , java.lang.String . java.lang.String ( STRING , getSpecification ( ) . getName ( ) ) ) ; return java.lang.StringBuilder ( java.lang.StringBuilder ( java.lang.StringBuilder ) ) . java.lang.StringBuilder ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { return noNull ( java.lang.StringBuilder ) . append ( STRING ) . append ( spec ( ) . getName ( ) ) . append ( ' ' ) ; }  <METHOD_END>
<METHOD_START> private java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder = noNull ( java.lang.StringBuilder ) ; boolean boolean = true ; boolean boolean = false ; for ( ColumnChangeSpecification org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification : spec ( ) . getChanges ( ) ) { if ( ! boolean ) { java.lang.StringBuilder . java.lang.StringBuilder ( ' ' ) ; } org.springframework.cassandra.core.cql.generator.ColumnChangeCqlGenerator<?> ( org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification , boolean ) . toCql ( java.lang.StringBuilder ) ; boolean = org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification instanceof RenameColumnSpecification ; boolean = false ; } return java.lang.StringBuilder ; }  <METHOD_END>
<METHOD_START> private org.springframework.cassandra.core.cql.generator.ColumnChangeCqlGenerator<?> < ? > org.springframework.cassandra.core.cql.generator.ColumnChangeCqlGenerator<?> ( ColumnChangeSpecification org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification , boolean boolean ) { if ( org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification instanceof AddColumnSpecification ) { return new AddColumnCqlGenerator ( ( AddColumnSpecification ) org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification ) ; } if ( org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification instanceof AlterColumnSpecification ) { return new AlterColumnCqlGenerator ( ( AlterColumnSpecification ) org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification ) ; } if ( org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification instanceof RenameColumnSpecification ) { return new RenameColumnCqlGenerator ( boolean ? STRING : RenameColumnCqlGenerator . RENAME , org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification ) ; } throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.cassandra.core.cql.generator.ColumnChangeSpecification . getClass ( ) . getName ( ) ) ) ; }  <METHOD_END>