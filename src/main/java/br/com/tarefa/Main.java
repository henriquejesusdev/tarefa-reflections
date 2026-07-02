package br.com.tarefa;

import br.com.tarefa.annotation.Tabela;
import br.com.tarefa.model.*;

public class Main {
    public static void main(String[] args) {
        Class<?>[] cs = { Cliente.class, Produto.class };
        for (Class<?> c : cs) {
            if (c.isAnnotationPresent(Tabela.class)) {
                Tabela t = c.getAnnotation(Tabela.class);
                System.out.println(c.getSimpleName() + " -> " + t.value());
            }
        }
    }
}