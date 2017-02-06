package 普通工厂模式;

public class MailSender implements Sender {

    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  

}
