package become_a_farmer_field;

import javax.swing.JOptionPane;

public class RadishGrowthOfField3 extends Thread{
	
	static int radishAmount = 0; //��Ȯ������ �� ����
	
	@Override
	public void run(){
		//System.out.println("�� �ɱ� 2�� ����(�� ���� ������ ������) ���Ѽ��ð� : "+Field_3.seedsSelectCount);
		Radish.seedsAmount--;
		System.out.println("�� ���Ѱ���: "+Radish.seedsAmount);
		
		try {
				Thread.sleep(7000);
				radishAmount++;
				System.out.println("��谡���� �� ����"+radishAmount);
				
	        	if(radishAmount == 1) {
	        		Field_3.fieldState++;
	        		System.out.println("�Ĺ��� �ɾ �ʵ� �� ���׷��̵� "+Field_3.fieldState);
	        		JOptionPane.showMessageDialog(null,"��� ������ ���۹��� �־��!", "SYSTEM", JOptionPane.INFORMATION_MESSAGE);
	        	}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}