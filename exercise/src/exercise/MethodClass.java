package exercise;




	class Car {
	    String carName;
	    String carType;

	    // assign values using constructor
	    public Car(String name, String type) {
	        this.carName = name;
	        this.carType = type;
	    }

	    // private method
	    private String getCarName() {
	        return this.carName;
	    }
      public void local(){
    	  class Engine {
    	        String engineType;
    	        
    	        void setEngine() {

    	           // Accessing the carType property of Car
    	            if(carType.equals("4WD")){

    	                // Invoking method getCarName() of Car
    	                if(getCarName().equals("Crysler")) {
    	                    engineType = "Smaller";
    	                } else {
    	                    engineType = "Bigger";
    	                }

    	            }else{
    	                engineType = "Bigger";
    	            }
    	            
        	     
    	        }
    	        
    	        String getEngineType(){
    	            return engineType;
    	        }
    	    }
    	  Engine n=new Engine();
	        n.setEngine();
    	  System.out.println("Engine Type for 8WD= " + n.getEngineType());
    	  n.setEngine();
          System.out.println("Engine Type for 4WD = " + n.getEngineType());

    	}

      }
	public class MethodClass {
	public static void main(String[] args) {
		 Car car1 = new Car("Mazda", "8WD");
		 car1.local();
		 Car car2 = new Car("Crysler","4WD");
		 car2.local();

	}

}
