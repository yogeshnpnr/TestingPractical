public class RemoveSpecialChars2 {


    public static void main(String[] args)
    {
//declare a string having special characters
       String str="Pr!ogr#am%m*in&g yogesh Lan?#guag(e";
        //String str = "The term "clear box," "white box," or "transparent box" refers to the capacity to see into the inner workings of software through its outside shell.";

        String resultStr="";
//loop execute till the length of the string
        for (int i=0;i<str.length();i++)
        {
//comparing alphabets with their corresponding ASCII value
            if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true
            {
//adding characters into empty string
                resultStr=resultStr+str.charAt(i);
            }
        }
        System.out.println("String after removing special characters: "+resultStr);
    }
}


//
