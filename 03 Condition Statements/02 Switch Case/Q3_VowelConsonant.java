//Q4-> find whether given character is vowel or consonant using switch case.

public class Q3_VowelConsonant {
    public static void main(String args[])
    {
        char ch='a';
        String ans;
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                ans="is Vowel";
                break;
            default: 
                ans="is Consonant";
        }
        System.out.println(ch +" " + ans);
    }
}
