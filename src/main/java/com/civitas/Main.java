package com.civitas;

import com.civitas.domain.Candidato;
import com.civitas.domain.Partido;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CIVITAS ===");

        Partido partido1 = new Partido("Partido Exemplo", "PE");

        Candidato candidato1 = new Candidato(
                "Ana Silva", "13", partido1
        );

        Candidato candidato2 = new Candidato(
                "Carlos Souza", "1313", partido1
        );

        System.out.println("Candidato: " + candidato1.getNome());
        System.out.println("Número: " + candidato1.getNumero());
        System.out.println("Partido: " +
                candidato1.getPartido().getNome() + " (" +
                candidato1.getPartido().getSigla() + ")");

        System.out.println();

        System.out.println("Candidato: " + candidato2.getNome());
        System.out.println("Número: " + candidato2.getNumero());
        System.out.println("Partido: " +
                candidato2.getPartido().getNome() + " (" +
                candidato2.getPartido().getSigla() + ")");
    }
}