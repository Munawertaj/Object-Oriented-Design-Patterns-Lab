public class Program {
    public static void main(String[] args) {
        WebPage basicPage = new BasicWebPage("Basic HTML", "Basic CSS", "Basic Script");
        WebPage authorizedPage = new AuthorizedWebPage(basicPage);
        WebPage authenticatedPage = new AuthenticatedWebPage(authorizedPage);

        authenticatedPage.display();
    }
}
