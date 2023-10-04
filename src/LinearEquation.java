import java.lang.Math;
import java.text.DecimalFormat;

public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    DecimalFormat f = new DecimalFormat("##.00");

    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope()
    {
        double slope = (double) (y1 - y2) / (x1 - x2);
        return slope;
    }

    public String fractionSlope()
    {
        String fractionSlope = "" + (y1 - y2) + "/" + (x1 - x2);
        return fractionSlope;
    }

    public double distance()
    {
        double distance = Math.sqrt( Math.pow( (x1 - x2), 2) + Math.pow( (y1 - y2), 2) );
        return distance;
    }

    public double yIntercept()
    {
        Double yIntercept = y1 - slope() * x1;
        return yIntercept;
    }

    public String equation()
    {
        String equation = "y = " + fractionSlope() + " * " + "x" + " + " + f.format(yIntercept());
        return equation;
    }

    public String calculateCoordinate(double thirdX)
    {
        double yCoordinate = slope() * thirdX + yIntercept();
        String str = "Solved Coordinate Point is: " + "(" + thirdX + ", " + f.format(yCoordinate) + ")";
        return str;
    }

    public String toString()
    {
        String str = "First Pair: (" + x1 + ", " + y1 + ")";
        str += "\nSecond Pair: (" + x2 + ", " + y2 + ")";
        str += "\nSlope of Line: " + f.format(slope());
        str += "\nY-intercept: " + f.format(yIntercept());
        str += "\nSlope Intercept Form: " + equation();
        str += "\nDistance Between Points: " + f.format(distance());
        return str;
    }
}
