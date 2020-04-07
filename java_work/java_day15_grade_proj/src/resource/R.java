package resource;

import java.util.Scanner;

import model.DAO;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Rank;
import view.Search;
import view.View;

public interface R {
	
	String appTitle = ":::::::::: �������� ���α׷� ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = ":::::::::: �Է� ��� ::::::::::";
	String outputTitle = ":::::::::: ��� ��� ::::::::::";
	String rankTitle = ":::::::::: ��� ���� ::::::::::";
	String searchTitle = ":::::::::: �˻� ��� ::::::::::";
	String modifyTitle = ":::::::::: ���� ��� ::::::::::";
	String deleteTitle = ":::::::::: ���� ��� ::::::::::";
	
	String[] menuArr = {"","�Է�","���","��� ����","�˻�","����","����","����"};
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Rank(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
	
	
}