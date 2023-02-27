import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class FooTest {
    Foo mockFoo = mock(Foo.class);

    @Test
    void testExample(){

        when(mockFoo.bool(anyString(), anyInt(), any(Object.class))).thenReturn(true);
        assertTrue(mockFoo.bool("A", 1, "A"));
        assertTrue(mockFoo.bool("B", 10, new Object()));
    }

    @Test
    void testVerify(){
        mockFoo.bool("A", 1, "A");
        mockFoo.bool("A", 5, "B");
        mockFoo.bool("A", 1, "A");
        mockFoo.bool("A", 4, "C");
        //verify(mockFoo).bool(anyString(), anyInt(), any(Object.class));
        //verify(mockFoo, atLeast(2)).bool(anyString(), anyInt(), any(Object.class));
        verify(mockFoo, times(3)).bool(anyString(), anyInt(), any(Object.class));
    }
}