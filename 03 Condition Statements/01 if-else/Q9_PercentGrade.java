//Q9-> using if else if
class Q9_PercentGrade {
        public static void main(String args[])
        {
            double per=75.5;
            char grade;
            if(per>=90)
                grade='A';
            else if(per>=70)
                grade='B';
            else if(per>=50)
                grade='C';
            else
                grade='F';
                
            System.out.println("Grade is "+ grade);
    
        }
    }
