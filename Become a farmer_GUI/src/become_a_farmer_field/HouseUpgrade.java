package become_a_farmer_field;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HouseUpgrade extends Thread {
	
	int WoodHouse_price = 3000;
	int firstFloorHouse_price = 5000;
	int secondFloorHouse_price = 7000;
	
	JLabel moneylabel = new JLabel();

	public HouseUpgrade(JLabel moneylabel) {
		this.moneylabel = moneylabel;
	}

	public void run() {
		
		if(House.houseGrade == 0 && FarmGame.money >= WoodHouse_price) {
			FarmGame.money = FarmGame.money - WoodHouse_price;
			moneylabel.setText("        G: " + FarmGame.money);
			House.houseGrade++;		
			//FarmGame.hp = FarmGame.hp - 30;
			//System.out.println("1�������� ���׷��̵�");
			//System.out.println(WoodHouse_price+"�� ����");
			//System.out.println("���� ��: "+FarmGame.money+" ���: "+House.houseGrade);
		}
		
		else if(House.houseGrade == 1 && FarmGame.money >= firstFloorHouse_price) {
			FarmGame.money = FarmGame.money - firstFloorHouse_price;
			moneylabel.setText("        G: " + FarmGame.money);
			House.houseGrade++;
			System.out.println("2�������� ���׷��̵�");
			//System.out.println(firstFloorHouse_price+"�� ����");
			System.out.println("���� ��: "+FarmGame.money+" ���: "+House.houseGrade);	
		}
		
		else if(House.houseGrade == 2 && FarmGame.money >= secondFloorHouse_price) {
			FarmGame.money = FarmGame.money - secondFloorHouse_price;
			moneylabel.setText("        G: " + FarmGame.money);
			House.houseGrade++;
			System.out.println("3�������� ���׷��̵�");
			//System.out.println(secondFloorHouse_price+"�� ����");
			System.out.println("���� ��: "+FarmGame.money+" ���: "+House.houseGrade);
		}
		
		else if(House.houseGrade == 3){
			JOptionPane.showMessageDialog(null,"��� �� ���׷��̵尡 �Ϸ�Ǿ� ���̻� �� �� �����ϴ�.!", "SYSTEM", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"�� ���׷��̵带 �� �� �����ϴ�.", "SYSTEM", JOptionPane.ERROR_MESSAGE);
		}
	}
}