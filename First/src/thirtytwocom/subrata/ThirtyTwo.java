package thirtytwocom.subrata;

public class ThirtyTwo {
    public static void main(String[] args) {
        System.out.println("java.io=>BufferedInputSystem,File,PrintWriter  ....\n" +
                "java.net=>Socket,URL,ServerSocket etc\n" +
                "JDBC=>java.sql=>ResultSet(interface),DriverManager,TimeStamp\n" +
                "classes inside particular folder=>we can include them in java codes =>package\n" +
                "package name should be kept according to domain mame to make it unique\n" +
                "suppose your domain name google.com them package name com.google  (reverse  order)\n" +
                "suppose subrata.com is domain => com/subrata/test like path will follow\n" +
                "\ncreate package=> com.subrata \n" +
                        "then we create again package com.subrata.test then automatically test will go inside subrata folder"+
                "lets, in folder subrata =>files are Sub1.class,Sub2.class,Sub3.class\n" +
                "     in folder test =>files are T1.class,T2.class,T3.class\n" +
                "\n" +
                "     to include all class of test folder => com.subrata.test.*\n" +
                "     to include all class of subrata folder => com.subrata.*       //fetch only the classes inside subrata\n" +
                "                                                                   //but not fetch folder eg:test\n" +
                "     to include T1.class of test folder => com.subrata.test.T1\n" +
                "\n" +
                "     Access Modifiers  (no specifiers): abstract,final,public,protected .....etc\n" +
                "     with class(3): (final,abstract and public) and by default it is default (but in inner class private possible)\n" +
                "     \n" +
                "              eg: class A               // [it is default] by default default is the acces\n" +
                "              {\n" +
                "              }\n" +
                "              public class A            // [IT IS PUBLIC]\n" +
                "              {\n" +
                "              }\n" +
                "              \n" +
                "              \n" +
                "Lets analyse power of access modifiers suppose main in class Abc inside package com.abc\n" +
                "\n" +
                "package com.abc\n" +
                "\n" +
                "public class Abc{\n" +
                "  public static void main(String[] args)\n" +
                "    {   \n" +
                "        A obj = new A();      //is it error or not ? see observation below \n" +
                "        obj.method();          //after successful access of A is method() or variable inside A show error or not ?\n" +
                "        obj.i=10;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "       //OBSERVATIONS for class A if A is:  [  A obj=new A()= ERROR?]                \n" +
                "1.public: both same package and different package : no error\n" +
                "2.default: same package:no error\n" +
                "           different package : Error\n" +
                "3.normal class should not be private,because not accessible,private may used with inner class           \n" +
                "\n" +
                "\n" +
                "      //OBSERVATIONS for method() or variable of class A if method() or variable is : [ obj.method(),obj.i=10  =ERROR ?]\n" +
                " 1.private:accessible inside own class only [error]\n" +
                " 2.default:accessible in same package : [if A in same package then no error] \n" +
                " 3.public:accessible in Any class or package : [no error]\n" +
                " 4.protected:accessible in subsiding/sub class : [if A is super class of Abc then no error]\n" +
                " \n");
    }
}
