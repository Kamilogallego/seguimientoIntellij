package DatosPersonas;

public class PrincipalPersona {
    public static void main(String []args){
        Persona persona=new Persona();
        persona cedula= "1095551280";
        persona nombre="Farid";
        persona.peso= 75.8f;
        System.out.println(persona.Mostrardatos());

    }
}
