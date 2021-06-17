package br.com.digitalhouse.aula.java.classes;

public class Usuario extends Humano {
    private String username;
    private String password;

   public static void enviarEmail(String destinatario){
       enviarEmail(destinatario, "Sem assunto", null);
   }

    public static void enviarEmail(String destinatario, String assunto, String[] anexos){
        //message.Send();
        System.out.println("Enviando email: " + destinatario + " assunto : " + assunto + " Anexos: " + anexos);
    }

   public static void enviarEmail(String destinatario, String assunto){
       enviarEmail(destinatario, assunto, null);
   }

   public String login(){
       if (this.password == "x" && this.username != null){
           return "Logou";
       }else{
           return "Nao Logou";
       }
   }

   public String login(String usernameSessao){
       if (usernameSessao != null){
           return "Logou";
       }else{
           return "Nao Logou";
       }
   }
}
