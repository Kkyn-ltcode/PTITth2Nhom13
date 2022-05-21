# PTITth2Nhom13
Nhóm 13: 
- Thành viên nhóm: 
  + Hoàng Công Tú - B19DCCN598
  + Lưu Trọng Nguyên - B19DCCN477
  + Trần Khắc Phong - B19DCCN502
  
- Mô tả cách làm
  + Hoàng Công Tú: module Add Product
      + Sử dụng Controller AddForm để hiện thị form thêm mới Product
      + Sử dụng ModelAttribute để lấy dữ liệu của form thêm mới Product
      + Tạo mới 1 Class Product 
      + Sử dụng Repository extend JpaRepository để thêm mới Product dựa theo phương thức save()
      + Quay trạng lại trang displayProduct để xem thông tin

  + Lưu Trọng Nguyên: module Delete Product
      + Sử dụng Controller UpdateForm để hiện thị form cập nhất Product
      + Sử dụng ModelAttribute để lấy dữ liệu của form cập nhất Product
      + Lấy Product dựa theo id mà ModelAttribute gửi về dựa theo phương thức FindById của JpaRepository
      + Sử dụng Repository extend JpaRepository để cập nhật Product dựa theo phương thức save()
      + Quay trạng lại trang displayProduct để xem thông tin

  + Trần Khắc Phong: module Edit Product 
      + Sử dụng Controller DeleteForm để hiện thị form xóa Product
      + Sử dụng PathVariable để lấy code của Product cần xóa
      + Sử dụng Repository extend JpaRepository để xóa Product dựa theo phương thức deleteById() 
      + Quay trạng lại trang displayProduct để xem thông tin
      
