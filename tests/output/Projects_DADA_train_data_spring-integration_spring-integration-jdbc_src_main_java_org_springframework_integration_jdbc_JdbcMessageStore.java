<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { this . org.springframework.integration.jdbc.DeserializingConverter = new DeserializingConverter ( ) ; this . org.springframework.integration.jdbc.SerializingConverter = new SerializingConverter ( ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource ) { this(); this . org.springframework.integration.jdbc.JdbcOperations = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.integration.jdbc.JdbcOperations = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public void void ( JdbcOperations org.springframework.integration.jdbc.JdbcOperations ) { this . org.springframework.integration.jdbc.JdbcOperations = org.springframework.integration.jdbc.JdbcOperations ; }  <METHOD_END>
<METHOD_START> public void void ( LobHandler org.springframework.integration.jdbc.LobHandler ) { this . org.springframework.integration.jdbc.LobHandler = org.springframework.integration.jdbc.LobHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( Serializer < ? super Message < ? > > org.springframework.integration.jdbc.Serializer<? super org.springframework.integration.jdbc.Message<?>> ) { this . org.springframework.integration.jdbc.SerializingConverter = new SerializingConverter ( ( Serializer < java.lang.Object > ) org.springframework.integration.jdbc.Serializer<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( Deserializer < ? extends Message < ? > > org.springframework.integration.jdbc.Deserializer<? extends org.springframework.integration.jdbc.Message<?>> ) { this . org.springframework.integration.jdbc.DeserializingConverter = new DeserializingConverter ( ( Deserializer ) org.springframework.integration.jdbc.Deserializer<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { Assert . state ( this . org.springframework.integration.jdbc.JdbcOperations != null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.util.UUID java.util.UUID ) { Message < ? > org.springframework.integration.jdbc.Message<?> = org.springframework.integration.jdbc.Message<?> ( java.util.UUID ) ; if ( org.springframework.integration.jdbc.Message<> == null ) { return null ; } int int = this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.String ( java.util.UUID ) , this . java.lang.String ) ; if ( int != NUMBER ) { return org.springframework.integration.jdbc.Message<> ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public long long ( ) { return this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.Long .class , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.util.UUID java.util.UUID ) { java.util.List<org.springframework.integration.jdbc.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jdbc.Message<?>> = this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , this . org.springframework.integration.jdbc.JdbcMessageStore.MessageMapper , java.lang.String ( java.util.UUID ) , this . java.lang.String ) ; if ( java.util.List<org.springframework.integration.jdbc.Message<?>> . isEmpty ( ) ) { return null ; } return java.util.List<org.springframework.integration.jdbc.Message<?>> . get ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.MessageMetadata org.springframework.integration.jdbc.MessageMetadata ( java.util.UUID java.util.UUID ) { java.util.List<org.springframework.integration.jdbc.MessageMetadata> < MessageMetadata > java.util.List<org.springframework.integration.jdbc.MessageMetadata> = this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ( rs , rn ) -> { MessageMetadata messageMetadata = new MessageMetadata ( UUID . fromString ( rs . getString ( STRING ) ) ) ; messageMetadata . setTimestamp ( rs . getTimestamp ( STRING ) . getTime ( ) ) ; return messageMetadata ; } , java.lang.String ( java.util.UUID ) , this . java.lang.String ) ; if ( java.util.List<org.springframework.integration.jdbc.MessageMetadata> . isEmpty ( ) ) { return null ; } return java.util.List<org.springframework.integration.jdbc.MessageMetadata> . get ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public < T > org.springframework.integration.jdbc.Message<T> < T > org.springframework.integration.jdbc.Message<T> ( final Message < T > org.springframework.integration.jdbc.Message<T> ) { java.util.UUID java.util.UUID = org.springframework.integration.jdbc.Message<T> . getHeaders ( ) . getId ( ) ; final java.lang.String java.lang.String = java.lang.String ( java.util.UUID ) ; final byte [] byte[] = this . org.springframework.integration.jdbc.SerializingConverter . convert ( org.springframework.integration.jdbc.Message<T> ) ; if ( org.springframework.integration.jdbc.Log . isDebugEnabled ( ) ) { org.springframework.integration.jdbc.Log . debug ( STRING + java.lang.String ) ; } try { this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { ps . setString ( NUMBER , messageId ) ; ps . setString ( NUMBER , this . region ) ; ps . setTimestamp ( NUMBER , new Timestamp ( System . currentTimeMillis ( ) ) ) ; this . lobHandler . getLobCreator ( ) . setBlobAsBytes ( ps , NUMBER , messageBytes ) ; } ) ; } catch ( DuplicateKeyException org.springframework.integration.jdbc.DuplicateKeyException ) { if ( org.springframework.integration.jdbc.Log . isDebugEnabled ( ) ) { org.springframework.integration.jdbc.Log . debug ( STRING + java.util.UUID + STRING + STRING ) ; } return ( Message < T > ) org.springframework.integration.jdbc.Message<?> ( java.util.UUID ) ; } return org.springframework.integration.jdbc.Message<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , org.springframework.integration.jdbc.Message<?> < ? > ... org.springframework.integration.jdbc.Message<?>[] ) { final java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; boolean boolean = this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( this . java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.Integer .class , java.lang.String , this . java.lang.String ) < NUMBER ; final java.sql.Timestamp java.sql.Timestamp = new java.sql.Timestamp ( java.lang.System . long ( ) ) ; final java.sql.Timestamp java.sql.Timestamp = boolean ? java.sql.Timestamp : this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.sql.Timestamp .class , java.lang.String , this . java.lang.String ) ; if ( boolean ) { try { void ( java.lang.String , java.sql.Timestamp ) ; } catch ( DuplicateKeyException org.springframework.integration.jdbc.DuplicateKeyException ) { org.springframework.integration.jdbc.Log . warn ( STRING , org.springframework.integration.jdbc.DuplicateKeyException ) ; void ( java.lang.String , java.sql.Timestamp ) ; } } else { void ( java.lang.String , java.sql.Timestamp ) ; } for ( Message < ? > org.springframework.integration.jdbc.Message<?> : org.springframework.integration.jdbc.Message<?>[] ) { org.springframework.integration.jdbc.Message ( org.springframework.integration.jdbc.Message<> ) ; } this . org.springframework.integration.jdbc.JdbcOperations . batchUpdate ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.util.Arrays . java.util.List ( org.springframework.integration.jdbc.Message<?>[] ) , NUMBER , ( ps , messageToAdd ) -> { String messageId = getKey ( messageToAdd . getHeaders ( ) . getId ( ) ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + messageId + STRING + createdDate ) ; } ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , messageId ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public int int ( ) { return this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.Integer .class , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public int int ( ) { return this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.Integer .class , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public int int ( java.lang.Object java.lang.Object ) { java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; return this . org.springframework.integration.jdbc.JdbcOperations . queryForObject ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.lang.Integer .class , java.lang.String , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.MessageGroup org.springframework.integration.jdbc.MessageGroup ( java.lang.Object java.lang.Object ) { java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; final java.util.concurrent.atomic.AtomicReference<java.util.Date> < java.util.Date > java.util.concurrent.atomic.AtomicReference<java.util.Date> = new java.util.concurrent.atomic.AtomicReference<java.util.Date> < java.util.Date > ( ) ; final java.util.concurrent.atomic.AtomicReference<java.util.Date> < java.util.Date > java.util.concurrent.atomic.AtomicReference<java.util.Date> = new java.util.concurrent.atomic.AtomicReference<java.util.Date> < java.util.Date > ( ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> < java.lang.Boolean > java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> = new java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> < java.lang.Boolean > ( ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> < java.lang.Integer > java.util.concurrent.atomic.AtomicReference<java.lang.Integer> = new java.util.concurrent.atomic.AtomicReference<java.lang.Integer> < java.lang.Integer > ( ) ; this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , rs -> { updateDate . set ( rs . getTimestamp ( STRING ) ) ; createDate . set ( rs . getTimestamp ( STRING ) ) ; completeFlag . set ( rs . getInt ( STRING ) > NUMBER ) ; lastReleasedSequenceRef . set ( rs . getInt ( STRING ) ) ; } , java.lang.String , this . java.lang.String ) ; if ( java.util.concurrent.atomic.AtomicReference<java.util.Date> . java.util.Date ( ) == null && java.util.concurrent.atomic.AtomicReference<java.util.Date> . java.util.Date ( ) == null ) { return new SimpleMessageGroup ( java.lang.Object ) ; } MessageGroup org.springframework.integration.jdbc.MessageGroup = getMessageGroupFactory ( ) . create ( this , java.lang.Object , java.util.concurrent.atomic.AtomicReference<java.util.Date> . java.util.Date ( ) . long ( ) , java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> . java.lang.Boolean ( ) ) ; org.springframework.integration.jdbc.MessageGroup . setLastModified ( java.util.concurrent.atomic.AtomicReference<java.util.Date> . java.util.Date ( ) . long ( ) ) ; org.springframework.integration.jdbc.MessageGroup . setLastReleasedMessageSequenceNumber ( java.util.concurrent.atomic.AtomicReference<java.lang.Integer> . java.lang.Integer ( ) ) ; return org.springframework.integration.jdbc.MessageGroup ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.util.Collection<org.springframework.integration.jdbc.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.jdbc.Message<?>> ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( java.util.Collection<org.springframework.integration.jdbc.Message<?>> , STRING ) ; final java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; if ( org.springframework.integration.jdbc.Log . isDebugEnabled ( ) ) { org.springframework.integration.jdbc.Log . debug ( STRING + java.lang.String ) ; } this . org.springframework.integration.jdbc.JdbcOperations . batchUpdate ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.util.Collection<org.springframework.integration.jdbc.Message<?>> , getRemoveBatchSize ( ) , ( ps , messageToRemove ) -> { ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , getKey ( messageToRemove . getHeaders ( ) . getId ( ) ) ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; this . org.springframework.integration.jdbc.JdbcOperations . batchUpdate ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , java.util.Collection<org.springframework.integration.jdbc.Message<?>> , getRemoveBatchSize ( ) , ( ps , messageToRemove ) -> { ps . setString ( NUMBER , getKey ( messageToRemove . getHeaders ( ) . getId ( ) ) ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; this . void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { final java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; for ( java.util.UUID java.util.UUID : this . java.util.List<java.util.UUID> ( java.lang.Object ) ) { this . org.springframework.integration.jdbc.Message<?> ( java.util.UUID ) ; } this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey ) ; } ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey ) ; } ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { final long long = java.lang.System . long ( ) ; final java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey ) ; } ps . setTimestamp ( NUMBER , new Timestamp ( updatedDate ) ) ; ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , final int int ) { Assert . notNull ( java.lang.Object , STRING ) ; final long long = java.lang.System . long ( ) ; final java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey ) ; } ps . setTimestamp ( NUMBER , new Timestamp ( updatedDate ) ) ; ps . setInt ( NUMBER , sequenceNumber ) ; ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; this . void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.lang.Object java.lang.Object ) { java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; Message < ? > org.springframework.integration.jdbc.Message<?> = this . org.springframework.integration.jdbc.Message<?> ( java.lang.String ) ; if ( org.springframework.integration.jdbc.Message<> != null ) { this . void ( java.lang.Object , org.springframework.integration.jdbc.Message<> ) ; } return org.springframework.integration.jdbc.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.lang.Object java.lang.Object ) { return org.springframework.integration.jdbc.Message<?> ( java.lang.String ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.integration.jdbc.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.jdbc.Message<?>> ( java.lang.Object java.lang.Object ) { return this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , this . org.springframework.integration.jdbc.JdbcMessageStore.MessageMapper , java.lang.String ( java.lang.Object ) , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.integration.jdbc.MessageGroup> < MessageGroup > java.util.Iterator<org.springframework.integration.jdbc.MessageGroup> ( ) { final java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , new SingleColumnRowMapper < java.lang.String > ( ) , this . java.lang.String ) . iterator ( ) ; return new java.util.Iterator<org.springframework.integration.jdbc.MessageGroup> < MessageGroup > ( ) { @ java.lang.Override public boolean boolean ( ) { return java.util.Iterator<java.lang.String> . boolean ( ) ; } @ java.lang.Override public org.springframework.integration.jdbc.MessageGroup org.springframework.integration.jdbc.MessageGroup ( ) { return org.springframework.integration.jdbc.MessageGroup ( java.util.Iterator<java.lang.String> . java.lang.String ( ) ) ; } @ java.lang.Override public void void ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return java.util.Iterator<java.lang.String> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.MessageGroup org.springframework.integration.jdbc.MessageGroup ( ) { return org.springframework.integration.jdbc.MessageGroup ( java.util.Iterator<java.lang.String> . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query org.springframework.integration.jdbc.JdbcMessageStore.Query ) { java.lang.String java.lang.String = this . java.util.Map<org.springframework.integration.jdbc.JdbcMessageStore.Query,java.lang.String> . java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query ) ; if ( java.lang.String == null ) { java.lang.String = StringUtils . replace ( org.springframework.integration.jdbc.JdbcMessageStore.Query . java.lang.String ( ) , STRING , this . java.lang.String ) ; this . java.util.Map<org.springframework.integration.jdbc.JdbcMessageStore.Query,java.lang.String> . java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query , java.lang.String ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.jdbc.JdbcOperations org.springframework.integration.jdbc.JdbcOperations ( ) { return this . org.springframework.integration.jdbc.JdbcOperations ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.lang.String java.lang.String ) { java.util.List<org.springframework.integration.jdbc.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jdbc.Message<?>> = this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , this . org.springframework.integration.jdbc.JdbcMessageStore.MessageMapper , java.lang.String , this . java.lang.String , java.lang.String , this . java.lang.String ) ; Assert . state ( java.util.List<org.springframework.integration.jdbc.Message<?>> . size ( ) < NUMBER , ( ) STRING + messages . size ( ) + STRING ) ; if ( java.util.List<org.springframework.integration.jdbc.Message<?>> . size ( ) > NUMBER ) { return java.util.List<org.springframework.integration.jdbc.Message<?>> . get ( NUMBER ) ; } return null ; }  <METHOD_END>
<METHOD_START> private void void ( final java.lang.String java.lang.String , final java.sql.Timestamp java.sql.Timestamp ) { this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey + STRING + createdDate ) ; } ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; ps . setTimestamp ( NUMBER , createdDate ) ; ps . setTimestamp ( NUMBER , createdDate ) ; } ) ; }  <METHOD_END>
<METHOD_START> private void void ( final java.lang.String java.lang.String , final java.sql.Timestamp java.sql.Timestamp ) { this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupKey + STRING + updatedDate ) ; } ps . setTimestamp ( NUMBER , updatedDate ) ; ps . setString ( NUMBER , groupKey ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; }  <METHOD_END>
<METHOD_START> private void void ( final java.lang.String java.lang.String ) { this . org.springframework.integration.jdbc.JdbcOperations . update ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ps -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + groupId ) ; } ps . setTimestamp ( NUMBER , new Timestamp ( System . currentTimeMillis ( ) ) ) ; ps . setString ( NUMBER , groupId ) ; ps . setString ( NUMBER , JdbcMessageStore .this . region ) ; } ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<java.util.UUID> < java.util.UUID > java.util.List<java.util.UUID> ( java.lang.Object java.lang.Object ) { java.lang.String java.lang.String = java.lang.String ( java.lang.Object ) ; final java.util.List<java.util.UUID> < java.util.UUID > java.util.List<java.util.UUID> = new java.util.ArrayList<java.util.UUID> < java.util.UUID > ( ) ; this . org.springframework.integration.jdbc.JdbcOperations . query ( java.lang.String ( org.springframework.integration.jdbc.JdbcMessageStore.Query . org.springframework.integration.jdbc.JdbcMessageStore.Query ) , ( RowCallbackHandler ) rs -> messageIds . add ( UUID . fromString ( rs . getString ( NUMBER ) ) ) , java.lang.String , this . java.lang.String ) ; return java.util.List<java.util.UUID> ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { return java.lang.Object == null ? null : UUIDConverter . getUUID ( java.lang.Object ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jdbc.Message<?> < ? > org.springframework.integration.jdbc.Message<?> ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { byte [] byte[] = org.springframework.integration.jdbc.JdbcMessageStore .this . org.springframework.integration.jdbc.LobHandler . getBlobAsBytes ( java.sql.ResultSet , STRING ) ; return ( Message < ? > ) org.springframework.integration.jdbc.JdbcMessageStore .this . org.springframework.integration.jdbc.DeserializingConverter . convert ( byte[] ) ; }  <METHOD_END>