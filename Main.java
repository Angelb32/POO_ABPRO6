package POO_ABPRO6;

public class Main {
  public static void main(String[] args) {
    // Crear dos instancias de cada clase
    Cliente cliente1 = new Cliente(12345678-9, "Angel", "Brito", "+56912345678", "AFP Habitat", 1, "Av. Nada 123", "Santiago", 35);
    Cliente cliente2 = new Cliente(98765432-1, "Luis", "Brito", "+56298765432", "AFP Cuprum", 2, "Calle 123", "Quilpué", 40);

    Usuario usuario1 = new Usuario("Luis", "1990-01-01", 12345678-9);
    Usuario usuario2 = new Usuario("Yasmin", "1985-05-10", 98765432-1);

    Capacitacion capacitacion1 = new Capacitacion(1, 12345678-9, "2023-05-15", "10:00", "Santiago", 120, 50);
    Capacitacion capacitacion2 = new Capacitacion(2, 98765432-1, "2023-05-20", "15:30", "Quilpué", 90, 30);

    // Desplegar los datos de los objetos usando el método toString()
    System.out.println(cliente1.toString());
    System.out.println(cliente2.toString());
    System.out.println(usuario1.toString());
    System.out.println(usuario2.toString());
    System.out.println(capacitacion1.toString());
    System.out.println(capacitacion2.toString());

    // Modificar un atributo a elección de cada clase
    cliente1.setTelefono("+56987654321");
    usuario2.setNombre("Yasmin de los Angeles");
    capacitacion1.setCantidadAsistentes(80);

    // Desplegar los datos de cada objeto usando métodos accesores y el resultado de los métodos recién creados
    System.out.println("Nombre completo del cliente 1: " + cliente1.obtenerNombre());
    System.out.println("Sistema de salud del cliente 2: " + cliente2.obtenerSistemaSalud());
    System.out.println("Edad del usuario 1: " + usuario1.mostrarEdad());
    System.out.println("Detalle de la capacitación 1: " + capacitacion1.mostrarDetalle());
  }
}