public class Main {

    public static void main(String[] args) {

        Persona angel = Persona.getSingletonInstance("Angel");

        System.out.println(angel.getNombre());
    }
}