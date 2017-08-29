<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return super. getComponentType ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStart ( ) ; Tailer org.springframework.integration.file.tail.Tailer = new Tailer ( this . getFile ( ) , this , this . long , this . boolean , this . boolean ) ; this . getTaskExecutor ( ) . execute ( org.springframework.integration.file.tail.Tailer ) ; this . org.springframework.integration.file.tail.Tailer = org.springframework.integration.file.tail.Tailer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStop ( ) ; this . org.springframework.integration.file.tail.Tailer . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Tailer org.springframework.integration.file.tail.Tailer ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . publish ( STRING + this . getFile ( ) . getAbsolutePath ( ) ) ; try { java.lang.Thread . void ( this . getMissingFileDelay ( ) ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . publish ( STRING + this . getFile ( ) . getAbsolutePath ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { send ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Exception java.lang.Exception ) { this . publish ( java.lang.Exception . java.lang.String ( ) ) ; }  <METHOD_END>
