package _8_oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {
        //how to create subclass of an interface
        //interface subclass we call implementation

        interface MessageService{
            void sendMessage(String message);
        }

        class MessageServiceImpl implements MessageService{
            @Override
            public void sendMessage(String message) {
                System.out.println("send message overridden");
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("good morning");
    }
}
