package resource;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.DeleteController;
import controller.InputController;
import controller.ListController;
import controller.LoginController;
import controller.SearchController;
import controller.SignupController;
import controller.UpdateController;
import model.DAO;

public interface R {
	DefaultTableModel dm = new DefaultTableModel(0,9);
	Vector<String> columnIdentifiers = new Vector<>();
	
	// 로그인
	JTextField idField = new JTextField(15);
	JTextField pwField = new JPasswordField(15);
	
	// 회원가입
	JTextField idtxt = new JTextField(12);
	JTextField pwtxt = new JPasswordField(20);
	JTextField nametxt = new JTextField(19);
	JTextField emailtxt = new JTextField(18);
	JTextField birthtxt = new JTextField(11);
	JTextField codetxt = new JTextField(8);
	
	// 메인 입력
	JLabel numLable = new JLabel();
	JTextField datetxt = new JTextField(10);
	JTextField customertxt = new JTextField(10);
	JTextField producttxt = new JTextField(10);
	JTextField qauntitytxt = new JTextField(10);
	JTextField pricetxt = new JTextField(10);
	
	// 찾기
	JTextField searchText = new JTextField(10);
	
	// 컨트롤러
	LoginController loginContorller = new LoginController();
	SignupController signupController = new SignupController();
	ListController listController = new ListController();
	InputController inputController = new InputController();
	DeleteController deleteController = new DeleteController();
	UpdateController updateController = new UpdateController();
	SearchController searchController = new SearchController();
	
	
	DAO dao = new DAO();

}
