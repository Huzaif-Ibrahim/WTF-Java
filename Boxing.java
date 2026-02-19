// 4

class boxing{
    public static void main(String[] args){
        int i = 20;
        float f = 2.3f;
        boolean b = true;
        double d = 4.56;
        long l = 3452223;
        char c = 'A';
        byte b1 = 5;

        System.out.println("Autoboxing");
        Integer intObj = i;
        Float floatObj = f;
        Boolean booleanObj = b;
        Double doubleObj = d;
        Long longObj = l;
        Character charObj = c;
        Byte byteObj = b1;

        System.out.println("Integer object : "+ intObj);
        System.out.println("Float object : "+ floatObj);
        System.out.println("Boolean object : "+ booleanObj);
        System.out.println("Double object : "+ doubleObj);
        System.out.println("Long object : "+ longObj);
        System.out.println("Char object : "+ charObj);
        System.out.println("Byte object : "+ byteObj);


        System.out.println("\nUnboxing");
        int intValue = intObj;
        float floatValue = floatObj;
        boolean booleanValue = booleanObj;
        double doubleValue = doubleObj;
        long longValue = longObj;
        char charValue = charObj;
        byte byteValue = byteObj;


        System.out.println("Integer value : "+ intValue);
        System.out.println("Float value : "+ floatValue);
        System.out.println("Boolean value : "+ booleanValue);
        System.out.println("Double value : "+ doubleValue);
        System.out.println("Long value : "+ longValue);
        System.out.println("Char value : "+ charValue);
        System.out.println("Byte value : "+ byteValue);

    }
}