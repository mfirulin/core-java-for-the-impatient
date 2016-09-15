import java.util.ArrayList;

public class Ch04Ex08 {
  
  private class InternalClass { }
  
  private static class InternalStaticClass { }
  
  public static void main(String[] args) {
  	Class<?> cl = String[].class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
    
    cl = Integer[].class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
    
    cl = int.class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
    
    cl = Ch04Ex08.class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());

    cl = InternalClass.class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
    
    cl = InternalStaticClass.class;
  	System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
    
    cl = ArrayList.class;
    System.out.println(cl.getName());
    System.out.println(cl.getSimpleName());
    System.out.println(cl.getCanonicalName());
    System.out.println(cl.getTypeName());
    System.out.println(cl.toString());
    System.out.println(cl.toGenericString());
  }
}
