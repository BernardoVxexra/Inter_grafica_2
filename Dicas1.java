import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dicas1 extends JFrame {
    private JButton botao1, botao2, botao3,botaosair;
    private String nome, datanasc, sexo, email, Etecc, cursoo;

    //Titulo
    public Dicas1() {
        super("Cadastro");

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        //Add os botoes
        botao1 = new JButton("Cadastrar");
        botao2 = new JButton("Curso e Etec");
        botao3 = new JButton("Área do Aluno");
        botaosair = new JButton("Sair");
        botaosair.setBounds(100,120,100,20);

         //dialog em prompt
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                nome = JOptionPane.showInputDialog(Dicas1.this, "Digite seu nome:");
                if (nome == null || nome.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhum nome digitado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                datanasc = JOptionPane.showInputDialog(Dicas1.this, "Digite sua data de nascimento (dd/mm/yyyy):");
                if (datanasc == null || datanasc.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhuma data de nascimento digitada.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                sexo = JOptionPane.showInputDialog(Dicas1.this, "Digite seu sexo:");
                if (sexo == null || sexo.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhum sexo digitado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                email = JOptionPane.showInputDialog(Dicas1.this, "Digite seu email:");
                if (email == null || email.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhum email digitado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Etecc = JOptionPane.showInputDialog(Dicas1.this, "Digite a ETEC que deseja:");
                if (Etecc == null || Etecc.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhuma Etec escolhida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                cursoo = JOptionPane.showInputDialog(Dicas1.this, "Digite o curso que deseja:");
                if (cursoo == null || cursoo.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "Nenhum curso escolhido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                //Cadastro feito
                JOptionPane.showMessageDialog(Dicas1.this,
                        "Cadastro concluido com sucesso!\n" +
                        "Nome: " + nome + "\n" +
                        "Data de Nascimento: " + datanasc + "\n" +
                        "Sexo: " + sexo + "\n" +
                        "Email: " + email + "\n" +
                        "Etec que deseja: " + Etecc + "\n" +
                        "Curso que deseja: " + cursoo);

            }
        });
        //caso tente ser espertinho e clicar em area ou curso primeiro sera bloqueado
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nome == null || nome.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "você deve fazer o cadastro primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(Dicas1.this,
                        "Etec e Curso:\n" +
                        "Etec: " + Etecc + "\n" +
                        "Curso: " + cursoo,
                        "Curso e Etec Registrados",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
         //mesma coisa aqui, area do aluno todas as informações registradas
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nome == null || nome.isEmpty()) {
                    JOptionPane.showMessageDialog(Dicas1.this, "você deve fazer o cadastro primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(Dicas1.this,
                        "Area do aluno:\n" +
                        "Nome: " + nome + "\n" +
                        "Data de Nascimento: " + datanasc + "\n" +
                        "Sexo: " + sexo + "\n" +
                        "Email: " + email + "\n" +
                        "Etec que deseja: " + Etecc + "\n" +
                        "Curso que deseja: " + cursoo,
                        "Area do Aluno",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        //Mensagem de opção quer sair ou não?
        botaosair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int opcao;
                    opcao = JOptionPane.showConfirmDialog(null,"Deseja mesmo sair da pagina?",
                    "Fechar",JOptionPane.YES_NO_OPTION);
                    if(opcao ==JOptionPane.YES_OPTION)
                    System.exit(0);

                }
            }
        );

        container.add(botao1);
        container.add(botao2);
        container.add(botao3);
        container.add(botaosair);

        setVisible(true);
    }

    public static void main(String[] args) {
            Dicas1 app = new Dicas1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}//Fim do programa 
