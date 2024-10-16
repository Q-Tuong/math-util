package com.poetdavinci.mathutil.main;

import static com.poetdavinci.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      //testFactorialGivenRightArgument5RunsWell();
        testFactorialGivenWrongArgumentMinus5ThrowException();
    }

    // TEST CASE #4:
    // Description: Test factorial with invalid argument, e.g n = -5
    // Steps:
    //          Call getFatorial(-5)
    // Expected result:
    //                  An exception is thrown: Kì vọng 1 ngoại lệ XH

    // Diễn giải thêm: Hàm của ta thiết kế rõ ràng nếu đưa n âm -> Hàm sẽ chửi
    // Vậy nếu ta test n âm, ta sẽ nhận về chửi -> Hàm ta chạy đúng như thiết kế
    // Thấy ngoại lệ mừng rơi nước mắt

    static void testFactorialGivenWrongArgumentMinus5ThrowException() {
        getFactorial(-5);
    }

    // VỀ LÝ THUYẾT LÀ PHẢI TEST VỚI DATA = 2, 3, ..., 20

    // TEST CASE #3: TỰ VIẾT NỐT
    static void testFactorialGivenRightArgument5RunsWell() {
        int n = 5;
        long actual = getFactorial(n);
        System.out.println("5! expected = 120"
                + "\nactualValue = " + actual);
    }

    // TEST CASE #2
    // Description: check getFatorial() method with valid argument (n = 1)

    // Steps/Procedures: (cách test, các bước verify hàm, chức năng)
    //              Call function/ method with n = 1    getFatorial(1)

    // Expected result: (hy vọng gọi 1! giá trị trả về là mấy
    //              to have 1 as the result of 1!

    // Status (passed/failed bug): mình phải run hàm và nhn giá trị trả
    //                             về mới biết hàm chạy đúng hay sai
    // CHẠY TEST CASE/ LÀM CÁC BƯỚC Ở TRÊN ĐỂ XÁC ĐỊNH DC HÀM ĐÚNG SAI
    // => GỌI LÀ TEST RUN

    static void testFactorialGivenRightArgument1RunsWell(){
        int n = 1;
        long expectedValue = 1; // hy vọng 1! = 1
        long actualValue = getFactorial(n);
        // SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        System.out.println("1! expected = " + expectedValue
                            + "\nactualValue = " + actualValue);
    }

    // CÁC TEST CASES ĐỂ DƯỚI ĐÂY, LÁT HỒI RUN TRONG MAIN()
    static void testFactorialGivenRightArgument0RunsWell(){
        // TEST CASE #1:
        // Description: Check getFactorial() function with valid argument (n = 0)
        // Steps:
        //          Call function/method with n = 0 getFactorial(0)
        // Expected result:
        //        Get 1 as the result of 0!
        // Actual result/Status (passed, failed) (waiting for test run)
        //

        // Test run: run cái test case
        long expectedResult = 1;
        long actualResult = getFactorial(0); // named-argument
        System.out.println("expected value: " + expectedResult
                        + " | actual value: " + actualResult);

    }
}