package Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Factory {

    public static shape createShape(String shapeName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, NoSuchMethodException, SecurityException, ClassNotFoundException, InvocationTargetException{
    	Class<?> classCal = Class.forName("Shape."+shapeName);
        Constructor<?> c = classCal.getConstructor();
        shape cal = (shape)c.newInstance();
        return cal;
    	//return (shape)Class.forName("Shape."+shapeName).getDeclaredConstructor().newInstance();
    }

}
