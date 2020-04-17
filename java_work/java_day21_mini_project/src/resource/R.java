package resource;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.DeleteController;
import controller.InsertController;
import controller.ListController;
import controller.SearchController;
import controller.UpdateController;
import model.DAO;

public interface R {
	DefaultTableModel dm = new DefaultTableModel(0,4);
	Vector<String> columnIdentifiers = new Vector<>();
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	JLabel noLabel = new JLabel("No : ");
	
	ListController listController = new ListController();
	InsertController insertController = new InsertController();
	SearchController searchController = new SearchController();
	UpdateController updateController = new UpdateController();
	DeleteController deleteController = new DeleteController();
	
	DAO dao = new DAO();
}
