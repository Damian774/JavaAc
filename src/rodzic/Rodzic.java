package rodzic;

public class Rodzic {
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
