/*
    WAP to take marks in 5 subjects of the student , The marks must not be less than 0 and
    also must not be greater than 100. Calculate the total scored by the student and find
    his/her grade. PS: make your own grading criteria.
 */

package conditionalstatements;

public class StudentGrade {

    public static void main(String[] args){

        int maths = 70, science = 80, english = 80, computer = 90, nepali = 65;
        double total = maths+science+english+computer+nepali;
        double percentage= (total/500)*100;

        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage>=75){
            System.out.println("Grade B");
        }
        else if(percentage>=60){
            System.out.println("Grade C");
        }
        else if(percentage>=45){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
