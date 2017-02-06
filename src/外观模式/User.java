package 外观模式;

//��computer�ཫ����֮��Ĺ�ϵ����computer����������˽�������
public class User {

    public static void main(String[] args) {  
        Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();  
    }  
}
