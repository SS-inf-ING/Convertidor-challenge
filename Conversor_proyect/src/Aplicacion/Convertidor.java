package Aplicacion;
//Librerias de formato decimal y de ventanas emergentes
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Convertidor {
    public static void main(String[] args) {
        //creando los vertices para la elección de la operación
        Object[] options = { "Conversor", "salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?","Menu",JOptionPane.DEFAULT_OPTION, 
        JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
        //Cerrando el programa al presionar "salir" 
        if(elige ==1){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if(elige ==0){
            //dandole el formato a los decimales
            DecimalFormat formatearDivisas = new DecimalFormat("#.##");
            //crear variable para usar en una función
            boolean continuarPrograma = true;
            while(continuarPrograma){
                String[] camb1 = { "Convertidor de monedas", "Longitud de cirulo"};
                String camb2 = (String) JOptionPane.showInputDialog(null ,"Eliga una opcion:","Conversor", 
                JOptionPane.QUESTION_MESSAGE ,null, camb1, camb1[0]);
                
             
                 try{
                   camb2.equals("Cancel");
                }catch(NullPointerException e){ 
                    JOptionPane.showMessageDialog(null, "se ha presionado el botón cancelar" );
                    elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?","Menu",JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
                } finally{
                     camb2 = (String) JOptionPane.showInputDialog(null ,"Eliga una opcion:","Conversor", 
                JOptionPane.QUESTION_MESSAGE ,null, camb1, camb1[0]);
                 }
                    
                if(camb2.equals("Convertidor de monedas")){
                    String input =JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que "
                            + "desea convertir :");
                     //Iniciando la moneda actual para convertir
                    double peso = 0.00 ;
                     //creando arrays para nuestro menu cambio de menedas
                    String[] opciones = {"De peso CL a Dolar", "De peso CL a Euro", 
                    "De peso CL a Libras", "De peso CL a Yen", "De peso CL a Won Coreano",
                    "De Dolar a peso CL ", "De Euro a peso CL", "De Libras a peso CL",
                    "De Yen a peso CL", "De Won Coreano a peso CL"};
                    String cambio = (String) JOptionPane.showInputDialog(null,"Eliga una opcion:",
                            "Convertidor de monedas", JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
                    //captando la excepcion de numero invalido
                    try{
                        peso = Double.parseDouble(input);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                    }
                    //asignaciones y operadores de cada valor monetario
                    if(cambio.equals("De peso CL a Dolar")){ double dolar = peso *0.0012; 
                    JOptionPane.showMessageDialog(null, peso + " Pesos chilos son: "+ 
                            formatearDivisas.format (dolar) + " Dolares.");
                    }else if(cambio.equals("De peso CL a Euro")){ double euro = peso *0.0012;
                    JOptionPane.showMessageDialog(null, peso + " Pesos chilos son: "+ 
                            formatearDivisas.format (euro) + " Euros.");
                    }else if(cambio.equals("De peso CL a Libras")){ double libras =peso *0.0010;
                    JOptionPane.showMessageDialog(null, peso + " Pesos chilos son: "+ 
                            formatearDivisas.format (libras) + " Libras Esterlinas.");
                    }else if(cambio.equals("De peso CL a Yen")) { double yen =peso *0.17;
                    JOptionPane.showMessageDialog(null, peso + " Pesos chilos son: "+ 
                            formatearDivisas.format (yen) + " Yen Japones.");
                    }else if(cambio.equals("De peso CL a Won Coreano")){ double wonC =peso *1.61; 
                    JOptionPane.showMessageDialog(null, peso + " Pesos chilos son: "+ 
                            formatearDivisas.format (wonC) + " Won sul-Coreano.");
                    }else if(cambio.equals("De Dolar a peso CL ")){ double pChileno = peso *811.07;
                    JOptionPane.showMessageDialog(null, pChileno +  " Dolares son: "+ 
                            formatearDivisas.format (pChileno) + " Pesos chilos.");
                    }else if(cambio.equals("De Euro a peso CL")){ double pChileno = peso *863.96;
                    JOptionPane.showMessageDialog(null, peso + " Euros son: "+ 
                            formatearDivisas.format (pChileno) + " Pesos chilos.");
                    }else if(cambio.equals("De Libras a peso CL")){ double pChileno =peso *974.50;
                    JOptionPane.showMessageDialog(null, peso + " Libras Esterlinas son: "+
                            formatearDivisas.format (pChileno) + " Pesos chilos.");
                    }else if(cambio.equals("De Yen a peso CL")) { double pChileno =peso *5.96;
                    JOptionPane.showMessageDialog(null, peso + " Yen Japones son: "+ 
                            formatearDivisas.format (pChileno) + " Pesos chilos.");
                    }else if(cambio.equals("De Won Coreano a peso CL")){ double pChileno =peso *0.62;
                    JOptionPane.showMessageDialog(null, peso + " Won sul-Coreano son: "+ 
                            formatearDivisas.format (pChileno) + " Pesos chilos.");   
                    }    
                    //Menu al finalizar nuestra operacion para continuar o cerrar el programa
                    int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", 
                            "Confirma", JOptionPane.YES_NO_CANCEL_OPTION);
                    if(confirma ==JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                }
                //Calculando longitud circulo
                if(camb2.equals("Longitud de cirulo")){
                    String rad, mensaje;
                    double radAux=0.00, area, longitud;
                rad =JOptionPane.showInputDialog(null, "Ingrese el radio del circulo: ");
                try{
                    radAux = Double.parseDouble(rad);
                }catch(NumberFormatException e){ 
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }
                //formula para calcular longitud
                area=Math.PI*Math.pow(radAux, 2);
                longitud=2*Math.PI*radAux;
                
                mensaje=("El area dl circulo es: "+area+"\nLa longitud de la circunferencia es: "+longitud);
                JOptionPane.showMessageDialog(null, mensaje);
                
                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", 
                        "Selecciona", JOptionPane.YES_NO_OPTION);
                if(confirma ==JOptionPane.NO_OPTION ){ continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado");}
                }
            }  
        }
    } 
}