import java.util.Date;

public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, Date fechaDeNacimiento, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public int getId(){ return id; }

}