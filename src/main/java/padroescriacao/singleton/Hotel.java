package padroescriacao.singleton;

public class Hotel {

    private Hotel() {};
    private static Hotel instance = new Hotel();
    public static Hotel getInstance() {
        return instance;
    }

    private String nomeHotel;
    private String nomeCliente;

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}
