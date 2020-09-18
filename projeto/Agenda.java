package projeto;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Agenda extends calendar {
	public int qtdDiaMes;
	private int mes;
	private int select;
	private String grid;
	private int diaSelecionado;
	private String lista;
	private boolean onOff = true;
	
	public Agenda()
	{
		mes (Integer.parseInt(getM()));
	}
	public void mes (int _mes)
	{
		switch (_mes) {
		case 1:
			mes = 1;
			qtdDiaMes = 31;
			break;
		case 2:
			mes = 2;
			qtdDiaMes = 28;
			break;
		case 3:
			mes = 3;
			qtdDiaMes = 31;			
			break;
		case 4:
			mes = 4;
			qtdDiaMes = 30;	
			break;
		case 5:
			mes = 5;
			qtdDiaMes = 31;	
			break;
		case 6:	
			mes = 6;
			qtdDiaMes = 30;
			break;
		case 7:
			mes = 7;
			qtdDiaMes = 31;
			break;
		case 8:
			mes = 8;
			qtdDiaMes = 31;
			break;
		case 9:
			mes = 9;
			qtdDiaMes = 30;			
			break;
		case 10:
			mes = 10;
			qtdDiaMes = 31;	
			break;
		case 11:
			mes = 11;
			qtdDiaMes = 30;	
			break;
		case 12:
			mes = 12;
			qtdDiaMes = 31;
			break;
		}
	}
	public void desenharGridAgenda()
	{
		grid = getDMA() + "\n ------------------------------------\n MES ATUAL : " + mes + "\n"
				+ " ------------------------------------\n" ;
		for(int dia = 1; dia <= qtdDiaMes; dia ++ ) {
			if(dia == diaSelecionado) {
				grid = grid +"("+dia+")" + " ";
			}
			else
				grid = grid +"\t"+ dia + "\t  ";
			if( dia < 10 )
				grid = grid + "  ";
			if(dia % 7 == 0 && dia != 0)
				grid = grid + "\n";
		}
		grid = grid + "\n------------------------------------\n"
				+ "1 - Adicionar\n"
				+ "2 - Sair\n"
				+ "3 - Lista\n"
				+ "4 - Mudar Mes";
		
		//select = Integer.parseInt(JOptionPane.showInputDialog (null , grid));
		select = Integer.parseInt(JOptionPane.showInputDialog (null, grid));
	}
	public void setlista(String ListaDeAnotacoes, int d, int m)
	{
		this.lista = lista + d + " / " + m + " MSG : " + ListaDeAnotacoes + "\n";
	}
	public void selecionarOpcao()
	{
		//msg = new String[qtdDiaMes];
		int mesSelecionado;
		//ADD
		if(select == 1) {
			diaSelecionado = Integer.parseInt(JOptionPane.showInputDialog (null , "Informe o dia"));
			mesSelecionado = Integer.parseInt(JOptionPane.showInputDialog (null , "Informe o mes"));
			mes(mesSelecionado);
			setlista(JOptionPane.showInputDialog (null , "informe a mensagem : "), diaSelecionado, mesSelecionado);
			}
			if(select == 2) 
				onOff = false;
				
			if(select == 3) 
				JOptionPane.showMessageDialog(null, lista);
			
			if(select == 4) {
				mes(Integer.parseInt(JOptionPane.showInputDialog (null , "Informe qual m�s voc� quer mudar")));
			}
	}
	public boolean fecharAgenda()
	{
		return onOff;
	}
	
	
}