package 接口的适配器模式;

public class SourceSub1 extends Wrapper2 implements Sourceable{

    public void method1(){  
        System.out.println("the sourceable interface's first Sub1!");  
    } 
}
