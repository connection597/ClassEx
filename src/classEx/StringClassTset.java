package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTset {

	public static void main(String[] args) throws ClassNotFoundException{
		Class strClass = Class.forName("java.lang.String");
		
		Constructor cons = strClass.getConstructor();
		for(Constructor c :cons ) {
			System.out.println(c);
		}
		System.out.println();
		Field[] field = strClass.getFields();
		for(Field f : field) {
			System.out.print(f);
		}
		
		System.out.println();
		Method [] method = strClass.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}

	}

}
