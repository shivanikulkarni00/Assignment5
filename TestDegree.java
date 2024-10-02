package assi5;
class Degree {
    // Method to print default message
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

// Subclass Undergraduate
class Undergraduate extends Degree {
    // Overriding the getDegree method
    @Override
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

// Subclass Postgraduate
class Postgraduate extends Degree {
    // Overriding the getDegree method
    @Override
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }

}



public class TestDegree {

	public static void main(String[] args) {
		 Degree degree = new Degree();         
	        Undergraduate ug = new Undergraduate(); 
	        Postgraduate pg = new Postgraduate();   

	   
	        degree.getDegree();  
	        ug.getDegree();     
	        pg.getDegree();    	
	}

}
