package laptopshop.service;

import com.laptopshop.entities.DanhMuc;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DanhMucService {

	Page<DanhMuc> getAllDanhMucForPageable(int page, int size);

	List<DanhMuc> getAllDanhMuc();

	DanhMuc getDanhMucById(long id);

	DanhMuc save(DanhMuc d);

	DanhMuc update(DanhMuc d);

	void deleteById(long id);
}
