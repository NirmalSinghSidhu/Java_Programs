public class VowelCheckWhile {
    public  static void VowelCheck(char s){
        int flag=0;
        switch(s){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'O':
            case 'E':
            case 'U':flag++;
        }
        if(flag==1){
            System.out.println("The given character "+s+" is a vowel");
        }
        else{
            if(s>='a'&&s<='z'||s>='A'&&s<='Z'){
                System.out.println("The given character "+s+" is a consonent..");
            }
            else{
            System.out.println("Not a character !!");
            }
        }
    }
    public static void main(String[] args) {
        VowelCheck('s');
    }
    
}
