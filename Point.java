/**
 * Created by k.waluch on 2016-05-04.
 */
public class Point {
    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void display()
    {
        System.out.print("("+x+","+y+") ");
    }

    public static Point doublePoint(Point p, int a, int b, int prime){
        if(p.y==0) {
            System.out.println("Nie mozna policzyc rzedu (dzielenie przez y=0)");

        }
        int s = ((3*p.x*p.x+a)/p.y)%prime;
        int xr=(s*s-2*p.x)%prime;
        int yr=(-p.x+s*(p.x-xr))%prime;

        Point R = new Point(xr,yr);

        return R;
    }

    public static Point addPoints(Point P,Point Q,int a, int b, int prime){
        if(P.x==Q.x) {
            System.out.println("Nie mozna policzyc rzedu (dzielenie przez xp-xq=0)");
        }
        int s = ((Q.y - P.y)/(P.x-Q.x))%prime;
        int xr=(s*s-P.x-Q.x)%prime;
        int yr=(-P.y+s*(P.x-xr))%prime;

        Point R = new Point(xr,yr);
        return R;
    }
}
