package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void retornaNomeHotel() {
        Hotel.getInstance().setNomeHotel("Bosque do Porto");
        assertEquals("Bosque do Porto", Hotel.getInstance().getNomeHotel());
    }

    @Test
    public void retornaNomeCliente() {
        Hotel.getInstance().setNomeCliente("Caio Dutra");
        assertEquals("Caio Dutra", Hotel.getInstance().getNomeCliente());
    }

}