package modelo;

public class FabricaNotificaciones {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return (Notificacion) new NotificacionEmail();
            case "sms":
                return (Notificacion) new NotificacionSMS();
            case "push":
                return (Notificacion) new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}
