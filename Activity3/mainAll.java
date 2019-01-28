
package studentinfo;

public class mainAll{
  
    public static void main(String[] args) {
         StudentInfo student = new StudentInfo("CITCS", "BSCS", "Something", 2, "2018 - 2019");
         student.setIdNumber("18-2977-319");
         student.setFirstname("Christopher");
         student.setLastName("Bermudez");
         student.printInformation(); 
    }
    
    
}
