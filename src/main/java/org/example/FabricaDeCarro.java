package org.example;

public class FabricaDeCarro implements FabricaDeVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
