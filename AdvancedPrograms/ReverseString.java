class ReverseString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str ="Yogesh";
        String result="";
        for(int i = str.length()-1;i>=0;i--)
        { 
            result = result + str.charAt(i);
        }
        
        System.out.println(result);
    }
}
