package recursos;
public class Cliente implements Comparable{
    //Atributos: dni, nombre, apellido, ciudad y dirección.
    private String nombre, apellido, ciudad, direccion;
    private long telefono, dni; //guardo el telefono para mi comodidad
    //Constructores
    public Cliente(
        long telefono, 
        long dni,
        String nombre,
        String apellido,
        String ciudad,
        String direccion){
        this.telefono = telefono;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    //Getters y Setters

    public long getTelefono() {
        return telefono;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Metodo de prueba
    @Override
    public String toString(){
        String string;
        if(telefono == 0L)
            string = "Ningún cliente por acá...";
        else string = "Cliente: teléfono Nº "+ telefono 
            +", DNI Nº: "+ dni
            +", Nombre y Apellido: "+ nombre +" "+ apellido
            +", Dirección: "+ direccion
            +", de la Ciudad: "+ ciudad +".\n";
        return string;
    }
    public String getString(){
        return telefono + ","
            + dni +","
            + nombre +","
            + apellido +","
            + ciudad +","
            + direccion +"\n";
    }
    //Metodos de java.lang.Comparable
    /**Método compareTo de la interfaz java.lang.Comparable; 
     * Para ordenar los Clientes según su DNI.
     * Devuelve -1 si el DNI de t es mayor al DNI de este Cliente.
     * Devuelve 0 si el DNI de t es igual al DNI de este Cliente.
     * Devuelve 1 si el DNI de t es menor al DNI de este Cliente.
     * @param t Un Cliente para comparar
     * @return Entero -1, 0, o 1
    **/
    @Override
    public int compareTo(Object t) {
        long elDni = ((Cliente)t).getDni();
        return elDni == dni ? 0 : elDni > dni ? -1 : 1;
    }
}
