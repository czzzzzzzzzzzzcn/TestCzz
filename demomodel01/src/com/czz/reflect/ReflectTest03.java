package com.czz.reflect;


import java.lang.reflect.*;

public class ReflectTest03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {
      test07();
    }
    //反编译field
    public static void test01() throws ClassNotFoundException {

        Class c =Class.forName("java.lang.String");
        Field[] fields = c.getFields();//获取public修饰的属性
        System.out.println("获取public修饰的属性长度："+fields.length);
        fields = c.getDeclaredFields();
        System.out.println("获取所有修饰的属性长度："+fields.length);
        System.out.println(fields.length);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{"+"\n");
        for (Field f :fields) {
            stringBuilder.append(Modifier.toString(f.getModifiers())+" ");
            stringBuilder.append(f.getType().getSimpleName());
            stringBuilder.append(" "+f.getName()+";\n");
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
    public static void test02() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.czz.reflect.reflectio.User");
        Object o = c.newInstance();
        //Field name= c.getField("name");//获取public的
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);//打破封装
        age.set(o,12);
        System.out.println(age.get(o));
    }

    /**
     * 反编译方法
     * @throws ClassNotFoundException
     */
    public static void test03() throws ClassNotFoundException {
        Class<?> c  = Class.forName("com.czz.reflect.reflectio.User");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m:declaredMethods
             ) {
            System.out.print(Modifier.toString(m.getModifiers()));
            System.out.print(" "+m.getReturnType().getSimpleName());
            System.out.print(" "+m.getName());
            System.out.print("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (Class cl:parameterTypes
                 ) {
                System.out.print(cl.getSimpleName()+",");
            }
            System.out.print("){}");
            System.out.println("");
        }


    }

    /**
     * 使用反射调用方法
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static  void test04() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.czz.reflect.reflectio.User");
        Object o = c.newInstance();
        Method toStr = c.getDeclaredMethod("toStr", String[].class, String.class, String.class);
        Object invoke = toStr.invoke(o,new String[2],"alf","saf");
        System.out.println(invoke);

    }

    /**
     * 反编译构造方法
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     */
    public static void test05() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.czz.reflect.reflectio.User");
        Constructor<?>[] declaredConstructor = aClass.getDeclaredConstructors();
        for (Constructor c:declaredConstructor
             ) {
            System.out.print(Modifier.toString(c.getModifiers()));
            System.out.print("  "+aClass.getSimpleName());
            System.out.print("(");
            Class[] parameterTypes = c.getParameterTypes();
            for (Class cl:parameterTypes
                 ) {
                System.out.print(cl.getSimpleName()+",");
            }
            System.out.println("){}");
        }

    }
    public static void test06() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("com.czz.reflect.reflectio.User");
//        有参构造方法
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("张三",34);
        System.out.println(o);
//        无参构造方法
        Constructor<?> declaredConstructors = aClass.getDeclaredConstructor();
        Object o1 = declaredConstructors.newInstance();
        System.out.println(o1);
    }

    /**
     * 获取继承的父类与实现的接口
     * @throws ClassNotFoundException
     */
    public static void test07() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.czz.reflect.reflectio.User");
        Class<?> superclass = aClass.getSuperclass();
        System.out.println("继承的父类："+superclass.getName());

        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println("实现的接口：");
        for (Class c : interfaces){
            System.out.print(c.getSimpleName());
        }
    }
}
