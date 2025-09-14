

class InvalidInputExceptions extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 & 9";
    }
    @Override
    public String getMessage(){
        return "getMessage";
    }
}
class CannotDivideByZeroExceptions extends Exception{
    @Override
    public String toString(){
        return "Cannot Divide By Zero";
    }
    public String getMessage(){
        return"getMessage";
    }

}

class MaxInputExceptions extends Exception{
    @Override
    public String toString(){
            return"Input can't be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "getMessage";
    }
}

class MaxMultiplyInputExceptions extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage(){
        return "getMessage";
    }
}
class CustomCalculator {
    double add(double a, double b)throws InvalidInputExceptions,MaxInputExceptions{
        if(a>100000 || b>100000){
            throw new MaxInputExceptions();
        }
        if(a==8 || b==9){
            throw new InvalidInputExceptions();
        }
        return a + b;
    }
    double subtract(double a, double b)throws MaxInputExceptions{
        if(a>100000 || b>100000){
            throw new MaxInputExceptions();
        }
        return a - b;
    }
    double multiply(double a, double b)throws MaxInputExceptions,MaxMultiplyInputExceptions{
        if(a>100000 || b>100000){
            throw new MaxInputExceptions();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputExceptions();
        }
        return a * b;
    }
    double divide(double a, double b)throws CannotDivideByZeroExceptions,MaxInputExceptions{
        if(a>100000 || b>100000){
            throw new MaxInputExceptions();
        }
        if(a==0||b==0){
            throw new CannotDivideByZeroExceptions();
        }
        return a / b;
    }

}
public class CL_103_exercise_6Sol {
    public static void main(String[]args)throws InvalidInputExceptions,CannotDivideByZeroExceptions,MaxInputExceptions,MaxMultiplyInputExceptions{

        /* ***>>> You Have to create a custom Calculator with following operations <<<***:
         * 1. + --> Addition
         * 2. - --> Subtraction
         * 3. * --> Multiplication
         * 4. / --> Division
         *--->>> Which throws the following custom exceptions :
         * 1. Invalid input Exception -- 8 & 9
         * 2. Cannot Divide by 0 Exception
         * 3. Max input Exception -- if any of the input is greater than 100000
         * 4. Max Multiplier Reached Exception - Don't allow any multiplication input to greater than 7000
         */

        CustomCalculator calculator = new CustomCalculator();
//        calculator.add(8,9);
        calculator.subtract(9999,645);
//          calculator.divide(10,0);
            calculator.multiply(7000,7777);


    }
}
 