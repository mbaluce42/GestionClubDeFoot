package packageUtility;

public class Tool {

    public static boolean contientChiffres(final String s)
    {
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                return true;
            }
        }
        return false;
    }

    public static String SetUpper(final String s)
    {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if(i==0){ c=Character.toUpperCase(c);}
            else if( s.charAt(i-1)== ' ' || s.charAt(i-1)== '-') {  c=Character.toUpperCase(c);}
            finalString.append(c);
        }
        return finalString.toString();
    }
}
