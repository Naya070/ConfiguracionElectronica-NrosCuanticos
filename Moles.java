
/**
 * Subclase para obtener moles según número másico  y gramos.
 * 
 * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
 * @version (2 - 22 de Julio de 2021)
 */
import javax.swing.JOptionPane;

public class Moles extends Procedimiento
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class moles
     */
    public Moles()
    {
        // initialise instance variables
        super(0);
    }

    
    /**
     * Método heredado, sin uso.
     */ 
    @Override
    public void Operaciones(){
    }
    
    /**
     * Método para calcular Moles
     */
    
           
    public void Cálculos(double Gramos, double NúmeroMásico) {
    
        if(NúmeroMásico<=0){HerramientaExcepciones.Cálculos(NúmeroMásico, Gramos);}
        else{
        
        double NumMoles = (Gramos / NúmeroMásico);
             
        JOptionPane.showMessageDialog(null, "Número de moles: " + NumMoles);}
    }
}
