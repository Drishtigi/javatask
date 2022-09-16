public class Example extends Throwable {
    public static boolean validate(String str) throws Exception{
        if(str=="Drishti"){
            throw new Exception();
        }
    }
    public static void main(String[] args){
        try{
           validate ("aruna");

        }
        catch(Exception e){
            System.out.println("Exception");


        }
    }
}
