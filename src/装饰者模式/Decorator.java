package 装饰者模式;

//decorator����һ��װ����
public class Decorator implements Sourceable{

	   private Sourceable source;  
	      
	    public Decorator(Sourceable source){  
	        super();  
	        this.source = source;  
	    }  
	    
	    @Override  
	    public void method() {  
	        System.out.println("before decorator!");  
	        source.method();  
	        System.out.println("after decorator!");  
	    }  
}
