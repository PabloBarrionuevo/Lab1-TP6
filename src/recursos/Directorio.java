package recursos;

import java.util.List;
import java.util.ArrayList;

/*
● agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de
teléfono. Siendo el nro del teléfono la clave del mismo.
● buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al
mismo.
● buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
teléfono asociados a dicho apellido.
● buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
asociados a dicha ciudad.
● borrarCliente() que en base a un dni elimina el cliente del directorio.

*/
public class Directorio {
    //atributos
    private java.util.Map<Long, Cliente> directorio = new java.util.TreeMap<Long, Cliente>();
    //constructor por defecto
    //metodos solicitados en ejercicio
    /**
     * agregarCliente(long,long,String,String,String,String):
     * Inserta en el Map de Clientes uno nuevo, recibiendo 
     * como números long los números de teléfono y DNI.
     * @param telefono del Cliente.
     * @param dni del Cliente.
     * @param nombre del Cliente.
     * @param apellido del Cliente.
     * @param ciudad del Cliente.
     * @param direccion del Cliente.
     */
    public void agregarCliente(
        long telefono, 
        long dni,
        String nombre,
        String apellido,
        String ciudad,
        String direccion){
        //si ya existe se sobreescribe, entonces controlo que no exista
        //controlo ademas que los números de telefono y dni no sean default
        if(!directorio.containsKey(telefono) && telefono != 0L && dni != 0L)
            directorio.put(telefono, new Cliente(telefono,dni,nombre,apellido,ciudad,direccion));
        else javax.swing.JOptionPane.showMessageDialog(null, "El cliente ya existe...", "Error", 0);
    }
    /**
     * agregarCliente(String,String,String,String,String,String):
     * Inserta en el Map de Clientes uno nuevo, recibiendo 
     * como String los números de teléfono y DNI.
     * @param telefono del Cliente.
     * @param dni del Cliente.
     * @param nombre del Cliente.
     * @param apellido del Cliente.
     * @param ciudad del Cliente.
     * @param direccion del Cliente.
     */
    public void agregarCliente(
        String telefono, 
        String dni,
        String nombre,
        String apellido,
        String ciudad,
        String direccion){
        telefono = telefono.replaceAll("-", "");//ver regex 0(2664)-4-123456 ...
        dni = dni.replace(".", "");
        agregarCliente(Long.parseLong(telefono),Long.parseLong(dni),nombre,apellido,ciudad,direccion);
    }
    /**
     * Método buscarCliente(long):
     * Buscar un Cliente, recibe un número de teléfono tipo long, 
     * y devuelve un Cliente si ese teléfono existe en el Map, si
     * no muestra un dialogo de mensaje de error y devuelve null.
     * @param telefono El número de teléfono a obtener del Map.
     * @return Un Objeto de tipo Cliente, o null si el parámetro telefono
     * no existe en el Map.
     */
    public Cliente buscarCliente(long telefono){
        Cliente busqueda = directorio.get(telefono);
        if(busqueda == null)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay ningún cliente con el teléfono: "+String.valueOf(telefono), "Error", 0);
        return busqueda;//si no existe retorna null y exepcion
    }
    /**
     * Método buscarTelefono(String):
     * A partir de una apellido, devuelve una Lista de números telefónicos,
     * de todos los Clientes que conciden o contienen como apellido 
     * el String pasado como parámetro, si no existen coincidencias mostrará
     * un dialogo de mensaje de error, devolviendo una Lista que estará vacia.
     * @param apellido String a Buscar dentro del Map.
     * @return Una Lista de números telefónicos.
     */
    public List<Long> buscarTelefono(String apellido){//seria mejor que devuelva Cliente, ya que luego lo puedo mostrar en la vista
        List<Long> valores = directorio.values().stream()
                .filter(cliente -> cliente.getApellido().toUpperCase().contains(apellido.toUpperCase()))
                .map(cliente -> cliente.getTelefono())
                .collect(java.util.stream.Collectors.toList());
        if(valores.size() == 0)
            javax.swing.JOptionPane.showMessageDialog(null, "Ningún Cliente con el apellido: "+apellido, "Error", 0);
        return valores;
    }
    /**
     * Método buscarClientes(String):
     * Devuelve una Lista de Clientes de aquellos cuya ciudad contenga
     * el criterio buscado (ciudad a buscar), en el caso de que ninguno
     * de los Clientes posean esa ciudad, mostrará un dialogo de mensaje de error
     * devolviendo una Lista vacia.
     * @param ciudad String a Buscar dentro del Map.
     * @return Una Lista de Clientes.
     */
    public List<Cliente> buscarClientes(String ciudad){
        List<Cliente> valores = directorio.values().stream()
                .filter(cliente -> cliente.getCiudad().toUpperCase().contains(ciudad.toUpperCase()))//CIUDAD contiene CIUDAD, para incluir minusculas y mayusculas en la busqueda
                .collect(java.util.stream.Collectors.toList());
        if(valores.size() == 0)
            javax.swing.JOptionPane.showMessageDialog(null, "Ningún Cliente con ciudad que contenga: "+ciudad, "Error", 0);
        return valores;
    }
    /**
     * Método borrarCliente(long):
     * Buscar en el Map si existe Cliente con DNI igual al DNI pasado
     * por parámetro y lo borra; si no existe, muestra un dialogo de 
     * mensaje de error.
     * @param dni long a Buscar dentro del Map.
     */
    public void borrarCliente(long dni){
        Cliente cliente = directorio.values().stream()
                //.filter(uncliente -> String.valueOf(uncliente.getDni()).contains(String.valueOf(dni)))//incluye numeros de dni no completos
                .filter(uncliente -> uncliente.getDni() == dni)//los dni deben ser iguales
                .collect(java.util.stream.Collectors.toList()).get(0);
        if(cliente != null)
            directorio.remove(cliente.getTelefono());
        else javax.swing.JOptionPane.showMessageDialog(null, "El cliente no existe...", "Error", 0);
        //la consigna no pide que devuelva el cliente borrado
    }
    
    //Metodos de prueba para utilizar en vistas
    //...
    //buscar por apellido que devuelva lista de clientes
    public List<Cliente> buscarPorApellidos(String apellido){
        List<Cliente> valores = directorio.values().stream()
                .filter(cliente -> cliente.getApellido().toUpperCase().contains(apellido.toUpperCase()))
                .collect(java.util.stream.Collectors.toList());
        if(valores.size() == 0)
            javax.swing.JOptionPane.showMessageDialog(null, "El cliente no existe...", "Error", 0);
        return valores;
    }
    //Para realizar una busqueda antes de borrar un cliente.
    public Cliente buscarPorDNI(long dni){
        List<Cliente> respuesta = directorio.values().stream()
                //.filter(cliente -> String.valueOf(cliente.getDni()).contains(String.valueOf(dni))) //el dni contiene
                .filter(uncliente -> uncliente.getDni() == dni)//los dni deben ser iguales
                .collect(java.util.stream.Collectors.toList());
        if(respuesta.size() == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "El cliente no existe...", "Error", 0);
            return null;
        }else
            return respuesta.get(0);
    }
    //toString
    @Override
    public String toString(){
        return new ArrayList(directorio.values()).toString();
    }
    //para mostrar los encabezados para llenar tabla
    public Object[] getKeys(){
        return directorio.keySet().toArray();
    }
    //Para guardar en un archivo de texto, luego evaluarlo mas facil.
    public String toStringGuardar() {
        return new ArrayList(directorio.values().stream().map(x -> x.getString()).collect(java.util.stream.Collectors.toList())).toString();
    }
}
