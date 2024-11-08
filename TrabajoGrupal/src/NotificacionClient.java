import modelo.*;
public class NotificacionClient {
    public static void main(String[] args) {
        FabricaNotificaciones fabrica = new FabricaNotificaciones();

        
        Notificacion email = fabrica.crearNotificacion("email");
        email.enviar("Bienvenido al sistema de notificaciones por correo electrónico!");

        
        Notificacion sms = fabrica.crearNotificacion("sms");
        sms.enviar("Este es un mensaje SMS.");

        
        Notificacion push = fabrica.crearNotificacion("push");
        push.enviar("Notificación push recibida.");
    }
}
