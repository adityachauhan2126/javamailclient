package de.EmailClient.emailclient;

public class EmailClientApplication {

    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        client.start();
        client.connect();
    }
}
