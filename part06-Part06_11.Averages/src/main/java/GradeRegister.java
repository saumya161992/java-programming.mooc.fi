
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointlist;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointlist = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.pointlist.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    public double averageOfGrades(){
        double sum = 0.0;
        
        if(grades.size() ==0){
            return -1;
        }else{
        for(int i = 0;i< grades.size();i++){
            sum = sum + grades.get(i);
        }
        return (sum)/(grades.size());}
    }
    
    public double averageOfPoints(){
        double sum = 0.0;
        
        if(pointlist.size() ==0){
            return -1;
        }else{
        for(int i = 0;i< pointlist.size();i++){
            sum = sum + pointlist.get(i);
        }
        return (sum)/(pointlist.size());}
    }
    

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
