import java.util.ArrayList;

public class Test {
  
    private class InternalClass { }
  
    private static class InternalStaticClass { }
  
    public static void main(String[] args) {
		Class<?> cl = String.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
		
        cl = String[].class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    
        cl = Integer[].class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    
        cl = int.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    
        cl = Test.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();

        cl = InternalClass.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    
        cl = InternalStaticClass.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    
        cl = ArrayList.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println();
    }
}
