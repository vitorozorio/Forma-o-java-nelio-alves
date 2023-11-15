package main;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class InterfaceGraficaTigre extends Frame {

    private static final int BARALHO_TAMANHO = 52;
    private static final int CARTAS_JOGADAS = 10;

    private List<Integer> cartasEmJogo = new ArrayList<>();
    private Random random = new Random();

    private Button botaoJogar;
    private Label labelCartaTigre;
    private Label labelHoraCerta;
    private Label labelPontoInicio;
    private TextField campoValorAposta;
    private Label labelProbabilidade;

    public InterfaceGraficaTigre() {
        super("Algoritmo do Tigre");
        setSize(400, 300);
        setLayout(new FlowLayout());

        botaoJogar = new Button("Jogar");
        botaoJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });

        labelCartaTigre = new Label("Carta do Tigre: ");
        labelHoraCerta = new Label("Hora certa para jogar: ");
        labelPontoInicio = new Label("Ponto de início: ");
        campoValorAposta = new TextField(10);
        labelProbabilidade = new Label("Probabilidade: ");

        add(botaoJogar);
        add(labelCartaTigre);
        add(labelHoraCerta);
        add(labelPontoInicio);
        add(campoValorAposta);
        add(labelProbabilidade);

        setVisible(true);
    }

    private void jogar() {
        cartasEmJogo.clear();

        for (int i = 0; i < CARTAS_JOGADAS; i++) {
            cartasEmJogo.add(random.nextInt(BARALHO_TAMANHO));
        }

        int cartaTigre = preverCartaTigre();
        boolean horaCerta = horaCertaParaJogar();

        labelCartaTigre.setText("Carta do Tigre: " + cartaTigre);
        labelHoraCerta.setText("Hora certa para jogar: " + horaCerta);

        int valorAposta = Integer.parseInt(campoValorAposta.getText());
        double probabilidade = preverProbabilidade(cartasEmJogo);

        labelProbabilidade.setText("Probabilidade: " + probabilidade);
    }

    private int preverCartaTigre() {
        int[] cartasTigre = new int[CARTAS_JOGADAS];

        for (int i = 0; i < CARTAS_JOGADAS; i++) {
            cartasTigre[i] = cartasEmJogo.get(i);
        }

        int cartaComMaiorValor = cartasTigre[0];

        for (int i = 1; i < CARTAS_JOGADAS; i++) {
            if (cartasTigre[i] > cartaComMaiorValor) {
                cartaComMaiorValor = cartasTigre[i];
            }
        }

        return cartaComMaiorValor;
    }

    private boolean horaCertaParaJogar() {
        int cartaComMenorValor = cartasEmJogo.get(0);

        for (int i = 1; i < CARTAS_JOGADAS; i++) {
            if (cartasEmJogo.get(i) < cartaComMenorValor) {
                cartaComMenorValor = cartasEmJogo.get(i);
            }
        }

        return cartaComMenorValor < 10;
    }

    private double preverProbabilidade(List<Integer> cartasEmJogo) {
        double probabilidade = 0;

        for (int i = 0; i < cartasEmJogo.size(); i++) {
            if (cartasEmJogo.get(i) > cartasEmJogo.get(0)) {
                probabilidade += 1.0 / cartasEmJogo.size();
            }
        }

        return probabilidade;
    }


        public static void main(String[] args) {
            InterfaceGraficaTigre interfaceGrafica = new InterfaceGraficaTigre();
        }

}
