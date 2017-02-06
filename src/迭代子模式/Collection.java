package 迭代子模式;

public interface Collection {  
    
    public Iterator iterator();  
      
    /*ȡ�ü���Ԫ��*/  
    public Object get(int i);  
      
    /*ȡ�ü��ϴ�С*/  
    public int size();  
}  