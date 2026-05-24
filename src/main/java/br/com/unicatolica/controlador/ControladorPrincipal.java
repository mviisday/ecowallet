package br.com.unicatolica.controlador;

import br.com.unicatolica.modelo.Despesa;
import br.com.unicatolica.modelo.Receita;
import br.com.unicatolica.modelo.Transacao;
import br.com.unicatolica.servico.Carteira;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControladorPrincipal {

    @FXML
    private TextField descricaoField;

    @FXML
    private TextField valorField;

    @FXML
    private DatePicker dataPicker;

    @FXML
    private TableView<Transacao> tabelaTransacoes;

    @FXML
    private TableColumn<Transacao, String> colunaDescricao;

    @FXML
    private TableColumn<Transacao, Double> colunaValor;

    @FXML
    private TableColumn<Transacao, String> colunaData;

    @FXML
    private TableColumn<Transacao, String> colunaTipo;

    @FXML
    private Label saldoLabel;

    private Carteira carteira = new Carteira();

    @FXML
    public void initialize() {
        colunaDescricao.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDescricao()));

        colunaValor.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getValor()));

        colunaData.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(cellData.getValue().getData()));

        colunaTipo.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
    }

    @FXML
    private void adicionarReceita() {
        adicionarTransacao("Receita");
    }

    @FXML
    private void adicionarDespesa() {
        adicionarTransacao("Despesa");
    }

    private void adicionarTransacao(String tipo) {
        String descricao = descricaoField.getText();
        double valor = Double.parseDouble(valorField.getText());
        String data = dataPicker.getValue().toString();

        Transacao transacao;

        if (tipo.equals("Receita")) {
            transacao = new Receita(descricao, valor, data);
        } else {
            transacao = new Despesa(descricao, valor, data);
        }

        carteira.adicionarTransacao(transacao);
        atualizarTela();
        limparCampos();
    }

    private void atualizarTela() {
        tabelaTransacoes.setItems(
                FXCollections.observableArrayList(carteira.getTransacoes())
        );

        saldoLabel.setText("Saldo: R$ " + carteira.calcularSaldo());
    }

    private void limparCampos() {
        descricaoField.clear();
        valorField.clear();
        dataPicker.setValue(null);
    }
}