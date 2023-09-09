
import java.util.*;
/**
 * Write a description of class AssignmentOne here.
 *
 * @author (Ashika Dewasurendra)
 * @version (a version number or a date)
 */
public class AssignmentOne
{
    
    
 public static void main(String []args){
    Scanner AssignmentOne = new Scanner(System.in);
    double [] assignmentMarks = new double[30];
    double highestMark = 0;
    double lowestMark = 30;
    double totalMarks =0;
    
    System.out.print("Enter Assignment Name:");
    String assignmentName = AssignmentOne.nextLine();
    
    for(int i =0; i<10;i++){
    System.out.print("Enter Mark  " +(i+1)+ ".");
    assignmentMarks[i] = AssignmentOne.nextDouble();
    
    if(assignmentMarks[i] <0 || assignmentMarks[i] >30){
    System.out.println("Invalid Mark, Please re-enter:");
    i = i-1;
    }
    
    }
    System.out.println();
    System.out.println("Assignment Name:" +assignmentName);
    for(int i =0; i<10;i++){
    System.out.println("Assignment Mark " +(i+1)+ ":" +assignmentMarks[i]);
    }

for(int i=0; i<10;i++){
double currentMark = assignmentMarks[i];
if(currentMark >= highestMark){
highestMark = currentMark;
}
if(currentMark<=lowestMark){
lowestMark = currentMark;
}
totalMarks += currentMark;
}
System.out.println("Highest Mark: " +highestMark);
System.out.println("Lowest Mark: " +lowestMark);
}

}

 
 
    
    
    
    
    
    
    
