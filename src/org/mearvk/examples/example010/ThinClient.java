package org.mearvk.examples.example010;

class Main
{
    public static void main(String... args)
    {
        ThinClient client = new ThinClient();

        System.out.println(client.getClass());

        System.out.println(client.getClass().getAnnotatedSuperclass());
    }
}

public class ThinClient extends BonerPatrol
{
    public UserInterface userinterface;

    public ThinClient()
    {
        this.userinterface = new UserInterface();

        this.userinterface.connect();

        this.userinterface.show();
    }
}

class BonerPatrol extends Object
{

}
