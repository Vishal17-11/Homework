

//A charity animal Hospital has received 1193 packets of food. WAP that displays how many
//dozes of packet and how many extra packets has the hospital received? (A dozen = 12 units)

public class HospitalCalc {


    public static void main(String[] args) {

        int RecievedPackets = 1193;
        int dozens = 0;
        int ExtraPackets = 0;

         dozens = RecievedPackets / 12;

         ExtraPackets = RecievedPackets % 12;

        System.out.println("The Dozens of packets :  " + dozens);
        System.out.println("The ExtraPackets :  " + ExtraPackets);

    }


}
