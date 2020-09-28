package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;
    private final ArrayList<Fraction> fractionList = new ArrayList<>();

    @BeforeEach
    void before() {
        fractionList.add(new Fraction(1, 2));
        fractionList.add(new Fraction(2, 3));
        fractionList.add(new Fraction(1, 1));
        user = new User("1", "Belen", "Garcia", fractionList);
    }

    @Test
    void testUserId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testUserName() {
        assertEquals("Belen", user.getName());
    }

    @Test
    void testUserSetName() {
        user.setName("Javier");
        assertEquals("Javier", user.getName());
    }

    @Test
    void testUserFamilyName() {
        assertEquals("Garcia", user.getFamilyName());
    }

    @Test
    void testUserSetFamilyName() {
        user.setFamilyName("Revuelta");
        assertEquals("Revuelta", user.getFamilyName());
    }

    @Test
    void testUserFractions() {
        assertEquals(fractionList, user.getFractions());
    }

    @Test
    void testUserSetFractions() {
        List<Fraction> fractionList1 = List.of(new Fraction(5, 5));
        user.setFractions(fractionList1);
        assertEquals(fractionList1, user.getFractions());
    }

    @Test
    void testUserAddFractions() {
        user.addFraction(new Fraction(6, 6));
        assertEquals(4, user.getFractions().size());
    }

    @Test
    void testUserFullName() {
        assertEquals("Belen Garcia", user.fullName());
    }

    @Test
    void testUserInitials() {
        assertEquals("B.", user.initials());
    }

    @Test
    void testUserToString() {
        assertEquals("User{" +
                "id='" + "1" + '\'' +
                ", name='" + "Belen" + '\'' +
                ", familyName='" + "Garcia" + '\'' +
                ", fractions=" + fractionList +
                '}', user.toString());
    }

}
