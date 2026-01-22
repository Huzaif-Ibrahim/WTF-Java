class DataType {
    public static void main(String[] args) {
        
        byte myByte1, myByte2;
        myByte1 = 120;
        myByte2 = -48;
        System.out.println("Byte1 : " + myByte1);
        System.out.println("Byte2 : " + myByte2);
        myByte1++;
        System.out.println("Incremented value of Byte1 : " + myByte1);

        short myShort = 6000;
        System.out.println("\nShort is: " + myShort);

        int myInteger1, myInteger2, result1;
        myInteger1 = 7000;
        myInteger2 = 9000;
        result1 = myInteger1 + myInteger2;
        System.out.println("\nInteger1 : "+ myByte1);
        System.out.println("Integer2 : "+ myByte1);
        System.out.println("Integer1 + Interger2 : "+ result1);

        long myLong1, myLong2, result2;
        myLong1 = 10;
        myLong2 = 20;
        result2 = myLong1 * myLong2;
        System.out.println("\nLong1 : "+ myLong1);
        System.out.println("Long2 : "+ myLong2);
        System.out.println("Long1 * Long2 : "+ result2);

        float myFloat1, myFloat2, result3;
        myFloat1 = 2.0f;
        myFloat2 = 8.0f;
        result3 = myFloat1 - myFloat2;
        System.out.println("\nFloat1 : "+ myFloat1);
        System.out.println("Float2 : "+ myFloat2);
        System.out.println("Float1 - Float2 : "+ result3);

        double myDouble1, myDouble2, result4;
        myDouble1 = 30.56;
        myDouble2 = 9.45;
        result4 = myDouble1 + myDouble2;
        System.out.println("\nDouble : "+ myDouble1);
        System.out.println("Double : "+ myDouble2);
        System.out.println("Double1 + Double2 : "+ result4);

    }
}