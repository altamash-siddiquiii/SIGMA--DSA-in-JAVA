public class ShortestPath {
    public static float findShortestPath(String path) {
        int x = 0, y = 0; // Assume in starting that x is x1 and y is y1

        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i); // direction for  each letter of path
            // EAST
            if (dir == 'E') {
                x++;   
            }
            // WEST
            else if (dir == 'W') {
                x--;
            }
            // NORTH
            else if (dir == 'N') {
                y++;
            }
            // SOUTH
            else { // dir=='S'
                y--;
            }
        }
        int X2 = x*x, Y2 = y*y;
        // Calculate with formula in return (TypeCaste double To float)
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        // Question 2 of lectures
        // Find Shortest Path to reach destination
        String path = "WNEENESENNN";

        System.out.println(findShortestPath(path));
    }
}