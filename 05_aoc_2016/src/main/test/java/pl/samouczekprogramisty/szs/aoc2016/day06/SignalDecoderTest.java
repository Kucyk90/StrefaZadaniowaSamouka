package pl.samouczekprogramisty.szs.aoc2016.day06;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SignalDecoderTest {
    private static List<String> input;

    @BeforeClass
    public static void setUpClass() {
        input = Arrays.asList(
                "eedadn", "drvtee", "eandsr", "raavrd",
                "atevrs", "tsrnev", "sdttsa", "rasrtv",
                "nssdts", "ntnada", "svetve", "tesnvt",
                "vntsnd", "vrdear", "dvrsen", "enarar"
        );
    }

    @Test
    public void shouldDecodeSignal() {
        SignalDecoder decoder = new SignalDecoder(input);
        assertEquals("easter", decoder.getMostCommonSignal());
        assertEquals("advent", decoder.getLeastCommonSignal());
    }
}