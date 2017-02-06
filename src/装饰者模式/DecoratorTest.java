package 装饰者模式;


//��Ҫ��չһ����Ĺ��ܣ���̬��Ϊһ���������ӹ��ܣ����ܶ�̬����
public class DecoratorTest {

    public static void main(String[] args) {  
        Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();  
    }  
}









