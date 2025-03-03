package com.example.ph56476_03032025;

public class TinhToan {

    public int tongSoChan(int start, int end) {
        if (start != 1) {
            throw new IllegalArgumentException("Số bắt đầu phải bắt đầu là 1");
        }

        if (end != 50) {
            throw new IllegalArgumentException("Số kết thúc phải là 50");
        }

        int tong = 0;
        for (int i = start; i <= end; i++) {
            if (i % 8 == 0 || i % 2 != 0) {
                continue;
            }
            tong += i;
        }

        return tong;
    }

}
