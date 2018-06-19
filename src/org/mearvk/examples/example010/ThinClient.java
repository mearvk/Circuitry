package org.mearvk.examples.example010;

public class ThinClient
{
    public UserInterface userinterface;

    public ThinClient()
    {
        this.userinterface = new UserInterface();

        this.userinterface.connect();

        this.userinterface.show();
    }
}

class Main
{
    public static void main(String... args)
    {
        ThinClient client = new ThinClient();
    }
}