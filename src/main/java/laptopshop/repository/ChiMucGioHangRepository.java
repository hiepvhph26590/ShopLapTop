package laptopshop.repository;

import com.laptopshop.entities.ChiMucGioHang;
import com.laptopshop.entities.GioHang;
import com.laptopshop.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long>{
	
	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	List<ChiMucGioHang> findByGioHang(GioHang g);
}
