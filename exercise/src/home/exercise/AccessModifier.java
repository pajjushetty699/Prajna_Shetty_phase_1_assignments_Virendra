package home.exercise;

public class AccessModifier {
	private int a=9;
	char b='u';
	protected float s=98.9f;
	
	public void methodPublic(){
		methodPrivate();
	}
     protected void methodProtected(){
    	 methodPrivate();
     }
     void methodDefault(){
    	 methodPrivate();
     }
     private void methodPrivate(){
    	 System.out.println("accessmodifier:methodPublic");
    	 System.out.println("private value "+a);
    	 System.out.println("char value "+b);
    	 System.out.println("float value"+s);
    
     }
    	 
    	 public static void main(String[] args) {
    			new AccessModifier().methodPrivate();

     }
	
	}


