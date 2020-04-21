import javax.swing.JOptionPane;

public class AppBloco{
   public static void main(String [] args){
   BlocoDeNotas notas = new BlocoDeNotas ();
   
   String menu = "1-Adicionar Notas\n2-Remover Nota\n0-Sair\n";
   int opcao;
   
   
   do{
      opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
      
      if (opcao == 1){
       String nomeNota = JOptionPane.showInputDialog("Que Nota Deseja Inserir?");
        Nota nota = new Nota (nomeNota);
        notas.addString(nota);
      } 
      else if (opcao == 0){
       JOptionPane.showMessageDialog(null, "tchau");
      }
      else if(opcao == 2){
      String nomeNota = JOptionPane.showInputDialog("Nota para remover:");
            if(notas.RemoverNota(nomeNota)){
            JOptionPane.showMessageDialog(null, "Nota Removida");
            }else {
            JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
           }     
        
    }while( opcao != 0 );
   
   }
}