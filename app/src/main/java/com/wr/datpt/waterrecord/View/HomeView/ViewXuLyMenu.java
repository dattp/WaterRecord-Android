package com.wr.datpt.waterrecord.View.HomeView;

import com.wr.datpt.waterrecord.Model.ObjectClass.Area;
import com.wr.datpt.waterrecord.Model.ObjectClass.Customer;

import java.util.List;

/**
 * Created by DatPT on 11/02/2018.
 */

public interface ViewXuLyMenu {
    void HientThiDanhSachMenu(List<Area> areaList);
    void HienThiDanhSachKhachHangKhuVuc(List<Customer> customerList);
}
