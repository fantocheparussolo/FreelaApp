package br.com.freela.main;

import br.com.freela.view.TelaInicial;

public class FreelaApp {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

}
