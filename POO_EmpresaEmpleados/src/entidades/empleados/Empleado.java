package entidades.empleados;

public abstract class Empleado {

    private String apellido;
    private int legajo;
    private float precioHora;
    private int cantidadHorasTrabajadas;

    public Empleado(String apellido, int legajo) {
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Empleado(String apellido, int legajo, float precioHora) {
        this.apellido = apellido;
        this.legajo = legajo;
        this.precioHora = precioHora;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

	public abstract float getSalarioFinal();

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Empleado: ");
        builder.append("apellido=");
        builder.append(apellido);
        builder.append(", legajo=");
        builder.append(legajo);
        builder.append(", precio por hora=");
        builder.append(precioHora);
        builder.append(", cantidad de horas trabajadas=");
        builder.append(cantidadHorasTrabajadas);
        builder.append(", salario=");
        builder.append(getSalarioFinal());
        return builder.toString();
    }

}
