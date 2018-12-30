package les_7_classes;

public class Triangle1 {
    private double site1;
    private double site2;
    private double site3;

    public Triangle1(double site1, double site2, double site3) {
        if (site1 + site2 <= site3 || site1 + site3 <= site2 || site2 + site3 <= site1)
            System.out.println("Triangle is impossible!");
        this.site1 = site1;
        this.site2 = site2;
        this.site3 = site3;
    }

    public double getSite1() {
        return site1;
    }

    public double getSite2() {
        return site2;
    }

    public double getSite3() {
        return site3;
    }

    public double getPerimeter() {
        return site1 + site2 + site3;
    }

    public boolean isRivnobedren() {
        if ((site1 == site2 && site1 != site3) || (site1 == site3 && site1 != site2) || (site2 == site3 && site2 != site1))
            return true;
        return false;
    }

    public boolean isRivnostor() {
        if (site1 == site2 && site1 == site3) return true;
        return false;
    }

    public boolean isPryamokut() {
        if (Math.pow(site1, 2) + Math.pow(site2, 2) == Math.pow(site3, 2) || Math.pow(site1, 2) + Math.pow(site3, 2) == Math.pow(site2, 2)
                || Math.pow(site2, 2) + Math.pow(site3, 2) == Math.pow(site1, 2)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Triangle1{" +
                "site1 = " + site1 +
                ", site2 = " + site2 +
                ", site3 = " + site3 +
                '}';
    }
}
