package barrionuevo.tp6;
/* ****************************************************************************
** TUDS
** Laboratorio 1
** Trabajo Práctico 6: colecciones Map - TreeMap
** Alumno: Barrionuevo Pablo
** Consigna:

**
***************************************************************************** */
public class DirectorioTel {
    //atributo de tipo Directorio para usar en pruebas y vistas
    public static recursos.Directorio dir = new recursos.Directorio();
    
    //método main
    public static void main(String[] args) {
        /* Pruebas de Directorio y Cliente
        //agregarCliente
        dir.agregarCliente(2664123456L, 29456789L, "Julian", "Martinez", "San Luis", "España 2020");
        dir.agregarCliente("2664123236", "30456789", "Marcos", "Torres", "San Luis", "España 2021");
        dir.agregarCliente("2664198766", "31.456.789", "Carlos", "Cabrera", "La Punta", "España 2022");
        dir.agregarCliente("2664789456", "32.456.789", "Pedro", "Lucero", "Villa Mercedes", "España 2023");
        dir.agregarCliente("2664891456", "33.456.789", "Jose", "Lucero Torres", "La Punta", "España 2024");
        System.out.println(dir.toString());
        
        //Buscar Cliente por número de teléfono
        System.out.println("--------------------------------------------------------\nBuscar por teléfono:");
        System.out.println("Cliente con DNI: 2664789456 -> "+ dir.buscarCliente(2664789456L).toString());
        System.out.println("Cliente que no existe: "+ dir.buscarCliente(0L));//null?.toString() -> exepcion
        
        //Buscar Telefonos de Clientes por Apellido
        System.out.println("--------------------------------------------------------\nBuscar por apellido:");
        System.out.println("Clientes con Apellido: Torres -> "+ dir.buscarTelefono("Torres").toString());
        System.out.println("Clientes con Apellido: Saa -> "+ dir.buscarTelefono("Saa").toString());//lista vacia
        System.out.println("Clientes con Apellido: (vacio) -> "+ dir.buscarTelefono("").toString());//todos los clientes
        
        //Buscar Clientes por ciudad
        System.out.println("--------------------------------------------------------\nBuscar por ciudad:");
        System.out.println("Clientes con ciudad: La Punta -> "+ dir.buscarClientes("La Punta").toString());
        System.out.println("Clientes con ciudad: La Paz -> "+ dir.buscarClientes("La Paz").toString());//lista vacia
        System.out.println("Clientes con ciudad: (vacio) -> "+ dir.buscarClientes("").toString());//todos los clientes
        
        //Borrar Cliente por DNI
        System.out.println("--------------------------------------------------------\nBorrar por dni:\n\"Clientes a borrar: 29456789");
        dir.borrarCliente(29456789);
        
        //Directorio resultante
        System.out.println(dir.toString());
        */

        //Vistas
        Vistas.Escritorio.nuevo();
    }
}
