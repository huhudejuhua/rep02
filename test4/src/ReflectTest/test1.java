package ReflectTest;

import Reflect.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test1 {
    public static void main(String[] args) throws Exception {
        /*Person person=new Person(1,2,2);
        Class cls=person.getClass();
        System.out.println(cls.getName());
        Field fl[]=cls.getFields();
        for(Field fleld:fl){
            System.out.println(fleld);
        }
        System.out.println("---------------------");
        Method method=cls.getMethod("show");
        method.invoke(person);
        System.out.println("---------------------");*/
        //Constructor constructor=cls.getConstructor(int.class,int.class,int.class);
       // Object p1=constructor.newInstance(2,2,2);
        //Person p2=(Person)p1;
        //p2.show();
        Class cls1=Person.class;
        Object obj=cls1.newInstance();
        Person p=(Person)obj;
        p.show();
    }
}
