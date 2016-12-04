package g53sqm.chat.server;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.powermock.api.easymock.annotation.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.Socket;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Server.class)

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MockConnection {
    @Mock
    private Server server;
    private Socket socket;
    private Connection connection;

    @Test
    public void mockServerAndSocket() throws IOException {
        server = Mockito.mock(Server.class);
        socket = Mockito.mock(Socket.class);

        ByteInputStream bis = PowerMockito.mock(ByteInputStream.class);
        PowerMockito.when(socket.getInputStream()).thenReturn(bis);

        connection = new Connection(socket,server);

        assertEquals(false,connection.isRunning());
    }
}