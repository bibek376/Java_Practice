public class main {

    public static void main(String[] args) {
        // TODO enter the string and integer as command line input
        String a,c="";
        int b,len;
        b=Integer.parseInt(args[1]);
        len=args[0].length();
        a=args[0];
        len=len-b;
        for(int i= 0;i<b;i++)
        {
            c=c+a.substring(len);
        }
        System.out.println(c);

    }

}