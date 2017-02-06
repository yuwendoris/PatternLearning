package 建造者模式;

import java.util.ArrayList;
import java.util.List;

import 普通工厂模式.MailSender;
import 普通工厂模式.Sender;
import 普通工厂模式.SmsSender;

public class Builder {

    private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender()); 
            System.out.println(list);
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
            System.out.println(list);
        }  
    }  
}
