package rodzic;

import java.util.Objects;

public class Rodzic {
    static{
        System.out.println("static rodzic");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Rodzic(String prywatnePole, String domyslnePole, String publicznePole, String protectedPole) {
        this.prywatnePole = prywatnePole;
        this.domyslnePole = domyslnePole;
        this.publicznePole = publicznePole;
        this.protectedPole = protectedPole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rodzic rodzic = (Rodzic) o;
        return Objects.equals(prywatnePole, rodzic.prywatnePole) &&
                Objects.equals(domyslnePole, rodzic.domyslnePole) &&
                Objects.equals(publicznePole, rodzic.publicznePole) &&
                Objects.equals(protectedPole, rodzic.protectedPole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prywatnePole, domyslnePole, publicznePole, protectedPole);
    }

    {
        System.out.println("blok rodzic");
    }

    public Rodzic() {
        System.out.println("rodzic konstruktor");
    }

    private String prywatnePole;
    String domyslnePole;
    public String publicznePole;
    protected String protectedPole;

    public String getPrywatnePole() {
        return prywatnePole;
    }

    public void setPrywatnePole(String prywatnePole) {
        this.prywatnePole = prywatnePole;
    }

    public String getDomyslnePole() {
        return domyslnePole;
    }

    public void setDomyslnePole(String domyslnePole) {
        this.domyslnePole = domyslnePole;
    }

    public String getPublicznePole() {
        return publicznePole;
    }

    public void setPublicznePole(String publicznePole) {
        this.publicznePole = publicznePole;
    }

    public String getProtectedPole() {
        return protectedPole;
    }

    public void setProtectedPole(String protectedPole) {
        this.protectedPole = protectedPole;
    }
}
