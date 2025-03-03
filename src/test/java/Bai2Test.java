import com.example.ph56476_03032025.NhanVienService;
import com.example.ph56476_03032025.model.NhanVien;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Bai2Test {

    private NhanVienService service;

    @BeforeEach
    public void setup() {
        service = new NhanVienService();
    }

    @Test
    public void thanhCong() {
        NhanVien o = new NhanVien("nv01", "Nhân viên A", 18, 250000, 1, "Phòng ban 01");
        service.update(o);
        Assert.assertEquals("Nhân viên A", service.get("nv01").getTen());
    }

    @Test
    public void maNvNull() {
        NhanVien o = new NhanVien(null, "Nhân viên A", 18, 250000, 1, "Phòng ban 01");
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Mã nhân viên không được bỏ trống", e.getMessage());
    }

    @Test
    public void maNvKhongTonTai() {
        NhanVien o = new NhanVien("nv555", "Nhân viên A", 18, 250000, 1, "Phòng ban 01");
        Exception e = Assert.assertThrows(NullPointerException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Không tìm thấy nhân viên", e.getMessage());
    }

    @Test
    public void tenBoTrong() {
        NhanVien o = new NhanVien("nv01", null, 18, 250000, 1, "Phòng ban 01");
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Tên nhân viên không được bỏ trống", e.getMessage());
    }

    @Test
    public void tuoiKhongHopLe() {
        NhanVien o = new NhanVien("nv01", "AAAAAAA", 0, 250000, 1, "Phòng ban 01");
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Tuổi không hợp lệ", e.getMessage());
    }

    @Test
    public void luongKhongHopLe() {
        NhanVien o = new NhanVien("nv01", "AAAAAAA", 18, -150000, 1, "Phòng ban 01");
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Lương không hợp lệ", e.getMessage());
    }

    @Test
    public void soNamLamViecKhongHopLe() {
        NhanVien o = new NhanVien("nv01", "AAAAAAA", 18, 150000, -50, "Phòng ban 01");
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Số năm làm việc không hợp lệ", e.getMessage());
    }

    @Test
    public void phongBanKhongHopLe() {
        NhanVien o = new NhanVien("nv01", "AAAAAAA", 18, 150000, 50, null);
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.update(o);
        });
        Assert.assertEquals("Phòng ban không được bỏ trống", e.getMessage());
    }

}
