import java.io.*;
class test5{
    public static void main(String args[]) throws IOException{
        int i,ch;
        String mystr1="";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("1. Enter new line \n2. Reverse the line \n3. Display the most used Characters \n4. Exit\nEnter Choice : ");
            ch=Integer.parseInt(br.readLine());
            switch(ch){
                case 1: System.out.println("Please enter a new line : ");
                        mystr1=br.readLine();
                    break;
                case 2: StringBuffer mystr2 = new StringBuffer(mystr1);
                        mystr2=mystr2.reverse();
                        System.out.println("The Reversed string is  : "+mystr2);
                    break;
                case 3: //collections part required
                    break;
                case 4:
                    break;

            }
        }while(ch!=4);
    }
}