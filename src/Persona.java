public class Persona {

    private String nombre;
    private static Persona persona;

    public Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("El nombre es " + this.nombre);
    }

    public static Persona getSingletonInstance(String nombre) {
        if (persona == null) {
            persona = new Persona(nombre);
        } else {
            System.out.println("No se puede crear el objeto");
        }

        return persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Persona getPersona() {
        return persona;
    }

    public static void setPersona(Persona persona) {
        Persona.persona = persona;
    }
}
