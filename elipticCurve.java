import java.util.LinkedList;

/**
 * Created by k.waluch on 2016-05-04.
 */
public class elipticCurve {

    int a;
    int b;
    int p;

    LinkedList<Point> points = new LinkedList<>();



    elipticCurve(int a, int b, int p)
    {
        this.a = a;
        this.b = b;
        this.p = p;
    }

    public LinkedList<Point> countPoints(){

        int left;
        int right;
        for(int i=1;i<p;i++) {
            for (int j = 1; j < p; j++)
            {
                left = (j*j)%p;
                right = ((i*i*i)+a*i+b)%p;
                if (left==right)
                {
                    points.add(new Point(i,j));
                }


            }
        }
        return points;
    }

    public int countOrder(Point P){


        LinkedList<Point> points = new LinkedList<Point>();
        int k = 2;
        points.add(P);
        Point R = Point.doublePoint(P,this.a,this.b,this.p);
        points.add(R);
        k++;

        while(true){
            if(k%2==0){
                if(points.get(k/2-2).y==0) {
                    System.out.println("Nie mozna policzyc rzedu (dzielenie przez y=0)");
                    return 0;
                }
                R = Point.doublePoint(points.get(k/2-2),this.a,this.b,this.p);
                points.add(R);
            }else{
                if(P.x==points.get(k-2).x) {
                    System.out.println("Nie mozna policzyc rzedu (dzielenie przez xp-xq=0)");
                    return 0;
                }
                R = Point.addPoints(points.get(k-2),P,this.a,this.b,this.p);
                points.add(R);
            }
            k++;
            if(R.x==P.x)
            {
                System.out.print("Znaleziono rzad punktu: ");
                break;
            }
            if(k==199){
                System.out.println("Rzad jest wiekszy niz 200");
                return 0;
            }
        }

        k+=2;
        System.out.println(k);
        return k;
    }

    public boolean checkFactors(){
        int equasion = (4*a*a*a + 27*b*b)%p;
        if(equasion==0) {
            return true;
        }else{
            return false;
        }
    }
}
