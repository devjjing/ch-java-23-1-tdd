import org.example.FizzBuzz;

public class FizzBuzzTest {

    @Test
    void fizzbuzzTest_when1_thenReturn1() {

        //GIVEN
        int number = 1;

        //WHEN
        int actual = FizzBuzz.fizzBuzz(number)

        //THEN
        assertEquals(expected:1, actual);
    }

    @test
    void fizzbuzzTest_when2_thenReturn2() {

        //GIVEN
        int number = 2;

        //WHEN
        int actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(expected:2, actual);
    }

    @test
    void fizzbuzzTest_when3_thenReturnFizz() {

        //GIVEN
        int number = 3;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(expected:"Fizz", actual);
    }

    @test
    void fizzbuzzTest_when5_thenReturnFizz() {

        //GIVEN
        int number = 5;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(expected:"Buzz", actual);
    }

    @test
    void fizzbuzzTest_when15_thenReturnFizzBuzz() {

        //GIVEN
        int number = 15;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(expected:"Fizz Buzz", actual);
    }
}
