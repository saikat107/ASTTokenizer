<METHOD_START> public static org.springframework.integration.file.dsl.FileInboundChannelAdapterSpec org.springframework.integration.file.dsl.FileInboundChannelAdapterSpec ( java.io.File java.io.File ) { return org.springframework.integration.file.dsl.FileInboundChannelAdapterSpec ( java.io.File , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileInboundChannelAdapterSpec org.springframework.integration.file.dsl.FileInboundChannelAdapterSpec ( java.io.File java.io.File , java.util.Comparator<java.io.File> < java.io.File > java.util.Comparator<java.io.File> ) { return new FileInboundChannelAdapterSpec ( java.util.Comparator<java.io.File> ) . directory ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.io.File java.io.File ) { return new FileWritingMessageHandlerSpec ( java.io.File ) . expectReply ( false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.lang.String java.lang.String ) { return new FileWritingMessageHandlerSpec ( java.lang.String ) . expectReply ( false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( Expression org.springframework.integration.file.dsl.Expression ) { return new FileWritingMessageHandlerSpec ( org.springframework.integration.file.dsl.Expression ) . expectReply ( false ) ; }  <METHOD_END>
<METHOD_START> public static < P > org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,?> < Message < P > , ? > java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,?> ) { return new FileWritingMessageHandlerSpec ( java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,> ) . expectReply ( false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.io.File java.io.File ) { return new FileWritingMessageHandlerSpec ( java.io.File ) . expectReply ( true ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.lang.String java.lang.String ) { return new FileWritingMessageHandlerSpec ( java.lang.String ) . expectReply ( true ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( Expression org.springframework.integration.file.dsl.Expression ) { return new FileWritingMessageHandlerSpec ( org.springframework.integration.file.dsl.Expression ) . expectReply ( true ) ; }  <METHOD_END>
<METHOD_START> public static < P > org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec org.springframework.integration.file.dsl.FileWritingMessageHandlerSpec ( java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,?> < Message < P > , ? > java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,?> ) { return new FileWritingMessageHandlerSpec ( java.util.function.Function<org.springframework.integration.file.dsl.Message<P>,> ) . expectReply ( true ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.TailAdapterSpec org.springframework.integration.file.dsl.TailAdapterSpec ( java.io.File java.io.File ) { return new TailAdapterSpec ( ) . file ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileSplitterSpec org.springframework.integration.file.dsl.FileSplitterSpec ( ) { return org.springframework.integration.file.dsl.FileSplitterSpec ( true ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileSplitterSpec org.springframework.integration.file.dsl.FileSplitterSpec ( boolean boolean ) { return org.springframework.integration.file.dsl.FileSplitterSpec ( boolean , false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileSplitterSpec org.springframework.integration.file.dsl.FileSplitterSpec ( boolean boolean , boolean boolean ) { return new FileSplitterSpec ( boolean , boolean ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToStringTransformer org.springframework.integration.file.dsl.FileToStringTransformer ( ) { return org.springframework.integration.file.dsl.FileToStringTransformer ( false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToStringTransformer org.springframework.integration.file.dsl.FileToStringTransformer ( boolean boolean ) { return org.springframework.integration.file.dsl.FileToStringTransformer ( null , boolean ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToStringTransformer org.springframework.integration.file.dsl.FileToStringTransformer ( java.lang.String java.lang.String ) { return org.springframework.integration.file.dsl.FileToStringTransformer ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToStringTransformer org.springframework.integration.file.dsl.FileToStringTransformer ( java.lang.String java.lang.String , boolean boolean ) { FileToStringTransformer org.springframework.integration.file.dsl.FileToStringTransformer = new FileToStringTransformer ( ) ; if ( java.lang.String != null ) { org.springframework.integration.file.dsl.FileToStringTransformer . setCharset ( java.lang.String ) ; } org.springframework.integration.file.dsl.FileToStringTransformer . setDeleteFiles ( boolean ) ; return org.springframework.integration.file.dsl.FileToStringTransformer ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToByteArrayTransformer org.springframework.integration.file.dsl.FileToByteArrayTransformer ( ) { return org.springframework.integration.file.dsl.FileToByteArrayTransformer ( false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.file.dsl.FileToByteArrayTransformer org.springframework.integration.file.dsl.FileToByteArrayTransformer ( boolean boolean ) { FileToByteArrayTransformer org.springframework.integration.file.dsl.FileToByteArrayTransformer = new FileToByteArrayTransformer ( ) ; org.springframework.integration.file.dsl.FileToByteArrayTransformer . setDeleteFiles ( boolean ) ; return org.springframework.integration.file.dsl.FileToByteArrayTransformer ; }  <METHOD_END>