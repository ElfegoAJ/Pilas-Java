
import javax.swing.JOptionPane;


public class mainPilas {
    
    public static void main(String[] args){
                int tamanio = 0,opc = 0,elemento;
        
        try{
            
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,"¿De qué tamaño quieres la pila","Solicitando el tamaño",JOptionPane.INFORMATION_MESSAGE));
            Pilas obj = new Pilas(tamanio);
            
            do {
                
                
                opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento de la pila\n"
                                + "2. Sacar un elemento de la pila\n"
                                + "3. ¿La pila está vacia?\n"
                                + "4. ¿La pila esta llena?\n"
                                + "5. ¿Qué elemento esta en la cima\n"
                                + "6. Tamaño de la pila\n"
                                + "7. Limpiar toda la pila\n"
                                + "8. Salir","Menu de opciones",3));
                
                switch(opc){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a empujar en la fila","Apilando datos",JOptionPane.INFORMATION_MESSAGE));
                        if (!obj.llena(tamanio)) {
                            obj.insertar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta llena","Error",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 2:
                        if (!obj.vacia()) {
                            
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: " + obj.eliminar(),"Obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Error",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    //Elfego Adair Juarez Arias UAEMEX
                    case 3:
                        if (obj.vacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacia","Vacia",JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila contiene datos","Tiene datos",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 4:
                        if (obj.llena(tamanio)) {
                            JOptionPane.showMessageDialog(null, "La pila esta llena","Pila llena",JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta llena","Con espacio",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 5:
                        
                        if (!obj.vacia()) {
                            
                            JOptionPane.showMessageDialog(null, "El elemento que esta en la cima es: " + obj.estaTope(),"Cima",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Vacia",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        
                    break;
                    
                    case 6:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: "+obj.tamanio(),"Tamaño",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    case 7:
                        if (obj.llena(tamanio)) {
                            
                            while(!obj.vacia()){
                                obj.eliminar();
                            }
                            JOptionPane.showMessageDialog(null, "Pila limpiada...","Limpieza",JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            
                           JOptionPane.showMessageDialog(null, "Debe llenar toda la pila para limpiar","Contiene espacio aun",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                    break;
                    
                    case 8:
                        JOptionPane.showMessageDialog(null, "Saliendo","Programa Terminado",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            
            } while (opc!=8);
            
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
//Elfego Adair Juarez Arias UAEMEX
