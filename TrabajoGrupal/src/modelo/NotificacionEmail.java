package modelo;

public class NotificacionEmail implements Notificacion{
    
    @Override
        public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
