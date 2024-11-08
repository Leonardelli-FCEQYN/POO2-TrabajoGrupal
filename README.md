Grupo H
Leonardelli, Lisandro
Sosa, Ayelen Camila
Castillo Mazo, Andrés Luciano
Amarilla, Aldo
Enunciado: 
Estás desarrollando un sistema de notificaciones que puede enviar mensajes a través de diferentes canales (correo electrónico, SMS, notificación push). Implementa el patrón correspondiente para  crear diferentes tipos de notificaciones dependiendo del canal que se elija.
Justificación:
Usamos el patrón Factory Method ya que es apropiado aquí porque permite crear el tipo de notificación sin especificar explícitamente la clase exacta en el código cliente. Esto simplifica el código del cliente y permite extender el sistema con nuevos canales de notificación sin modificar el código existente, solo añadiendo nuevas fábricas
