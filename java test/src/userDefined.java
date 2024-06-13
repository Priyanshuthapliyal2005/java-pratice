import java.lang.*;


public class userDefined {
    public static void main(String args[]){
        int ahe=9;

        try{
            if(ahe<19){
                throw new myOwnException();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("It is handled properly.");
    }
}


class myOwnException extends Exception{
    public String getMessage(){
        return "this is my exception.";
    }
}
