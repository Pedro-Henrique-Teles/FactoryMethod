import org.example.FabricaDeCarro;
import org.example.FabricaDeMoto;
import org.example.FabricaDeVeiculo;
import org.example.Veiculo;

public class TesteDeVeiculo {
    public static void main(String[] args) {
        FabricaDeVeiculo fabricaDeCarro = new FabricaDeCarro();
        Veiculo carro = fabricaDeCarro.criarVeiculo();
        carro.dirigir();

        FabricaDeVeiculo fabricaDeMoto = new FabricaDeMoto();
        Veiculo moto = fabricaDeMoto.criarVeiculo();
        moto.dirigir();
    }
}
