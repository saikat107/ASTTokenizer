<METHOD_START> @ Autowired ( required = false ) public void void ( java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> < WebSocketConfigurer > java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> ) { if ( ! CollectionUtils . isEmpty ( java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> ) ) { this . java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> . addAll ( java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( WebSocketHandlerRegistry org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry ) { for ( WebSocketConfigurer org.springframework.web.socket.config.annotation.WebSocketConfigurer : this . java.util.List<org.springframework.web.socket.config.annotation.WebSocketConfigurer> ) { org.springframework.web.socket.config.annotation.WebSocketConfigurer . registerWebSocketHandlers ( org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry ) ; } }  <METHOD_END>