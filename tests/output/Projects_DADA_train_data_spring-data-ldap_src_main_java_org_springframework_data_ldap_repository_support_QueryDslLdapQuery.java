<METHOD_START> public void ( LdapOperations org.springframework.data.ldap.repository.support.LdapOperations , EntityPath < K > org.springframework.data.ldap.repository.support.EntityPath<K> ) { this( org.springframework.data.ldap.repository.support.LdapOperations , org.springframework.data.ldap.repository.support.EntityPath<K> . getType ( ) ); }  <METHOD_END>
<METHOD_START> public void ( LdapOperations org.springframework.data.ldap.repository.support.LdapOperations , java.lang.Class<? extends K> < ? extends K > java.lang.Class<? extends K> ) { Assert . notNull ( org.springframework.data.ldap.repository.support.LdapOperations , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; this . org.springframework.data.ldap.repository.support.LdapOperations = org.springframework.data.ldap.repository.support.LdapOperations ; this . java.lang.Class<? extends K> = java.lang.Class<> ; this . org.springframework.data.ldap.repository.support.LdapSerializer = new LdapSerializer ( org.springframework.data.ldap.repository.support.LdapOperations . getObjectDirectoryMapper ( ) , this . java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.ldap.repository.support.QueryDslLdapQuery<K> < K > org.springframework.data.ldap.repository.support.QueryDslLdapQuery<K> ( Predicate ... org.springframework.data.ldap.repository.support.Predicate[] ) { return org.springframework.data.ldap.repository.support.QueryMixin<org.springframework.data.ldap.repository.support.QueryDslLdapQuery<K>> . where ( org.springframework.data.ldap.repository.support.Predicate[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.util.List<K> < K > java.util.List<K> ( ) { return ( java.util.List<K> < K > ) org.springframework.data.ldap.repository.support.LdapOperations . find ( org.springframework.data.ldap.repository.support.LdapQuery ( ) , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public K K ( ) { return org.springframework.data.ldap.repository.support.LdapOperations . findOne ( org.springframework.data.ldap.repository.support.LdapQuery ( ) , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.ldap.repository.support.LdapQuery org.springframework.data.ldap.repository.support.LdapQuery ( ) { return query ( ) . filter ( org.springframework.data.ldap.repository.support.LdapSerializer . handle ( org.springframework.data.ldap.repository.support.QueryMixin<org.springframework.data.ldap.repository.support.QueryDslLdapQuery<K>> . getMetadata ( ) . getWhere ( ) ) ) ; }  <METHOD_END>