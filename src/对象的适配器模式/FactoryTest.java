package 对象的适配器模式;

import 多个工厂模式.SendFactory;
import 普通工厂模式.Sender;

public class FactoryTest {

	   public static void main(String[] args) {  
	        SendFactory factory = new SendFactory();  
	        Sender sender = factory.produceMail();  
	        sender.Send();  
	    }  

}
