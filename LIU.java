import javax.swing.*;

public class LIU
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("��ӭ����JY3��");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
}