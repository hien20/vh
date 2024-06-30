1.	Môi trường cài đặt
•	Hệ điều hành Android 6.0
•	Min sdk 23
•	Android studio
•	XAMPP
2. Công nghệ sử dụng
•	Ngôn ngữ Java
•	PHP kết nối server
•	Cơ sở dữ liệu MySQL

2.1 Màn hình chủ
    ![image](https://github.com/hien20/vh/assets/85773590/2b9e4c73-1948-4c55-9670-2b977dc63a3d)


                                     Hình 2.1 Giao diện màn hình chủ
	Ở đầu màn hình chủ ứng dụng là slider hiển thị thông tin các ưu đãi mà ứng dụng đang có, ở kế bên dưới là danh sách “Món ngon mỗi ngày” hiển thị 10 món ăn ngẫu nhiên, mỗi lần mở lại màn hình chủ sẽ load lên ngẫu nhiên 10 món khác nhau khác. Khách hàng có thể ấn vào một món bất kỳ ở màn hình chủ để vào thẳng màn hình chi tiết của món đó.
	Ở góc trái trên là thanh menu để mở ra các tùy chọn của ứng dụng bao gồm: xem danh mục, xem giới thiệu chung và xem thông tin liên hệ đến cửa hàng.







2.2 Màn hình danh mục và màn hình sản phẩm
	Khi chọn phần danh mục thì ứng dụng sẽ hiển thị ra cho khách hàng danh sách cách danh mục hiện có của cửa hàng. Khi chọn vào một danh mục cụ thể thị sẽ hiển thị ra danh sách các món ăn thuộc danh mục đó.

          

 ![image](https://github.com/hien20/vh/assets/85773590/f3020bd7-687a-460a-a930-7dced351e36e)
	   ![image](https://github.com/hien20/vh/assets/85773590/bb7bc0bb-1516-4919-bacc-a167578048c7)
                Hình 2.2 Giao diện màn hình danh mục và màn hình sản phẩm

2.3 Màn hình chi tiết sản phẩm	
	Khi khách hàng chọn một sản phẩm bất kì sẽ chuyển màn hình chi tiết xem thông tin chi tiết của món và bắt đầu chọn món theo số lượng cụ thể. Khi thêm thành công một món thì trên giỏ hàng nhỏ sẽ cập nhật lại tất cả số lượng món đã chọn.
 ![image](https://github.com/hien20/vh/assets/85773590/f55b3387-3b30-4327-bad6-a9046bf3d261)

Hình 2.3 Giao diện màn hình chi tiết sản phẩm


2.4 Màn hình giỏ hàng
	Sau khi đã chọn xong các món theo nhu cầu, khách hàng nhận vào biếu tượng giỏ hàng nhỏ để chuyển sang màn hình giỏ hàng, ở đây sẽ hiển thị thông tin cụ thể từng món bao gồm, giá, số lượng, thành tiền của mỗi món đã chọn và hơn thể nữa là tổng tiền của cả đơn hàng. Bên cạnh đó còn có thể thấy, số lượng tối đa của mỗi sản phẩm là 200, khách hàng có thể thêm bớt số lượng theo ý trong khoảng từ 1-200. Nếu khách hàng không thích mua một món nào đó thì có thể nhấn biểu tượng dấu “x” ở góc dưới của mỗi sản phẩm sẽ hiện lên thông báo rằng có muốn xóa hay không. Nhấn đồng ý thì món đó kèm theo số lượng món sẽ bị xóa khỏi giỏ hàng. 
	Khi khách hàng chỉnh sửa hoặc xóa sản phẩm thì đồng thời số lượng sản phẩm hiển thị trên thanh toolbar cũng như tổng tiền hóa đơn sẽ được cập nhật theo.
       ![image](https://github.com/hien20/vh/assets/85773590/c7e277b7-54d2-493a-8005-20e3f18b6167)

              Hình 2.4 Giao diện màn hình giỏ hàng và các thao tác với giỏ hàng
Nếu xóa hết tất cả các món thì màn hình giỏ hàng sẽ trở về trạng thái mặc định là trống. Nếu giỏ hàng trống thì sẽ hiên nút “Chọn món” và nếu đã có mốn rồi thì sẽ hiện nút  “Tiếp tục chọn món” để quay về màn hình Danh mục và khách hàng tiếp tục chọn các món ưa thích.
            	![image](https://github.com/hien20/vh/assets/85773590/041bd3ce-e11d-47ce-94ab-0ebf51ef5fa4)

                                              Hình 2.5 Xóa trống giỏ hàng


 
2.5 Màn hình thanh toán
	Khi giỏ hàng trống, khách hàng bấm thanh toán sẽ hiển thị thông báo yêu cầu khách hàng chọn món trước khi thanh toán. Khi khách hàng quay lại chọn món, ấn thanh toán một lần nữa sẽ chuyển sang màn hình thanh toán để khách hàng nhập thông tin thanh toán.
       ![image](https://github.com/hien20/vh/assets/85773590/f70ec0b3-bda0-43a8-bee9-9c96b3df8651)

                                        Hình 2.6 Yêu cầu chọn món trước khi thanh toán

	
 
Ở màn hình thanh toán, khi khách hàng chưa nhập thông tin mà nhấn thanh toán thì sẽ báo lỗi yêu cầu khách hàng nhập đầy đủ thông tin theo từng trường cụ thể. Bên cạnh đó nếu email nhập không đúng định dạng hoặc số điện thoại vượt quá 10 số thì cũng sẽ báo lỗi cho khách hàng biết.
      ![image](https://github.com/hien20/vh/assets/85773590/aa342014-1622-46a8-a426-c8983e1c6f0c)
![image](https://github.com/hien20/vh/assets/85773590/b9323be0-9b83-481f-8862-630648afc7ca)

                       Hình 2.7 Giao diện màn hình thanh toán và báo lỗi nhập liệu



2.6 Màn hình thông báo
	Sau khi đã nhập đầy đủ thông tin và hợp lệ, khách hàng nhấn thanh toán, nếu thành công thì sẽ chuyển sang màn hình thông báo thành công và hiển thị lại các thông tin thanh toán của khách hàng kèm theo đó là tổng tiền của hóa đơn mà khách hàng phải trả.

      
![image](https://github.com/hien20/vh/assets/85773590/6a9f06d9-b3b1-42d9-be7f-43f62c5abb67)
![image](https://github.com/hien20/vh/assets/85773590/1c00ce96-0a1f-41ea-95a6-e6151459c46a)


                         Hình 2.8 Màn hình thông báo thanh toán thành công





Và sau đó thông tin thanh toán của khách hàng, bào gồm thông tin giao nhận và thông tin chi tiết từng món khách hàng đã đặt (số lượng, giá tiền, tồng tiền , …) sẽ hiển thị bên CSDL
![image](https://github.com/hien20/vh/assets/85773590/4f1605b6-7a16-43a7-9485-9211e012dedd)

 
Hình 2. 9 Cơ sở dữ liệu sau khi thanh toán thành công
2.7 Màn hình giới thiệu chung
	Ở màn hình này sẽ hiển thị tên cửa hàng, hình ảnh của cửa hàng, kèm theo đó là địa chỉ của cửa hàng. Khi cần liên hệ với người bên cửa hàng thì khách hàng có thể nhấn vào nút “Liên hệ” để chuyển sang màn hình thông tin liên hệ.
                                              ![image](https://github.com/hien20/vh/assets/85773590/2a1eaef4-0ca0-4e23-8615-ebb59127d5b6)

                                          Hình 2.10 Màn hình giới thiệu chung
2.8 Màn hình liên hệ
	Ở màn hình liên hệ, mặc định sẽ hiển thị thông tin tên nhà hàng, kèm theo số điện thoại. Khi nhấn biểu tượng điện thoại sẽ chuyển sang màn hình quay số của điện thoại kèm theo số điện thoại nhà hàng để khách hàng có thể gọi khi cần.
 ![image](https://github.com/hien20/vh/assets/85773590/8d2c2bf6-d3f3-4e03-96cd-42200b55b9bf)


                         Hình 2.11 Màn hình liên hệ (Gọi điện)




	Ngoài ra khi nhấn vào biểu tượng tin nhắn thì sẽ hiển thị bảng đóng góp ý kiến để khách hàng có thể gửi lời ý kiến hoặc đóng góp cải thiện cho phía nhà hàng. Cũng tương tự thanh toán, nếu khách hàng chưa nhập nhì mà nhấn gửi thì sẽ báo lỗi yêu cầu khách hàng nhập vào gì đó trước khi gửi.
    

 ![image](https://github.com/hien20/vh/assets/85773590/7c9a16ee-00fb-41a9-ba07-9e1d12fc43f6)
                              Hình 2.12 Mành hình liên hệ (Lời nhắn gửi)


	Khi khách hàng đã nhập lời góp ý, nhấn gửi sẽ thông báo thành công và bên phía nhà hàng đã nhận được lời nhắn từ phía khách hàng.
                                            


