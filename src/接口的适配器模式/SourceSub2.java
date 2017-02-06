package 接口的适配器模式;

public class SourceSub2 extends Wrapper2 implements Sourceable {

    public void method2(){  
        System.out.println("the sourceable interface's second Sub2!");  
    } 
}
