package _8_oops.abstraction;

public class Demo10 {
    public static void main(String[] args) {

        //define the parent class
        interface MessageService {
            void sendMessage(String message);
        }

        //subclass using traditional way
        class MessageServiceImpl implements  MessageService{
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message "+message);
            }
        }

        // creating subclass object
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("good morning");


    }
}
