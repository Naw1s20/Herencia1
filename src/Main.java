//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("alex", "lolo", "123","ribs", 100, 1);
        System.out.println(empleado1.getRemuneracion());
        empleado1.aumentarRemuneracion(10);
        System.out.println(empleado1.getRemuneracion());

    }
}