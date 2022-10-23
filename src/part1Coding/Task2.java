package part1Coding;

public class Task2 {


}
abstract class Marks{
       abstract double getPercentage();
        }
        class A extends Marks{
        double subject1;
        double subject2;
        double subject3;
        double per;
        A(double subject1,double subject2, double subject3){
            this.subject1=subject1;
            this.subject2=subject2;
            this.subject3=subject3;
        }

            @Override
            double getPercentage() {
            per=(subject1+subject2+subject3)/300*100;
                return per;
            }
        }
        class B extends Marks{
        double subject1;
        double subject2;
        double subject3;
        double subject4;
        double per;
        B(double subject1, double subject2,double subject3,double subject4){
            this.subject1=subject1;
            this.subject2=subject2;
            this.subject3=subject3;
            this.subject4=subject4;
        }


            @Override
            double getPercentage() {
                per=(subject1+subject2+subject3+subject4)/400*100;
                return per;

            }
        }