import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by nsieverska on 15.08.15.
 */
public class PhoneBookFrame extends JFrame {

	String[] tableColumn = {
			"Name",
			"Phone Number"
	};

	String[][] data= {
		{"Cat", "01"},
			{"Dog", "02"}
	};

	JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
	JTable table = new JTable(data, tableColumn);
	JButton addButton = new JButton("Add");
	JButton deleteButton = new JButton("Delete");
	JButton editButton = new JButton("Edit");
	JScrollPane scrollPane = new JScrollPane(table);

	PhoneBookFrame() {
		setTitle("Phone Book");
		setBounds(300, 300, 500, 300);
		setLayout(new BorderLayout());

		buttonPanel.add(addButton);
		buttonPanel.add(deleteButton);
		buttonPanel.add(editButton);
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.SOUTH);
		pack();

		setVisible(true);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				AddPhoneNumberFrame addPhoneNumberFrame = new AddPhoneNumberFrame();
			}
		});

		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				DeletePhoneNumber deletePhoneNumber = new DeletePhoneNumber();
			}
		});

		editButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				EditPhoneNumber editPhoneNumber = new EditPhoneNumber();
			}
		});


	}
}
