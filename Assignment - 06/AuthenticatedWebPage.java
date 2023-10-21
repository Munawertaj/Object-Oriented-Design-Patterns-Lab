public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    private void authenticateUser() {
        System.out.println("Authenticating user");
    }

    public void display() {
        super.display();
        authenticateUser();
    }
}
