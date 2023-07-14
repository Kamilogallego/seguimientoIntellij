package DatosPersonas;

public class Persona {
    public String cedula;
    public String nombre;
    public String email;
    public int edad;
    public float peso;
    public String Mostrardatos(){
        return "La cedula de la persona es: "+cedula+ "El nombre es"+nombre+ "Su email es:"+edad+ "Su Edad es:" +peso+ "Su peso es:";
    }
}
