package assi5;

public class TestStudent {

	public static void main(String[] args) {
	        
	        Student[] st = new Student[10];

	        for (int i = 0; i < st.length; i++) {
	            st[i] = new Student(); 

	           
	            if (i % 2 == 0) {
	                st[i].setInfo("Student" + (i+1), 20 + i);  
	            } else {
	                st[i].setInfo("Student" + (i+1), 20 + i, "Address" + (i+1)); 
	            }
	        }

	        for (Student student : st) {
	            student.printDetails();
	        }
	    }
	}


