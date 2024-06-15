package Dsa_by_coding_ninjas;

public class stringImplementation {
    public static String removeCharacter(String s,String a,char c,int i)
    {
        if(i>=s.length())
        {
//            System.out.println(a);
            return a;
        }
        if (s.charAt(i) == c) {
            return removeCharacter(s,a,c,i+1);
        }
        else {
            a+=s.charAt(i);
            return removeCharacter(s,a,c,i+1);
        }
    }
    public static void main(String []args)
    {
        String s="anskcsndnc";
        String a="";

        System.out.println(removeCharacter(s,a,'a',0));

    }
}
