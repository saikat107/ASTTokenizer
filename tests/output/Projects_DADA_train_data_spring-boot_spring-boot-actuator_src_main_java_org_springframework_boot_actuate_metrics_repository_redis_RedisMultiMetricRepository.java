<METHOD_START> public void ( RedisConnectionFactory org.springframework.boot.actuate.metrics.repository.redis.RedisConnectionFactory ) { this( org.springframework.boot.actuate.metrics.repository.redis.RedisConnectionFactory , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( RedisConnectionFactory org.springframework.boot.actuate.metrics.repository.redis.RedisConnectionFactory , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.boot.actuate.metrics.repository.redis.RedisConnectionFactory , STRING ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> = RedisUtils . stringTemplate ( org.springframework.boot.actuate.metrics.repository.redis.RedisConnectionFactory ) ; if ( ! java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } this . java.lang.String = java.lang.String ; this . java.lang.String = STRING + this . java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - NUMBER ) ; this . org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . boundZSetOps ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> < Metric < ? > > java.lang.Iterable<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( java.lang.String java.lang.String ) { BoundZSetOperations < java.lang.String , java.lang.String > org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . boundZSetOps ( java.lang.String ( java.lang.String ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . range ( NUMBER , - NUMBER ) ; java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = java.util.Set<java.lang.String> . java.util.Iterator<java.lang.String> ( ) ; java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> < Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> = new java.util.ArrayList<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> <> ( java.util.Set<java.lang.String> . int ( ) ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . opsForValue ( ) . multiGet ( java.util.Set<java.lang.String> ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = java.util.Iterator<java.lang.String> . java.lang.String ( ) ; java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> . add ( org.springframework.boot.actuate.metrics.repository.redis.Metric<?> ( java.lang.String , java.lang.String , java.lang.String , org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . score ( java.lang.String ) ) ) ; } return java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.util.Collection<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; void ( java.lang.String ) ; BoundZSetOperations < java.lang.String , java.lang.String > org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . boundZSetOps ( java.lang.String ) ; for ( Metric < ? > org.springframework.boot.actuate.metrics.repository.redis.Metric<?> : java.util.Collection<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> ) ; java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getName ( ) ) ; org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . add ( java.lang.String , org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getValue ( ) . doubleValue ( ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . opsForValue ( ) . set ( java.lang.String , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , Delta < ? > org.springframework.boot.actuate.metrics.repository.redis.Delta<?> ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; void ( java.lang.String ) ; BoundZSetOperations < java.lang.String , java.lang.String > org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . boundZSetOps ( java.lang.String ) ; java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.repository.redis.Delta<> . getName ( ) ) ; double double = org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . incrementScore ( java.lang.String , org.springframework.boot.actuate.metrics.repository.redis.Delta<> . getValue ( ) . doubleValue ( ) ) ; java.lang.String java.lang.String = java.lang.String ( new Metric <> ( org.springframework.boot.actuate.metrics.repository.redis.Delta<> . getName ( ) , double , org.springframework.boot.actuate.metrics.repository.redis.Delta<> . getTimestamp ( ) ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . opsForValue ( ) . set ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . range ( NUMBER , - NUMBER ) ; java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { java.util.Collection<java.lang.String> . boolean ( java.lang.String . java.lang.String ( this . java.lang.String . int ( ) ) ) ; } return java.util.Collection<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . size ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; if ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . hasKey ( java.lang.String ) ) { BoundZSetOperations < java.lang.String , java.lang.String > org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> = this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . boundZSetOps ( java.lang.String ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . range ( NUMBER , - NUMBER ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . delete ( java.lang.String ) ; } this . org.springframework.boot.actuate.metrics.repository.redis.RedisOperations<java.lang.String,java.lang.String> . delete ( java.lang.String ) ; } this . org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . remove ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.metrics.repository.redis.Metric<?> < ? > org.springframework.boot.actuate.metrics.repository.redis.Metric<?> ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Double java.lang.Double ) { java.util.Date java.util.Date = new java.util.Date ( java.lang.Long . java.lang.Long ( java.lang.String ) ) ; return new Metric <> ( java.lang.String ( java.lang.String ) , java.lang.Double , java.util.Date ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( Metric < ? > org.springframework.boot.actuate.metrics.repository.redis.Metric<?> ) { return java.lang.String . java.lang.String ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getTimestamp ( ) . getTime ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return this . java.lang.String + java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { Assert . state ( java.lang.String != null && java.lang.String . boolean ( this . java.lang.String ) , STRING + java.lang.String ) ; return java.lang.String . java.lang.String ( this . java.lang.String . int ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { this . org.springframework.boot.actuate.metrics.repository.redis.BoundZSetOperations<java.lang.String,java.lang.String> . incrementScore ( java.lang.String , NUMBER ) ; }  <METHOD_END>