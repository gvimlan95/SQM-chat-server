package g53sqm.chat.server;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.ServerSocket;
import java.net.Socket;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Connection.class)
public class ConnectionTest {

    Connection connection;
    Socket socket;
    Server server;

    @Test
    public void mockTest() throws Exception {
        connection = PowerMockito.mock(Connection.class);
        socket = PowerMockito.mock(Socket.class);
        server = PowerMockito.mock(Server.class);
        PowerMockito.whenNew(Connection.class).withArguments(socket,server).thenReturn(connection);



    }

}