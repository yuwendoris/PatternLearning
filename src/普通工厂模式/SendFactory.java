package 普通工厂模式;

public class SendFactory {

	   public Sender produce(String type) {  //�����sender�ǽӿڵ�����
	        if ("mail".equals(type)) {  
	            return new MailSender();  
	        } else if ("sms".equals(type)) {  
	            return new SmsSender();  
	        } else {  
	            System.out.println("��������ȷ������!");  
	            return null;  
	        }  
	    }  

}
