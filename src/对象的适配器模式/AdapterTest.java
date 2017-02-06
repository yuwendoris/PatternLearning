package 对象的适配器模式;

import 适配器模式.Source;

//��ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��wrapper�࣬����ԭ���һ��ʵ������wrapper��ķ����У�����ʵ���ķ�������
public class AdapterTest {

    public static void main(String[] args) {  
        Source source = new Source();  
        Wrapper target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }
}
