# Juliet-Test-Suite

## Kiểm thử bằng Findbugs Java

Sau khi tạo project test mới, Findbugs sẽ phân tích mã nguồn (mất khoảng 5-7 phút). Kết quả báo ra các tệp còn thiếu như hình dưới.

![Missing Files](https://i.imgur.com/ZXOjTTs.png)

Findbugs phát hiện được 5329 bugs.

![Dashboard](https://i.imgur.com/EjCgvmL.png)

Một vài lỗi

![Bug](https://i.imgur.com/cpHADvZ.png)
![Bug](https://i.imgur.com/ersxkRe.png)

## Kiểm thử bằng CodeScene

[![](https://codescene.io/projects/5816/status.svg) Get more details at **codescene.io**.](https://codescene.io/projects/5816/jobs/latest-successful/results)

## So sánh Findbugs vs. CodeScene

|         | Findbugs     | CodeScene     |
| :------------- | :---------- | :----------- |
|  Thời gian | 3-5 phút   | 7 phút    |
| Độ chi tiết   | Liệt kê rõ ràng từng lỗi, phân chia cụ thể và cho biết chi tiết thông tin về lỗi | Dừng lại ở mức thông kê sơ bộ về mã nguồn |
| Số bugs phát hiện   | 5329 |   |
