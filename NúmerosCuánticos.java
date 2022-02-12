
/**
 * Subclase para obtener números cuánticos según número atómico.
 * 
 * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
 * @version (2 - 22 de Julio de 2021)
 */
import javax.swing.JOptionPane;
public class NúmerosCuánticos extends ConfiguraciónElectrónica
{
    // instance variables - replace the example below with your own
        public char NúmeroPrincipal, NúmeroSecundario;
        public String NúmeroDeValencia, NúmeroSpin, CadenaNum;
        public int NúmeroMagnético;
               
     /**
     * Constructor de objetos de la clase NúmerosCuánticos
     */
    public NúmerosCuánticos(int Num)
    {
        // initialise instance variables
        super(Num);
        
    }

    /**
     * Método que realiza el procedimiento para tener los números cuánticos.
     */
    @Override 
    
    public void Operaciones(){
        
        
        super.Operaciones(); //Llamado al método de la superclase para obtener el parámetro ConfEelect
        
        if (ConfElect== null){}
        else{
    
        NúmeroDeValencia = ConfElect.substring(ConfElect.lastIndexOf(' ') + 1); //Obtener los números de valencia}
            
        NúmeroPrincipal = NúmeroDeValencia.charAt(0); //Primer carácter 
        
        NúmeroSecundario = NúmeroDeValencia.charAt(1); //Segundo caracter
        
        int Valorascii = NúmeroSecundario; //Transformar en ASCII
        int iNúmSecundario;
        
        if (Valorascii == 115){
            iNúmSecundario = 0;
        }
        if (Valorascii == 112){
            iNúmSecundario = 1;
        }
        if (Valorascii == 100){
            iNúmSecundario = 2;
        }
        if (Valorascii == 102){
            iNúmSecundario = 3;
        }
        
         
         
        String Potencia = NúmeroDeValencia.substring(NúmeroDeValencia.lastIndexOf('^') + 1); //potencia
        
        int iPotencia = Integer.parseInt(Potencia);
        
                
        if (Valorascii == 115){
            
           if (iPotencia == 1) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "1/2";
              
            }
            if (iPotencia == 2) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "-1/2";
              
            }
            CadenaNum = "Números cuánticos: \n" + " Número principal: " + NúmeroPrincipal +";" 
               + "\n Número secundario: " + NúmeroSecundario + " l=0"+";" 
               + "\n Número Magnético: " + NúmeroMagnético +";"
               + "\n Número Spin: " + NúmeroSpin;
        }
        
        if (Valorascii == 112){ 
           
            
           if (iPotencia == 1) {
               
               NúmeroMagnético = -1;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 2) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 3) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 4) {
               
               NúmeroMagnético = -1;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 5) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 6) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "-1/2";
               
            }
            
            CadenaNum = "Números cuánticos: \n" + " Número principal: " + NúmeroPrincipal +";" 
               + "\n Número secundario: " + NúmeroSecundario + " l=1"+";" 
               + "\n Número Magnético: " + NúmeroMagnético +";"
               + "\n Número Spin: " + NúmeroSpin;
        }
        
            if (Valorascii == 100){
             
           if (iPotencia == 1) {
               
               NúmeroMagnético = -2;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 2) {
               
               NúmeroMagnético = -1;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 3) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 4) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "1/2";
                              
            }
            if (iPotencia == 5) {
               
               NúmeroMagnético = 2;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 6) {
               
               NúmeroMagnético = -2;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 7) {
               
               NúmeroMagnético = -1;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 8) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "-1/2";
              
            }
            if (iPotencia == 9) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 10) {
               
               NúmeroMagnético = 2;
               
               NúmeroSpin = "-1/2";
               
            }
            CadenaNum = "Números cuánticos: \n" + " Número principal: " + NúmeroPrincipal +";" 
               + "\n Número secundario: " + NúmeroSecundario + " l=2"+";" 
               + "\n Número Magnético: " + NúmeroMagnético +";"
               + "\n Número Spin: " + NúmeroSpin;
        }
        
         if (Valorascii == 102){
            
           if (iPotencia == 1) {
               
               NúmeroMagnético = -3;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 2) {
               
               NúmeroMagnético = -2;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 3) {
               
               NúmeroMagnético = -1;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 4) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 5) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 6) {
               
               NúmeroMagnético = 2;
               
               NúmeroSpin = "1/2";
               
                         }
            if (iPotencia == 7) {
               
               NúmeroMagnético = 3;
               
               NúmeroSpin = "1/2";
               
            }
            if (iPotencia == 8) {
               
               NúmeroMagnético = -3;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 9) {
               
               NúmeroMagnético = -2;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 10) {
               
               NúmeroMagnético = -1;
               
                NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 11) {
               
               NúmeroMagnético = 0;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 12) {
               
               NúmeroMagnético = 1;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 13) {
               
               NúmeroMagnético = 2;
               
               NúmeroSpin = "-1/2";
               
            }
            if (iPotencia == 14) {
               
               NúmeroMagnético = 3;
               
               NúmeroSpin = "-1/2";
               
            }
            CadenaNum = "Números cuánticos: \n" + " Número principal: " + NúmeroPrincipal +";" 
               + "\n Número secundario: " + NúmeroSecundario + " l=3"+";" 
               + "\n Número Magnético: " + NúmeroMagnético +";"
               + "\n Número Spin: " + NúmeroSpin;
        }
    }
        
       
    }
    
    /**
     * Método para obtener los números cuánticos calculados mediante el método Operaciones
     * Muestra los números cuánticos según el número atómico. 
     */
    
    
    
    public void ObtenerNumCuan(){
        
        Operaciones();
        
        
         if (HerramientaExcepciones.ConfElectValidar(ConfElect)){ 
            JOptionPane.showMessageDialog(null, CadenaNum);
            }          
         
          } 
    
    
}

