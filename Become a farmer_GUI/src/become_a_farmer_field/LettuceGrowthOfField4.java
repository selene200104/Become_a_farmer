package become_a_farmer_field;

import javax.swing.JOptionPane;

public class LettuceGrowthOfField4 extends Thread{
	
	static int lettuceAmount = 0; //��Ȯ������ ���� ����
	
	@Override
	public void run(){
		//System.out.println("���߽ɱ� 2�� ����(���� ���� ������ ������) ���Ѽ��ð� : "+Field_4.seedsSelectCount);
		Lettuce.seedsAmount--;
		System.out.println("���߾��Ѱ���: "+Lettuce.seedsAmount);
		
		try {
				Thread.sleep(3000);
				lettuceAmount++;
				System.out.println("��谡���� ���߰���"+lettuceAmount);
				
	        	if(lettuceAmount == 1) {
	        		Field_4.fieldState++;
	        		System.out.println("�Ĺ��� �ɾ �ʵ� �� ���׷��̵� "+Field_4.fieldState);
	        		JOptionPane.showMessageDialog(null,"��� ������ ���۹��� �־��!", "SYSTEM", JOptionPane.INFORMATION_MESSAGE);
	        	}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}