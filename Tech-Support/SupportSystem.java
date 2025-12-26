public class SupportSystem {
    private InputReader reader;
    private Responder responder;

    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
    }

    public void start() {
        boolean finished = false;

        printWelcome();

        while (!finished) {
            String input = reader.getInput();
            if (input.equalsIgnoreCase("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input.toLowerCase());
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("=== TECH SUPPORT SYSTEM FRS ===");
        System.out.println("Silakan jelaskan masalah Anda terkait pengambilan FRS.");
        System.out.println("Ketik 'bye' untuk keluar.");
    }

    private void printGoodbye() {
        System.out.println("Terima kasih telah menggunakan Tech Support System.");
    }
}
