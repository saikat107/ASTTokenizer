<METHOD_START> public static void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { java.io.OutputStream java.io.OutputStream = new java.io.ByteArrayOutputStream ( ) ; java.io.ObjectOutputStream java.io.ObjectOutputStream = new java.io.ObjectOutputStream ( java.io.OutputStream ) ; java.io.ObjectOutputStream . void ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.Object java.lang.Object ) throws java.io.IOException { try { void ( java.lang.Object ) ; return true ; } catch ( java.io.NotSerializableException java.io.NotSerializableException ) { return false ; } }  <METHOD_END>
<METHOD_START> public static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) throws java.io.IOException , java.lang.ClassNotFoundException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.io.ObjectOutputStream java.io.ObjectOutputStream = new java.io.ObjectOutputStream ( java.io.ByteArrayOutputStream ) ; java.io.ObjectOutputStream . void ( java.lang.Object ) ; java.io.ObjectOutputStream . void ( ) ; java.io.ByteArrayOutputStream . void ( ) ; byte [] byte[] = java.io.ByteArrayOutputStream . byte[] ( ) ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( byte[] ) ; java.io.ObjectInputStream java.io.ObjectInputStream = new java.io.ObjectInputStream ( java.io.ByteArrayInputStream ) ; java.lang.Object java.lang.Object = java.io.ObjectInputStream . java.lang.Object ( ) ; return java.lang.Object ; }  <METHOD_END>