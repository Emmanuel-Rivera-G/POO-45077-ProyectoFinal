package usuario_paquete;
import java.util.*;

public class Cliente extends Usuario {

    private String dni;
    private double vecesConsumo;
    
    public Cliente() {
        
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, String correo,String dni, double vecesConsumo) {
        super(nombre, apellido, telefono, direccion, correo);
        this.dni = dni;
        this.vecesConsumo = vecesConsumo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getVecesConsumo() {
        return vecesConsumo;
    }

    public void setVecesConsumo(double vecesConsumo) {
        this.vecesConsumo = vecesConsumo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cliente [dni=" + dni + ", vecesConsumo=" + vecesConsumo + "]";
    }        
}