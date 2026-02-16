import java.io.*;

// class Checked{
//     public static void main(String[] args) throws IOException {
//         FileReader file = new FileReader("D:\\Java\\hello.txt");
//         BufferedReader fileInput = new BufferedReader(file);

//         for(int counter=0; counter<3; counter++){
//             System.out.println(fileInput.readLine());
//         }
//         fileInput.close();
//     }
// }
class Checked{
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("D:\\Java\\hello.txt");
            BufferedReader fileInput = new BufferedReader(file);

            for(int counter=0; counter<3; counter++){
                System.out.println(fileInput.readLine());
            }
            fileInput.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found "+ e.getMessage());
        } catch(IOException e){
            System.out.println("Error reading file " + e.getMessage());
        } 
    }
}                               