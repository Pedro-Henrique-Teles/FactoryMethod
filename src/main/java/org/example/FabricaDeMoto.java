package org.example;

public class FabricaDeMoto implements FabricaDeVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
