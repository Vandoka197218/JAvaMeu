/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;  
import org.apache.commons.mail.MultiPartEmail;  


/**
 *
 * @author Administrador
 */
public class emailAnexo1 {
    DadosEmail da = new DadosEmail();

    /**
    * @param args
    */  
  public static void main(String[] args) {  

        // Create the attachment  
          
                // Caminho do arquivo a ser enviado  
        File f = new File("f:/maciel_javamail_api.pdf");
                       
        EmailAttachment attachment = new EmailAttachment();  
        attachment.setPath(f.getPath()); // Obtem o caminho do arquivo  
        attachment.setDisposition(EmailAttachment.ATTACHMENT);  
        attachment.setDescription("Anexo sei la veja pdf");  
        attachment.setName(f.getName()); // Obtem o nome do arquivo  

        try {  
          // Create the email message  
          MultiPartEmail email = new MultiPartEmail();  
          email.setDebug(true);  
          email.setHostName("smtp.gmail.com");  
          email.setAuthentication("tecnica.consertado.playservice@gmail.com","va12do34");  
          email.setSSL(true);  
          email.addTo("vandomaja72@gmail.com"); //pode ser qualquer email  
          email.setFrom("tecnica.consertado.playservice@gmail.com"); //será passado o email que você fará a autenticação
          email.setSubject("Teste anexo");  
          email.setMsg("Teste anexo");  

          // add the attachment  
          email.attach(attachment);  

          // send the email  
          email.send();  
      } catch (EmailException e) {  
          e.printStackTrace();  
      }  
  }  
}
