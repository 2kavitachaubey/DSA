package Arrays;

public class WaterContainer {
    public static void main(String[] args) {
        int[] water = {1,8,6,2,5,4,8,3,7};
        int low =0;
        int high = water.length-1;
        int area = 0;
        for(int i=0; i<water.length; i++){
            System.out.println("low: "+ water[low]);
            System.out.println("high: "+ water[high]);
            int value = Integer.min(water[low],water[high]);
            if(area < value*(water.length-(i+1))){
                area = value*(water.length-(i+1));
                System.out.println("this is area : " + area);
            }
            if(water[low] < water[high]){
                low++;
            }else{
                high--;
            }
        }
        System.out.println(area);
    }
}
