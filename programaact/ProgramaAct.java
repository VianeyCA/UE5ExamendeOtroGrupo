package programaact;

import java.util.List;

public class ProgramaAct {

    public static void main(String[] args) {
        // TODO code application logic here
         ProgramaAct meto= new ProgramaAct();
         int N[][]= {
             {9, 13, 5, 2, 5, 6},
             {12, 3, 5, 5, 1, 5},
             {48, 5, 3, 4, 1, 5}
             };  
        // meto.Mostrar(N); 
         meto.restar(N);
    }
    public void restar(int M[][] ){
         int a[]= new int [M.length];
         
         for(int i=0; i<M.length; i++){
             for(int j=0; j<M[i].length; j++){
                 if (j==0)
                 {
                     a[i]= M[i][j]; //se guarda la posicion inicial
                 }
                 else{
                     a[i]-=M[i][j];
                 }
                
            }
            
        }
        for (int i=0; i<a.length; i++){
             System.out.println(a[i]); 
            }
    }
    
     public static void Mostrar(List M) {
        for (int i = 0; i < M.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + M.get(i));
        }
        System.out.println("");
    }
    
}
