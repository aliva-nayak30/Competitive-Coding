        //USING FOR LOOP 0(N3)


        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         for(int k=j+1;k<arr.length;k++){
        //             sum=arr[i]+arr[j]+arr[k];

        //             if(sum==target){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        //SECOND APPROACH WITH SORTING ARRAY(BINARY SEARCH)

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int low=i+1;
            int high=arr.length-1;
            int y=target-arr[i];
            while(low<high){
                if(arr[low]+arr[high]==y){
                    return true;
                }
                else if(arr[low]+arr[high]>y){
                    high--;
                }
                else if(arr[low]+arr[high]<y){
                    low++;
                }

                }
            }
            return false;
