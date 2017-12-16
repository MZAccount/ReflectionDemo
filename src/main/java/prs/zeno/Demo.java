package prs.zeno;

import java.util.Set;

import org.reflections.Reflections;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Initialised the program");
		
//		Demo.class.getPackage().getName()
		String name = Demo.class.getPackage().getName();
		
		assert name.equals("prs.zeno");
		System.out.println(name);
		Reflections reflections = new Reflections(name);

		Set<Class<? extends MyClass>> subTypes = reflections.getSubTypesOf(MyClass.class);

//		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SomeAnnotation.class);
		System.out.println(subTypes);
	}

}
