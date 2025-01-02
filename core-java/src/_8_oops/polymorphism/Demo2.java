package _8_oops.polymorphism;

public class Demo2 {
    public static void main(String[] args) {

        class MessageService {
            public void sendMessage(String message) {
                System.out.println("message sent using Email");
            }
        }

        class MessageServiceImpl extends MessageService {

            @Override
            public void sendMessage(String message) {
                System.out.println("message sent using whatsApp");
            }
        }

        MessageServiceImpl messageService = new MessageServiceImpl();
        messageService.sendMessage("Good morning");

    }
}
