public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        byte myByte;
        

        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short myShort = 200;
        myByte = (byte)myShort;
        System.out.println(myByte);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again

        byte myByte2 = 127;
        System.out.println(myByte2);
        
        myByte2 = (byte) (myByte2 + 1);
        System.out.println(myByte2);
        
        myByte2 = (byte) (myByte2 + 2);
        System.out.println(myByte2);
        
        
        
    }    
}
