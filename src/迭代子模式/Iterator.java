package 迭代子模式;

public interface Iterator {  
    //ǰ��  
    public Object previous();  
      
    //����  
    public Object next();  
    public boolean hasNext();  
      
    //ȡ�õ�һ��Ԫ��  
    public Object first();  
}  