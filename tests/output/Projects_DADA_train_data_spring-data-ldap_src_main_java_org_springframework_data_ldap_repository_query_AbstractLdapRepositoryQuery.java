<METHOD_START> public void ( LdapQueryMethod org.springframework.data.ldap.repository.query.LdapQueryMethod , java.lang.Class<?> < ? > java.lang.Class<?> , LdapOperations org.springframework.data.ldap.repository.query.LdapOperations ) { Assert . notNull ( org.springframework.data.ldap.repository.query.LdapQueryMethod , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( org.springframework.data.ldap.repository.query.LdapOperations , STRING ) ; this . org.springframework.data.ldap.repository.query.LdapQueryMethod = org.springframework.data.ldap.repository.query.LdapQueryMethod ; this . java.lang.Class<?> = java.lang.Class<> ; this . org.springframework.data.ldap.repository.query.LdapOperations = org.springframework.data.ldap.repository.query.LdapOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { LdapQuery org.springframework.data.ldap.repository.query.LdapQuery = org.springframework.data.ldap.repository.query.LdapQuery ( java.lang.Object[] ) ; if ( org.springframework.data.ldap.repository.query.LdapQueryMethod . isCollectionQuery ( ) ) { return org.springframework.data.ldap.repository.query.LdapOperations . find ( org.springframework.data.ldap.repository.query.LdapQuery , java.lang.Class<> ) ; } else { try { return org.springframework.data.ldap.repository.query.LdapOperations . findOne ( org.springframework.data.ldap.repository.query.LdapQuery , java.lang.Class<> ) ; } catch ( EmptyResultDataAccessException org.springframework.data.ldap.repository.query.EmptyResultDataAccessException ) { return null ; } } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.ldap.repository.query.LdapQuery org.springframework.data.ldap.repository.query.LdapQuery ( java.lang.Object [] java.lang.Object[] );  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.data.ldap.repository.query.QueryMethod org.springframework.data.ldap.repository.query.QueryMethod ( ) { return org.springframework.data.ldap.repository.query.LdapQueryMethod ; }  <METHOD_END>