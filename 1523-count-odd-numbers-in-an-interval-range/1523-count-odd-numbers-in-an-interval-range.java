class Solution {
    public int countOdds(int low, int high) {
       // return (high + 1) / 2 - low / 2;
   // }
//}
        if (low % 2 != 0 || high % 2 != 0){
         return(high - low) / 2+1;
    }
        else
        {
            return(high-low)/2;
        }

    }
}