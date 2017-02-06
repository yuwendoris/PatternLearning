
 package 对象的适配器模式;

import 适配器模式.Source;
import 适配器模式.Targetable;

public class Wrapper implements Targetable {  
  
    private Source source;  
      
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable1 method!");  
    }  
  
    @Override  
    public void method1() {  
        source.method1();  
    }  
}  
