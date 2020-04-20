package controller;

import java.util.Vector;

import view.MainFrame;

public class SearchController implements Controller {

	@Override
	public void service() {
		
		String searchTitle = MainFrame.searchTitle;
		String word = searchText.getText();
		
		switch(searchTitle) {
		case "�ŷ�ó" :
			searchTitle = "customer";
			break;
		case "��ǰ����" :
			searchTitle = "product";
			break;
		case "����" :
			searchTitle = "salse";
			word = "����";
			break;
		case "����" :
			searchTitle = "salse";
			word = "����";
			break;
		}

		Vector<Vector> dataVector = dao.search(searchTitle, word);
		dm.setDataVector(dataVector, columnIdentifiers);

	}

}
