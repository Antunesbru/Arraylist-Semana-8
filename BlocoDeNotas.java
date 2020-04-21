import java.util.ArrayList;

public class BlocoDeNotas{
   private ArrayList <Nota> notas;
   
   //construtor
   public BlocoDeNotas(){
      notas = new ArrayList <Nota> ();
   }
   
   //adicionar
   public void addString(Nota nota){
      notas.add(nota);
   }
   
   //Remover
   public boolean RemoverNota(String nomeNota){
      int posicao = buscar(nomeNota);
        if(posicao >= 0){
            notas.remove(posicao);
            return true;
            } else {
            return false;
            }
         }
   private int buscar(String nota){
      for(int i = 0; i < notas.size(); i++){
        Nota not = notas.get(i);
        String nomeNota = not.getNomeNota();
            if(nota.equals(nomeNota)){
               return i;
            }
         }
         return -1;//nao
      } 
}