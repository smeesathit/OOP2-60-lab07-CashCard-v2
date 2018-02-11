import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class CashCardTest
{
    public static void main(String[] args) 
    {
        CashCard card1, card2, card3;

        card1 = new CashCard(100.00);
        System.out.println(card1.toString());

        card2 = new CashCard(new GregorianCalendar(2019, Calendar.FEBRUARY, 12));
        System.out.println(card2.toString());

        card3 = new CashCard(200.00, new GregorianCalendar(2019, Calendar.MARCH, 12));
        System.out.println(card3.toString());
        System.out.println("\n");
        
        // show total number of cards
        System.out.println("จำนวนบัตร = " + CashCard.getNumberOfCard());

        // deduct money
        System.out.println("รหัสบัตร : " + card1.getCardId());

        card1.deduct(300);
        System.out.println("ตัดยอด: 300 บาท == > ยอดเงิน = " + card1.getBalance());

        card1.deduct(100);
        System.out.println("ตัดยอด: 100 บาท == > ยอดเงิน = " + card1.getBalance());

        // refill methods
        System.out.println("ยอดเงินปัจจุบัน = " + card1.getBalance());
        // refill(money)
        card1.refill(100); 
        System.out.println("เติมเงิน 100 บาท == > ยอดเงิน = " + card1.getBalance());

        // refill(money, exp date)
        card1.refill(200, new GregorianCalendar(2019, Calendar.AUGUST, 12) ); 
        System.out.println("เติมเงิน 200 บาท และ กำหนดวันหมดอายุใหม่ == > ยอดเงิน = " 
            + card1.getBalance() 
            + String.format(" วันหมดอายุ: %1$td/%1$tm/%1$ty", card1.getExpiryDate()));
    } // end main
} // end CashCardTest
