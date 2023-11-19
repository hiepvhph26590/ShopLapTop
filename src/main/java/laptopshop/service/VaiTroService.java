package laptopshop.service;

import com.laptopshop.entities.VaiTro;

import java.util.List;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
