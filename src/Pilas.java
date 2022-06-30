
public class Pilas implements Machote{
    Integer p[]= null;
    int tope=-1;
    
    public Pilas(int n){
        p = new Integer[n];
    }
//Elfego Adair Juarez Arias UAEMEX
    @Override
    public boolean vacia() {
        return tope==-1;
    }

    @Override
    public boolean llena(int tam) {
        return tam -1==tope;
    }

    public boolean insertar(Integer dato) {
        if (!llena(p.length)) {
            tope ++;
            p[tope]=dato;
            return true;
        }
        return false;
    }

    @Override
    public Integer eliminar() {
        if (!vacia()) {
            tope--;
            return p[tope+1];
        }
        return null;
    }
    
    @Override
    public int estaTope(){
        return p[tope];
    }
    
    public int tamanio(){
        return p.length;
    }
    

    @Override
    public boolean insertar(Object dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Elfego Adair Juarez Arias UAEMEX
}
