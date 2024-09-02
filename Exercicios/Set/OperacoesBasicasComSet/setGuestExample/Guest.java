package setGuestExample;

public class Guest {
    private String name;
    private int invitationCode;

    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    public String toString() {
        return "setGuestExample.Guest: [Name: %s, InvitationCode: %d]".formatted(name, invitationCode);
    }
}
