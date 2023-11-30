import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int n = 0;
        int luachon;
        do {
            System.out.println("******************* MENU ************************");
            System.out.println("1. Nhập giá trị n phần tử của mảng n nhập từ bàn phím");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần, các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.println("Nhập lựa chọn: ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("Nhập số lượng phần tử của mảng:");
                    n = sc.nextInt();
                    System.out.println("Nhập giá trị cho từng phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ":");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị của các phần tử trong mảng:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Phần tử thứ " + (i + 1) + ": " + arr[i]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        double average = (double) sum / count;
                        System.out.println("Trung bình các phần tử dương trong mảng: " + average);
                    } else {
                        System.out.println("Không có phần tử dương nào trong mảng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập giá trị k cần tìm: ");
                    int k = sc.nextInt();
                    System.out.print("Vị trí (chỉ số) của phần tử có giá trị " + k + " trong mảng: ");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy giá trị " + k + " trong mảng.");
                    } else {
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.print("Mảng sau khi sắp xếp giảm dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 6:
                    int count2 = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;

                        if (arr[i] < 2) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            count2++;
                        }
                    }
                    System.out.println("Số lượng phần tử là số nguyên tố trong mảng là: " + count2);
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại 1-9 ");
            }
        } while (luachon != 9);
    }
}


