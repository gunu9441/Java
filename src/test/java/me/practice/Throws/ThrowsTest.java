package me.practice.Throws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowsTest {
    @Test
    @DisplayName("Checking Fool")
    void Is_Nick_fool(){
        Throws thrw = new Throws();
        FoolException foolException = assertThrows(FoolException.class,()->thrw.sayNick("fool"));
        System.out.println(foolException);
        assertEquals("FoolException!!",foolException.getMessage());
    }
}