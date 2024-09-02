package setGuestExample;

import java.util.HashSet;
import java.util.Set;

public class SetGuest {
    private static Set<Guest> setGuests = new HashSet<Guest>();

    public static Set<Guest> getSetGuests() {
        return setGuests;
    }

    public static void addGuest(Guest guest){
        setGuests.add(guest);
    }

    public static void removeGuestByInvitationCode(int invitationCode){
        setGuests.removeIf(g -> g.getInvitationCode() == invitationCode);
    }

    public static int countGuests(){
        return setGuests.size();
    }

    public static void showGuests(){
        setGuests.forEach(System.out::println);
    }
}
