class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int n = position.length; 

        // pair up speed & position, sort descending order
        double[][] cars = new double[n][2];

        for (int i = 0; i < n; i ++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> Double.compare(b[0], a[0]));

        
        Deque<Double> stack = new ArrayDeque<>();
        for (double[] car : cars){
            double pos = car[0];
            double spd = car[1];
            double time = (target - pos) / spd; 

            if (stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
            // else it merges to the fleet ahead, do nothing
        }

        return stack.size(); 
        
    }
}

/**

time = (target - position) / speed 
    if the car behind: smaller, or equal time as car in front
    --> becomes a car fleet. 
    if bigger, 
    --> seperate fleet.

fleet is led by the car at the front 
    --> start from the closest to the target to keep track

    - sort cars by position
    - compute time to target
    - walk thru, 
    - see if merge or seperate

**/



