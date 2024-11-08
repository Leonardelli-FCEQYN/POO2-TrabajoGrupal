package modelo;

/**
 * Clase que implementa la interfaz Notificacion para enviar notificaciones por correo electrónico. 
 */
public class FabricaNotificaciones {

    /**
     * Crea una notificación del tipo especificado.
     * @param tipo El tipo de notificación a crear.
     * @return Notificacion La notificación creada.
     * @throws IllegalArgumentException si el tipo de notificación no es soportado.
     * @return
     */
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSMS();
            case "push":
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}
