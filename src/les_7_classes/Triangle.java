package les_7_classes;

public class Triangle {
    private String name;
    private double site1;
    private double site2;
    private double site3;

    public Triangle(String name, double site1, double site2, double site3) {
        this.name = name;
        this.site1 = site1;
        this.site2 = site2;
        this.site3 = site3;
    }

    public Triangle() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSite1(double site1) {
        this.site1 = site1;
    }

    public void setSite2(double site2) {
        this.site2 = site2;
    }

    public void setSite3(double site3) {
        this.site3 = site3;
    }

    public double square() {
        double sq;
        double p;
        p = (site1 + site2 + site3) / 2;
        sq = Math.sqrt(p * (p - site1) * (p - site2) * (p - site3));
        return sq;

    }

    public void print() {
        System.out.println("name = " + name);
        System.out.println("site1 = " + site1);
        System.out.println("site2 = " + site2);
        System.out.println("site3 = " + site3);
    }
}
