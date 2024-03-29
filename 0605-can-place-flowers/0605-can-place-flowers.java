class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyBed = 0, i=0;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                flowerbed[i]++;
                emptyBed += 1;
            }
            if(emptyBed >= n){
                return true;
            }
            i++;
        }
        return false;
    }
}