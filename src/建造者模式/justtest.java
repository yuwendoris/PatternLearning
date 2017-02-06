package 建造者模式;

import 原型模式.Prototype;

public class justtest implements Cloneable{

	public Object justtest() throws CloneNotSupportedException {
		
	    Prototype proto = (Prototype) super.clone();
		return proto;
		// TODO Auto-generated constructor stub
	}

}
