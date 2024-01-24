public class jan5 {
    
    
    public static class Student{
        String firstName;
        String lastName;
        double cgpa;
        String major;
        int age;
        boolean onProbation;
        
    }


    public static void main(String[] args){
        
    
        Student myStudent = new Student();
        myStudent.firstname = "Sathwick";
        myStudent.lastName = "Gowda T.";
        myStudent.age = 20;
        myStudent.major = "Computer Science";
        myStudent.onProbation = false;
        myStudent.cgpa = 9;

        System.out.println(myStudent.firstName);

    }
    
    



}


