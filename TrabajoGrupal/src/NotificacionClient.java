import modelo.*;
public class NotificacionClient {
    /**
     * Cliente para probar el sistema de notificaciones.
     */
    public static void main(String[] args) {
        /**
         * Se crea una fábrica de notificaciones.
         */
        FabricaNotificaciones fabrica = new FabricaNotificaciones();
        /**
         * Se crean notificaciones de cada tipo y se envían mensajes.
         */
        Notificacion email = fabrica.crearNotificacion("email");
        /**
         * Se envía un mensaje a través del canal de notificación.
         */
        email.enviar("Bienvenido al sistema de notificaciones por correo electrónico!");
        /**
         * Se crea una notificación de tipo SMS y se envía un mensaje.
         */
        Notificacion sms = fabrica.crearNotificacion("sms");
        sms.enviar("Este es un mensaje SMS.");

        /**
         * Se crea una notificación de tipo push y se envía un mensaje.
         */
        Notificacion push = fabrica.crearNotificacion("push");
        push.enviar("Notificación push recibida.");
    }
}
