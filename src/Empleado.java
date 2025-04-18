public class Empleado extends Persona

{
    private double remuneracion;
    private int empleadoId;


    public void aumentarRemuneracion(int aumento){

        this.remuneracion += (remuneracion * aumento)/100;



    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Empleado() {
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }


    @Override
    public String toString() {
        return super.toString()+
                "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId +
                '}';
    }
}
