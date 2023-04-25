package coordinator.app;

public class Banner {
    protected String message;
    
    public Banner() {
        this.message = "Salut, from the banner app!";
    }

    public String salut() {
        return this.message;
    }

    public void salutation() {
        System.out.println(this.salut());
    }
}
