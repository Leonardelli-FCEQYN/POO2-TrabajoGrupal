package modelo;

public class NotificacionSMS implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
