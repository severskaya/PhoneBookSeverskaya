import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nsieverska on 15.08.15.
 */
public class AddPhoneNumberFrame extends JFrame {

	JPanel buttonPanel = new JPanel();
	JPanel textFieldPanel = new JPanel();

	JTextField name = new JTextField();
	JTextField phone = new JTextField();
	JButton addButton = new JButton("Add");
	JButton cancelButton = new JButton("Cancel");

	AddPhoneNumberFrame() {

		setTitle("Add new contact");
		setBounds(300, 300, 500, 300);
		setLayout(new BorderLayout());
		buttonPanel.setLayout(new GridLayout());
		textFieldPanel.setLayout(new GridLayout());

		textFieldPanel.add(name, BorderLayout.NORTH);
		textFieldPanel.add(phone, BorderLayout.SOUTH);
		buttonPanel.add(addButton);
		buttonPanel.add(cancelButton);

		add(buttonPanel, BorderLayout.SOUTH);
		add(textFieldPanel, BorderLayout.NORTH);

		pack();
		setVisible(true);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Writer writer = new Writer();
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				setVisible(false);
				dispose();
			}
		});
	}
}
