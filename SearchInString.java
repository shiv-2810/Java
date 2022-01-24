import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        String s=obj.nextLine();
        char t=obj.next().trim().charAt(0);
        System.out.println(search(s,t));
    }
    public static boolean search(String s,char t)
    {
        if(s.length()==0)
            return true;
        for(char ch:s.toCharArray())
        {
            if(ch==t)
                return true;
        }
        return false;
    }
}
