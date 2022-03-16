import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.javaqa.group2.chernykh2.Addition;

public class AdditionTest {

    @Test
    public void shouldCountLosersNought() {
        int[] speeds = {0, 0, 0};

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersOneNought() {
        int[] speeds = {0};

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersNothing() {
        int[] speeds = {};

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBigNumber() {
        int[] speeds = {1000000000, 0, 0};

        int actual = Addition.droppedOut(speeds);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBorder() {
        int[] speeds = {8, 8, 0};

        int actual = Addition.droppedOut(speeds);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBigNumbers() {
        int[] speeds = {999999999, 999999999, 999999999};

        int actual = Addition.droppedOut(speeds);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersManyPlayers() {
        int[] speeds = {0, 5, 1, 8, 0, 9, 2, 99, 999};

        int actual = Addition.droppedOut(speeds);

        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersOnePlayer() {
        int[] speeds = {8};

        int actual = Addition.droppedOut(speeds);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosers() {
        int[] speeds = {8, 9, 10};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {8, 9, 10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersNought() {
        int[] speeds = {0, 0, 0};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersOne() {
        int[] speeds = {0, 0, 1};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersOneNought() {
        int[] speeds = {0};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersNothing() {
        int[] speeds = {};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersManyPlayers() {
        int[] speeds = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {8, 9, 10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersAll() {
        int[] speeds = {0, 0, 0};

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0, 0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersNought() {
        int[] speeds = {7, 8, 9};

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersOneNought() {
        int[] speeds = {0};

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersNothing() {
        int[] speeds = {};

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersManyPlayers() {
        int[] speeds = {0, 1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 0, 9, 10};

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0, 1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeeds() {
        String[] numberLines = {"Romeo 8", "Julia 9", "Father 10"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeedsAllWinners() {
        String[] numberLines = {"Romeo 7", "Julia 7", "Father 6"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {"Romeo", "Julia", "Father"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeedsAllZero() {
        String[] numberLines = {"Romeo 0", "Julia 0", "Father 0"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {"Romeo", "Julia", "Father"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeedsNegativeNumbers() {
        String[] numberLines = {"Romeo -7", "Julia -1", "Father 1"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {"Romeo", "Julia", "Father"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeedsBigNumbers() {
        String[] numberLines = {"Romeo 77", "Julia 7777777", "Father 100000"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void splitSpeedsOneLetter() {
        String[] numberLines = {"R 7", "j 8", "Q 10"};

        String[] actual = Addition.survivors(numberLines);

        String[] expected = {"R"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
