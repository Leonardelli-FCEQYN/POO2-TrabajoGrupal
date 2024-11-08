package modelo;
/**
 * Interfaz que define el comportamiento de un canal de notificación.
 */
public interface Notificacion {
     /**
     * Envía un mensaje a través del canal de notificación.
     *
     * @param mensaje El mensaje a enviar.
     */
    void enviar(String mensaje);
}
