package plaudernTec;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

public class User {
    /**
     * Define user parameters
     * Using encapsulating
     * Define get and set methods
     */

    private InputStream inputStream;
    private String name; //ID user
    private PrintStream outputStream;


    public User(Socket client, String name) throws IOException {
        this.outputStream = new PrintStream(client.getOutputStream());
        this.inputStream = client.getInputStream();
        this.name = name;

    }

    /**
     * Remove a user from clients list
     * @param user
     */


    /**
     * Getters methods
     *
     * @return
     */
    public InputStream getInputStream() {
        return this.inputStream;
    }

    public String getName() {
        return this.name;
    }

    public PrintStream getOutStream() {
        return this.outputStream;
    }

    /**
     * This method is for the print users in the UserList
     */
    public String toString() {
        return this.name;
    }

}
