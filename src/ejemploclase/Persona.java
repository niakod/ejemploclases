package ejemploclase;
/**
 *
 * @author MaR
 */
public class Persona {

    
    //ATRIBUTOS:
    private String nombre;
    int edad;
    String email;
    //SETTERS Y GETTERS:
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param vNombre asigna el valor de nombre
     */
    public void setNombre(String vNombre) {
        this.nombre = vNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int vEdad){
        this.edad = vEdad;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String vEmail){
        this.email = vEmail;
    }
    //CONSTRUCTORES:
    public Persona(){} //el constructor vacío
    //Constructor que recibe todos los atributos como parámetros:
    public Persona(String vNombre, int vEdad, String vEmail){
        this.nombre = vNombre;
        this.edad = vEdad;
        this.email = vEmail;
    }
    //METODOS:
    public String presentacion(){
        return "Hola me llamo "+nombre+"!";
    }
}
