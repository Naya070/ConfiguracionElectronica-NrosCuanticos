
/**
 * Subclase para obtener configuración electrónica según número atómico.
 * Clase base de la clase NúmerosCuánticos.
 * @author (Nayarith el Carmen Jiménez Sierra 2017100188) 
 * @version (2 - 22 de Julio de 2021)
 */
import javax.swing.JOptionPane;

public class ConfiguraciónElectrónica extends Procedimiento
{
       public int potencia;
       public String ConfElect;
     
   /**
     * Constructor heredado de la clase Procedimiento.
     */
    public ConfiguraciónElectrónica(int Num)
    {
        // initialise instance variables
        super(Num);
    }
    
    /**
     * Método que realiza el procedimiento para tener la configuración electrónica
     */
    
     
    
    @Override //Sobreescribiendo método de superclase Procedimiento
    
    public void Operaciones() {
        
      if (HerramientaExcepciones.IValidar(Num)){}
       
        
                   
     if (Num == 1 || Num == 2 ) { potencia = Num;
         ConfElect = "1s"+"^"+potencia;
        }
     if (Num == 3 || Num == 4 ) { potencia = Num - 2;
         ConfElect = "1s^2 2s"+"^"+potencia;
        }
     if (Num > 4 && Num <= 10 ) { potencia = Num - 4;
         ConfElect = "1s^2 2s^2 2p"+"^"+potencia;
        }
     if (Num > 10 && Num <= 12 ) { potencia = Num - 10;
         ConfElect = "1s^2 2s^2 2p^6 3s"+"^"+potencia;
        }
     if (Num > 12 && Num <= 18 ) { potencia = Num - 12;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p"+"^"+potencia;
        } 
     if (Num > 18 && Num <= 20 ) { potencia = Num - 18;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s"+"^"+potencia;
        } 
     if (Num > 20 && Num <= 30 ) { potencia = Num - 20;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d"+"^"+potencia;
        } 
     if (Num > 30 && Num <= 36 ) { potencia = Num - 30;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p"+"^"+potencia;
        } 
     if (Num > 36 && Num <= 38 ) { potencia = Num - 36;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s"+"^"+potencia;
        } 
     if (Num > 38 && Num <= 48 ) { potencia = Num - 38;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d"+"^"+potencia;
        } 
     if (Num > 48 && Num <= 54 ) { potencia = Num - 48;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p"+"^"+potencia;
        } 
     if (Num > 54 && Num <= 56 ) { potencia = Num - 54;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s"+"^"+potencia;
        } 
     if (Num > 56 && Num <= 70 ) { potencia = Num - 56;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f"+"^"+potencia;
        } 
     if (Num > 70 && Num <= 80 ) { potencia = Num - 70;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d"+"^"+potencia;
        }
     if (Num > 80 && Num <= 86 ) { potencia = Num - 80;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p"+"^"+potencia;
        }
     if (Num > 86 && Num <= 88 ) { potencia = Num - 86;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s"+"^"+potencia;
        }
     if (Num > 88 && Num <= 102 ) { potencia = Num - 88;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f"+"^"+potencia;
        }
     if (Num > 102 && Num <= 112 ) { potencia = Num - 102;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d"+"^"+potencia;
        }
     if (Num > 112 && Num <= 126 ) { potencia = Num - 112;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f"+"^"+potencia;
        }
     if (Num > 126 && Num <= 136 ) { potencia = Num - 126;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f^14 6d"+"^"+potencia;
        }
     if (Num > 136 && Num <= 142 ) { potencia = Num - 136;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f^14 6d^10 7p"+"^"+potencia;
        }
     if (Num > 142 && Num <= 156 ) { potencia = Num - 142;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f^14 6d^10 7p6 6f"+"^"+potencia;
        }
     if (Num > 156 && Num <= 166 ) { potencia = Num - 156;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f^14 6d^10 7p6 6f^14 7d"+"^"+potencia;
        }
     if (Num > 166 && Num <= 180 ) { potencia = Num - 166;
         ConfElect = "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^10 4p^6 5s^2 4d^10 5p^6 6s^2 4f^14 5d^10 6p^6 7s^2 5f^14 6d^10 7p^6 5f^14 6d^10 7p6 6f^14 7d^10 7f"+"^"+potencia;
        }
        
       
    }
    
    /**
     * Método para obtener la configuración electrónica calculada mediante el método Operaciones
     * Muestra la configuración electrónica según el número atómico. 
     */
    
    public void ObtenerConfElect(){
        Operaciones();
        
         if (HerramientaExcepciones.ConfElectValidar(ConfElect)){ 
            JOptionPane.showMessageDialog(null,"Configuración Electrónica: " + ConfElect);
            }          
         
          }   
}
