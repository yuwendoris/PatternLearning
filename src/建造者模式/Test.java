package 建造者模式;

public class Test {

    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceSmsSender(10);
    }  
}
