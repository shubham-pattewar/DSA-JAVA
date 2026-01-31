public class DShortestPath {
    public static float shortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i <path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            } else if(dir == 'E'){
                x++;
            } else if(dir == 'W'){
                x--;
            } else if(dir == 'S'){
                y--;
            } else{
                return -1;
            }
        }
        int sumofSqu = x*x + y*y;
        return (float) Math.sqrt(sumofSqu);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        // String path = "WWEESSNNW";
        System.out.println(shortestPath(path));
    }
}
