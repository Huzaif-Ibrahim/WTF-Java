class MultiArray{
    public static void main(String args[]){
        int arr[][] = {{2,6,4},{9,0,7},{1,8,5}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}