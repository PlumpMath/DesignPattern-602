package Proxy.StaticAOP;

public class Hello implements IHello{
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
}
