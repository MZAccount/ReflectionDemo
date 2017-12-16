package prs.zeno;

import java.util.Set;

import org.reflections.Reflections;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Initialised the program");
		Reflections reflections = new Reflections("my.project");

		Set<Class<? extends MyClass>> subTypes = reflections.getSubTypesOf(MyClass.class);

//		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SomeAnnotation.class);
		System.out.println(subTypes);
	}

}
