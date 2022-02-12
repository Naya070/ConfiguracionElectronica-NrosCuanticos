
/**
 * Superclase para heredar métodos.
 * 
 * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
 * @version (2 - 22 de Julio de 2021)
 */
import javax.swing.JOptionPane;

public abstract class Procedimiento
{
    // instance variables - replace the example below with your own
    protected int Num;

    /**
     * Constructor heredable de Superclase Procedimiento
     */
    public Procedimiento(int NúmeroAtómico)
    {
        // initialise instance variables
       Num = NúmeroAtómico;
        
    }
    
    /**
     * Método heredable para pedir o modificar el número atómico introducido.
     */
    public void PedirNúmeroAtómico()
    {
        // initialise instance variables
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número atómico"));
        
    }

    /**
     * Método heredable para sobreescribir posteriormente.
     */
    public abstract void Operaciones(); 
    
    /**
     * Método heredable para sobreescribir posteriormente.
     */
    public void Cálculos(){
    }
    
    
    /**
     * Método heredable para obtener el número atómico introducido.
     */
    public  void MostrarResultado()
    {
        // initialise instance variables
        
        JOptionPane.showMessageDialog(null,"Configuración Electrónica es: " + Num );
    }           
    
}
