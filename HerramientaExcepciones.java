    
    /**
     * Clase para establecer excepciones en el código
     * 
     * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
     * @version (1 - 17 de Julio de 2021)
     */
    import javax.swing.JOptionPane;
    public class HerramientaExcepciones 
    {
      
    public static boolean SValidar(String Num){
                
        try{ 
            
            Integer.parseInt(Num);
        }
        
        catch (Exception Exc) {
           JOptionPane.showMessageDialog(null, "El número atómico debe ser un número entero");
           return false;
        }
         return true;               
        }
    
    
    public static boolean IValidar(int Num){
    if (Num < 1 || Num > 156){
          
         JOptionPane.showMessageDialog(null, "El número no es válido");
           return false;
        
    }
    return true;
    }
    
    public static boolean ConfElectValidar(String ConfElect){
    if (ConfElect == null){
            
           return false;
    }
    return true;
    }
    
    public static boolean ConfElectVal(String ConfElect){
    if (ConfElect != null){
                      return true;
    }
    JOptionPane.showMessageDialog(null, "Error");
    return false;
    }
    
    public static boolean Cálculos(double NúmeroMásico, double Gramos){
        if(NúmeroMásico<=0){        
        try{ 
              NúmeroMásico = 1;
        }
        
        catch (Exception Exc) {
           JOptionPane.showMessageDialog(null, "El número de masa debe ser un número positivo mayor o igual a 1");
           return false;
        }
        JOptionPane.showMessageDialog(null, "El número de masa debe ser un número positivo mayor o igual a 1"); 
        return false;              
        }
        return false;
}
}
