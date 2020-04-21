public class Nota{
   private String nomeNota;
   
   //metodo construtor
   public Nota(String n){
      nomeNota = n;
   }
   
   //metodo de acesso 
   public String getNomeNota(){
      return nomeNota;   
   }
   
   //metodo modificador
   public void setNomeNota(String n){
      nomeNota = n;
   }
}