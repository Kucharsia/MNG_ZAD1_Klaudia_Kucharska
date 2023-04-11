import static org.junit.Assert.*;

import org.junit.Test;
public class WATEmailParserTest {
    @Test
    public void testGetImie() {
        WATEmailParser parser1 = new WATEmailParser("jan.kowalski@wat.pl");
        assertEquals("jan", parser1.getImie());

        WATEmailParser parser2 = new WATEmailParser("adam.nowak@student.wat.pl");
        assertEquals("adam", parser2.getImie());

        WATEmailParser parser3 = new WATEmailParser("anna.malysz@pw.edu.pl");
        assertEquals("anna", parser3.getImie());
    }

    @Test
    public void testGetNazwisko() {
        WATEmailParser parser1 = new WATEmailParser("jan.kowalski@wat.pl");
        assertEquals("kowalski", parser1.getNazwisko());

        WATEmailParser parser2 = new WATEmailParser("adam.nowak@student.wat.pl");
        assertEquals("nowak", parser2.getNazwisko());

        WATEmailParser parser3 = new WATEmailParser("anna.malysz@pw.edu.pl");
        assertEquals("malysz", parser3.getNazwisko());
    }

    @Test
    public void testCzyStudent() {
        WATEmailParser parser1 = new WATEmailParser("jan.kowalski@wat.pl");
        assertFalse(parser1.czyStudent());

        WATEmailParser parser2 = new WATEmailParser("adam.nowak@student.wat.edu.pl");
        assertTrue(parser2.czyStudent());

        WATEmailParser parser3 = new WATEmailParser("anna.malysz@pw.edu.pl");
        assertFalse(parser3.czyStudent());
    }

    @Test
    public void testCzyMezczyzna() {
        WATEmailParser parser1 = new WATEmailParser("jan.kowalski@wat.pl");
        assertTrue(parser1.czyMezczyzna());

        WATEmailParser parser2 = new WATEmailParser("adam.nowak@student.wat.pl");
        assertTrue(parser2.czyMezczyzna());

        WATEmailParser parser3 = new WATEmailParser("anna.malysz@pw.edu.pl");
        assertFalse(parser3.czyMezczyzna());

        WATEmailParser parser4 = new WATEmailParser("magdalena.kowalczyk@wat.pl");
        assertFalse(parser4.czyMezczyzna());

        WATEmailParser parser5 = new WATEmailParser("janusz.malinowski@wat.pl");
        assertTrue(parser5.czyMezczyzna());

        WATEmailParser parser6 = new WATEmailParser("beata.nowicka@stud.wat.pl");
        assertFalse(parser6.czyMezczyzna());

        WATEmailParser parser7 = new WATEmailParser("tomasz.adamczyk@wat.pl");
        assertTrue(parser7.czyMezczyzna());

        WATEmailParser parser8 = new WATEmailParser("joanna.majewska@stud.wat.pl");
        assertFalse(parser8.czyMezczyzna());

        WATEmailParser parser9 = new WATEmailParser("katarzyna.kwiatkowska@pw.edu.pl");
        assertFalse(parser9.czyMezczyzna());

        WATEmailParser parser10 = new WATEmailParser("jacek.wozniak@student.wat.pl");
        assertTrue(parser10.czyMezczyzna());
    }
}
