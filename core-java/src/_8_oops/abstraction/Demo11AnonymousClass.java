package _8_oops.abstraction;

public class Demo11AnonymousClass {
    public static void main(String[] args) {

        //define the parent class
        interface MessageService {
            void sendMessage(String message);
        }


        MessageService messageService =  new MessageService(){
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message "+message);
            }
        };
        messageService.sendMessage("anonymous way");


        class A {}



       new A();



    }
}
