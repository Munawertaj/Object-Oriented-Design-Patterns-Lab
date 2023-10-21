# Web Page Decorator Pattern

This Java code demonstrates the Decorator Pattern applied to a web page, allowing the dynamic addition of features and behaviors to a basic web page.

## Code Structure

- `WebPage.java`: Defines the WebPage interface with a `display` method.
- `BasicWebPage.java`: Represents a basic web page with HTML, CSS, and script content.
- `WebPageDecorator.java`: Abstract class that serves as the base for decorator classes.
- `AuthorizedWebPage.java`: Decorator class for authorizing users.
- `AuthenticatedWebPage.java`: Decorator class for authenticating users.
- `Program.java`: The main class that demonstrates the use of decorators to extend web page functionality.

## Usage

1. Implement the `WebPage` interface to create concrete web page classes.
2. Create decorator classes that extend `WebPageDecorator` to add specific behaviors.
3. In the `main` method of `Program`, create an instance of a basic web page and decorate it with various features as needed.

## Decorator Pattern

The Decorator Pattern allows you to add or alter the behavior of objects dynamically, without affecting their existing structure. In this code, decorators are used to add authorization and authentication features to a basic web page, demonstrating the flexibility of the pattern.
