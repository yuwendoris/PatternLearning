package 接口的适配器模式;

//��ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴��
public class WrapperTest {

    public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
          
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
    }  
}
