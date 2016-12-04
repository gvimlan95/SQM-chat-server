package g53sqm.chat.server;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.easymock.annotation.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
public class MockServer {

    @Mock
    private Server server;
    private int PORT = 9000;
    private Socket socket;
    private Connection connection;

    @Test
    public void mockFirst() throws IOException {
//        server = PowerMockito.mock(Server.class);
//        PowerMockito.when(server).
//        socket = Mockito.mock(Socket.class);
//
//        ByteInputStream bis = PowerMockito.mock(ByteInputStream.class);
//        PowerMockito.when(socket.getInputStream()).thenReturn(bis);
//
//        connection = new Connection(socket,server);
//
//        assertEquals(1,server.getNumberOfUsers());
    }
}