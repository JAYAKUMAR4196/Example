public class Example {
    public void main(string[]args) {
        System.out.println("Accessible from anywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Accessible within package and subclasses.");
    }

    private static class string {

        public string() {
        }
    }
}
