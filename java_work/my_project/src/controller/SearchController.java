package controller;

import java.util.Vector;

import view.MainFrame;

public class SearchController implements Controller {

	@Override
	public void service() {
		
		String searchTitle = MainFrame.searchTitle;
		String word = searchText.getText();
		
		switch(searchTitle) {
		case "거래처" :
			searchTitle = "customer";
			break;
		case "제품정보" :
			searchTitle = "product";
			break;
		case "매출" :
			searchTitle = "salse";
			word = "매출";
			break;
		case "매입" :
			searchTitle = "salse";
			word = "매입";
			break;
		}

		Vector<Vector> dataVector = dao.search(searchTitle, word);
		dm.setDataVector(dataVector, columnIdentifiers);

	}

}
