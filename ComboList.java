import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboList extends JFrame {

        JList lista1;
        String curso[] = {"Administração", "Recursos Humanos" , "Tecnologia da Informação" , "Logistica" , "Gestão Empresarial" ,"Serviços Jurídicos"};
        JButton exibir;
        JLabel rotulo, texto,rotulo2;
        JComboBox lista2;
         String escola[] = {"Etec da Zona Leste", "Etec Camargo aranha", "Etec de guaianases","Etec de guarulhos"};

        public ComboList() {

        super("Inscrições de Etec Abertas ");
        setSize(600, 450);
        setResizable(false);
        setLayout(null);
        Container tela = getContentPane();


        lista1 = new JList(curso);
        lista2 = new JComboBox(escola);
        texto = new JLabel("Escolha o curso que deseja:");
        rotulo = new JLabel("");
        rotulo2 = new JLabel("");
        exibir = new JButton("Matricular");
        lista1.setVisibleRowCount(5);
        lista2.setMaximumRowCount(5);


        JScrollPane painelRolagem = new JScrollPane(lista1);
        lista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        texto.setBounds(40, 10, 500, 100);
        painelRolagem.setBounds(40, 80, 250, 100);
        rotulo.setBounds(40, 250, 500, 30);
        rotulo2.setBounds(40, 265, 500, 30);
        lista2.setBounds(40, 200, 200, 30);

        exibir.setBounds(250, 300, 100, 30);

        exibir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rotulo.setText("O curso que você está é: " + lista1.getSelectedValue().toString());
                        rotulo2.setText("E sua Etec é a : " + lista2.getSelectedItem());
                        
                    }

                }
        );

        tela.add(texto);
        tela.add(lista2);
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        tela.add(rotulo2);

        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        ComboList app = new ComboList();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}
