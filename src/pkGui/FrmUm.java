package pkGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class FrmUm extends JFrame{
		private JPanel painel;
		private JTextField txtNum1;
		private JTextField txtNum2;
		private JTextField txtRes;
		private JLabel label1, label2;
		private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
		
		public FrmUm() {
			
			super("Andre Luis");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			painel= new JPanel();
			painel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(painel);
			painel.setLayout(null);
			
			
			txtNum1= new JTextField();
			txtNum1.setBounds(171, 26, 86, 20);
			painel.add(txtNum1);
			
			txtNum2= new JTextField();
			txtNum2.setBounds(171, 50, 86, 20);
			painel.add(txtNum2);
			
			txtRes= new JTextField();
			txtRes.setEditable(false);
			txtRes.setBounds(171, 77, 86, 20);
			painel.add(txtRes);
			
			label1= new JLabel();
			label1.setText("Numero 1");
			label1.setBounds(100, 29, 70, 14);
			painel.add(label1);
			
			label1= new JLabel();
			label1.setText("Numero 2");
			label1.setBounds(100, 50, 70, 14);
			painel.add(label1);
			/*
			label2= new JLabel();
			label2.setText("Resultado");
			label2.setBounds(103, 80, 80, 14);
			painel.add(label2);
			*/
			btnSomar= new JButton("Somar");
			
			btnSomar.setBounds(36, 227, 89, 23);
			painel.add(btnSomar);
			
			btnSubtrair= new JButton();
			btnSubtrair.setText("Subtrair");
			btnSubtrair.setBounds(154, 227, 89, 23);
			painel.add(btnSubtrair);
			
			
			btnMultiplicar= new JButton();
			btnMultiplicar.setText("Multiplicar");
			btnMultiplicar.setBounds(277, 227, 100, 23);
			painel.add(btnMultiplicar);
			
			
			btnDividir= new JButton();
			btnDividir.setText("Dividir");
			btnDividir.setBounds(400, 227, 100, 23);
			painel.add(btnDividir);
			

			super.setVisible(true);
			
			btnSomar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double n1= Double.parseDouble(txtNum1.getText());
					double n2= Double.parseDouble(txtNum2.getText());
					double soma= n1+n2;
					JOptionPane.showMessageDialog(null, soma);
					
					}
				});
			btnSubtrair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double n1= Double.parseDouble(txtNum1.getText());
					double n2= Double.parseDouble(txtNum2.getText());
					double soma= n1-n2;
					JOptionPane.showMessageDialog(null, soma);
					}
				});
			btnMultiplicar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double n1= Double.parseDouble(txtNum1.getText());
					double n2= Double.parseDouble(txtNum2.getText());
					double soma= n1*n2;
					JOptionPane.showMessageDialog(null, soma);
					}
				});
			
			btnDividir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double n1= Double.parseDouble(txtNum1.getText());
					double n2= Double.parseDouble(txtNum2.getText());
					double soma= n1/n2;
					JOptionPane.showMessageDialog(null, soma);
					}
				});
		}
		

}
