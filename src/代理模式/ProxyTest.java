package 代理模式;


//���ְ취�����еķ�����ʹ�õ�ʱ����Ҫ��ԭ�еķ������иĽ���1���޸�ԭ�еķ�������Ӧ������Υ����"����չ���ţ����޸Ĺر�"ԭ�򣻲���һ�����������ԭ�еķ������ҶԲ����Ľ�����п���
public class ProxyTest {

    public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    } 
}
