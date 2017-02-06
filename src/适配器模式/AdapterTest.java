package 适配器模式;

//��ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ���
public class AdapterTest {

   public static void main(String[] args) {  
	    Targetable target = new Adapter();  
	    target.method1();  
        target.method2();  
	 }  
}
