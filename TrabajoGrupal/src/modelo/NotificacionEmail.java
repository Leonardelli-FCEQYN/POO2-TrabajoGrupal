package modelo;
/**
 * Clase que implementa la interfaz Notificacion para enviar notificaciones por correo electrónico. 
 */
public class NotificacionEmail implements Notificacion{
    /**
     * Envía un mensaje a través del canal de notificación.
     * @param mensaje El mensaje a enviar.
     */
    @Override
        public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
