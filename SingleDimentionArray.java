// class SingleDimentionArray{
//     public static void main(String[] args){
//         int arr[] = new int[5];

//         arr[0] = 3;
//         arr[1] = 4;
//         arr[2] = 6;
//         arr[3] = 9;
//         arr[4] = 10;

//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

class SingleDimentionArray{
    public static void main(String[] args){
        int arr[][] = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}