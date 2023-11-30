import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.print("Nhập số dòng của ma trận: ");
        rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int luachon;
        do {
            System.out.println("*********************MENU***********************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("Nhập giá trị cho các phần tử của mảng:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            arr[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử mảng theo ma trận:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Số lượng phần tử chia hết cho 2 và 3 trong mảng là: " + count);
                    break;
                case 4:
                    int sum = 0;
                    int n = arr.length;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - j - 1) {
                                System.out.println(arr[i][j]);
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ: " + sum);
                    break;
                case 5:
                    for (int j = 0; j < cols; j++) {
                        for (int i = 0; i < rows - 1; i++) {
                            int minIndex = i;
                            for (int k = i + 1; k < rows; k++) {
                                if (arr[k][j] < arr[minIndex][j]) {
                                    minIndex = k;
                                }
                            }
                            if (minIndex != i) {
                                int temp = arr[i][j];
                                arr[i][j] = arr[minIndex][j];
                                arr[minIndex][j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < cols; i++) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Các phần tử là số nguyên tố trong mảng:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            int currentNumber = arr[i][j];
                            boolean isPrime = true;

                            if (currentNumber < 2) {
                                isPrime = false;
                            } else {
                                for (int k = 2; k <= Math.sqrt(currentNumber); k++) {
                                    if (currentNumber % k == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại 1-9");
            }
        } while (luachon != 9);
    }
}

