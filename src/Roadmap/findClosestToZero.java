package Roadmap;

public class findClosestToZero {
    static int closestToZero(int[] arr){
        int numDistance = Integer.MAX_VALUE;
        int numClosest = 0 ;
        for(int i = 0; i < arr.length; i++){
            int currentDistance = arr[i];
            int distance = currentDistance >= 0 ? currentDistance : -currentDistance;
            if(distance < numDistance){
                numDistance = distance;
                numClosest = currentDistance;
            }else if(distance == numDistance && numClosest>currentDistance ){
                numClosest = currentDistance;
            }
        }
        return numClosest;
    }
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(closestToZero(arr));
    }
}
