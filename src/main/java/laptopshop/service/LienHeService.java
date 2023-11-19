package laptopshop.service;

import com.laptopshop.dto.SearchLienHeObject;
import com.laptopshop.entities.LienHe;
import org.springframework.data.domain.Page;

import java.text.ParseException;

public interface LienHeService {

	Page<LienHe> getLienHeByFilter(SearchLienHeObject object, int page) throws ParseException;

	LienHe findById(long id);
	
	LienHe save(LienHe lh);
	
	int countByTrangThai(String trangThai);

}
