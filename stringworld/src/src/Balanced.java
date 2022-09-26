import java.util.Scanner;
public class Balanced {
    public static void main(String[] args){

         
        int x=0,i=0;
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();

        char[] ch = new char[str.length()];

            ch[i] = str.charAt(i);





        while(ch[i]!=0){
            if (ch[i] == '(') {
                x++;
            } else if (ch[i] == ')') {
                x--;
            }else if(ch[i]=='['){
                x++;
            }else if(ch[i]==']') {
                x--;
            }else if(ch[i]=='{') {
                x++;
            }else if(ch[i]=='}'){
                x--;
            }if (x < 0){
                break;

            }


            i++;
        }
        if(x==0) {
            System.out.println("Expression is balanced");
        }
        else {
            System.out.println("Expression is unbalanced");



        }

    }
}
