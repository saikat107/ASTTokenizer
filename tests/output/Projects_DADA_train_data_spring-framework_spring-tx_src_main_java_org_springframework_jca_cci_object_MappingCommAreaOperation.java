<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( ConnectionFactory org.springframework.jca.cci.object.ConnectionFactory , InteractionSpec org.springframework.jca.cci.object.InteractionSpec ) { super( org.springframework.jca.cci.object.ConnectionFactory , org.springframework.jca.cci.object.InteractionSpec ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final org.springframework.jca.cci.object.Record org.springframework.jca.cci.object.Record ( RecordFactory org.springframework.jca.cci.object.RecordFactory , java.lang.Object java.lang.Object ) { try { return new CommAreaRecord ( byte[] ( java.lang.Object ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new DataRetrievalFailureException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final java.lang.Object java.lang.Object ( Record org.springframework.jca.cci.object.Record ) throws org.springframework.jca.cci.object.DataAccessException { CommAreaRecord org.springframework.jca.cci.object.CommAreaRecord = ( CommAreaRecord ) org.springframework.jca.cci.object.Record ; try { return java.lang.Object ( org.springframework.jca.cci.object.CommAreaRecord . toByteArray ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new DataRetrievalFailureException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> protected abstract byte [] byte[] ( java.lang.Object java.lang.Object ) throws java.io.IOException , org.springframework.jca.cci.object.DataAccessException ;  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( byte [] byte[] ) throws java.io.IOException , org.springframework.jca.cci.object.DataAccessException ;  <METHOD_END>