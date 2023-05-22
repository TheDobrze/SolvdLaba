package buildingCompany.ex;

import buildingCompany.Enums.Certificate;
import buildingCompany.Enums.Salary;
import buildingCompany.Person;
import buildingCompany.employees.Builder;

import java.lang.reflect.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static buildingCompany.Enums.Certificate.FORKLIFT;
import static buildingCompany.Enums.Salary.MIDIUM;

public class Reflection {
    public static void main(String[] args) throws ParseException, ClassNotFoundException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("12-04-2020");
        Class<?> builderClass = Builder.class;
        builderClass = new Builder(1,"Marek","Hopsybut",date, MIDIUM,FORKLIFT,true ).getClass();

        try {
            builderClass = Class.forName("buildingCompany.employees.Builder");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(builderClass.getName());
        Class<?> superClass = Class.forName("buildingCompany.employees.Builder").getSuperclass();
        System.out.println(superClass);

        Class<?> classes = builderClass.getClass();
        System.out.println(builderClass.getClass());

        Class<?>[] declareClass = Class.forName("buildingCompany.employees.Builder").getDeclaredClasses();
        System.out.println(Arrays.toString(declareClass));

        Type[] interfaces = Class.forName("buildingCompany.employees.Builder").getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        Field[] publicFields = Class.forName("buildingCompany.employees.Builder").getFields();
        System.out.println(Arrays.toString(publicFields));

        try {
            Builder bd =  new Builder(1,"Marek","Hopsybut",date, MIDIUM,FORKLIFT,true );
            Field privateField = Builder.class.getSuperclass().getDeclaredField("Name");
            privateField.setAccessible(true);
            String name = (String) privateField.get(bd);
            System.out.println(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Method[] publicMethods = Class.forName("buildingCompany.employees.Builder").getMethods();
        System.out.println(Arrays.toString(publicMethods));

        Constructor<?>[] publicConstructors = Class.forName("buildingCompany.employees.Builder").getConstructors();
        System.out.println(Arrays.toString(publicConstructors));

        try {
            Constructor<?> constructor = Class.forName("buildingCompany.employees.Builder").getConstructor(int.class,java.lang.String.class,java.lang.String.class,java.util.Date.class,buildingCompany.Enums.Salary.class,buildingCompany.Enums.Certificate.class,boolean.class);
            System.out.println(Arrays.toString(constructor.getParameterTypes()));

            Object myObject = constructor.newInstance(2,"Mikołaj","Pucykrak",date, MIDIUM,FORKLIFT,true);
            Method myObjectMethod = myObject.getClass().getMethod("work",null);
            myObjectMethod.invoke(myObject,null);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
