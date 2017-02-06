package 多个工厂模式;

import 普通工厂模式.MailSender;
import 普通工厂模式.Sender;
import 普通工厂模式.SmsSender;

public class SendFactory {

	public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}  
