
/**
 * Subclase para obtener neutrones según número másico y numero atómico.
 * 
 * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
 * @version (2 - 22 de Julio de 2021)
 */
import javax.swing.JOptionPane;

public class Neutrones extends Procedimiento
{
    // instance variables - replace the example below with your own
    int NúmeroMásico;
    int iNeutrones;
    
    /**
     * Constructor heredado de la clase Procedimiento.
     */
    public Neutrones()
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
     * Método para calcular cantidad de neutrones en el átomo.
     * Introduzca número atómico
     * Introduzca número de masa de forma redondeada
     * Ejemplo: Si el número de masa es 10.811 colocar 11. Si es 40.44 colocar 40. 
     */
    
           
    public void Cálculos(int Num, int NúmeroMásico) {
    
        int NúmMas= NúmeroMásico;
        
        iNeutrones = (NúmMas - Num);
        
        JOptionPane.showMessageDialog(null, "Número de neutrones: " + iNeutrones);
    }
}
