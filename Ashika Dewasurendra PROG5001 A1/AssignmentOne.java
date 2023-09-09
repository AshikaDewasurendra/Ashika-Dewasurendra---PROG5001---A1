
import java.util.*;
import java.lang.Math;
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
    double mean = 0;
    double markDiff = 0;
    double std=0;
    
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
mean = totalMarks/assignmentMarks.length;

for(int i =0;i<10;i++){
double currentMark = assignmentMarks[i];
markDiff += (mean-currentMark)*(mean-currentMark);
}



System.out.println("Highest Mark: " +highestMark);
System.out.println("Lowest Mark: " +lowestMark);
System.out.println("Mean: " +mean);
}

//Get Vaild code 
public static double CheckHighestMark(double[]currentMark){
    double highestMark = currentMark[0];
    for(int i=0;i<currentMark.length;i++){
        if(currentMark[i] > highestMark){
            highestMark = currentMark[i];
        }
        
    }
    return highestMark;
}

public static double checkLowestMark(double[]currentMarks){
    double lowestMark = currentMarks[0];
    for(int i=0;i<currentMarks.length;i++){
        if(currentMarks[i] < lowestMark){
            lowestMark = currentMarks[i];
            
        }
        
    }
    return lowestMark;
}

public static double checkMean(double[]currentMarks){
    double total =0;
       for(double currentMark : currentMarks){
       total += currentMark;
}
double mean = total/currentMarks.length;
return mean;
}

public static double checkStandardDeviation(double[]currentMarks,double mean){
    double standardDeviation=0;
   for(double currentMark : currentMarks){
       standardDeviation += Math.pow(currentMark-mean,2);  }
       
       standardDeviation = Math.sqrt((standardDeviation/(currentMarks.length -1)));
       return standardDeviation;
}
}

 
 
    
    
    
    
    
    
    
