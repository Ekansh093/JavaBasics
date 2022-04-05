package java1;

public class Exception1 {

    public static void main(String[] args) {

        /**
         * Throwable
         *          -Exception
         *                  -Checked
         *                          -IOException
         *                          -SQLException
         *                  -Unchecked
         *                          -ArithmeticException
         *                          -FileNotFoundException
         *          -Error
         *               - Physical errors - memory issue
         */

        // Thowble is  class, throws is used to suppress exception, throw is used to throw exception

        try{
            int i=2;
            System.out.println("Test");
            if(i==2)
                throw new CustomException("Custom exception");
        }catch (Exception e){

        }



    }
}

class CustomException extends Exception{

    public CustomException(String msg){
        super(msg);
    }
}