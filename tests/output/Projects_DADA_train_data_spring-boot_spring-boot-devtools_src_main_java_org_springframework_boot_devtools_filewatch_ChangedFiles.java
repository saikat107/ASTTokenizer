<METHOD_START> public void ( java.io.File java.io.File , java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> < ChangedFile > java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ) { this . java.io.File = java.io.File ; this . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> = java.util.Collections . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ( java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ) ; }  <METHOD_END>
<METHOD_START> public java.io.File java.io.File ( ) { return this . java.io.File ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.boot.devtools.filewatch.ChangedFile> < ChangedFile > java.util.Iterator<org.springframework.boot.devtools.filewatch.ChangedFile> ( ) { return java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ( ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> < ChangedFile > java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ( ) { return this . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> . hashCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return false ; } if ( java.lang.Object == this ) { return true ; } if ( java.lang.Object instanceof org.springframework.boot.devtools.filewatch.ChangedFiles ) { org.springframework.boot.devtools.filewatch.ChangedFiles org.springframework.boot.devtools.filewatch.ChangedFiles = ( org.springframework.boot.devtools.filewatch.ChangedFiles ) java.lang.Object ; return this . java.io.File . boolean ( org.springframework.boot.devtools.filewatch.ChangedFiles . java.io.File ) && this . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> . equals ( org.springframework.boot.devtools.filewatch.ChangedFiles . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ) ; } return super. boolean ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.io.File + STRING + this . java.util.Set<org.springframework.boot.devtools.filewatch.ChangedFile> ; }  <METHOD_END>