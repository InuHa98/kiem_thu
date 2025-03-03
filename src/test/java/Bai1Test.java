import com.example.ph56476_03032025.TinhToan;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Bai1Test {

    private final TinhToan service = new TinhToan();

    @Test
    public void thanhCong() {
        Assert.assertEquals(482, service.tongSoChan(1, 50));
    }

    @Test
    public void soBatDauNhoHon1() {
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.tongSoChan(0, 50);
        });
        Assert.assertEquals("Số bắt đầu phải bắt đầu là 1", e.getMessage());
    }

    @Test
    public void soBatDauLonHon1() {
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.tongSoChan(2, 50);
        });
        Assert.assertEquals("Số bắt đầu phải bắt đầu là 1", e.getMessage());
    }

    @Test
    public void soKetThucNhoHon50() {
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.tongSoChan(1, 49);
        });
        Assert.assertEquals("Số kết thúc phải là 50", e.getMessage());
    }

    @Test
    public void soKetThucLonHon50() {
        Exception e = Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.tongSoChan(1, 51);
        });
        Assert.assertEquals("Số kết thúc phải là 50", e.getMessage());
    }

    @Test
    public void ketQuaSai() {
        Assert.assertNotEquals(100, service.tongSoChan(1, 50));
    }

}
